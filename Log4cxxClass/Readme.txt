1) Include the webLog4cxx.h in your cpp file. 

#include "WebLog4cxx.h"


2) Create a new WebLog4cxx class

WebLog4cxx mLogger = WebLog4cxx(loggerName);


3) Define the output file

mLogger.createFileAppender (".\\log\\logName.log");


4) Set the log level

mLogger.setLevel ("DEBUG"); 

5) log a message calling the logMessage method. 

mLogger.logMessage ("Some message", DEBUG_WL); 