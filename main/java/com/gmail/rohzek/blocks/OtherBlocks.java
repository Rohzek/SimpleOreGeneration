package com.gmail.rohzek.blocks;

import java.util.ArrayList;
import java.util.List;

import com.gmail.rohzek.compatibility.CheckForMods;

import forestry.core.ModuleCore;
import forestry.core.blocks.BlockResourceOre;
import forestry.core.blocks.EnumResourceType;
import mekanism.common.MekanismBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Optional;
import techreborn.init.ModBlocks;

public class OtherBlocks 
{
	public static IBlockState[] vanillaOres = new IBlockState[] 
			{
					Blocks.QUARTZ_ORE.getDefaultState(),
					Blocks.COAL_ORE.getDefaultState(),
					Blocks.DIAMOND_ORE.getDefaultState(),
					Blocks.EMERALD_ORE.getDefaultState(),
					Blocks.GOLD_ORE.getDefaultState(),
					Blocks.IRON_ORE.getDefaultState(),
					Blocks.LAPIS_ORE.getDefaultState(),
					Blocks.REDSTONE_ORE.getDefaultState()
			};
	public static List<ModOrePack> moddedSurfaceOres, moddedEndOres;
	
	public static void init()
	{
		moddedSurfaceOres = new ArrayList<ModOrePack>();
		moddedEndOres = new ArrayList<ModOrePack>();
		
		if(CheckForMods.check("forestry"))
		{
			forestry();
		}
		
		
		if(CheckForMods.check("techreborn"))
		{
			techReborn();
		}
		
		if(CheckForMods.check("mekanism"))
		{
			mekanism();
		}
	}
	
	@Optional.Method(modid = "forestry")
	static void forestry()
	{
		BlockResourceOre resourcesBlock = ModuleCore.getBlocks().resources;
		IBlockState apatiteBlockState = resourcesBlock.getStateFromMeta(EnumResourceType.APATITE.getMeta());
		moddedSurfaceOres.add(new ModOrePack("surfaceApatiteOre", apatiteBlockState));
	}
	
	@Optional.Method(modid = "techreborn")
	static void techReborn()
	{
		IBlockState galena = ModBlocks.ORE.getBlockStateFromName("galena");
		moddedSurfaceOres.add(new ModOrePack("surfaceGalenaOre", galena));
	}
	
	@Optional.Method(modid = "mekanism")
	static void mekanism()
	{
		IBlockState osmium = MekanismBlocks.OreBlock.getDefaultState();
		moddedSurfaceOres.add(new ModOrePack("surfaceOsmiumOre", osmium));
	}
}
