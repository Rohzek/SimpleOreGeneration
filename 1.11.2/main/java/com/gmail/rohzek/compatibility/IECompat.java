package com.gmail.rohzek.compatibility;

import java.util.ArrayList;
import com.gmail.rohzek.lib.Reference;
import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.LogHelper;
import blusunrize.immersiveengineering.ImmersiveEngineering;
import blusunrize.immersiveengineering.common.Config;
import blusunrize.immersiveengineering.common.world.IEWorldGen;
import net.minecraft.client.Minecraft;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.config.Configuration;

public class IECompat 
{
	
	public static void load()
	{
		fixConfigs();
		loadOre();
		LogHelper.log("IE Compatibility loaded");
	}
	
	public static void fixConfigs()
	{
		if(ConfigurationManager.supportIE)
		{
			DimensionType[] dimTypes = DimensionType.values();
			ArrayList<Integer> dims = new ArrayList<Integer>();
			
			LogHelper.debug("Blocking IE ores in the following dimensions:");
			
			for(int i = 0; i < dimTypes.length; i++)
			{
				int[] dim = DimensionManager.getDimensions(dimTypes[i]);
				for(int j = 0; j < dim.length; j++)
				{
					dims.add(dim[j]);
					LogHelper.debug("" + dimTypes[i]);
					LogHelper.debug("Which is dim ID: " + dim[j]);
				}
			}
	
			IEWorldGen.oreDimBlacklist = dims;
		}
	}
	
	public static void loadOre()
	{
		if(ConfigurationManager.supportIE)
		{
			ModdedConstants.bauxiteOre = true;
			ModdedConstants.copperOre = true;
			ModdedConstants.leadOre = true;
			ModdedConstants.nickelOre = true;
			ModdedConstants.silverOre = true;
			ModdedConstants.uraniumOre = true;
		}
	}
}
