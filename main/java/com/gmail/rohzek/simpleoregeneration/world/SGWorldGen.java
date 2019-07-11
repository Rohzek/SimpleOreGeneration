package com.gmail.rohzek.simpleoregeneration.world;

import java.util.Random;

import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.LogHelper;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeHills;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class SGWorldGen implements IWorldGenerator
{
	boolean test = false;
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{	
		switch(world.provider.getDimension())
		{
			case 0:
				if(!test)
				{
					overworld(random, chunkX, chunkZ, world);
				}
				break;
			case -1:
				if(!test)
				{
					nether(random, chunkX, chunkZ, world);
				}
				break;
			case 1:
				if(!test)
				{
					end(random, chunkX, chunkZ, world);
				}
				break;
			default:
				if(!test)
				{
					overworld(random, chunkX, chunkZ, world);
				}
				break;	
		}
	}
	
	private void overworld(Random random, int chunkX, int chunkZ, World world)
	{
		for(SGWorldGenMineable mineable : WorldGenerators.worldGeneratorsSurface)
		{
			if(!mineable.data.disableOre)
			{
				runGenerator(mineable, world, random, chunkX, chunkZ, veinCount(mineable.data.veinMinimum, mineable.data.veinMaximum), mineable.data.minY, mineable.data.maxY);
			}
		}
	}
	
	private void nether(Random random, int chunkX, int chunkZ, World world)
	{
		for(SGWorldGenMineable mineable : WorldGenerators.worldGeneratorsNether)
		{
			if(!mineable.data.disableOre)
			{
				runGenerator(mineable, world, random, chunkX, chunkZ, veinCount(mineable.data.veinMinimum, mineable.data.veinMaximum), mineable.data.minY, mineable.data.maxY);
			}
		}
	}
	
	private void end(Random random, int chunkX, int chunkZ, World world)
	{
		for(SGWorldGenMineable mineable : WorldGenerators.worldGeneratorsEnd)
		{
			if(!mineable.data.disableOre)
			{
				runGenerator(mineable, world, random, chunkX, chunkZ, veinCount(mineable.data.veinMinimum, mineable.data.veinMaximum), mineable.data.minY, mineable.data.maxY);
			}
		}
	}
	
	// Randomly choose how many veins can be in a chunk
	private static int veinCount(int min, int max)
	{
		// Since min is added at the end,
		max = max - min; // Subtract it from max here, so we can never have more than the max
		
		if(max < 0)
		{
			max = 0;
		}
		
		return min + (int) (Math.random() * max);
	}
	
	/*
	 * Chance to spawn is number of times it tries to spawn a vein per chunk
	 */
	private void runGenerator (SGWorldGenMineable generator, World world, Random rand, int chunkX, int chunkZ, int veinsPerChunk, int minHeight, int maxHeight)
	{	
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
		{
			throw new IllegalArgumentException("Minimum or Maximum height out of bounds");
		}
		
		int heightDiff = maxHeight - minHeight + 1;
		
		for (int i = 0; i < veinsPerChunk; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			BlockPos pos = new BlockPos(x, y, z);
			String biomeName = world.getBiome(pos).getRegistryName().getResourcePath().toString();
			
			if(generator.data.name.equals("surfaceEmeraldOre") && !ConfigurationManager.emeraldSpawnAnywhere)
			{
				if(world.getBiome(pos) instanceof BiomeHills)
				{
					generator.generate(world, rand, pos);
				}
			}
			else
			{
				for(String biom : generator.data.biomeList)
				{
					if(biomeName.equals(biom))
					{
						generator.generate(world, rand, pos);
					}
				}
			}
		}
	}
}
