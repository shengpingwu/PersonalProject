#ifndef __CRASH_HANDLER_H__
#define __CRASH_HANDLER_H__

#if defined( __WIN32__ ) || defined( _WINDOWS_ ) || defined (_WIN32) || defined (_WINDOWS) || defined (WIN32)
	#define EXTIMPORTPRETYPE __declspec(dllimport) 
	#define EXTIMPORTPOSTTYPE __stdcall
#else
	#define EXTIMPORTPOSTTYPE 
#endif

void EXTIMPORTPOSTTYPE iniCrashHandler (char* pathToSaveDump);

void EXTIMPORTPOSTTYPE testCrashHandler (void);

wchar_t* charToWChar(const char* text);

bool DirectoryExists(wchar_t * szPath);

#endif