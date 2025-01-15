package com.gmail.rohzek.simpleoregen.blocks;

import java.util.List;

import com.gmail.rohzek.simpleoregen.lib.TimeOutput;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

public class CheshireRoseFlowerItem extends BlockItem
{

	public CheshireRoseFlowerItem(Block block) 
	{
		super(block, new Item.Properties());
	}
	
	@Override
	public void inventoryTick(ItemStack stack, Level world, Entity entity, int slotId, boolean isSelected) 
	{
		if(entity instanceof Player) 
		{
			Player player = (Player) entity;
			
			if(!player.isCreative() && !player.isSpectator()) 
			{
				if(player.getInventory().offhand.getFirst().getItem().equals(WorldGenBlocks.CHESHIRE_ROSE_FLOWER.get().asItem())) 
				{
					player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 2, 0, false, false));
				}
			}
		}
	}
	
	@Override
	public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag tooltipFlag) 
	{
		if(Screen.hasShiftDown()) 
		{
			tooltip.add(Component.literal("§bE§dr§fi§dk§ba §c<3 §dA§fm§6y§r"));
			tooltip.add(Component.literal(""+TimeOutput.getTimeTogether()));
		}
	}
}
