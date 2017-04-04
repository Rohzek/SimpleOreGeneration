package com.gmail.rohzek.world;

import java.util.Random;

import com.gmail.rohzek.blocks.SGOres;
import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.JsonParser;
import com.gmail.rohzek.util.LogHelper;

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
	
	public SGWorldGen()
	{	
		// Surface Ores
		this.coalOre = new SGWorldGenMineable(Blocks.COAL_ORE.getDefaultState(), blockSize(JsonParser.loadSurfaceCoalOre().get("veinMinimum").getAsInt(), JsonParser.loadSurfaceCoalOre().get("veinMultiplier").getAsInt()), 0);
		this.diamondOre = new SGWorldGenMineable(Blocks.DIAMOND_ORE.getDefaultState(), blockSize(JsonParser.loadSurfaceDiamondOre().get("veinMinimum").getAsInt(), JsonParser.loadSurfaceDiamondOre().get("veinMultiplier").getAsInt()), 0);
		this.emeraldOre = new SGWorldGenMineable(Blocks.EMERALD_ORE.getDefaultState(), blockSize(JsonParser.loadSurfaceEmeraldOre().get("veinMinimum").getAsInt(), JsonParser.loadSurfaceEmeraldOre().get("veinMultiplier").getAsInt()), 0);
		this.goldOre = new SGWorldGenMineable(Blocks.GOLD_ORE.getDefaultState(), blockSize(JsonParser.loadSurfaceGoldOre().get("veinMinimum").getAsInt(), JsonParser.loadSurfaceGoldOre().get("veinMultiplier").getAsInt()), 0);
		this.ironOre = new SGWorldGenMineable(Blocks.IRON_ORE.getDefaultState(), blockSize(JsonParser.loadSurfaceIronOre().get("veinMinimum").getAsInt(), JsonParser.loadSurfaceIronOre().get("veinMultiplier").getAsInt()), 0);
		this.lapisOre = new SGWorldGenMineable(Blocks.LAPIS_ORE.getDefaultState(), blockSize(JsonParser.loadSurfaceLapisOre().get("veinMinimum").getAsInt(), JsonParser.loadSurfaceLapisOre().get("veinMultiplier").getAsInt()), 0);
		this.redstoneOre = new SGWorldGenMineable(Blocks.REDSTONE_ORE.getDefaultState(), blockSize(JsonParser.loadSurfaceRedstoneOre().get("veinMinimum").getAsInt(),JsonParser.loadSurfaceRedstoneOre().get("veinMultiplier").getAsInt()), 0);
		
		// Nether Ores
		this.netherCoalOre = new SGWorldGenMineable(SGOres.netherCoalOre.getDefaultState(), blockSize(JsonParser.loadNetherCoalOre().get("veinMinimum").getAsInt(), JsonParser.loadNetherCoalOre().get("veinMultiplier").getAsInt()), -1);
		this.netherDiamondOre = new SGWorldGenMineable(SGOres.netherDiamondOre.getDefaultState(), blockSize(JsonParser.loadNetherDiamondOre().get("veinMinimum").getAsInt(), JsonParser.loadNetherDiamondOre().get("veinMultiplier").getAsInt()), -1);
		this.netherEmeraldOre = new SGWorldGenMineable(SGOres.netherEmeraldOre.getDefaultState(), blockSize(JsonParser.loadNetherEmeraldOre().get("veinMinimum").getAsInt(), JsonParser.loadNetherEmeraldOre().get("veinMultiplier").getAsInt()), -1);
		this.netherGoldOre = new SGWorldGenMineable(SGOres.netherGoldOre.getDefaultState(), blockSize(JsonParser.loadNetherGoldOre().get("veinMinimum").getAsInt(), JsonParser.loadNetherGoldOre().get("veinMultiplier").getAsInt()), -1);
		this.netherIronOre = new SGWorldGenMineable(SGOres.netherIronOre.getDefaultState(), blockSize(JsonParser.loadNetherIronOre().get("veinMinimum").getAsInt(), JsonParser.loadNetherIronOre().get("veinMultiplier").getAsInt()), -1);
		this.netherLapisOre = new SGWorldGenMineable(SGOres.netherLapisOre.getDefaultState(), blockSize(JsonParser.loadNetherLapisOre().get("veinMinimum").getAsInt(), JsonParser.loadNetherLapisOre().get("veinMultiplier").getAsInt()), -1);
		this.netherQuartz = new SGWorldGenMineable(SGOres.netherQuartzOre.getDefaultState(), blockSize(JsonParser.loadNetherQuartzOre().get("veinMinimum").getAsInt(), JsonParser.loadNetherQuartzOre().get("veinMultiplier").getAsInt()), -1);
		this.netherRedstoneOre = new SGWorldGenMineable(SGOres.netherRedstoneOre.getDefaultState(), blockSize(JsonParser.loadNetherRedstoneOre().get("veinMinimum").getAsInt(), JsonParser.loadNetherRedstoneOre().get("veinMultiplier").getAsInt()), -1);
		
		// End Ores
		this.endCoalOre = new SGWorldGenMineable(SGOres.endCoalOre.getDefaultState(), blockSize(JsonParser.loadEndCoalOre().get("veinMinimum").getAsInt(), JsonParser.loadEndCoalOre().get("veinMultiplier").getAsInt()), 1);
		this.endDiamondOre = new SGWorldGenMineable(SGOres.endDiamondOre.getDefaultState(), blockSize(JsonParser.loadEndDiamondOre().get("veinMinimum").getAsInt(), JsonParser.loadEndDiamondOre().get("veinMultiplier").getAsInt()), 1);
		this.endEmeraldOre = new SGWorldGenMineable(SGOres.endEmeraldOre.getDefaultState(), blockSize(JsonParser.loadEndEmeraldOre().get("veinMinimum").getAsInt(), JsonParser.loadEndEmeraldOre().get("veinMultiplier").getAsInt()), 1);
		this.endGoldOre = new SGWorldGenMineable(SGOres.endGoldOre.getDefaultState(), blockSize(JsonParser.loadEndGoldOre().get("veinMinimum").getAsInt(), JsonParser.loadEndGoldOre().get("veinMultiplier").getAsInt()), 1);
		this.endIronOre = new SGWorldGenMineable(SGOres.endIronOre.getDefaultState(), blockSize(JsonParser.loadEndIronOre().get("veinMinimum").getAsInt(), JsonParser.loadEndIronOre().get("veinMultiplier").getAsInt()), 1);
		this.endLapisOre = new SGWorldGenMineable(SGOres.endLapisOre.getDefaultState(), blockSize(JsonParser.loadEndLapisOre().get("veinMinimum").getAsInt(), JsonParser.loadEndLapisOre().get("veinMultiplier").getAsInt()), 1);
		this.endRedstoneOre = new SGWorldGenMineable(SGOres.endRedstoneOre.getDefaultState(), blockSize(JsonParser.loadEndRedstoneOre().get("veinMinimum").getAsInt(), JsonParser.loadEndRedstoneOre().get("veinMultiplier").getAsInt()), 1);
	}
	
	// Taken from vanilla, modified to work with my rarity/random values
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
			case 0:
				generateOverworldOres(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
				break;
			case -1:
				generateNetherOres(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
				break;
			case 1:
				generateEnderOres(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
				break;
			default:
				if(ConfigurationManager.supportNewDims)
				{
					generateOverworldOres(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
				}
				break;	
		}
	}
	
	// Randomly choose how many blocks can be in a vein
	private int blockSize(int min, int max)
	{
		return min + (int) (Math.random() * max);
	}
	
	private void generateOverworldOres(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		if(!JsonParser.loadSurfaceCoalOre().get("disableOre").getAsBoolean())
		{
			runGenerator(this.coalOre, world, random, chunkX, chunkZ, JsonParser.loadSurfaceCoalOre().get("rarity").getAsInt(), JsonParser.loadSurfaceCoalOre().get("minY").getAsInt(), JsonParser.loadSurfaceCoalOre().get("maxY").getAsInt());
		}
		
		if(!JsonParser.loadSurfaceDiamondOre().get("disableOre").getAsBoolean())
		{
			runGenerator(this.diamondOre, world, random, chunkX, chunkZ, JsonParser.loadSurfaceDiamondOre().get("rarity").getAsInt(), JsonParser.loadSurfaceDiamondOre().get("minY").getAsInt(), JsonParser.loadSurfaceDiamondOre().get("maxY").getAsInt());
		}
		
		if(!JsonParser.loadSurfaceEmeraldOre().get("disableOre").getAsBoolean())
		{
			runGenerator(this.emeraldOre, world, random, chunkX, chunkZ, JsonParser.loadSurfaceEmeraldOre().get("rarity").getAsInt(), JsonParser.loadSurfaceEmeraldOre().get("minY").getAsInt(), JsonParser.loadSurfaceEmeraldOre().get("maxY").getAsInt());
		}
		
		if(!JsonParser.loadSurfaceGoldOre().get("disableOre").getAsBoolean())
		{
			runGenerator(this.goldOre, world, random, chunkX, chunkZ, JsonParser.loadSurfaceGoldOre().get("rarity").getAsInt(), JsonParser.loadSurfaceGoldOre().get("minY").getAsInt(), JsonParser.loadSurfaceGoldOre().get("maxY").getAsInt());
		}
		
		if(!JsonParser.loadSurfaceIronOre().get("disableOre").getAsBoolean())
		{
			runGenerator(this.ironOre, world, random, chunkX, chunkZ, JsonParser.loadSurfaceIronOre().get("rarity").getAsInt(), JsonParser.loadSurfaceIronOre().get("minY").getAsInt(), JsonParser.loadSurfaceIronOre().get("maxY").getAsInt());
		}
		
		if(!JsonParser.loadSurfaceLapisOre().get("disableOre").getAsBoolean())
		{
			runGenerator(this.lapisOre, world, random, chunkX, chunkZ, JsonParser.loadSurfaceLapisOre().get("rarity").getAsInt(), JsonParser.loadSurfaceLapisOre().get("minY").getAsInt(), JsonParser.loadSurfaceLapisOre().get("maxY").getAsInt());
		}
		
		if(!JsonParser.loadSurfaceRedstoneOre().get("disableOre").getAsBoolean())
		{
			runGenerator(this.redstoneOre, world, random, chunkX, chunkZ, JsonParser.loadSurfaceRedstoneOre().get("rarity").getAsInt(), JsonParser.loadSurfaceRedstoneOre().get("minY").getAsInt(), JsonParser.loadSurfaceRedstoneOre().get("maxY").getAsInt());
		}
	}
	
	private void generateNetherOres(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		if(!JsonParser.loadNetherCoalOre().get("disableOre").getAsBoolean())
		{
			runGenerator(this.netherCoalOre, world, random, chunkX, chunkZ, JsonParser.loadNetherCoalOre().get("rarity").getAsInt(), JsonParser.loadNetherCoalOre().get("minY").getAsInt(), JsonParser.loadNetherCoalOre().get("maxY").getAsInt());
		}
		
		if(!JsonParser.loadNetherDiamondOre().get("disableOre").getAsBoolean())
		{
			runGenerator(this.netherDiamondOre, world, random, chunkX, chunkZ, JsonParser.loadNetherDiamondOre().get("rarity").getAsInt(), JsonParser.loadNetherDiamondOre().get("minY").getAsInt(), JsonParser.loadNetherDiamondOre().get("maxY").getAsInt());
		}
		
		if(!JsonParser.loadNetherEmeraldOre().get("disableOre").getAsBoolean())
		{
			runGenerator(this.netherEmeraldOre, world, random, chunkX, chunkZ, JsonParser.loadNetherEmeraldOre().get("rarity").getAsInt(), JsonParser.loadNetherEmeraldOre().get("minY").getAsInt(), JsonParser.loadNetherEmeraldOre().get("maxY").getAsInt());
		}
		
		if(!JsonParser.loadNetherGoldOre().get("disableOre").getAsBoolean())
		{
			runGenerator(this.netherGoldOre, world, random, chunkX, chunkZ, JsonParser.loadNetherGoldOre().get("rarity").getAsInt(), JsonParser.loadNetherGoldOre().get("minY").getAsInt(), JsonParser.loadNetherGoldOre().get("maxY").getAsInt());
		}
		
		if(!JsonParser.loadNetherIronOre().get("disableOre").getAsBoolean())
		{
			runGenerator(this.netherIronOre, world, random, chunkX, chunkZ, JsonParser.loadNetherIronOre().get("rarity").getAsInt(), JsonParser.loadNetherIronOre().get("minY").getAsInt(), JsonParser.loadNetherIronOre().get("maxY").getAsInt());
		}
		
		if(!JsonParser.loadNetherLapisOre().get("disableOre").getAsBoolean())
		{
			runGenerator(this.netherLapisOre, world, random, chunkX, chunkZ, JsonParser.loadNetherLapisOre().get("rarity").getAsInt(), JsonParser.loadNetherLapisOre().get("minY").getAsInt(), JsonParser.loadNetherLapisOre().get("maxY").getAsInt());
		}
		
		if(!JsonParser.loadNetherQuartzOre().get("disableOre").getAsBoolean())
		{
			runGenerator(this.netherQuartz, world, random, chunkX, chunkZ, JsonParser.loadNetherQuartzOre().get("rarity").getAsInt(), JsonParser.loadNetherQuartzOre().get("minY").getAsInt(), JsonParser.loadNetherQuartzOre().get("maxY").getAsInt());
		}
		
		if(!JsonParser.loadNetherRedstoneOre().get("disableOre").getAsBoolean())
		{
			runGenerator(this.netherRedstoneOre, world, random, chunkX, chunkZ, JsonParser.loadNetherRedstoneOre().get("rarity").getAsInt(), JsonParser.loadNetherRedstoneOre().get("minY").getAsInt(), JsonParser.loadNetherRedstoneOre().get("maxY").getAsInt());
		}
	}
	
	private void generateEnderOres(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		if(!JsonParser.loadEndCoalOre().get("disableOre").getAsBoolean())
		{
			runGenerator(this.endCoalOre, world, random, chunkX, chunkZ, JsonParser.loadEndCoalOre().get("rarity").getAsInt(), JsonParser.loadEndCoalOre().get("minY").getAsInt(), JsonParser.loadEndCoalOre().get("maxY").getAsInt());
		}
		
		if(!JsonParser.loadEndDiamondOre().get("disableOre").getAsBoolean())
		{
			runGenerator(this.endDiamondOre, world, random, chunkX, chunkZ, JsonParser.loadEndDiamondOre().get("rarity").getAsInt(), JsonParser.loadEndDiamondOre().get("minY").getAsInt(), JsonParser.loadEndDiamondOre().get("maxY").getAsInt());
		}
		
		if(!JsonParser.loadEndEmeraldOre().get("disableOre").getAsBoolean())
		{
			runGenerator(this.endEmeraldOre, world, random, chunkX, chunkZ, JsonParser.loadEndEmeraldOre().get("rarity").getAsInt(), JsonParser.loadEndEmeraldOre().get("minY").getAsInt(), JsonParser.loadEndEmeraldOre().get("maxY").getAsInt());
		}
		
		if(!JsonParser.loadEndGoldOre().get("disableOre").getAsBoolean())
		{
			runGenerator(this.endGoldOre, world, random, chunkX, chunkZ, JsonParser.loadEndGoldOre().get("rarity").getAsInt(), JsonParser.loadEndGoldOre().get("minY").getAsInt(), JsonParser.loadEndGoldOre().get("maxY").getAsInt());
		}
		
		if(!JsonParser.loadEndIronOre().get("disableOre").getAsBoolean())
		{
			runGenerator(this.endIronOre, world, random, chunkX, chunkZ, JsonParser.loadEndIronOre().get("rarity").getAsInt(), JsonParser.loadEndIronOre().get("minY").getAsInt(), JsonParser.loadEndIronOre().get("maxY").getAsInt());
		}
		
		if(!JsonParser.loadEndLapisOre().get("disableOre").getAsBoolean())
		{
			runGenerator(this.endLapisOre, world, random, chunkX, chunkZ, JsonParser.loadEndLapisOre().get("rarity").getAsInt(), JsonParser.loadEndLapisOre().get("minY").getAsInt(), JsonParser.loadEndLapisOre().get("maxY").getAsInt());
		}
		
		if(!JsonParser.loadEndRedstoneOre().get("disableOre").getAsBoolean())
		{
			runGenerator(this.endRedstoneOre, world, random, chunkX, chunkZ, JsonParser.loadEndRedstoneOre().get("rarity").getAsInt(), JsonParser.loadEndRedstoneOre().get("minY").getAsInt(), JsonParser.loadEndRedstoneOre().get("maxY").getAsInt());
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
