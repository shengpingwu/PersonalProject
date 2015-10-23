#ifndef __WEBLOG4CXX_H__

#if defined( __WIN32__ ) || defined( _WINDOWS_ ) || defined (_WIN32) || defined (_WINDOWS) || defined (WIN32)
#pragma warning (disable:4511)
#pragma warning (disable:4512)
#endif

#include <log4cxx/logger.h>
#include <string>

using namespace log4cxx; 
using std::string; 

enum weblogLevel {FATAL_WL, ERROR_WL, WARN_WL, INFO_WL, DEBUG_WL, TRACE_WL};

class WebLog4cxx 
{
public: 
	WebLog4cxx (const string &nameLogger);

	~WebLog4cxx (void); 

	void logMessage (const string vMessage, const weblogLevel vMode); 
	void setLevel (const string vMode); 
	void createFileAppender (const string fileName); 
private: 
	LoggerPtr mlogger; 
}; 

#endif