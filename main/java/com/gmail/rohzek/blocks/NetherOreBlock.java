package com.gmail.rohzek.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

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
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return this == SGOres.netherCoalOre ? Items.coal :
        	   this == SGOres.netherDiamondOre ? Items.diamond :
        	   this == SGOres.netherEmeraldOre ? Items.emerald :
        	   this == SGOres.netherLapisOre ? Items.dye : 
        	   this == SGOres.netherRedstoneOre ? Items.redstone :
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
