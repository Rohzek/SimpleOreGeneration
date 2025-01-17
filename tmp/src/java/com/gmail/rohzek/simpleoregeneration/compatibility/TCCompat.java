package com.gmail.rohzek.simpleoregeneration.compatibility;

import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.LogHelper;

import slimeknights.tconstruct.common.config.Config;

public class TCCompat 
{
	public static void load() 
	{
		fixConfig();
		loadOre();
		LogHelper.log("Tinker's Construct Compatibility loaded");
	}
	
	public static void fixConfig()
	{
		if(ConfigurationManager.supportTC)
		{
			try 
			{
				Class.forName("slimeknights.tconstruct.common.config.Config");
				
				Config.genCobalt = false;
				Config.genArdite = false;
			}
			catch( ClassNotFoundException e ) 
			{
				 LogHelper.log("Tinkers Construct not found, but Tinkers Construct compat is loaded?");
			}	
		}
	}
	
	public static void loadOre()
	{
		if(ConfigurationManager.supportTC)
		{
			ModdedConstants.enabledOres.add(new ModOre("cobaltOre", true));
			ModdedConstants.enabledOres.add(new ModOre("arditeOre", true));
		}
	}
}
