package com.gmail.rohzek.compatibility;

import com.github.alexthe666.iceandfire.IceAndFire;
import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.LogHelper;

public class IAFCompat 
{
	public static void load() 
	{
		fixConfig();
		loadOre();
		LogHelper.log("Ice and Fire Compatibility loaded");
	}
	
	public static void fixConfig()
	{
		if(ConfigurationManager.supportIceAndFire)
		{
			IceAndFire.CONFIG.generateSapphireOre = false;
			IceAndFire.CONFIG.generateSilverOre = false;
		}
	}
	
	public static void loadOre()
	{
		if(ConfigurationManager.supportIceAndFire)
		{
			ModdedConstants.enabledOres.add(new ModOre("sapphireOre", true));
			ModdedConstants.enabledOres.add(new ModOre("silverOre", true));
		}
	}
}
