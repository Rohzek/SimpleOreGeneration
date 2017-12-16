package com.gmail.rohzek.compatibility;

import java.io.File;

import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.LogHelper;

import cofh.core.init.CoreProps;
import cofh.core.util.ConfigHandler;
import cofh.thermalfoundation.ThermalFoundation;

public class TFCompat 
{
	public static void load()
	{
		fixConfig();
		loadOre();
		LogHelper.log("Thermal Foundation Compatibility loaded");
	}
	
	public static void fixConfig()
	{
		String path = CoreProps.configDir + "/cofh/world/";
		String worldGenOre = "01_thermalfoundation_ores.json";
		
		File worldGenFile = new File(path + worldGenOre);
		File worldGenFileReplace = new File(path + worldGenOre + ".bak");
		File worldVanilla = new File(path + "00_minecraft.json");
		
		if(ConfigurationManager.supportTF)
		{
			ConfigHandler config = ThermalFoundation.CONFIG;
			config.set("World", "GenerateDefaultFiles", false);
			config.save();
			
			if(worldGenFile.exists() && !worldGenFile.isDirectory())
			{
				worldGenFile.renameTo(worldGenFileReplace);
			}
		}
		else
		{	
			if(worldGenFileReplace.exists() && !worldGenFileReplace.isDirectory())
			{
				worldGenFileReplace.renameTo(worldGenFile);
			}
		}
		
		if(worldVanilla.exists())
		{
			worldVanilla.delete();
		}
	}
	
	public static void loadOre()
	{
		if(ConfigurationManager.supportTF)
		{			
			ModdedConstants.enabledOres.add(new ModOre("aluminumOre", true));
			ModdedConstants.enabledOres.add(new ModOre("copperOre", true));
			ModdedConstants.enabledOres.add(new ModOre("iridiumOre", true));
			ModdedConstants.enabledOres.add(new ModOre("leadOre", true));
			ModdedConstants.enabledOres.add(new ModOre("nickelOre", true));
			ModdedConstants.enabledOres.add(new ModOre("silverOre", true));
			ModdedConstants.enabledOres.add(new ModOre("tinOre", true));
			// Platinum - Doesn't spawn by default
			// Mana Infused Ore - Doesn't spawn by default
		}
	}
}
