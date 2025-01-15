package com.gmail.rohzek.simpleoregen.datagen;

import com.gmail.rohzek.simpleoregen.lib.Reference;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class OreGenTags 
{
	public static class Blocks
	{
		// Define tags for blocks
		public static final TagKey<Block> ALUMINIUM_ORES = createTag("aluminium_ores");
		
		public static final TagKey<Block> BRONZE_BLOCK = createTag("bronze_blocks");
		
		private static TagKey<Block> createTag(String name)
		{
			return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Reference.MODID, name));
		}
	}
	
	public static class Items
	{
		// Define tags for items
		public static final TagKey<Item> DIAMONDS = createTag("diamonds");
		public static final TagKey<Item> RUBIES = createTag("rubies");
		public static final TagKey<Item> SAPPHIRES = createTag("sapphires");
					
		private static TagKey<Item> createTag(String name)
		{
			return ItemTags.create(ResourceLocation.fromNamespaceAndPath(Reference.MODID, name));
		}
	}
}
