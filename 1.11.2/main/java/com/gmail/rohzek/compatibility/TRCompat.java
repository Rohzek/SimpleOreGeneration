package com.gmail.rohzek.compatibility;

import com.gmail.rohzek.blocks.SGOres;
import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.LogHelper;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import techreborn.Core;
import techreborn.init.ModBlocks;

public class TRCompat
{
	public static void load()
	{
		fixConfig();
		loadOre();
		LogHelper.log("Tech Reborn Compatibility loaded");
	}
	
	public static void fixConfig()
	{
		if(ConfigurationManager.supportTR)
		{
			Core.worldGen.config.generateOres = false;
		}
	}
	
	public static void loadOre()
	{
		if(ConfigurationManager.supportTR)
		{
			// Constants
			ModdedConstants.enabledOres.add(new ModOre("aluminumOre", true));
			ModdedConstants.enabledOres.add(new ModOre("copperOre", true));
			ModdedConstants.enabledOres.add(new ModOre("iridiumOre", true));
			ModdedConstants.enabledOres.add(new ModOre("tinOre", true));
			ModdedConstants.enabledOres.add(new ModOre("silverOre", true));
			ModdedConstants.enabledOres.add(new ModOre("leadOre", true));
			
			ModdedConstants.enabledOres.add(new ModOre("cinnabarOre", true));
			ModdedConstants.enabledOres.add(new ModOre("galenaOre", true));
			ModdedConstants.enabledOres.add(new ModOre("peridotOre", true));
			ModdedConstants.enabledOres.add(new ModOre("pyriteOre", true));
			ModdedConstants.enabledOres.add(new ModOre("rubyOre", true));
			ModdedConstants.enabledOres.add(new ModOre("sapphireOre", true));
			ModdedConstants.enabledOres.add(new ModOre("sheldoniteOre", true));
			ModdedConstants.enabledOres.add(new ModOre("sodaliteOre", true));
			ModdedConstants.enabledOres.add(new ModOre("sphaleriteOre", true));
			ModdedConstants.enabledOres.add(new ModOre("tungstenOre", true));
		}
	}
}
