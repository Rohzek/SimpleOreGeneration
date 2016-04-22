package com.gmail.rohzek.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Lets you change things about ALL of the End blocks specifically.
 * @author Rohzek
 *
 */
public class EndOreBlock extends GenericBlock
{
	public EndOreBlock(String unlocalizedName)
	{
		super(unlocalizedName, Material.rock, 3f, 15f);
		
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
}
