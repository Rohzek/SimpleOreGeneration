package com.gmail.rohzek.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Allows you to change things about ALL of the Nether ores specifically
 * @author Rohzek
 *
 */
public class NetherOreBlock extends GenericBlock
{
	public NetherOreBlock(String unlocalizedName)
	{
		super(unlocalizedName, Material.ROCK, 3f, 15f);
		
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return this == SGOres.netherCoalOre ? Items.COAL :
        	   this == SGOres.netherDiamondOre ? Items.DIAMOND :
        	   this == SGOres.netherEmeraldOre ? Items.EMERALD :
        	   this == SGOres.netherLapisOre ? Items.DYE : 
        	   this == SGOres.netherRedstoneOre ? Items.REDSTONE :
        	   Item.getItemFromBlock(this);
    }
	
	@Override
	public int quantityDropped(Random random)
    {
		return  this == SGOres.netherCoalOre ? random.nextInt(2) :
     	   		this == SGOres.netherLapisOre ? random.nextInt(8) : 
     	   		this == SGOres.netherRedstoneOre ? random.nextInt(5) :
     	   		1;
    }
}
