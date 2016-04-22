package com.gmail.rohzek.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

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
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return this == SGOres.endCoalOre ? Items.coal :
        	   this == SGOres.endDiamondOre ? Items.diamond :
        	   this == SGOres.endEmeraldOre ? Items.emerald :
        	   this == SGOres.endLapisOre ? Items.dye : 
        	   this == SGOres.endRedstoneOre ? Items.redstone :
        	   Item.getItemFromBlock(this);
    }
	
	@Override
	public int quantityDropped(Random random)
    {
		return  this == SGOres.endCoalOre ? random.nextInt(2) :
     	   		this == SGOres.endLapisOre ? random.nextInt(8) : 
     	   		this == SGOres.endRedstoneOre ? random.nextInt(5) :
     	   		1;
    }
}
