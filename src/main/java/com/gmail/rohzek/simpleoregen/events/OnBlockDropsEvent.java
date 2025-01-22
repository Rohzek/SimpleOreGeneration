package com.gmail.rohzek.simpleoregen.events;

import java.util.List;
import java.util.Random;

import com.gmail.rohzek.simpleoregen.blocks.oretypes.ChaosOre;
import com.gmail.rohzek.simpleoregen.blocks.oretypes.EndChaosOre;
import com.gmail.rohzek.simpleoregen.blocks.oretypes.GravityChaosOre;
import com.gmail.rohzek.simpleoregen.blocks.oretypes.NetherChaosOre;
import com.gmail.rohzek.simpleoregen.items.OreGenItems;
import com.gmail.rohzek.simpleoregen.lib.ConfigurationManager;

import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.level.BlockDropsEvent;

@EventBusSubscriber
public class OnBlockDropsEvent 
{
	static Random rand;
	
	@SuppressWarnings("resource")
	@SubscribeEvent
	public static void onBlockBreakEvent(BlockDropsEvent event)
	{
		rand = new Random();
		var world = event.getLevel();
		Block block = event.getState().getBlock();
		BlockPos pos = event.getPos();
		List<ItemEntity> TODROP = event.getDrops();
		
		List<ItemLike> DROPS = List.of(Items.COAL, Items.RAW_COPPER, Items.DIAMOND, Items.EMERALD, Items.RAW_GOLD, Items.RAW_IRON, Items.REDSTONE, Items.LAPIS_LAZULI,
				OreGenItems.RAW_BAUXITE, OreGenItems.RAW_COBALT, OreGenItems.RAW_IRIDIUM, OreGenItems.RAW_LEAD, OreGenItems.RAW_NICKEL, OreGenItems.RAW_PLATINUM,
				OreGenItems.RUBY, OreGenItems.SAPPHIRE, OreGenItems.RAW_SILVER, OreGenItems.RAW_TIN, OreGenItems.RAW_TUNGSTEN, OreGenItems.RAW_URANIUM, OreGenItems.RAW_ZINC);
		
		if(block instanceof ChaosOre || block instanceof GravityChaosOre || block instanceof NetherChaosOre || block instanceof EndChaosOre) 
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
		
		if(block instanceof DropExperienceBlock) 
		{
			HolderLookup.Provider provider = Minecraft.getInstance().level.registryAccess();
			HolderLookup.RegistryLookup<Enchantment> enchanter = provider.lookupOrThrow(Registries.ENCHANTMENT);
			
			var tool = event.getTool();
			var enchants = tool.getAllEnchantments(enchanter);
			var silktouchlevel = enchants.getLevel(enchanter.get(Enchantments.SILK_TOUCH).get());
			
			if(silktouchlevel == 0)
			{
				if(block.getDescriptionId().contains("deepslate")) 
				{
					TODROP.add(new ItemEntity(world, pos.getX(), pos.getY() + 1, pos.getZ(), new ItemStack(Blocks.COBBLED_DEEPSLATE, rand.nextInt(2) + 1)));
				}
				else if(block.getDescriptionId().contains("nether")) 
				{
					TODROP.add(new ItemEntity(world, pos.getX(), pos.getY() + 1, pos.getZ(), new ItemStack(Blocks.NETHERRACK, rand.nextInt(2 + 1))));
				}
				else if(block.getDescriptionId().contains("end")) 
				{
					TODROP.add(new ItemEntity(world, pos.getX(), pos.getY() + 1, pos.getZ(), new ItemStack(Blocks.END_STONE, rand.nextInt(2 + 1))));
				}
				else 
				{
					TODROP.add(new ItemEntity(world, pos.getX(), pos.getY() + 1, pos.getZ(), new ItemStack(Blocks.COBBLESTONE, rand.nextInt(2) + 1)));
				}
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
