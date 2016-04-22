package com.gmail.rohzek.blocks;

import com.gmail.rohzek.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * New custom ores for generation in the Nether and End
 * @author Rohzek
 *
 */
public class SGOres 
{
	// Nether Ores
	public static Block netherCoalOre; 
	public static Block netherDiamondOre;  
	public static Block netherEmeraldOre; 
	public static Block netherIronOre;
	public static Block netherGoldOre;
	public static Block netherLapisOre;
	public static Block netherRedstoneOre;
	
	// End Ores
	public static Block endCoalOre; 
	public static Block endDiamondOre;  
	public static Block endEmeraldOre; 
	public static Block endIronOre;
	public static Block endGoldOre;
	public static Block endLapisOre;
	public static Block endRedstoneOre;
	
	public static void mainRegistry()
	{
		initializeBlock();
		registerBlock();
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
	}
	
	public static void registerBlock()
	{
		// Nether Ores
		GameRegistry.registerBlock(netherCoalOre, netherCoalOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(netherDiamondOre, netherDiamondOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(netherEmeraldOre, netherEmeraldOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(netherIronOre, netherIronOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(netherGoldOre, netherGoldOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(netherLapisOre, netherLapisOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(netherRedstoneOre, netherRedstoneOre.getUnlocalizedName().substring(5));
		
		// End Ores
		GameRegistry.registerBlock(endCoalOre, endCoalOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(endDiamondOre, endDiamondOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(endEmeraldOre, endEmeraldOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(endIronOre, endIronOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(endGoldOre, endGoldOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(endLapisOre, endLapisOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(endRedstoneOre, endRedstoneOre.getUnlocalizedName().substring(5));
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
