package com.gmail.rohzek.simpleoregeneration.blocks;

import com.gmail.rohzek.json.OreData;
import com.gmail.rohzek.json.Ores;

public class MiningLevels 
{
	public static void Set()
	{
		setMiningLevels();
	}
	
	public static void setMiningLevels()
	{
		for(SurfaceOreBlock block : SGOres.surfaceOres)
		{
			String name = block.getUnlocalizedName().substring(5);
			
			for(OreData data : Ores.surfaceOres)
			{
				if(name.toLowerCase().equals(data.name.toLowerCase()))
				{
					block.setHarvestLevel("pickaxe", getMiningLevel(data.miningLevel));
				}
				
			}
		}
		
		for(NetherOreBlock block : SGOres.netherOres)
		{
			String name = block.getUnlocalizedName().substring(5);
			
			for(OreData data : Ores.netherOres)
			{
				if(name.toLowerCase().equals(data.name.toLowerCase()))
				{
					block.setHarvestLevel("pickaxe", getMiningLevel(data.miningLevel));
				}
				
			}
		}
		
		for(EndOreBlock block : SGOres.endOres)
		{
			String name = block.getUnlocalizedName().substring(5);
			
			for(OreData data : Ores.endOres)
			{
				if(name.toLowerCase().equals(data.name.toLowerCase()))
				{
					block.setHarvestLevel("pickaxe", getMiningLevel(data.miningLevel));
				}
				
			}
		}
	}
	
	public static int getMiningLevel(String level)
	{
		if(level.equalsIgnoreCase("wooden") || level.equalsIgnoreCase("wood") || level.equalsIgnoreCase("gold") || level.equalsIgnoreCase("golden"))
		{
			return 0;
		}
		
		else if(level.equalsIgnoreCase("stone"))
		{
			return 1;
		}
		
		else if(level.equalsIgnoreCase("iron") || level.equalsIgnoreCase("modded"))
		{
			return 2;
		}
		
		else if(level.equalsIgnoreCase("diamond"))
		{
			return 3;
		}
		
		else if(level.equalsIgnoreCase("custom"))
		{
			return 4;
		}
		
		return 2;
	}
}
