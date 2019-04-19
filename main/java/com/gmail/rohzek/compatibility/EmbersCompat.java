package com.gmail.rohzek.compatibility;

import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.LogHelper;

import appeng.api.features.IWorldGen.WorldGenType;
import appeng.core.features.registries.WorldGenRegistry;
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
			try 
			{
				Class.forName("teamroots.embers.ConfigManager");
				
				ConfigManager.orespawnBlacklist.add(0);
			}
			catch( ClassNotFoundException e ) 
			{
				 LogHelper.log("Embers not found, but Embers compat is loaded?");
			}
		}
	}
	
	public static void loadOre()
	{
		if(ConfigurationManager.supportEmbers)
		{
			ModdedConstants.enabledOres.add(new ModOre("aluminumOre", true));
			ModdedConstants.enabledOres.add(new ModOre("copperOre", true));
			ModdedConstants.enabledOres.add(new ModOre("leadOre", true));
			ModdedConstants.enabledOres.add(new ModOre("nickelOre", true));
			ModdedConstants.enabledOres.add(new ModOre("silverOre", true));
			ModdedConstants.enabledOres.add(new ModOre("tinOre", true));
		}
	}
}
