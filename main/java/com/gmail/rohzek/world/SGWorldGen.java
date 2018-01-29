package com.gmail.rohzek.world;

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
				runGenerator(mineable, world, random, chunkX, chunkZ, mineable.data.veinCount, mineable.data.minY, mineable.data.maxY);
			}
		}
	}
	
	private void nether(Random random, int chunkX, int chunkZ, World world)
	{
		for(SGWorldGenMineable mineable : WorldGenerators.worldGeneratorsNether)
		{
			if(!mineable.data.disableOre)
			{
				runGenerator(mineable, world, random, chunkX, chunkZ, mineable.data.veinCount, mineable.data.minY, mineable.data.maxY);
			}
		}
	}
	
	private void end(Random random, int chunkX, int chunkZ, World world)
	{
		for(SGWorldGenMineable mineable : WorldGenerators.worldGeneratorsEnd)
		{
			if(!mineable.data.disableOre)
			{
				runGenerator(mineable, world, random, chunkX, chunkZ, mineable.data.veinCount, mineable.data.minY, mineable.data.maxY);
			}
		}
	}
	
	private void runGenerator (SGWorldGenMineable generator, World world, Random rand, int chunkX, int chunkZ, int chanceToSpawn, int minHeight, int maxHeight)
	{	
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
		{
			throw new IllegalArgumentException("Minimum or Maximum height out of bounds");
		}
		
		int heightDiff = maxHeight - minHeight + 1;
		
		for (int i = 0; i < chanceToSpawn; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			if(generator.data.name.equals("surfaceEmeraldOre") && !ConfigurationManager.emeraldSpawnAnywhere)
			{
				if(world.getBiome(new BlockPos(x, y, z)) instanceof BiomeHills)
				{
					generator.generate(world, rand, new BlockPos(x, y, z));
				}
			}
			else
			{
				generator.generate(world, rand, new BlockPos(x, y, z));
			}
		}
	}
}
