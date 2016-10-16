package com.gmail.rohzek.world;

import java.util.Random;

import com.gmail.rohzek.blocks.SGOres;
import com.gmail.rohzek.util.ConfigurationManager;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

// Modified from vanilla to make ores a little more (or less) controllable. Will generate evenly in valid Y levels
public class SGWorldGen implements IWorldGenerator
{	
	// Ores - Surface
	private WorldGenerator coalOre;
	private WorldGenerator diamondOre;
	private WorldGenerator emeraldOre;
	private WorldGenerator goldOre;
	private WorldGenerator ironOre;
	private WorldGenerator lapisOre;
	private WorldGenerator redstoneOre;
	
	// Ores - Nether
	private WorldGenerator netherCoalOre;
	private WorldGenerator netherDiamondOre;
	private WorldGenerator netherEmeraldOre;
	private WorldGenerator netherGoldOre;
	private WorldGenerator netherIronOre;
	private WorldGenerator netherLapisOre;
	private WorldGenerator netherQuartz;
	private WorldGenerator netherRedstoneOre;
	
	// Ores - End
	private WorldGenerator endCoalOre;
	private WorldGenerator endDiamondOre;
	private WorldGenerator endEmeraldOre;
	private WorldGenerator endGoldOre;
	private WorldGenerator endIronOre;
	private WorldGenerator endLapisOre;
	private WorldGenerator endRedstoneOre;
	
	// Setting variables for ore rarity/amount spawning
	private int redstone = 24;
	private int coal = 12;
	private int iron = 10;
	private int lapis = 8;
	private int gold = 6;
	private int emerald = 4;
	private int diamond = 2;
	
	public SGWorldGen()
	{
		// Creates HUGE amounts, if you want it.. Similar to Big Dig
		if(ConfigurationManager.superEasyMode)
		{
			redstone = 50;
			coal = 50;
			iron = 50;
			lapis = 50;
			gold = 50;
			emerald = 50;
			diamond = 50;
		}
		
		// Surface Ores
		this.coalOre = new SGWorldGenMineable(Blocks.COAL_ORE.getDefaultState(), blockSize(coal), 0);
		this.diamondOre = new SGWorldGenMineable(Blocks.DIAMOND_ORE.getDefaultState(), blockSize(diamond), 0);
		this.emeraldOre = new SGWorldGenMineable(Blocks.EMERALD_ORE.getDefaultState(), blockSize(emerald), 0);
		this.goldOre = new SGWorldGenMineable(Blocks.GOLD_ORE.getDefaultState(), blockSize(gold), 0);
		this.ironOre = new SGWorldGenMineable(Blocks.IRON_ORE.getDefaultState(), blockSize(iron), 0);
		this.lapisOre = new SGWorldGenMineable(Blocks.LAPIS_ORE.getDefaultState(), blockSize(lapis), 0);
		this.redstoneOre = new SGWorldGenMineable(Blocks.REDSTONE_ORE.getDefaultState(), blockSize(redstone), 0);
		
		// Nether Ores
		this.netherCoalOre = new SGWorldGenMineable(SGOres.netherCoalOre.getDefaultState(), blockSize(coal), -1);
		this.netherDiamondOre = new SGWorldGenMineable(SGOres.netherDiamondOre.getDefaultState(), blockSize(diamond), -1);
		this.netherEmeraldOre = new SGWorldGenMineable(SGOres.netherEmeraldOre.getDefaultState(), blockSize(emerald), -1);
		this.netherGoldOre = new SGWorldGenMineable(SGOres.netherGoldOre.getDefaultState(), blockSize(gold), -1);
		this.netherIronOre = new SGWorldGenMineable(SGOres.netherIronOre.getDefaultState(), blockSize(iron), -1);
		this.netherLapisOre = new SGWorldGenMineable(SGOres.netherLapisOre.getDefaultState(), blockSize(lapis), -1);
		this.netherRedstoneOre = new SGWorldGenMineable(SGOres.netherRedstoneOre.getDefaultState(), blockSize(redstone), -1);
		this.netherQuartz = new SGWorldGenMineable(SGOres.netherRedstoneOre.getDefaultState(), blockSize(99), -1);
		
		// End Ores
		this.endCoalOre = new SGWorldGenMineable(SGOres.endCoalOre.getDefaultState(), blockSize(coal), 1);
		this.endDiamondOre = new SGWorldGenMineable(SGOres.endDiamondOre.getDefaultState(), blockSize(diamond), 1);
		this.endEmeraldOre = new SGWorldGenMineable(SGOres.endEmeraldOre.getDefaultState(), blockSize(emerald), 1);
		this.endGoldOre = new SGWorldGenMineable(SGOres.endGoldOre.getDefaultState(), blockSize(gold), 1);
		this.endIronOre = new SGWorldGenMineable(SGOres.endIronOre.getDefaultState(), blockSize(iron), 1);
		this.endLapisOre = new SGWorldGenMineable(SGOres.endLapisOre.getDefaultState(), blockSize(lapis), 1);
		this.endRedstoneOre = new SGWorldGenMineable(SGOres.endRedstoneOre.getDefaultState(), blockSize(redstone), 1);
	}
	
	// Taken from vanilla, modified to work with my rarity/random values
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		int surfaceMinY = 0;
		int surfaceMaxY = 256;
		
		int netherMinY = 0;
		int netherMaxY = 126;
		
		int endMinY = 10;
		int endMaxY = 60;
		
		// the "rarity" number is the chance to spawn, max Y numbers taken from vanilla for the surface ores.
		switch(world.provider.getDimension()) 
		{
		case 0: //Over world
			runGenerator(this.coalOre, world, random, chunkX, chunkZ, coal, surfaceMinY, 132);
			runGenerator(this.diamondOre, world, random, chunkX, chunkZ, diamond, surfaceMinY, 16);
			runGenerator(this.emeraldOre, world, random, chunkX, chunkZ, emerald, surfaceMinY, 33);
			runGenerator(this.goldOre, world, random, chunkX, chunkZ, gold, surfaceMinY, 34);
			runGenerator(this.ironOre, world, random, chunkX, chunkZ, iron, surfaceMinY, 69);
			runGenerator(this.lapisOre, world, random, chunkX, chunkZ, lapis, surfaceMinY, 34);
			runGenerator(this.redstoneOre, world, random, chunkX, chunkZ, redstone, surfaceMinY, 17);
			
			break;
		case -1: //Nether
			runGenerator(this.netherCoalOre, world, random, chunkX, chunkZ, (coal * 2), netherMinY, netherMaxY);
			runGenerator(this.netherDiamondOre, world, random, chunkX, chunkZ, (diamond * 2), netherMinY, netherMaxY);
			runGenerator(this.netherEmeraldOre, world, random, chunkX, chunkZ, (emerald * 2), netherMinY, netherMaxY);
			runGenerator(this.netherGoldOre, world, random, chunkX, chunkZ, (gold * 2), netherMinY, netherMaxY);
			runGenerator(this.netherIronOre, world, random, chunkX, chunkZ, (iron * 2), netherMinY, netherMaxY);
			runGenerator(this.netherLapisOre, world, random, chunkX, chunkZ, (lapis * 2), netherMinY, netherMaxY);
			runGenerator(this.netherRedstoneOre, world, random, chunkX, chunkZ, (redstone * 2), netherMinY, netherMaxY);
			runGenerator(this.netherQuartz, world, random, chunkX, chunkZ, (coal * 6), netherMinY, netherMaxY);
			
			break;
		case 1: //The End	
			runGenerator(this.endCoalOre, world, random, chunkX, chunkZ, coal, endMinY, endMaxY);
			runGenerator(this.endDiamondOre, world, random, chunkX, chunkZ, diamond, endMinY, endMaxY);
			runGenerator(this.endEmeraldOre, world, random, chunkX, chunkZ, emerald, endMinY, endMaxY);
			runGenerator(this.endGoldOre, world, random, chunkX, chunkZ, gold, endMinY, endMaxY);
			runGenerator(this.endIronOre, world, random, chunkX, chunkZ, iron, endMinY, endMaxY);
			runGenerator(this.endLapisOre, world, random, chunkX, chunkZ, lapis, endMinY, endMaxY);
			runGenerator(this.endRedstoneOre, world, random, chunkX, chunkZ, redstone, endMinY, endMaxY);
			
			break;
		}
	}
	
	// Randomly choose how many blocks can be in a vein
	private int blockSize(int rarity)
	{
		if(ConfigurationManager.superEasyMode)
		{
			return 10 + (int) (Math.random() * 25);
		}
		else
		{
			if(rarity == coal)
			{
				return 2 + (int) (Math.random() * 17);
			}
			else if(rarity == diamond)
			{
				return 3 + (int) (Math.random() * 6);
			}
			else if(rarity == emerald)
			{
				return 1 + (int) (Math.random() * 6);
			}
			else if(rarity == gold)
			{
				return 3 + (int) (Math.random() * 9);
			}
			else if(rarity == iron)
			{
				return 5 + (int) (Math.random() * 19);
			}
			else if(rarity == lapis)
			{
				return 3 + (int) (Math.random() * 7);
			}
			
			else if(rarity == redstone)
			{
				return 3 + (int) (Math.random() * 7);
			}
			else
			{
				return 5 + (int) (Math.random() * 9);
			}
		}
	}
	
	// Taken from vanilla
	private void runGenerator (WorldGenerator generator, World world, Random rand, int chunkX, int chunkZ, int chanceToSpawn, int minHeight, int maxHeight)
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
			generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}
}
