package com.gmail.rohzek.util;

import java.io.File;

import com.gmail.rohzek.lib.Reference;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigurationManager
{
	public static File loc;
	
	public static boolean isDebug;
	public static boolean straight2Ingots;
	
	public ConfigurationManager(FMLPreInitializationEvent event)
	{
		loc = new File(Reference.LOCATION + "/options.cfg");
		
		Configuration config = new Configuration(loc);
		
		// Load the file
		config.load();
		
		isDebug = config.get(Configuration.CATEGORY_GENERAL, "debug", false, "Enables more printouts to the chat. WARNING: Will spam the log file. Good for bug reports. Not recommended for regular play.").getBoolean(false);
		
		straight2Ingots = config.get(Configuration.CATEGORY_GENERAL, "smeltToIngots", true, "Makes new ores be smelted straight to their ingot form, instead of turning into vanilla ores first.").getBoolean(true);
		
		// Re-save the file
		config.save();
	}
}
