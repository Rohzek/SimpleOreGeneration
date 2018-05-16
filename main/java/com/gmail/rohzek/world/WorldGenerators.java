package com.gmail.rohzek.world;

import java.util.ArrayList;

import com.gmail.rohzek.blocks.EndOreBlock;
import com.gmail.rohzek.blocks.ModOrePack;
import com.gmail.rohzek.blocks.NetherOreBlock;
import com.gmail.rohzek.blocks.OtherBlocks;
import com.gmail.rohzek.blocks.SGOres;
import com.gmail.rohzek.blocks.SurfaceOreBlock;
import com.gmail.rohzek.json.OreData;
import com.gmail.rohzek.json.Ores;
import com.gmail.rohzek.util.ConfigurationManager;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;

public class WorldGenerators 
{
	public static ArrayList<SGWorldGenMineable> worldGeneratorsSurface, worldGeneratorsNether, worldGeneratorsEnd;
	
	public static void init()
	{
		surface();
		nether();
		end();
	}
	
	static void surface()
	{
		worldGeneratorsSurface = new ArrayList<SGWorldGenMineable>();
		
		if(ConfigurationManager.changeVanilla)
		{
			for(IBlockState block : OtherBlocks.vanillaOres)
			{
				for(OreData data : Ores.vanillaOres)
				{
					String dataName = data.name.toLowerCase(), blockName = "";

					if(block.getBlock().getUnlocalizedName().startsWith("ore", 5))
					{
						blockName = block.getBlock().getUnlocalizedName().substring(8).toLowerCase();
					}
					else
					{
						blockName = block.getBlock().getUnlocalizedName().substring(5).toLowerCase();
					}
					
					if(dataName.contains(blockName) && !data.disableOre && ConfigurationManager.changeVanilla)
					{
						worldGeneratorsSurface.add(new SGWorldGenMineable(block, blockSize(data.veinMinimum, data.veinMaximum), data));
					}
				}
			}
		}
		
		for(SurfaceOreBlock block : SGOres.surfaceOres)
		{
			for(OreData data : Ores.surfaceOres)
			{
				String name = block.getUnlocalizedName().substring(5);
				
				if(name.equals(data.name) && !data.disableOre)
				{
					worldGeneratorsSurface.add(new SGWorldGenMineable(block.getDefaultState(), blockSize(data.veinMinimum, data.veinMaximum), data));
				}
			}
		}
		
		for(OreData data : Ores.surfaceOres)
		{	
			for(ModOrePack pack : OtherBlocks.moddedSurfaceOres)
			{
				String name = pack.name;
				
				if(data.name.equals(name) && !data.disableOre)
				{
					worldGeneratorsSurface.add(new SGWorldGenMineable(pack.block, blockSize(data.veinMinimum, data.veinMaximum), data));
				}
			}
		}
	}
	
	static void nether()
	{
		worldGeneratorsNether = new ArrayList<SGWorldGenMineable>();
		
		if(ConfigurationManager.netherOres)
		{
			for(NetherOreBlock block : SGOres.netherOres)
			{
				for(OreData data : Ores.netherOres)
				{
					String name = block.getUnlocalizedName().substring(5);
					
					if(name.equals(data.name) && !data.disableOre)
					{
						if(data.name.equals("netherQuartzOre") && ConfigurationManager.useVanillaNetherQuartz)
						{
							worldGeneratorsNether.add(new SGWorldGenMineable(Blocks.QUARTZ_ORE.getDefaultState(), blockSize(data.veinMinimum, data.veinMaximum), data));
						}
						else
						{
							worldGeneratorsNether.add(new SGWorldGenMineable(block.getDefaultState(), blockSize(data.veinMinimum, data.veinMaximum), data));
						}
					}
				}
			}
		}
		else if(!ConfigurationManager.netherOres)
		{
			for(NetherOreBlock block : SGOres.netherOres)
			{
				for(OreData data : Ores.netherOres)
				{
					String name = block.getUnlocalizedName().substring(5);
					String quartz = "netherQuartzOre";
					
					if(name.equals(quartz) && data.name.equals(quartz) && !data.disableOre)
					{
						worldGeneratorsNether.add(new SGWorldGenMineable(Blocks.QUARTZ_ORE.getDefaultState(), blockSize(data.veinMinimum, data.veinMaximum), data));
					}
				}
			}
		}
	}
	
	static void end()
	{
		worldGeneratorsEnd = new ArrayList<SGWorldGenMineable>();
		
		if(ConfigurationManager.endOres)
		{
			for(EndOreBlock block : SGOres.endOres)
			{
				for(OreData data : Ores.endOres)
				{
					String name = block.getUnlocalizedName().substring(5);
					
					if(name.equals(data.name) && !data.disableOre)
					{
						worldGeneratorsEnd.add(new SGWorldGenMineable(block.getDefaultState(), blockSize(data.veinMinimum, data.veinMaximum), data));
					}
				}
			}
		}
	}
	
	// Randomly choose how many blocks can be in a vein
	private static int blockSize(int min, int max)
	{
		// Since min is added at the end,
		max = max - min; // Subtract it from max here, so we can never have more than the max
		return min + (int) (Math.random() * max);
	}
}
