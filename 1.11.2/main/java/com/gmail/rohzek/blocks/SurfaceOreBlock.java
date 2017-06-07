package com.gmail.rohzek.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SurfaceOreBlock extends GenericBlock
{

	public SurfaceOreBlock(String unlocalizedName) 
	{
		super(unlocalizedName, Material.ROCK, 3f, 15f);
		
		this.setRegistryName(unlocalizedName);
		
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
}
