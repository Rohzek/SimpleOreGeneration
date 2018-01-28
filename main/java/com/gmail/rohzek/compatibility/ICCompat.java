package com.gmail.rohzek.compatibility;

import com.gmail.rohzek.smelting.SmeltingRecipes;
import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.LogHelper;

import ic2.core.init.MainConfig;
import ic2.core.util.Config;

public class ICCompat 
{
	public static void load() 
	{
		fixConfig();
		loadOre();
		addRecipes();
		LogHelper.log("IC2 Compatibility loaded");
	}
	
	public static void fixConfig()
	{
		if(ConfigurationManager.supportIC)
		{
			Config config = MainConfig.get();
			
			config.set("worldgen/copperOre", false);
			config.set("worldgen/tinOre", false);
			config.set("worldgen/uraniumOre", false);
			config.set("worldgen/leadOre", false);
		}
	}
	
	public static void loadOre()
	{
		if(ConfigurationManager.supportIC)
		{	
			ModdedConstants.enabledOres.add(new ModOre("copperOre", true));
			ModdedConstants.enabledOres.add(new ModOre("tinOre", true));
			ModdedConstants.enabledOres.add(new ModOre("leadOre", true));
			ModdedConstants.enabledOres.add(new ModOre("uraniumOre", true));
		}
	}
	
	public static void addRecipes()
	{
		SmeltingRecipes.addMaceratorRecipes();
	}
}
