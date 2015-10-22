#include "CrashHandler.h"

#if defined( __WIN32__ ) || defined( _WINDOWS_ ) || defined (_WIN32) || defined (_WINDOWS) || defined (WIN32)
	#pragma warning (disable:4786)
#endif

#include <stdio.h>
#include <tchar.h>

#include "client/windows/crash_generation/client_info.h"
#include "client/windows/crash_generation/crash_generation_server.h"
#include "client/windows/handler/exception_handler.h"
#include "client/windows/common/ipc_protocol.h"

//typedef google_breakpad::ExceptionHandler exceptionCrashHandler; 

wchar_t* charToWChar(const char* text)
{
    size_t newSize = strlen(text) + 1;
	size_t sizeConvertedChars = 0; 
    wchar_t* wa = new wchar_t[newSize];
    mbstowcs_s(&sizeConvertedChars, wa, newSize, text,_TRUNCATE);
    return wa;
}

void EXTIMPORTPOSTTYPE testCrashHandler (void)
{
	int *i = NULL; 
	(*i)++; 
}

void EXTIMPORTPOSTTYPE iniCrashHandler (char* pathToSaveDump)
{
	/* Exception handler, when the app crash, this handler catch the exception and produce an dump file*/
	google_breakpad::ExceptionHandler* handler = NULL;

	/* Information for the app. */
	google_breakpad::CustomInfoEntry kCustomInfoEntries[] = {
		google_breakpad::CustomInfoEntry(L"prod", L"CrashHandler"),
		google_breakpad::CustomInfoEntry(L"ver", L"1.0"),
	};
	int kCustomInfoCount = 2;

	/* Change the path from standard char to wide char */
	wchar_t *dumpPath = charToWChar (pathToSaveDump); 

	/* Some pipeline for connect to an server for transfer information, not yet implemented */
	const wchar_t *kPipeNameLocal = NULL; 
	google_breakpad::CustomClientInfo custom_info = {kCustomInfoEntries, kCustomInfoCount};
	
	if (!DirectoryExists (dumpPath))
	{
		CreateDirectory (dumpPath, NULL);
	}

	/* Basic exception handler: Handler all exception and generated an miniDump*/
	handler = new google_breakpad::ExceptionHandler (dumpPath,
		                                               NULL, 
													   NULL, 
													   NULL, 
													   google_breakpad::ExceptionHandler::HANDLER_ALL,
													   MiniDumpNormal,
													   kPipeNameLocal,
													   &custom_info);
}

bool DirectoryExists(wchar_t *szPath)
{
  DWORD dwAttrib = GetFileAttributes(szPath);

  return (dwAttrib != INVALID_FILE_ATTRIBUTES && (dwAttrib & FILE_ATTRIBUTE_DIRECTORY));
}

#if defined( __WIN32__ ) || defined( _WINDOWS_ ) || defined (_WIN32) || defined (_WINDOWS) || defined (WIN32)
	#include <windows.h>
#endif

#if defined( __WIN32__ ) || defined( _WINDOWS_ ) || defined (_WIN32) || defined (_WINDOWS) || defined (WIN32)
	BOOL __stdcall DllMain( HANDLE hModule, 
							DWORD  ul_reason_for_call, 
							LPVOID lpReserved)
	{
		
		switch (ul_reason_for_call)
		{
			case DLL_PROCESS_ATTACH:		break;
			case DLL_THREAD_ATTACH:		break;
			case DLL_THREAD_DETACH:		break;

			case DLL_PROCESS_DETACH:	break;
		}
		return TRUE;
	}

#endif