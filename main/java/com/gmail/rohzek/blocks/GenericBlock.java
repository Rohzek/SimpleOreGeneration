package com.gmail.rohzek.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Allows you to change things about ALL of the custom blocks in this pack.
 * @author Rohzek
 *
 */
public class GenericBlock extends Block
{
	public GenericBlock(String unlocalizedName, Material mat, float hardness, float resistance)
	{
		super(mat);
		
		this.setUnlocalizedName(unlocalizedName);
		this.setHardness(hardness);
		this.setResistance(resistance);
	}
}
