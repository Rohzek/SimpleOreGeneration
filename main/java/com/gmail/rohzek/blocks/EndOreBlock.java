package com.gmail.rohzek.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
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
		super(unlocalizedName, Material.ROCK, 3f, 15f);
		
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return this == SGOres.endCoalOre ? Items.COAL :
        	   this == SGOres.endDiamondOre ? Items.DIAMOND :
        	   this == SGOres.endEmeraldOre ? Items.EMERALD :
        	   this == SGOres.endLapisOre   ?  Items.DYE :
        	   this == SGOres.endRedstoneOre ? Items.REDSTONE :
        	   Item.getItemFromBlock(this);
    }
	
	@Override
	public int quantityDropped(Random random)
    {
		return  this == SGOres.endCoalOre ? 1 + random.nextInt(2) :
     	   		this == SGOres.endLapisOre ? 1 + random.nextInt(8) : 
     	   		this == SGOres.endRedstoneOre ? 1 + random.nextInt(5) :
     	   		1;
    }
	
	@Override
	public int damageDropped(IBlockState state)
    {
        return this == SGOres.endLapisOre ? EnumDyeColor.BLUE.getDyeDamage() : 0;
    }
}
