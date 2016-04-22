package com.gmail.rohzek.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Allows you to change things about ALL of the Nether ores specifically
 * @author Rohzek
 *
 */
public class NetherOreBlock extends GenericBlock
{
	public NetherOreBlock(String unlocalizedName)
	{
		super(unlocalizedName, Material.rock, 3f, 15f);
		
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
}
