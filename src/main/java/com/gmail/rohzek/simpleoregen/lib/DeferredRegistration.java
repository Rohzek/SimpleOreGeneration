package com.gmail.rohzek.simpleoregen.lib;

import java.util.function.Supplier;

import com.gmail.rohzek.simpleoregen.blocks.flowertypes.CheshireRoseFlowerItem;
import com.mojang.serialization.MapCodec;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.effects.EnchantmentEntityEffect;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DeferredRegistration 
{
	public static final DeferredRegister.Items ITEMS = DeferredRegister.Items.createItems(Reference.MODID);
	public static final DeferredRegister.Items ITEMS_FLOWERS = DeferredRegister.Items.createItems(Reference.MODID);
	public static final DeferredRegister.Items ITEMS_FLOWERS_POTTED = DeferredRegister.Items.createItems(Reference.MODID);
	public static final DeferredRegister.Items ITEM_BLOCKS = DeferredRegister.Items.createItems(Reference.MODID);
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.Blocks.createBlocks(Reference.MODID);
	public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS = DeferredRegister.create(BuiltInRegistries.ARMOR_MATERIAL, Reference.MODID);
	private static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(BuiltInRegistries.CREATIVE_MODE_TAB, Reference.MODID);
	
	public static final DeferredRegister<MapCodec<? extends EnchantmentEntityEffect>> ENTITY_ENCHANTMENT_EFFECT = 
			DeferredRegister.create(Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE, Reference.MODID);
	
	public static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block)
	{
		DeferredBlock<T> toReturn = BLOCKS.register(name, block);
		registerBlockItem(name, toReturn);
		return toReturn;
	}
	
	private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block)
	{
		if(name.toLowerCase().contains("rose")) 
		{
			if(name.toLowerCase().contains("potted")) 
			{
				ITEMS_FLOWERS_POTTED.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
			}
			else
			{
				if(name.toLowerCase().contains("cheshire")) 
				{
					ITEMS_FLOWERS.register(name, () -> new CheshireRoseFlowerItem(block.get()));
				}
				else 
				{
					ITEMS_FLOWERS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
				}
			}
		}
		else
		{
			ITEM_BLOCKS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
		}
	}
	
	public static void register(IEventBus bus)
	{
		ITEMS.register(bus);
		ITEM_BLOCKS.register(bus);
		ITEMS_FLOWERS.register(bus);
		ITEMS_FLOWERS_POTTED.register(bus);
		ARMOR_MATERIALS.register(bus);
		TABS.register(bus);
		BLOCKS.register(bus);
		ENTITY_ENCHANTMENT_EFFECT.register(bus);
	}

	public static final Supplier<CreativeModeTab> ITEM_GROUP = TABS.register(Reference.MODID, () -> CreativeModeTab.builder()
			.title(Component.translatable("itemGroup." + Reference.MODID))
			.icon(() -> new ItemStack(Blocks.IRON_ORE))
			.displayItems((params, output) -> {
				ITEMS_FLOWERS.getEntries().forEach(entry -> {
					output.accept(entry.get());
				});
				
				ITEMS.getEntries().forEach(entry -> {
					output.accept(entry.get());
				});
				
				ITEM_BLOCKS.getEntries().forEach(entry -> {
					output.accept(entry.get());
				});
			})
			.build()
	);
}

