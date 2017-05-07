package com.gmail.rohzek.blocks;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Random;

import org.lwjgl.input.Keyboard;

import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CheshireRose extends BlockBush
{
	public CheshireRose(String name)
	{
		super();
		this.setUnlocalizedName(name);
		this.setSoundType(SoundType.PLANT);
	}
	
	@Override
	public CreativeTabs getCreativeTabToDisplayOn() 
	{
		return CreativeTabs.DECORATIONS;
	}
	
	/**
	 * Calculates the time since October 24, 2016, in years, days, and months.
	 */
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced)
	{
		LocalDateTime fromDateTime = LocalDateTime.of(2016, 10, 24, 0, 0);
		LocalDateTime toDateTime = LocalDateTime.now();
		LocalDateTime tempDateTime = LocalDateTime.from(fromDateTime);

		long years = tempDateTime.until( toDateTime, ChronoUnit.YEARS);
		tempDateTime = tempDateTime.plusYears(years);

		long months = tempDateTime.until(toDateTime, ChronoUnit.MONTHS);
		tempDateTime = tempDateTime.plusMonths(months);

		// We're not actually going to use Days.
		long days = tempDateTime.until( toDateTime, ChronoUnit.DAYS);
		tempDateTime = tempDateTime.plusDays(days);
		
		String partOne = years > 1 ? years + " years " : years == 1 ? years + " year " : "";
		String partTwo = years > 0 && months > 0 ? " and " : "";
		String partThree = months > 1 ? months + " months" : months == 1 ? months + " month" : "";
		String partFour = " together. <3";
		
		String output = partOne + partTwo + partThree + partFour;
		
		String time = toDateTime.now() + "";
		
		if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
		{
			tooltip.add(TextFormatting.RED + "Rohzek loves CheshireRose");
			tooltip.add(TextFormatting.GOLD + output);
		}
	}
	
	/**
	 * Applies regeneration for 2 seconds, while standing on flower.
	 */
	@Override
	public void onEntityCollidedWithBlock(World world, BlockPos pos, IBlockState state, Entity entity) 
	{
		spawnHearts(world, pos, state, entity);
		
		EntityPlayer player;
		
		if(entity instanceof EntityPlayer)
		{
			player = (EntityPlayer)entity;
			player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 50, 0, true, false));
		}
	}
	
	/**
	 * Taken straight from the particles spawned when breeding animals, and tweaked
	 * ever so slightly. (i < 2 instead of i < 7)
	 */
	@SideOnly(Side.CLIENT)
	private void spawnHearts(World world, BlockPos pos, IBlockState state, Entity entity)
	{
		Random rand = new Random();
		int posX = pos.getX(), posY = pos.getY(), posZ = pos.getZ();
		float width = 1f, height = 1f;
		
		for (int i = 0; i < 2; ++i)
		{
			double d0 = rand.nextGaussian() * 0.02D;
			double d1 = rand.nextGaussian() * 0.02D;
			double d2 = rand.nextGaussian() * 0.02D;
			world.spawnParticle(EnumParticleTypes.HEART, 
					posX + (double)(rand.nextFloat() * width * 2.0F) - (double)width, 
					posY + 0.5D + (double)(rand.nextFloat() * height), 
					posZ + (double)(rand.nextFloat() * width * 2.0F) - (double)width, d0, d1, d2, new int[0]);
		}
	}
}
