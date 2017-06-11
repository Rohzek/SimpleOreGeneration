package com.gmail.rohzek.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

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
		this.setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(this);
    }
	
	@Override
	public int quantityDropped(Random random)
    {
		return 1;
    }
}
