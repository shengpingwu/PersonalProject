#include "WebLog4cxx.h"
#include <log4cxx/propertyconfigurator.h>
#include <log4cxx/rollingfileappender.h> 
#include <log4cxx/patternlayout.h>
#include <log4cxx/helpers/transcoder.h>

const int    MAX_BACKUP_FILE = 5; 
const string MAX_FILE_SIZE   = "10MB"; 
const string CURSTOM_PATTERN = "%d %t %5p %M %L - %m%n"; 

/* Logger Initialization provide a name with the option define in T04_WebAgent.properties */
WebLog4cxx::WebLog4cxx  (const string &nameLogger)
{	
	mlogger = Logger::getLogger (nameLogger); 
	//PropertyConfigurator::configure (LOG4CXX_FILE("T04_WebAgent.properties")); 
}

WebLog4cxx::~WebLog4cxx (void)
{
}
void WebLog4cxx::setLevel (const string vMode)
{
	if (vMode == "TRACE")
	{
		mlogger->setLevel (Level::getTrace()); 
	}
	else if (vMode == "INFO")
	{
		mlogger->setLevel (Level::getInfo()); 
	}
	else if (vMode == "WARN")
	{
		mlogger->setLevel (Level::getWarn()); 
	}
	else if (vMode == "ERROR")
	{
		mlogger->setLevel (Level::getError()); 
	}
	else if (vMode == "FATAL")
	{
		mlogger->setLevel (Level::getFatal()); 
	}
	else
	{
		mlogger->setLevel (Level::getDebug()); 
	}
}

void WebLog4cxx::createFileAppender (const string fileName)
{
	//PatternLayoutPtr patternLayoutPtr = new PatternLayout ("%d %t %5p %M %L - %m%n");
	LOG4CXX_DECODE_CHAR (sFileName, fileName); 
	LOG4CXX_DECODE_CHAR (sCustomPattern, CURSTOM_PATTERN); 
	LOG4CXX_DECODE_CHAR (sMaxFileSize, MAX_FILE_SIZE); 
	RollingFileAppenderPtr rollingFileAppender = new RollingFileAppender (LayoutPtr (new PatternLayout(sCustomPattern)), sFileName, true); 

	rollingFileAppender->setMaxBackupIndex (MAX_BACKUP_FILE); 
	rollingFileAppender->setMaxFileSize (sMaxFileSize); 
	mlogger->addAppender (rollingFileAppender); 
}
void WebLog4cxx::logMessage (const string vMessage, const weblogLevel vMode)
{
	switch (vMode){
		case FATAL_WL: LOG4CXX_FATAL (mlogger, vMessage);
			           break; 
		case ERROR_WL: LOG4CXX_ERROR (mlogger, vMessage); 
			           break; 
		case WARN_WL:  LOG4CXX_WARN  (mlogger, vMessage); 
			           break; 
		case INFO_WL:  LOG4CXX_INFO  (mlogger, vMessage); 
			           break; 
		case TRACE_WL: LOG4CXX_TRACE (mlogger, vMessage); 
			           break; 
		case DEBUG_WL: 
		default:       LOG4CXX_DEBUG (mlogger, vMessage); 
			           break; 
	}
}

