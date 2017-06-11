package com.gmail.rohzek.world;

import java.util.Random;

import com.gmail.rohzek.blocks.SGOres;
import com.gmail.rohzek.compatibility.ModdedConstants;
import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.json.JsonLoadICBlocks;
import com.gmail.rohzek.util.json.JsonLoaderForestryBlocks;
import com.gmail.rohzek.util.json.JsonNeutralModBlocks;
import com.gmail.rohzek.util.json.JsonParser;
/*
import forestry.core.PluginCore;
import forestry.core.blocks.BlockResourceOre;
import forestry.core.blocks.EnumResourceType;
*/
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.Optional;

// Modified from vanilla to make ores a little more (or less) controllable. Will generate evenly in valid Y levels
public class SGWorldGen implements IWorldGenerator
{	
	// Vanilla Surface Ores
	private WorldGenerator coalOre;
	private WorldGenerator diamondOre;
	private WorldGenerator emeraldOre;
	private WorldGenerator goldOre;
	private WorldGenerator ironOre;
	private WorldGenerator lapisOre;
	private WorldGenerator redstoneOre;
	
	// Vanilla Nether Ores
	private WorldGenerator netherCoalOre;
	private WorldGenerator netherDiamondOre;
	private WorldGenerator netherEmeraldOre;
	private WorldGenerator netherGoldOre;
	private WorldGenerator netherIronOre;
	private WorldGenerator netherLapisOre;
	private WorldGenerator netherQuartz;
	private WorldGenerator netherRedstoneOre;
	
	// Vanilla End Ores
	private WorldGenerator endCoalOre;
	private WorldGenerator endDiamondOre;
	private WorldGenerator endEmeraldOre;
	private WorldGenerator endGoldOre;
	private WorldGenerator endIronOre;
	private WorldGenerator endLapisOre;
	private WorldGenerator endRedstoneOre;
	
	// Modded Surface Ores
	private WorldGenerator surfaceApatiteOre;
	private WorldGenerator surfaceCopperOre;
	private WorldGenerator surfaceLeadOre;
	private WorldGenerator surfaceTinOre;
	private WorldGenerator surfaceUraniumOre;
	
	// Modded Nether Ores
	private WorldGenerator netherCopperOre;
	private WorldGenerator netherLeadOre;
	private WorldGenerator netherTinOre;
	private WorldGenerator netherUraniumOre;
	
	// Modded End Ores
	private WorldGenerator endCopperOre;
	private WorldGenerator endLeadOre;
	private WorldGenerator endTinOre;
	private WorldGenerator endUraniumOre;
	
	public SGWorldGen()
	{	
		// Vanilla Surface Ores
		this.coalOre = new SGWorldGenMineable(Blocks.COAL_ORE.getDefaultState(), blockSize(JsonParser.loadSurfaceCoalOre().get("veinMinimum").getAsInt(), JsonParser.loadSurfaceCoalOre().get("veinMultiplier").getAsInt()), 0);
		this.diamondOre = new SGWorldGenMineable(Blocks.DIAMOND_ORE.getDefaultState(), blockSize(JsonParser.loadSurfaceDiamondOre().get("veinMinimum").getAsInt(), JsonParser.loadSurfaceDiamondOre().get("veinMultiplier").getAsInt()), 0);
		this.emeraldOre = new SGWorldGenMineable(Blocks.EMERALD_ORE.getDefaultState(), blockSize(JsonParser.loadSurfaceEmeraldOre().get("veinMinimum").getAsInt(), JsonParser.loadSurfaceEmeraldOre().get("veinMultiplier").getAsInt()), 0);
		this.goldOre = new SGWorldGenMineable(Blocks.GOLD_ORE.getDefaultState(), blockSize(JsonParser.loadSurfaceGoldOre().get("veinMinimum").getAsInt(), JsonParser.loadSurfaceGoldOre().get("veinMultiplier").getAsInt()), 0);
		this.ironOre = new SGWorldGenMineable(Blocks.IRON_ORE.getDefaultState(), blockSize(JsonParser.loadSurfaceIronOre().get("veinMinimum").getAsInt(), JsonParser.loadSurfaceIronOre().get("veinMultiplier").getAsInt()), 0);
		this.lapisOre = new SGWorldGenMineable(Blocks.LAPIS_ORE.getDefaultState(), blockSize(JsonParser.loadSurfaceLapisOre().get("veinMinimum").getAsInt(), JsonParser.loadSurfaceLapisOre().get("veinMultiplier").getAsInt()), 0);
		this.redstoneOre = new SGWorldGenMineable(Blocks.REDSTONE_ORE.getDefaultState(), blockSize(JsonParser.loadSurfaceRedstoneOre().get("veinMinimum").getAsInt(),JsonParser.loadSurfaceRedstoneOre().get("veinMultiplier").getAsInt()), 0);
		
		// Vanilla Nether Ores
		this.netherCoalOre = new SGWorldGenMineable(SGOres.NETHER_COAL_ORE.getDefaultState(), blockSize(JsonParser.loadNetherCoalOre().get("veinMinimum").getAsInt(), JsonParser.loadNetherCoalOre().get("veinMultiplier").getAsInt()), -1);
		this.netherDiamondOre = new SGWorldGenMineable(SGOres.NETHER_DIAMOND_ORE.getDefaultState(), blockSize(JsonParser.loadNetherDiamondOre().get("veinMinimum").getAsInt(), JsonParser.loadNetherDiamondOre().get("veinMultiplier").getAsInt()), -1);
		this.netherEmeraldOre = new SGWorldGenMineable(SGOres.NETHER_EMERALD_ORE.getDefaultState(), blockSize(JsonParser.loadNetherEmeraldOre().get("veinMinimum").getAsInt(), JsonParser.loadNetherEmeraldOre().get("veinMultiplier").getAsInt()), -1);
		this.netherGoldOre = new SGWorldGenMineable(SGOres.NETHER_GOLD_ORE.getDefaultState(), blockSize(JsonParser.loadNetherGoldOre().get("veinMinimum").getAsInt(), JsonParser.loadNetherGoldOre().get("veinMultiplier").getAsInt()), -1);
		this.netherIronOre = new SGWorldGenMineable(SGOres.NETHER_IRON_ORE.getDefaultState(), blockSize(JsonParser.loadNetherIronOre().get("veinMinimum").getAsInt(), JsonParser.loadNetherIronOre().get("veinMultiplier").getAsInt()), -1);
		this.netherLapisOre = new SGWorldGenMineable(SGOres.NETHER_LAPIS_ORE.getDefaultState(), blockSize(JsonParser.loadNetherLapisOre().get("veinMinimum").getAsInt(), JsonParser.loadNetherLapisOre().get("veinMultiplier").getAsInt()), -1);
		this.netherQuartz = new SGWorldGenMineable(SGOres.NETHER_QUARTZ_ORE.getDefaultState(), blockSize(JsonParser.loadNetherQuartzOre().get("veinMinimum").getAsInt(), JsonParser.loadNetherQuartzOre().get("veinMultiplier").getAsInt()), -1);
		this.netherRedstoneOre = new SGWorldGenMineable(SGOres.NETHER_REDSTONE_ORE.getDefaultState(), blockSize(JsonParser.loadNetherRedstoneOre().get("veinMinimum").getAsInt(), JsonParser.loadNetherRedstoneOre().get("veinMultiplier").getAsInt()), -1);
		
		// Vanilla End Ores
		this.endCoalOre = new SGWorldGenMineable(SGOres.END_COAL_ORE.getDefaultState(), blockSize(JsonParser.loadEndCoalOre().get("veinMinimum").getAsInt(), JsonParser.loadEndCoalOre().get("veinMultiplier").getAsInt()), 1);
		this.endDiamondOre = new SGWorldGenMineable(SGOres.END_DIAMOND_ORE.getDefaultState(), blockSize(JsonParser.loadEndDiamondOre().get("veinMinimum").getAsInt(), JsonParser.loadEndDiamondOre().get("veinMultiplier").getAsInt()), 1);
		this.endEmeraldOre = new SGWorldGenMineable(SGOres.END_EMERALD_ORE.getDefaultState(), blockSize(JsonParser.loadEndEmeraldOre().get("veinMinimum").getAsInt(), JsonParser.loadEndEmeraldOre().get("veinMultiplier").getAsInt()), 1);
		this.endGoldOre = new SGWorldGenMineable(SGOres.END_GOLD_ORE.getDefaultState(), blockSize(JsonParser.loadEndGoldOre().get("veinMinimum").getAsInt(), JsonParser.loadEndGoldOre().get("veinMultiplier").getAsInt()), 1);
		this.endIronOre = new SGWorldGenMineable(SGOres.END_IRON_ORE.getDefaultState(), blockSize(JsonParser.loadEndIronOre().get("veinMinimum").getAsInt(), JsonParser.loadEndIronOre().get("veinMultiplier").getAsInt()), 1);
		this.endLapisOre = new SGWorldGenMineable(SGOres.END_LAPIS_ORE.getDefaultState(), blockSize(JsonParser.loadEndLapisOre().get("veinMinimum").getAsInt(), JsonParser.loadEndLapisOre().get("veinMultiplier").getAsInt()), 1);
		this.endRedstoneOre = new SGWorldGenMineable(SGOres.END_REDSTONE_ORE.getDefaultState(), blockSize(JsonParser.loadEndRedstoneOre().get("veinMinimum").getAsInt(), JsonParser.loadEndRedstoneOre().get("veinMultiplier").getAsInt()), 1);
	
		// Modded Surface Ores
		this.surfaceCopperOre = new SGWorldGenMineable(SGOres.SURFACE_COPPER_ORE.getDefaultState(), blockSize(JsonNeutralModBlocks.loadSurfaceCopper().get("veinMinimum").getAsInt(), JsonNeutralModBlocks.loadSurfaceCopper().get("veinMultiplier").getAsInt()), 0);
		this.surfaceLeadOre = new SGWorldGenMineable(SGOres.SURFACE_LEAD_ORE.getDefaultState(), blockSize(JsonNeutralModBlocks.loadSurfaceLead().get("veinMinimum").getAsInt(), JsonNeutralModBlocks.loadSurfaceLead().get("veinMultiplier").getAsInt()), 0);
		this.surfaceTinOre = new SGWorldGenMineable(SGOres.SURFACE_TIN_ORE.getDefaultState(), blockSize(JsonNeutralModBlocks.loadSurfaceLead().get("veinMinimum").getAsInt(), JsonNeutralModBlocks.loadSurfaceLead().get("veinMultiplier").getAsInt()), 0);
		this.surfaceUraniumOre = new SGWorldGenMineable(SGOres.SURFACE_URANIUM_ORE.getDefaultState(), blockSize(JsonLoadICBlocks.loadSurfaceUranium().get("veinMinimum").getAsInt(), JsonLoadICBlocks.loadSurfaceUranium().get("veinMultiplier").getAsInt()), 0);
		
		// Modded Nether Ores
		this.netherCopperOre = new SGWorldGenMineable(SGOres.NETHER_COPPER_ORE.getDefaultState(), blockSize(JsonNeutralModBlocks.loadNetherCopper().get("veinMinimum").getAsInt(), JsonNeutralModBlocks.loadNetherCopper().get("veinMultiplier").getAsInt()), -1);
		this.netherLeadOre = new SGWorldGenMineable(SGOres.NETHER_LEAD_ORE.getDefaultState(), blockSize(JsonNeutralModBlocks.loadNetherLead().get("veinMinimum").getAsInt(), JsonNeutralModBlocks.loadNetherLead().get("veinMultiplier").getAsInt()), -1);
		this.netherTinOre = new SGWorldGenMineable(SGOres.NETHER_TIN_ORE.getDefaultState(), blockSize(JsonNeutralModBlocks.loadNetherTin().get("veinMinimum").getAsInt(), JsonNeutralModBlocks.loadNetherTin().get("veinMultiplier").getAsInt()), -1);
		this.netherUraniumOre = new SGWorldGenMineable(SGOres.NETHER_URANIUM_ORE.getDefaultState(), blockSize(JsonLoadICBlocks.loadNetherUranium().get("veinMinimum").getAsInt(), JsonLoadICBlocks.loadNetherUranium().get("veinMultiplier").getAsInt()), -1);
		
		// Modded End Ores
		this.endCopperOre = new SGWorldGenMineable(SGOres.END_COPPER_ORE.getDefaultState(), blockSize(JsonNeutralModBlocks.loadEndCopper().get("veinMinimum").getAsInt(), JsonNeutralModBlocks.loadEndCopper().get("veinMultiplier").getAsInt()), 1);
		this.endLeadOre = new SGWorldGenMineable(SGOres.END_LEAD_ORE.getDefaultState(), blockSize(JsonNeutralModBlocks.loadEndLead().get("veinMinimum").getAsInt(), JsonNeutralModBlocks.loadEndLead().get("veinMultiplier").getAsInt()), 1);
		this.endTinOre = new SGWorldGenMineable(SGOres.END_TIN_ORE.getDefaultState(), blockSize(JsonNeutralModBlocks.loadEndTin().get("veinMinimum").getAsInt(), JsonNeutralModBlocks.loadEndTin().get("veinMultiplier").getAsInt()), 1);
		this.endUraniumOre = new SGWorldGenMineable(SGOres.END_URANIUM_ORE.getDefaultState(), blockSize(JsonLoadICBlocks.loadEndUranium().get("veinMinimum").getAsInt(), JsonLoadICBlocks.loadEndUranium().get("veinMultiplier").getAsInt()), 1);
		
	}
	
	// Taken from vanilla, modified to work with my rarity/random values
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
			case 0:
				if(ConfigurationManager.changeVanilla)
				{
					generateVanillaSurfaceOres(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
				}
				generateModdedSurfaceOres(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
				break;
			case -1:
				generateVanillaNetherOres(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
				generateModdedNetherOres(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
				break;
			case 1:
				generateVanillaEnderOres(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
				generateModdedEnderOres(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
				break;
			default:
				if(ConfigurationManager.supportNewDims)
				{
					generateVanillaSurfaceOres(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
					generateModdedSurfaceOres(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
				}
				break;	
		}
	}
	
	// Randomly choose how many blocks can be in a vein
	private int blockSize(int min, int max)
	{
		return min + (int) (Math.random() * max);
	}
	
	private void generateVanillaSurfaceOres(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
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
	
	private void generateModdedSurfaceOres(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		if(ModdedConstants.copperOre)
		{
			if(!JsonNeutralModBlocks.loadSurfaceCopper().get("disableOre").getAsBoolean())
			{
				runGenerator(this.surfaceCopperOre, world, random, chunkX, chunkZ, JsonNeutralModBlocks.loadSurfaceCopper().get("rarity").getAsInt(), JsonNeutralModBlocks.loadSurfaceCopper().get("minY").getAsInt(), JsonNeutralModBlocks.loadSurfaceCopper().get("maxY").getAsInt());
			}
		}
		
		if(ModdedConstants.leadOre)
		{
			if(!JsonNeutralModBlocks.loadSurfaceLead().get("disableOre").getAsBoolean())
			{
				runGenerator(this.surfaceLeadOre, world, random, chunkX, chunkZ, JsonNeutralModBlocks.loadSurfaceLead().get("rarity").getAsInt(), JsonNeutralModBlocks.loadSurfaceLead().get("minY").getAsInt(), JsonNeutralModBlocks.loadSurfaceLead().get("maxY").getAsInt());
			}
		}
		
		if(ModdedConstants.tinOre)
		{
			if(!JsonNeutralModBlocks.loadSurfaceTin().get("disableOre").getAsBoolean())
			{
				runGenerator(this.surfaceTinOre, world, random, chunkX, chunkZ, JsonNeutralModBlocks.loadSurfaceTin().get("rarity").getAsInt(), JsonNeutralModBlocks.loadSurfaceTin().get("minY").getAsInt(), JsonNeutralModBlocks.loadSurfaceTin().get("maxY").getAsInt());
			}
		}
		
		if(ModdedConstants.uraniumOre)
		{
			if(!JsonLoadICBlocks.loadSurfaceUranium().get("disableOre").getAsBoolean())
			{
				runGenerator(this.surfaceUraniumOre, world, random, chunkX, chunkZ, JsonLoadICBlocks.loadSurfaceUranium().get("rarity").getAsInt(), JsonLoadICBlocks.loadSurfaceUranium().get("minY").getAsInt(), JsonLoadICBlocks.loadSurfaceUranium().get("maxY").getAsInt());
			}
		}
		
		if(ModdedConstants.apatiteOre)
		{
			generateForestrySurfaceOres(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	
	@Optional.Method(modid = "forestry")
	private void generateForestrySurfaceOres(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		/*
		BlockResourceOre resourcesBlock = PluginCore.getBlocks().resources;
		IBlockState apatiteBlockState = resourcesBlock.getStateFromMeta(EnumResourceType.APATITE.getMeta());
		this.surfaceApatiteOre = new SGWorldGenMineable(apatiteBlockState, blockSize(JsonLoaderForestryBlocks.loadSurfaceApatite().get("veinMinimum").getAsInt(), JsonLoaderForestryBlocks.loadSurfaceApatite().get("veinMultiplier").getAsInt()), 0);
		
		if(!JsonLoaderForestryBlocks.loadSurfaceApatite().get("disableOre").getAsBoolean())
		{
			runGenerator(this.surfaceApatiteOre, world, random, chunkX, chunkZ, JsonLoaderForestryBlocks.loadSurfaceApatite().get("rarity").getAsInt(), JsonLoaderForestryBlocks.loadSurfaceApatite().get("minY").getAsInt(), JsonLoaderForestryBlocks.loadSurfaceApatite().get("maxY").getAsInt());
		}
		*/
	}
	
	private void generateVanillaNetherOres(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
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
		
		if(ConfigurationManager.changeVanilla)
		{
			if(!JsonParser.loadNetherQuartzOre().get("disableOre").getAsBoolean())
			{
				runGenerator(this.netherQuartz, world, random, chunkX, chunkZ, JsonParser.loadNetherQuartzOre().get("rarity").getAsInt(), JsonParser.loadNetherQuartzOre().get("minY").getAsInt(), JsonParser.loadNetherQuartzOre().get("maxY").getAsInt());
			}
		}
		
		if(!JsonParser.loadNetherRedstoneOre().get("disableOre").getAsBoolean())
		{
			runGenerator(this.netherRedstoneOre, world, random, chunkX, chunkZ, JsonParser.loadNetherRedstoneOre().get("rarity").getAsInt(), JsonParser.loadNetherRedstoneOre().get("minY").getAsInt(), JsonParser.loadNetherRedstoneOre().get("maxY").getAsInt());
		}
	}
	
	private void generateModdedNetherOres(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		if(ModdedConstants.copperOre)
		{
			if(!JsonNeutralModBlocks.loadNetherCopper().get("disableOre").getAsBoolean())
			{
				runGenerator(this.netherCopperOre, world, random, chunkX, chunkZ, JsonNeutralModBlocks.loadNetherCopper().get("rarity").getAsInt(), JsonNeutralModBlocks.loadNetherCopper().get("minY").getAsInt(), JsonNeutralModBlocks.loadNetherCopper().get("maxY").getAsInt());
			}
		}
		
		if(ModdedConstants.leadOre)
		{
			if(!JsonNeutralModBlocks.loadNetherLead().get("disableOre").getAsBoolean())
			{
				runGenerator(this.netherLeadOre, world, random, chunkX, chunkZ, JsonNeutralModBlocks.loadNetherLead().get("rarity").getAsInt(), JsonNeutralModBlocks.loadNetherLead().get("minY").getAsInt(), JsonNeutralModBlocks.loadNetherLead().get("maxY").getAsInt());
			}
		}
		
		if(ModdedConstants.tinOre)
		{
			if(!JsonNeutralModBlocks.loadNetherTin().get("disableOre").getAsBoolean())
			{
				runGenerator(this.netherTinOre, world, random, chunkX, chunkZ, JsonNeutralModBlocks.loadNetherTin().get("rarity").getAsInt(), JsonNeutralModBlocks.loadNetherTin().get("minY").getAsInt(), JsonNeutralModBlocks.loadNetherTin().get("maxY").getAsInt());
			}
		}
		
		if(ModdedConstants.uraniumOre)
		{
			if(!JsonLoadICBlocks.loadNetherUranium().get("disableOre").getAsBoolean())
			{
				runGenerator(this.netherUraniumOre, world, random, chunkX, chunkZ, JsonLoadICBlocks.loadNetherUranium().get("rarity").getAsInt(), JsonLoadICBlocks.loadNetherUranium().get("minY").getAsInt(), JsonLoadICBlocks.loadNetherUranium().get("maxY").getAsInt());
			}
		}
	}
	
	private void generateVanillaEnderOres(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
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
	
	private void generateModdedEnderOres(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		if(ModdedConstants.copperOre)
		{
			if(!JsonNeutralModBlocks.loadEndCopper().get("disableOre").getAsBoolean())
			{
				runGenerator(this.endCopperOre, world, random, chunkX, chunkZ, JsonNeutralModBlocks.loadEndCopper().get("rarity").getAsInt(), JsonNeutralModBlocks.loadEndCopper().get("minY").getAsInt(), JsonNeutralModBlocks.loadEndCopper().get("maxY").getAsInt());
			}
		}
		
		if(ModdedConstants.leadOre)
		{
			if(!JsonNeutralModBlocks.loadEndLead().get("disableOre").getAsBoolean())
			{
				runGenerator(this.endLeadOre, world, random, chunkX, chunkZ, JsonNeutralModBlocks.loadEndLead().get("rarity").getAsInt(), JsonNeutralModBlocks.loadEndLead().get("minY").getAsInt(), JsonNeutralModBlocks.loadEndLead().get("maxY").getAsInt());
			}
		}
		
		if(ModdedConstants.tinOre)
		{
			if(!JsonNeutralModBlocks.loadEndTin().get("disableOre").getAsBoolean())
			{
				runGenerator(this.endTinOre, world, random, chunkX, chunkZ, JsonNeutralModBlocks.loadEndTin().get("rarity").getAsInt(), JsonNeutralModBlocks.loadEndTin().get("minY").getAsInt(), JsonNeutralModBlocks.loadEndTin().get("maxY").getAsInt());
			}
		}
		
		if(ModdedConstants.uraniumOre)
		{
			if(!JsonLoadICBlocks.loadEndUranium().get("disableOre").getAsBoolean())
			{
				runGenerator(this.endUraniumOre, world, random, chunkX, chunkZ, JsonLoadICBlocks.loadEndUranium().get("rarity").getAsInt(), JsonLoadICBlocks.loadEndUranium().get("minY").getAsInt(), JsonLoadICBlocks.loadEndUranium().get("maxY").getAsInt());
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
