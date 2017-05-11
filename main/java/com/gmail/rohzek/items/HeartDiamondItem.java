package com.gmail.rohzek.items;

import java.util.List;

import org.lwjgl.input.Keyboard;

import com.gmail.rohzek.util.TimeOutput;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class HeartDiamondItem extends Item
{
	public HeartDiamondItem(String name)
	{
		setNames(name);
		this.setCreativeTab(CreativeTabs.MATERIALS);
	}
	
	private void setNames(String name)
	{
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
	}
	
	/**
	 * Calculates the time since October 24, 2016, in years, days, and months.
	 */
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced)
	{	
		if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
		{
			tooltip.add(TextFormatting.RED + "Rohzek loves CheshireRose");
			tooltip.add(TextFormatting.GOLD + TimeOutput.getTimeTogether());
		}
	}
	
	@Override
	public void getSubItems(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> subItems) 
	{
		ItemStack enchHeart = new ItemStack(itemIn);
		
		enchHeart.addEnchantment(Enchantments.FIRE_ASPECT, 4);
		enchHeart.addEnchantment(Enchantments.UNBREAKING, 4);
		
		subItems.add(enchHeart);
	}
	
	@Override
	public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) 
	{
		stack.addEnchantment(Enchantments.FIRE_ASPECT, 4);
		stack.addEnchantment(Enchantments.UNBREAKING, 4);
	}
}
