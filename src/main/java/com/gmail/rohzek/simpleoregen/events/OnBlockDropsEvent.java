package com.gmail.rohzek.simpleoregen.events;

import java.util.List;
import java.util.Random;

import com.gmail.rohzek.simpleoregen.blocks.ChaosOreBlock;
import com.gmail.rohzek.simpleoregen.blocks.EndChaosOreBlock;
import com.gmail.rohzek.simpleoregen.blocks.GravityChaosOreBlock;
import com.gmail.rohzek.simpleoregen.blocks.NetherChaosOreBlock;
import com.gmail.rohzek.simpleoregen.items.OreGenItems;
import com.gmail.rohzek.simpleoregen.lib.ConfigurationManager;

import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.level.BlockDropsEvent;

@EventBusSubscriber
public class OnBlockDropsEvent 
{
	static Random rand;
	
	@SubscribeEvent
	public static void onBlockBreakEvent(BlockDropsEvent event)
	{
		rand = new Random();
		Block block = event.getState().getBlock();
		List<ItemEntity> TODROP = event.getDrops();
		
		List<ItemLike> DROPS = List.of(Items.COAL, Items.RAW_COPPER, Items.DIAMOND, Items.EMERALD, Items.RAW_GOLD, Items.RAW_IRON, Items.REDSTONE, Items.LAPIS_LAZULI,
				OreGenItems.RAW_BAUXITE, OreGenItems.RAW_COBALT, OreGenItems.RAW_IRIDIUM, OreGenItems.RAW_LEAD, OreGenItems.RAW_NICKEL, OreGenItems.RAW_PLATINUM,
				OreGenItems.RUBY, OreGenItems.SAPPHIRE, OreGenItems.RAW_SILVER, OreGenItems.RAW_TIN, OreGenItems.RAW_TUNGSTEN, OreGenItems.RAW_URANIUM, OreGenItems.RAW_ZINC);
		
		if(block instanceof ChaosOreBlock || block instanceof GravityChaosOreBlock || block instanceof NetherChaosOreBlock || block instanceof EndChaosOreBlock) 
		{
			TODROP.clear();
			String mode = ConfigurationManager.GENERAL.chaosBlockDropMode.get();
			
			switch(mode) 
			{
				case "none":
					break;
				case "single":
					TODROP.add(convertDrop(event, DROPS.get(rand.nextInt(DROPS.size()))));
					break;
				case "multiple":
					int amount = rand.nextInt(DROPS.size());
					for(int i = 0; i < amount; i++)
					{
						TODROP.add(convertDrop(event, DROPS.get(rand.nextInt(DROPS.size()))));
					}
					break;
				default:
					for(int i = 0; i < DROPS.size(); i++)
					{
						TODROP.add(convertDrop(event, DROPS.get(i)));
					}
					break;
			}
		}
	}
	
	static ItemEntity convertDrop(BlockDropsEvent event, ItemLike item) 
	{
		var world = event.getLevel();
		var pos = event.getPos();
		
		return new ItemEntity(world, pos.getX(), pos.getY() + 1, pos.getZ(), new ItemStack(item.asItem(), rand.nextInt(3) + 1));
	}
}
