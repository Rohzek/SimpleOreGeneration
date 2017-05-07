package com.gmail.rohzek.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

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
		
		this.setRegistryName(unlocalizedName);
		
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return this == SGOres.END_COAL_ORE     ? Items.COAL :
        	   this == SGOres.END_DIAMOND_ORE  ? Items.DIAMOND :
        	   this == SGOres.END_EMERALD_ORE  ? Items.EMERALD :
        	   this == SGOres.END_LAPIS_ORE    ?  Items.DYE :
        	   this == SGOres.END_REDSTONE_ORE ? Items.REDSTONE :
        	   Item.getItemFromBlock(this);
    }
	
	@Override
	public int quantityDropped(Random random)
    {
		return  this == SGOres.END_COAL_ORE     ? 1 + random.nextInt(2) :
     	   		this == SGOres.END_LAPIS_ORE    ? 1 + random.nextInt(8) : 
     	   		this == SGOres.END_REDSTONE_ORE ? 1 + random.nextInt(5) :
     	   		1;
    }
	
	@Override
	public int damageDropped(IBlockState state)
    {
        return this == SGOres.END_LAPIS_ORE ? EnumDyeColor.BLUE.getDyeDamage() : 0;
    }
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) 
	{
		if(this == SGOres.END_LAPIS_ORE)
		{
			return new ItemStack(Item.getItemFromBlock(SGOres.END_LAPIS_ORE));
		}
		else
		{
			return super.getPickBlock(state, target, world, pos, player);
		}
	}
}
