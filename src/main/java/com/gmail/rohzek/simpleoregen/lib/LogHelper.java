package com.gmail.rohzek.simpleoregen.lib;

import com.gmail.rohzek.simpleoregen.SimpleOreGeneration;

public class LogHelper 
{
	public static void Log(String message) 
	{
		SimpleOreGeneration.LOGGER.info(message);
	}
	
	public static void Debug(String message) 
	{
		if(ConfigurationManager.GENERAL.isDebug.get()) 
		{
			SimpleOreGeneration.LOGGER.debug(message);
		}
	}
}
