package com.gmail.rohzek.crafting;

import com.gmail.rohzek.blocks.SGBlocks;
import com.gmail.rohzek.items.SGItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingManager 
{
	public static void mainRegistry()
	{
		addCraftingRecipes();
	}
	
	public static void addCraftingRecipes()
	{
		// Redstone Comparator
		GameRegistry.addRecipe(new ItemStack(Items.COMPARATOR), new Object[]{" T ","TQT","SSS",'T', Blocks.REDSTONE_TORCH, 'Q', SGItems.QUARTZ, 'S', new ItemStack(Blocks.STONE, 1, 0)});
		// Daylight Sensor
		GameRegistry.addRecipe(new ItemStack(Blocks.DAYLIGHT_DETECTOR), new Object[]{"GGG","QQQ","WWW",'G', Blocks.GLASS, 'Q', SGItems.QUARTZ, 'W', Blocks.WOODEN_SLAB});
		
		// Quartz Block
		GameRegistry.addRecipe(new ItemStack(Blocks.QUARTZ_BLOCK), new Object[]{"QQ","QQ", 'Q', SGItems.QUARTZ});
		
		// Diorite
		GameRegistry.addRecipe(new ItemStack(Blocks.STONE, 2, 3), new Object[]{"CQ","QC",'C', Blocks.COBBLESTONE, 'Q', SGItems.QUARTZ});
		
		// Granite
		GameRegistry.addRecipe(new ItemStack(Blocks.STONE,  1, 1), new Object[]{"SQ", 'S', new ItemStack(Blocks.STONE, 1, 3), 'Q', SGItems.QUARTZ});
		
		// Block of Bronze
		GameRegistry.addRecipe(new ItemStack(SGBlocks.BRONZE_BLOCK), new Object[]{"BBB", "BBB", "BBB", 'B', SGItems.BRONZE_INGOT});
		
		// Bronze Ingot
		GameRegistry.addRecipe(new ItemStack(SGItems.BRONZE_INGOT), new Object[]{"CC", "CT", 'C', SGItems.BRONZE_INGOT, 'T', SGItems.TIN_INGOT});
		GameRegistry.addRecipe(new ItemStack(SGItems.BRONZE_INGOT), new Object[]{"BBB", "BBB", "BBB", 'B', SGItems.BRONZE_NUGGET});
		GameRegistry.addShapelessRecipe(new ItemStack(SGItems.BRONZE_INGOT, 9, 0), SGBlocks.BRONZE_BLOCK);
		
		// Bronze Nugget
		GameRegistry.addShapelessRecipe(new ItemStack(SGItems.BRONZE_NUGGET, 9, 0), SGItems.BRONZE_INGOT);
		
		// Nether Quartz
		GameRegistry.addRecipe(new ItemStack(Items.QUARTZ, 8), new Object[]{"QQQ", "QRQ", "QQQ", 'Q', SGItems.QUARTZ, 'R', Items.BLAZE_POWDER});
	}
}
