package com.gmail.rohzek.util;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigurationManager
{
	public static boolean isDebug;
	public static boolean superEasyMode;
	public static boolean straight2Ingots;
	
	public ConfigurationManager(FMLPreInitializationEvent event)
	{
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		
		// Load the file
		config.load();
		
		isDebug = config.get(Configuration.CATEGORY_GENERAL, "debug", false, "Enables more printouts to the chat. WARNING: Will spam the log file. Good for bug reports. Not recommended for regular play.").getBoolean(false);
		
		superEasyMode = config.get(Configuration.CATEGORY_GENERAL, "superEasyMode", false, "Allows surface ores to found easier, and at any Y value... wimp.").getBoolean(false);
		
		straight2Ingots = config.get(Configuration.CATEGORY_GENERAL, "smeltToIngots", true, "Makes new ores be smelted straight to their ingot form, instead of turning into vanilla ores.").getBoolean(true);
		
		// Re-save the file
		config.save();
	}
}
