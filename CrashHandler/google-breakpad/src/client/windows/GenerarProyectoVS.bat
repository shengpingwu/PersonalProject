echo OFF
echo "---------- Set Output Visual Studio 2010 project ----------"
set GYP_MSVS_VERSION=2010
set GYP=E:\PROJECTS\CrashHandler\trunk\google-breakpad\src\tools\gyp\gyp
set CLIENT_PATH=E:\PROJECTS\CrashHandler\trunk\google-breakpad\src\client\windows
echo "---------- Build Visual Studio 2010 project files----------"
%GYP% --no-circular-check %CLIENT_PATH%\breakpad_client.gyp
echo "---------- Finish ----------"
pause

