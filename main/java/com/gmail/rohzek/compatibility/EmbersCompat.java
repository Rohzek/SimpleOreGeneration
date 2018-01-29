package com.gmail.rohzek.compatibility;

import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.LogHelper;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;
import teamroots.embers.ConfigManager;

public class EmbersCompat 
{
	public static void load() 
	{
		fixConfig();
		loadOre();
		LogHelper.log("Embers Compatibility loaded");
	}
	
	public static void fixConfig()
	{	
		if(ConfigurationManager.supportEmbers)
		{
			ConfigManager.copperVeinSize = 0;
			ConfigManager.leadVeinSize = 0;
			ConfigManager.silverVeinSize = 0;
		}
	}
	
	public static void loadOre()
	{
		if(ConfigurationManager.supportEmbers)
		{
			ModdedConstants.enabledOres.add(new ModOre("copperOre", true));
			ModdedConstants.enabledOres.add(new ModOre("leadOre", true));
			ModdedConstants.enabledOres.add(new ModOre("silverOre", true));
		}
	}
}
