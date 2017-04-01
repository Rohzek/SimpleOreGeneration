package com.gmail.rohzek.blocks;

import com.gmail.rohzek.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * New custom ores for generation in the Nether and End
 * @author Rohzek
 *
 */
public class SGOres 
{
	// Nether Ore Blocks
	public static Block netherCoalOre; 
	public static Block netherDiamondOre;  
	public static Block netherEmeraldOre; 
	public static Block netherIronOre;
	public static Block netherGoldOre;
	public static Block netherLapisOre;
	public static Block netherRedstoneOre;
	
	// Nether Ores Item Blocks
	public static ItemBlock netherCoalOreItem; 
	public static ItemBlock netherDiamondOreItem;  
	public static ItemBlock netherEmeraldOreItem;
	public static ItemBlock netherIronOreItem;
	public static ItemBlock netherGoldOreItem;
	public static ItemBlock netherLapisOreItem;
	public static ItemBlock netherRedstoneOreItem;
	
	// End Ore Blocks
	public static Block endCoalOre; 
	public static Block endDiamondOre;  
	public static Block endEmeraldOre; 
	public static Block endIronOre;
	public static Block endGoldOre;
	public static Block endLapisOre;
	public static Block endRedstoneOre;
	
	// End Ores Item Blocks
	public static ItemBlock endCoalOreItem;
	public static ItemBlock endDiamondOreItem;
	public static ItemBlock endEmeraldOreItem;
	public static ItemBlock endIronOreItem;
	public static ItemBlock endGoldOreItem;
	public static ItemBlock endLapisOreItem;
	public static ItemBlock endRedstoneOreItem;
	
	public static void mainRegistry()
	{
		initializeBlock();
		registerBlock();
		initalizeItemBlock();
		registerItemBlock();
	}
	
	public static void initializeBlock()
	{
		// Nether Ores
		netherCoalOre = new NetherOreBlock("netherCoalOre");
		netherDiamondOre = new NetherOreBlock("netherDiamondOre");
		netherEmeraldOre = new NetherOreBlock("netherEmeraldOre");
		netherIronOre = new NetherOreBlock("netherIronOre");
		netherGoldOre = new NetherOreBlock("netherGoldOre");
		netherLapisOre = new NetherOreBlock("netherLapisOre");
		netherRedstoneOre = new NetherOreBlock("netherRedstoneOre");
		
		// End Ores
		endCoalOre = new EndOreBlock("endCoalOre");
		endDiamondOre = new EndOreBlock("endDiamondOre");  
		endEmeraldOre = new EndOreBlock("endEmeraldOre"); 
		endIronOre = new EndOreBlock("endIronOre");
		endGoldOre = new EndOreBlock("endGoldOre");
		endLapisOre = new EndOreBlock("endLapisOre");
		endRedstoneOre = new EndOreBlock("endRedstoneOre");
		
		// Registry Names
		
		// Nether Ores
		netherCoalOre.setRegistryName("netherCoalOre");
		netherDiamondOre.setRegistryName("netherDiamondOre");
		netherEmeraldOre.setRegistryName("netherEmeraldOre");
		netherIronOre.setRegistryName("netherIronOre");
		netherGoldOre.setRegistryName("netherGoldOre");
		netherLapisOre.setRegistryName("netherLapisOre");
		netherRedstoneOre.setRegistryName("netherRedstoneOre");
		
		// End Ores
		endCoalOre.setRegistryName("endCoalOre");
		endDiamondOre.setRegistryName("endDiamondOre"); 
		endEmeraldOre.setRegistryName("endEmeraldOre");
		endIronOre.setRegistryName("endIronOre");
		endGoldOre.setRegistryName("endGoldOre");
		endLapisOre.setRegistryName("endLapisOre");
		endRedstoneOre.setRegistryName("endRedstoneOre");
	}
	
	public static void initalizeItemBlock()
	{
		// Initialize Nether Ores
		netherCoalOreItem = new ItemBlock(netherCoalOre);
		netherDiamondOreItem = new ItemBlock(netherDiamondOre);
		netherEmeraldOreItem = new ItemBlock(netherEmeraldOre);
		netherIronOreItem = new ItemBlock(netherIronOre);
		netherGoldOreItem = new ItemBlock(netherGoldOre);
		netherLapisOreItem = new ItemBlock(netherLapisOre);
		netherRedstoneOreItem = new ItemBlock(netherRedstoneOre);
		
		// Initialize End Ores
		endCoalOreItem = new ItemBlock(endCoalOre);
		endDiamondOreItem = new ItemBlock(endDiamondOre);
		endEmeraldOreItem = new ItemBlock(endEmeraldOre);
		endIronOreItem = new ItemBlock(endIronOre);
		endGoldOreItem = new ItemBlock(endGoldOre);
		endLapisOreItem = new ItemBlock(endLapisOre);
		endRedstoneOreItem = new ItemBlock(endRedstoneOre);
		
		// Register Nether Ores
		netherCoalOreItem.setRegistryName("netherCoalOre");
		netherDiamondOreItem.setRegistryName("netherDiamondOre");
		netherEmeraldOreItem.setRegistryName("netherEmeraldOre");
		netherIronOreItem.setRegistryName("netherIronOre");
		netherGoldOreItem.setRegistryName("netherGoldOre");
		netherLapisOreItem.setRegistryName("netherLapisOre");
		netherRedstoneOreItem.setRegistryName("netherRedstoneOre");
		
		// Register End Ores
		endCoalOreItem.setRegistryName("endCoalOre");
		endDiamondOreItem.setRegistryName("endDiamondOre");
		endEmeraldOreItem.setRegistryName("endEmeraldOre");
		endIronOreItem.setRegistryName("endIronOre");
		endGoldOreItem.setRegistryName("endGoldOre");
		endLapisOreItem.setRegistryName("endLapisOre");
		endRedstoneOreItem.setRegistryName("endRedstoneOre");
	}
	
	public static void registerBlock()
	{
		// Nether Ores
		GameRegistry.register(netherCoalOre);
		GameRegistry.register(netherDiamondOre);
		GameRegistry.register(netherEmeraldOre);
		GameRegistry.register(netherIronOre);
		GameRegistry.register(netherGoldOre);
		GameRegistry.register(netherLapisOre);
		GameRegistry.register(netherRedstoneOre);
		
		// End Ores
		GameRegistry.register(endCoalOre);
		GameRegistry.register(endDiamondOre);
		GameRegistry.register(endEmeraldOre);
		GameRegistry.register(endIronOre);
		GameRegistry.register(endGoldOre);
		GameRegistry.register(endLapisOre);
		GameRegistry.register(endRedstoneOre);
	}
	
	public static void registerItemBlock()
	{
		// Nether Ores
		GameRegistry.register(netherCoalOreItem);
		GameRegistry.register(netherDiamondOreItem);
		GameRegistry.register(netherEmeraldOreItem);
		GameRegistry.register(netherIronOreItem);
		GameRegistry.register(netherGoldOreItem);
		GameRegistry.register(netherLapisOreItem);
		GameRegistry.register(netherRedstoneOreItem);
		
		// End Ores
		GameRegistry.register(endCoalOreItem);
		GameRegistry.register(endDiamondOreItem);
		GameRegistry.register(endEmeraldOreItem);
		GameRegistry.register(endIronOreItem);
		GameRegistry.register(endGoldOreItem);
		GameRegistry.register(endLapisOreItem);
		GameRegistry.register(endRedstoneOreItem);
	}
	
	public static void registerRenders()
	{
		// Nether Ores
		registerRender(netherCoalOre);
		registerRender(netherDiamondOre);
		registerRender(netherEmeraldOre);
		registerRender(netherIronOre);
		registerRender(netherGoldOre);
		registerRender(netherLapisOre);
		registerRender(netherRedstoneOre);
		
		// End Ores
		registerRender(endCoalOre);
		registerRender(endDiamondOre);
		registerRender(endEmeraldOre);
		registerRender(endIronOre);
		registerRender(endGoldOre);
		registerRender(endLapisOre);
		registerRender(endRedstoneOre);
	}
	
	public static void registerRender(Block block)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.RESOURCEID + block.getUnlocalizedName().substring(5), "inventory"));
	}
}
