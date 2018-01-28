package com.gmail.rohzek.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SolidBlock extends Block
{

	public SolidBlock(String name) 
	{
		super(Material.IRON);
		
		setNames(name);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(3f);
		this.setResistance(15f);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	
	public void setNames(String name)
	{
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
	}
}
