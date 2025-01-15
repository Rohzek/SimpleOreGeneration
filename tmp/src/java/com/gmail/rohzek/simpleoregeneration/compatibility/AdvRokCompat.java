package com.gmail.rohzek.simpleoregeneration.compatibility;

import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.LogHelper;

//import zmaster587.advancedRocketry.api.Configuration;

public class AdvRokCompat 
{
	public static void load() 
	{
		fixConfig();
		loadOre();
		LogHelper.log("Advanced Rocketry Compatibility loaded");
	}
	
	public static void fixConfig()
	{
		if(ConfigurationManager.supportAdvRok)
		{
			/*
			Configuration.generateAluminum = false;
			Configuration.generateCopper = false;
			Configuration.generateDilithium = false;
			Configuration.generateIridium = false;
			Configuration.generateRutile = false;
			Configuration.generateTin = false;
			*/
		}
	}
	
	public static void loadOre()
	{
		if(ConfigurationManager.supportAdvRok)
		{
			ModdedConstants.enabledOres.add(new ModOre("aluminumOre", true));
			ModdedConstants.enabledOres.add(new ModOre("copperOre", true));
			ModdedConstants.enabledOres.add(new ModOre("dilithiumOre", true));
			ModdedConstants.enabledOres.add(new ModOre("iridiumOre", true));
			ModdedConstants.enabledOres.add(new ModOre("rutileOre", true));
			ModdedConstants.enabledOres.add(new ModOre("tinOre", true));
		}
	}
}
