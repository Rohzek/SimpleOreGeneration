package com.gmail.rohzek.simpleoregeneration.util;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;


/**
 * Allows easy logging to console by calling "Logger.log("string"); or Logger.debug("string"); anywhere
 * @author Rohzek
 *
 */
public class LogHelper
{
	private static final Logger LOGGER = LogManager.getLogger();
	
	// General logging, allows you to choose log level to control displaying
    public static void log(Level logLevel, String string)
    {
    	LOGGER.log(logLevel, string);
    }
 // General logging, will show up in the console regardless
    public static void log(String string)
    {
    	LOGGER.log(Level.INFO, string);
    }

    // This is a normal printout but only if my debug config is true.. Allows us to check something, and forget about it for the release
    public static void debug(String string)
    {
    	if(ConfigurationManager.isDebug)
    	{
    		LOGGER.log(Level.INFO, string);
    	}
    }
    
    // Not sure how the rest work, but we don't need them I guess? Included for completeness. Maybe you want them?
    public static void all(String string)
    {
        log(Level.ALL, string);
    }

    public static void error(String string)
    {
        log(Level.ERROR, string);
    }

    public static void fatal(String string)
    {
        log(Level.FATAL, string);
    }

    public static void info(String string)
    {
        log(Level.INFO, string);
    }

    public static void off(String string)
    {
        log(Level.OFF, string);
    }

    public static void trace(String string)
    {
        if (ConfigurationManager.isDebug)
        {
            log(Level.TRACE, string);
        }
    }

    public static void warn(String string)
    {
        log(Level.WARN, string);
    }
}
