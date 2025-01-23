package com.gmail.rohzek.simpleoregen.data;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import com.gmail.rohzek.simpleoregen.items.OreGenArmors;
import com.gmail.rohzek.simpleoregen.items.OreGenItems;
import com.gmail.rohzek.simpleoregen.items.OreGenTools;
import com.gmail.rohzek.simpleoregen.lib.Reference;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemTagProvider extends ItemTagsProvider 
{
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) 
    {
        super(output, lookupProvider, blockTags, Reference.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) 
    {
    	tag(OreGenTags.Items.PLANKS)
			.add(Items.ACACIA_PLANKS)
			.add(Items.BAMBOO_PLANKS)
			.add(Items.BIRCH_PLANKS)
			.add(Items.CHERRY_PLANKS)
			.add(Items.CRIMSON_PLANKS)
			.add(Items.DARK_OAK_PLANKS)
			.add(Items.JUNGLE_PLANKS)
			.add(Items.MANGROVE_PLANKS)
			.add(Items.OAK_PLANKS)
			.add(Items.SPRUCE_PLANKS)
			.add(Items.WARPED_PLANKS);
    	
    	tag(OreGenTags.Items.STONES)
			.add(Items.COBBLED_DEEPSLATE)
			.add(Items.COBBLESTONE)
			.add(Items.MOSSY_COBBLESTONE)
			.add(Items.STONE)
			.add(Items.BLACKSTONE)
			.add(Items.ANDESITE)
			.add(Items.DIORITE)
			.add(Items.GRANITE);
    	
    	tag(OreGenTags.Items.COALS)
    		.add(Items.CHARCOAL)
    		.add(Items.COAL);
    	
    	tag(Tags.Items.GEMS_DIAMOND)
	    	.add(OreGenItems.HEART_DIAMOND.get())
	    	.add(Items.DIAMOND);
        
        tag(OreGenTags.Items.RUBIES)
        	.add(OreGenItems.RUBY.get());
        
        tag(OreGenTags.Items.SAPPHIRES)
    		.add(OreGenItems.SAPPHIRE.get());
        
        tag(OreGenTags.Items.RAW_BAUXITES)
			.add(OreGenItems.RAW_BAUXITE.get());
        
        tag(OreGenTags.Items.RAW_ALUMINIUMS)
			.add(OreGenItems.RAW_BAUXITE.get());
        
        tag(OreGenTags.Items.RAW_ALUMINUMS)
			.add(OreGenItems.RAW_BAUXITE.get());
        
        tag(OreGenTags.Items.RAW_COBALTS)
    		.add(OreGenItems.RAW_COBALT.get());
        
        tag(OreGenTags.Items.RAW_IRIDIUMS)
			.add(OreGenItems.RAW_IRIDIUM.get());
        
        tag(OreGenTags.Items.RAW_LEADS)
			.add(OreGenItems.RAW_LEAD.get());
        
        tag(OreGenTags.Items.RAW_NICKELS)
			.add(OreGenItems.RAW_NICKEL.get());
        
        tag(OreGenTags.Items.RAW_PLATINUMS)
			.add(OreGenItems.RAW_PLATINUM.get());
        
        tag(OreGenTags.Items.RAW_SILVERS)
			.add(OreGenItems.RAW_SILVER.get());
        
        tag(OreGenTags.Items.RAW_TINS)
			.add(OreGenItems.RAW_TIN.get());
        
        tag(OreGenTags.Items.RAW_TUNGSTENS)
			.add(OreGenItems.RAW_TUNGSTEN.get());
        
        tag(OreGenTags.Items.RAW_URANIUMS)
			.add(OreGenItems.RAW_URANIUM.get());
        
        tag(OreGenTags.Items.RAW_ZINCS)
			.add(OreGenItems.RAW_ZINC.get());
        
        tag(OreGenTags.Items.BAUXITE_INGOTS)
			.add(OreGenItems.BAUXITE_INGOT.get());
        
        tag(OreGenTags.Items.ALUMINUM_INGOTS)
			.add(OreGenItems.BAUXITE_INGOT.get());
        
        tag(OreGenTags.Items.ALUMINIUM_INGOTS)
			.add(OreGenItems.BAUXITE_INGOT.get());
        
        tag(OreGenTags.Items.BRONZE_INGOTS)
			.add(OreGenItems.BRONZE_INGOT.get());
        
        tag(OreGenTags.Items.COBALT_INGOTS)
			.add(OreGenItems.COBALT_INGOT.get());
        
        tag(OreGenTags.Items.IRIDIUM_INGOTS)
			.add(OreGenItems.IRIDIUM_INGOT.get());
        
        tag(OreGenTags.Items.LEAD_INGOTS)
			.add(OreGenItems.LEAD_INGOT.get());
        
        tag(OreGenTags.Items.NICKEL_INGOTS)
			.add(OreGenItems.NICKEL_INGOT.get());
        
        tag(OreGenTags.Items.PLATINUM_INGOTS)
			.add(OreGenItems.PLATINUM_INGOT.get());
        
        tag(OreGenTags.Items.SILVER_INGOTS)
			.add(OreGenItems.SILVER_INGOT.get());
        
        tag(OreGenTags.Items.STEEL_INGOTS)
			.add(OreGenItems.STEEL_INGOT.get());
        
        tag(OreGenTags.Items.TIN_INGOTS)
			.add(OreGenItems.TIN_INGOT.get());
        
        tag(OreGenTags.Items.TUNGSTEN_INGOTS)
			.add(OreGenItems.TUNGSTEN_INGOT.get());
        
        tag(OreGenTags.Items.URANIUM_INGOTS)
			.add(OreGenItems.URANIUM_INGOT.get());
        
        tag(OreGenTags.Items.ZINC_INGOTS)
			.add(OreGenItems.ZINC_INGOT.get());
        
        tag(OreGenTags.Items.BAUXITE_NUGGETS)
			.add(OreGenItems.BAUXITE_NUGGET.get());
        
        tag(OreGenTags.Items.ALUMINUM_NUGGETS)
			.add(OreGenItems.BAUXITE_NUGGET.get());
        
        tag(OreGenTags.Items.ALUMINIUM_NUGGETS)
			.add(OreGenItems.BAUXITE_NUGGET.get());
        
        tag(OreGenTags.Items.BRONZE_NUGGETS)
			.add(OreGenItems.BRONZE_NUGGET.get());
        
        tag(OreGenTags.Items.COBALT_NUGGETS)
			.add(OreGenItems.COBALT_NUGGET.get());
        
        tag(OreGenTags.Items.COPPER_NUGGETS)
			.add(OreGenItems.COPPER_NUGGET.get());
        
        tag(OreGenTags.Items.IRIDIUM_NUGGETS)
			.add(OreGenItems.IRIDIUM_NUGGET.get());
        
        tag(OreGenTags.Items.LEAD_NUGGETS)
			.add(OreGenItems.LEAD_NUGGET.get());
        
        tag(OreGenTags.Items.NICKEL_NUGGETS)
			.add(OreGenItems.NICKEL_NUGGET.get());
        
        tag(OreGenTags.Items.PLATINUM_NUGGETS)
			.add(OreGenItems.PLATINUM_NUGGET.get());
        
        tag(OreGenTags.Items.SILVER_NUGGETS)
			.add(OreGenItems.SILVER_NUGGET.get());
        
        tag(OreGenTags.Items.STEEL_NUGGETS)
			.add(OreGenItems.STEEL_NUGGET.get());
        
        tag(OreGenTags.Items.TIN_NUGGETS)
			.add(OreGenItems.TIN_NUGGET.get());
        
        tag(OreGenTags.Items.TUNGSTEN_NUGGETS)
			.add(OreGenItems.TUNGSTEN_NUGGET.get());
        
        tag(OreGenTags.Items.URANIUM_NUGGETS)
        	.add(OreGenItems.URANIUM_NUGGET.get());
        
        tag(OreGenTags.Items.ZINC_NUGGETS)
			.add(OreGenItems.ZINC_NUGGET.get());
        
        tag(OreGenTags.Items.BAUXITE_PICKAXES)
			.add(OreGenTools.BAUXITE_PICKAXE.get());
    
	    tag(OreGenTags.Items.ALUMINUM_PICKAXES)
			.add(OreGenTools.BAUXITE_PICKAXE.get());
	    
	    tag(OreGenTags.Items.ALUMINIUM_PICKAXES)
			.add(OreGenTools.BAUXITE_PICKAXE.get());
	    
	    tag(OreGenTags.Items.BRONZE_PICKAXES)
			.add(OreGenTools.BRONZE_PICKAXE.get());
	    
	    tag(OreGenTags.Items.COBALT_PICKAXES)
			.add(OreGenTools.COBALT_PICKAXE.get());
	    
	    tag(OreGenTags.Items.IRIDIUM_PICKAXES)
			.add(OreGenTools.IRIDIUM_PICKAXE.get());
	    
	    tag(OreGenTags.Items.LEAD_PICKAXES)
			.add(OreGenTools.LEAD_PICKAXE.get());
	    
	    tag(OreGenTags.Items.NICKEL_PICKAXES)
			.add(OreGenTools.NICKEL_PICKAXE.get());
	    
	    tag(OreGenTags.Items.PLATINUM_PICKAXES)
			.add(OreGenTools.PLATINUM_PICKAXE.get());
	    
	    tag(OreGenTags.Items.SILVER_PICKAXES)
			.add(OreGenTools.SILVER_PICKAXE.get());
	    
	    tag(OreGenTags.Items.STEEL_PICKAXES)
			.add(OreGenTools.STEEL_PICKAXE.get());
	    
	    tag(OreGenTags.Items.TIN_PICKAXES)
			.add(OreGenTools.TIN_PICKAXE.get());
	    
	    tag(OreGenTags.Items.TUNGSTEN_PICKAXES)
			.add(OreGenTools.TUNGSTEN_PICKAXE.get());
	    
	    tag(OreGenTags.Items.URANIUM_PICKAXES)
			.add(OreGenTools.URANIUM_PICKAXE.get());
	    
	    tag(OreGenTags.Items.ZINC_PICKAXES)
			.add(OreGenTools.ZINC_PICKAXE.get());
	    
	    tag(OreGenTags.Items.BAUXITE_AXES)
			.add(OreGenTools.BAUXITE_AXE.get());
    
	    tag(OreGenTags.Items.ALUMINUM_AXES)
			.add(OreGenTools.BAUXITE_AXE.get());
	    
	    tag(OreGenTags.Items.ALUMINIUM_AXES)
			.add(OreGenTools.BAUXITE_AXE.get());
	    
	    tag(OreGenTags.Items.BRONZE_AXES)
			.add(OreGenTools.BRONZE_AXE.get());
	    
	    tag(OreGenTags.Items.COBALT_AXES)
			.add(OreGenTools.COBALT_AXE.get());
	    
	    tag(OreGenTags.Items.IRIDIUM_AXES)
			.add(OreGenTools.IRIDIUM_AXE.get());
	    
	    tag(OreGenTags.Items.LEAD_AXES)
			.add(OreGenTools.LEAD_AXE.get());
	    
	    tag(OreGenTags.Items.NICKEL_AXES)
			.add(OreGenTools.NICKEL_AXE.get());
	    
	    tag(OreGenTags.Items.PLATINUM_AXES)
			.add(OreGenTools.PLATINUM_AXE.get());
	    
	    tag(OreGenTags.Items.SILVER_AXES)
			.add(OreGenTools.SILVER_AXE.get());
	    
	    tag(OreGenTags.Items.STEEL_AXES)
			.add(OreGenTools.STEEL_AXE.get());
	    
	    tag(OreGenTags.Items.TIN_AXES)
			.add(OreGenTools.TIN_AXE.get());
	    
	    tag(OreGenTags.Items.TUNGSTEN_AXES)
			.add(OreGenTools.TUNGSTEN_AXE.get());
	    
	    tag(OreGenTags.Items.URANIUM_AXES)
			.add(OreGenTools.URANIUM_AXE.get());
	    
	    tag(OreGenTags.Items.ZINC_AXES)
			.add(OreGenTools.ZINC_AXE.get());
	    
	    tag(OreGenTags.Items.BAUXITE_HOES)
			.add(OreGenTools.BAUXITE_HOE.get());
    
	    tag(OreGenTags.Items.ALUMINUM_HOES)
			.add(OreGenTools.BAUXITE_HOE.get());
	    
	    tag(OreGenTags.Items.ALUMINIUM_HOES)
			.add(OreGenTools.BAUXITE_HOE.get());
	    
	    tag(OreGenTags.Items.BRONZE_HOES)
			.add(OreGenTools.BRONZE_HOE.get());
	    
	    tag(OreGenTags.Items.COBALT_HOES)
			.add(OreGenTools.COBALT_HOE.get());
	    
	    tag(OreGenTags.Items.IRIDIUM_HOES)
			.add(OreGenTools.IRIDIUM_HOE.get());
	    
	    tag(OreGenTags.Items.LEAD_HOES)
			.add(OreGenTools.LEAD_HOE.get());
	    
	    tag(OreGenTags.Items.NICKEL_HOES)
			.add(OreGenTools.NICKEL_HOE.get());
	    
	    tag(OreGenTags.Items.PLATINUM_HOES)
			.add(OreGenTools.PLATINUM_HOE.get());
	    
	    tag(OreGenTags.Items.SILVER_HOES)
			.add(OreGenTools.SILVER_HOE.get());
	    
	    tag(OreGenTags.Items.STEEL_HOES)
			.add(OreGenTools.STEEL_HOE.get());
	    
	    tag(OreGenTags.Items.TIN_HOES)
			.add(OreGenTools.TIN_HOE.get());
	    
	    tag(OreGenTags.Items.TUNGSTEN_HOES)
			.add(OreGenTools.TUNGSTEN_HOE.get());
	    
	    tag(OreGenTags.Items.URANIUM_HOES)
			.add(OreGenTools.URANIUM_HOE.get());
	    
	    tag(OreGenTags.Items.ZINC_HOES)
			.add(OreGenTools.ZINC_HOE.get());
	    
	    tag(OreGenTags.Items.BAUXITE_SHOVELS)
			.add(OreGenTools.BAUXITE_SHOVEL.get());
    
	    tag(OreGenTags.Items.ALUMINUM_SHOVELS)
			.add(OreGenTools.BAUXITE_SHOVEL.get());
	    
	    tag(OreGenTags.Items.ALUMINIUM_SHOVELS)
			.add(OreGenTools.BAUXITE_SHOVEL.get());
	    
	    tag(OreGenTags.Items.BRONZE_SHOVELS)
			.add(OreGenTools.BRONZE_SHOVEL.get());
	    
	    tag(OreGenTags.Items.COBALT_SHOVELS)
			.add(OreGenTools.COBALT_SHOVEL.get());
	    
	    tag(OreGenTags.Items.IRIDIUM_SHOVELS)
			.add(OreGenTools.IRIDIUM_SHOVEL.get());
	    
	    tag(OreGenTags.Items.LEAD_SHOVELS)
			.add(OreGenTools.LEAD_SHOVEL.get());
	    
	    tag(OreGenTags.Items.NICKEL_SHOVELS)
			.add(OreGenTools.NICKEL_SHOVEL.get());
	    
	    tag(OreGenTags.Items.PLATINUM_SHOVELS)
			.add(OreGenTools.PLATINUM_SHOVEL.get());
	    
	    tag(OreGenTags.Items.SILVER_SHOVELS)
			.add(OreGenTools.SILVER_SHOVEL.get());
	    
	    tag(OreGenTags.Items.STEEL_SHOVELS)
			.add(OreGenTools.STEEL_SHOVEL.get());
	    
	    tag(OreGenTags.Items.TIN_SHOVELS)
			.add(OreGenTools.TIN_SHOVEL.get());
	    
	    tag(OreGenTags.Items.TUNGSTEN_SHOVELS)
			.add(OreGenTools.TUNGSTEN_SHOVEL.get());
	    
	    tag(OreGenTags.Items.URANIUM_SHOVELS)
			.add(OreGenTools.URANIUM_SHOVEL.get());
	    
	    tag(OreGenTags.Items.ZINC_SHOVELS)
			.add(OreGenTools.ZINC_SHOVEL.get());
	    
	    tag(OreGenTags.Items.BAUXITE_SWORDS)
			.add(OreGenTools.BAUXITE_SWORD.get());
    
	    tag(OreGenTags.Items.ALUMINUM_SWORDS)
			.add(OreGenTools.BAUXITE_SWORD.get());
	    
	    tag(OreGenTags.Items.ALUMINIUM_SWORDS)
			.add(OreGenTools.BAUXITE_SWORD.get());
	    
	    tag(OreGenTags.Items.BRONZE_SWORDS)
			.add(OreGenTools.BRONZE_SWORD.get());
	    
	    tag(OreGenTags.Items.COBALT_SWORDS)
			.add(OreGenTools.COBALT_SWORD.get());
	    
	    tag(OreGenTags.Items.IRIDIUM_SWORDS)
			.add(OreGenTools.IRIDIUM_SWORD.get());
	    
	    tag(OreGenTags.Items.LEAD_SWORDS)
			.add(OreGenTools.LEAD_SWORD.get());
	    
	    tag(OreGenTags.Items.NICKEL_SWORDS)
			.add(OreGenTools.NICKEL_SWORD.get());
	    
	    tag(OreGenTags.Items.PLATINUM_SWORDS)
			.add(OreGenTools.PLATINUM_SWORD.get());
	    
	    tag(OreGenTags.Items.SILVER_SWORDS)
			.add(OreGenTools.SILVER_SWORD.get());
	    
	    tag(OreGenTags.Items.STEEL_SWORDS)
			.add(OreGenTools.STEEL_SWORD.get());
	    
	    tag(OreGenTags.Items.TIN_SWORDS)
			.add(OreGenTools.TIN_SWORD.get());
	    
	    tag(OreGenTags.Items.TUNGSTEN_SWORDS)
			.add(OreGenTools.TUNGSTEN_SWORD.get());
	    
	    tag(OreGenTags.Items.URANIUM_SWORDS)
			.add(OreGenTools.URANIUM_SWORD.get());
	    
	    tag(OreGenTags.Items.ZINC_SWORDS)
			.add(OreGenTools.ZINC_SWORD.get());
	    
	    tag(OreGenTags.Items.BAUXITE_PAXELS)
			.add(OreGenTools.BAUXITE_PAXEL.get());
    
	    tag(OreGenTags.Items.ALUMINUM_PAXELS)
			.add(OreGenTools.BAUXITE_PAXEL.get());
	    
	    tag(OreGenTags.Items.ALUMINIUM_PAXELS)
			.add(OreGenTools.BAUXITE_PAXEL.get());
	    
	    tag(OreGenTags.Items.BRONZE_PAXELS)
			.add(OreGenTools.BRONZE_PAXEL.get());
	    
	    tag(OreGenTags.Items.COBALT_PAXELS)
			.add(OreGenTools.COBALT_PAXEL.get());
	    
	    tag(OreGenTags.Items.IRIDIUM_PAXELS)
			.add(OreGenTools.IRIDIUM_PAXEL.get());
	    
	    tag(OreGenTags.Items.LEAD_PAXELS)
			.add(OreGenTools.LEAD_PAXEL.get());
	    
	    tag(OreGenTags.Items.NICKEL_PAXELS)
			.add(OreGenTools.NICKEL_PAXEL.get());
	    
	    tag(OreGenTags.Items.PLATINUM_PAXELS)
			.add(OreGenTools.PLATINUM_PAXEL.get());
	    
	    tag(OreGenTags.Items.SILVER_PAXELS)
			.add(OreGenTools.SILVER_PAXEL.get());
	    
	    tag(OreGenTags.Items.STEEL_PAXELS)
			.add(OreGenTools.STEEL_PAXEL.get());
	    
	    tag(OreGenTags.Items.TIN_PAXELS)
			.add(OreGenTools.TIN_PAXEL.get());
	    
	    tag(OreGenTags.Items.TUNGSTEN_PAXELS)
			.add(OreGenTools.TUNGSTEN_PAXEL.get());
	    
	    tag(OreGenTags.Items.URANIUM_PAXELS)
			.add(OreGenTools.URANIUM_PAXEL.get());
	    
	    tag(OreGenTags.Items.ZINC_PAXELS)
			.add(OreGenTools.ZINC_PAXEL.get());
	    
	    tag(OreGenTags.Items.BAUXITE_HELMETS)
			.add(OreGenArmors.BAUXITE_HELMET.get());
    
	    tag(OreGenTags.Items.ALUMINUM_HELMETS)
			.add(OreGenArmors.BAUXITE_HELMET.get());
	    
	    tag(OreGenTags.Items.ALUMINIUM_HELMETS)
			.add(OreGenArmors.BAUXITE_HELMET.get());
	    
	    tag(OreGenTags.Items.BRONZE_HELMETS)
			.add(OreGenArmors.BRONZE_HELMET.get());
	    
	    tag(OreGenTags.Items.COBALT_HELMETS)
			.add(OreGenArmors.COBALT_HELMET.get());
	    
	    tag(OreGenTags.Items.IRIDIUM_HELMETS)
			.add(OreGenArmors.IRIDIUM_HELMET.get());
	    
	    tag(OreGenTags.Items.LEAD_HELMETS)
			.add(OreGenArmors.LEAD_HELMET.get());
	    
	    tag(OreGenTags.Items.NICKEL_HELMETS)
			.add(OreGenArmors.NICKEL_HELMET.get());
	    
	    tag(OreGenTags.Items.PLATINUM_HELMETS)
			.add(OreGenArmors.PLATINUM_HELMET.get());
	    
	    tag(OreGenTags.Items.SILVER_HELMETS)
			.add(OreGenArmors.SILVER_HELMET.get());
	    
	    tag(OreGenTags.Items.STEEL_HELMETS)
			.add(OreGenArmors.STEEL_HELMET.get());
	    
	    tag(OreGenTags.Items.TIN_HELMETS)
			.add(OreGenArmors.TIN_HELMET.get());
	    
	    tag(OreGenTags.Items.TUNGSTEN_HELMETS)
			.add(OreGenArmors.TUNGSTEN_HELMET.get());
	    
	    tag(OreGenTags.Items.URANIUM_HELMETS)
			.add(OreGenArmors.URANIUM_HELMET.get());
	    
	    tag(OreGenTags.Items.ZINC_HELMETS)
			.add(OreGenArmors.ZINC_HELMET.get());
	    
	    tag(OreGenTags.Items.BAUXITE_CHESTPLATES)
			.add(OreGenArmors.BAUXITE_CHESTPLATE.get());

	    tag(OreGenTags.Items.ALUMINUM_CHESTPLATES)
			.add(OreGenArmors.BAUXITE_CHESTPLATE.get());
	    
	    tag(OreGenTags.Items.ALUMINIUM_CHESTPLATES)
			.add(OreGenArmors.BAUXITE_CHESTPLATE.get());
	    
	    tag(OreGenTags.Items.BRONZE_CHESTPLATES)
			.add(OreGenArmors.BRONZE_CHESTPLATE.get());
	    
	    tag(OreGenTags.Items.COBALT_CHESTPLATES)
			.add(OreGenArmors.COBALT_CHESTPLATE.get());
	    
	    tag(OreGenTags.Items.IRIDIUM_CHESTPLATES)
			.add(OreGenArmors.IRIDIUM_CHESTPLATE.get());
	    
	    tag(OreGenTags.Items.LEAD_CHESTPLATES)
			.add(OreGenArmors.LEAD_CHESTPLATE.get());
	    
	    tag(OreGenTags.Items.NICKEL_CHESTPLATES)
			.add(OreGenArmors.NICKEL_CHESTPLATE.get());
	    
	    tag(OreGenTags.Items.PLATINUM_CHESTPLATES)
			.add(OreGenArmors.PLATINUM_CHESTPLATE.get());
	    
	    tag(OreGenTags.Items.SILVER_CHESTPLATES)
			.add(OreGenArmors.SILVER_CHESTPLATE.get());
	    
	    tag(OreGenTags.Items.STEEL_CHESTPLATES)
			.add(OreGenArmors.STEEL_CHESTPLATE.get());
	    
	    tag(OreGenTags.Items.TIN_CHESTPLATES)
			.add(OreGenArmors.TIN_CHESTPLATE.get());
	    
	    tag(OreGenTags.Items.TUNGSTEN_CHESTPLATES)
			.add(OreGenArmors.TUNGSTEN_CHESTPLATE.get());
	    
	    tag(OreGenTags.Items.URANIUM_CHESTPLATES)
			.add(OreGenArmors.URANIUM_CHESTPLATE.get());
	    
	    tag(OreGenTags.Items.ZINC_CHESTPLATES)
			.add(OreGenArmors.ZINC_CHESTPLATE.get());
	    
	    tag(OreGenTags.Items.BAUXITE_LEGGINGS)
			.add(OreGenArmors.BAUXITE_LEGGINGS.get());
	
		tag(OreGenTags.Items.ALUMINUM_LEGGINGS)
			.add(OreGenArmors.BAUXITE_LEGGINGS.get());
		
		tag(OreGenTags.Items.ALUMINIUM_LEGGINGS)
			.add(OreGenArmors.BAUXITE_LEGGINGS.get());
		
		tag(OreGenTags.Items.BRONZE_LEGGINGS)
			.add(OreGenArmors.BRONZE_LEGGINGS.get());
		
		tag(OreGenTags.Items.COBALT_LEGGINGS)
			.add(OreGenArmors.COBALT_LEGGINGS.get());
		
		tag(OreGenTags.Items.IRIDIUM_LEGGINGS)
			.add(OreGenArmors.IRIDIUM_LEGGINGS.get());
		
		tag(OreGenTags.Items.LEAD_LEGGINGS)
			.add(OreGenArmors.LEAD_LEGGINGS.get());
		
		tag(OreGenTags.Items.NICKEL_LEGGINGS)
			.add(OreGenArmors.NICKEL_LEGGINGS.get());
		
		tag(OreGenTags.Items.PLATINUM_LEGGINGS)
			.add(OreGenArmors.PLATINUM_LEGGINGS.get());
		
		tag(OreGenTags.Items.SILVER_LEGGINGS)
			.add(OreGenArmors.SILVER_LEGGINGS.get());
		
		tag(OreGenTags.Items.STEEL_LEGGINGS)
			.add(OreGenArmors.STEEL_LEGGINGS.get());
		
		tag(OreGenTags.Items.TIN_LEGGINGS)
			.add(OreGenArmors.TIN_LEGGINGS.get());
		
		tag(OreGenTags.Items.TUNGSTEN_LEGGINGS)
			.add(OreGenArmors.TUNGSTEN_LEGGINGS.get());
		
		tag(OreGenTags.Items.URANIUM_LEGGINGS)
			.add(OreGenArmors.URANIUM_LEGGINGS.get());
		
		tag(OreGenTags.Items.ZINC_LEGGINGS)
			.add(OreGenArmors.ZINC_LEGGINGS.get());
		
		tag(OreGenTags.Items.BAUXITE_BOOTS)
			.add(OreGenArmors.BAUXITE_BOOTS.get());

	    tag(OreGenTags.Items.ALUMINUM_BOOTS)
			.add(OreGenArmors.BAUXITE_BOOTS.get());
	    
	    tag(OreGenTags.Items.ALUMINIUM_BOOTS)
			.add(OreGenArmors.BAUXITE_BOOTS.get());
	    
	    tag(OreGenTags.Items.BRONZE_BOOTS)
			.add(OreGenArmors.BRONZE_BOOTS.get());
	    
	    tag(OreGenTags.Items.COBALT_BOOTS)
			.add(OreGenArmors.COBALT_BOOTS.get());
	    
	    tag(OreGenTags.Items.IRIDIUM_BOOTS)
			.add(OreGenArmors.IRIDIUM_BOOTS.get());
	    
	    tag(OreGenTags.Items.LEAD_BOOTS)
			.add(OreGenArmors.LEAD_BOOTS.get());
	    
	    tag(OreGenTags.Items.NICKEL_BOOTS)
			.add(OreGenArmors.NICKEL_BOOTS.get());
	    
	    tag(OreGenTags.Items.PLATINUM_BOOTS)
			.add(OreGenArmors.PLATINUM_BOOTS.get());
	    
	    tag(OreGenTags.Items.SILVER_BOOTS)
			.add(OreGenArmors.SILVER_BOOTS.get());
	    
	    tag(OreGenTags.Items.STEEL_BOOTS)
			.add(OreGenArmors.STEEL_BOOTS.get());
	    
	    tag(OreGenTags.Items.TIN_BOOTS)
			.add(OreGenArmors.TIN_BOOTS.get());
	    
	    tag(OreGenTags.Items.TUNGSTEN_BOOTS)
			.add(OreGenArmors.TUNGSTEN_BOOTS.get());
	    
	    tag(OreGenTags.Items.URANIUM_BOOTS)
			.add(OreGenArmors.URANIUM_BOOTS.get());
	    
	    tag(OreGenTags.Items.ZINC_BOOTS)
			.add(OreGenArmors.ZINC_BOOTS.get());
	    
	    tag(OreGenTags.Items.TOOLS)
		    .add(OreGenTools.BAUXITE_PICKAXE.get())
		    .add(OreGenTools.BAUXITE_PICKAXE.get())
		    .add(OreGenTools.BAUXITE_PICKAXE.get())
		    .add(OreGenTools.BRONZE_PICKAXE.get())
		    .add(OreGenTools.COBALT_PICKAXE.get())
		    .add(OreGenTools.IRIDIUM_PICKAXE.get())
		    .add(OreGenTools.LEAD_PICKAXE.get())
		    .add(OreGenTools.NICKEL_PICKAXE.get())
		    .add(OreGenTools.PLATINUM_PICKAXE.get())
		    .add(OreGenTools.SILVER_PICKAXE.get())
		    .add(OreGenTools.STEEL_PICKAXE.get())
		    .add(OreGenTools.TIN_PICKAXE.get())
		    .add(OreGenTools.TUNGSTEN_PICKAXE.get())
		    .add(OreGenTools.URANIUM_PICKAXE.get())
		    .add(OreGenTools.ZINC_PICKAXE.get())
		    .add(OreGenTools.BAUXITE_AXE.get())
		    .add(OreGenTools.BAUXITE_AXE.get())
		    .add(OreGenTools.BAUXITE_AXE.get())
		    .add(OreGenTools.BRONZE_AXE.get())
		    .add(OreGenTools.COBALT_AXE.get())
		    .add(OreGenTools.IRIDIUM_AXE.get())
		    .add(OreGenTools.LEAD_AXE.get())
		    .add(OreGenTools.NICKEL_AXE.get())
		    .add(OreGenTools.PLATINUM_AXE.get())
		    .add(OreGenTools.SILVER_AXE.get())
		    .add(OreGenTools.STEEL_AXE.get())
		    .add(OreGenTools.TIN_AXE.get())
		    .add(OreGenTools.TUNGSTEN_AXE.get())
		    .add(OreGenTools.URANIUM_AXE.get())
		    .add(OreGenTools.ZINC_AXE.get())
		    .add(OreGenTools.BAUXITE_HOE.get())
		    .add(OreGenTools.BAUXITE_HOE.get())
		    .add(OreGenTools.BAUXITE_HOE.get())
		    .add(OreGenTools.BRONZE_HOE.get())
		    .add(OreGenTools.COBALT_HOE.get())
		    .add(OreGenTools.IRIDIUM_HOE.get())
		    .add(OreGenTools.LEAD_HOE.get())
		    .add(OreGenTools.NICKEL_HOE.get())
		    .add(OreGenTools.PLATINUM_HOE.get())
		    .add(OreGenTools.SILVER_HOE.get())
		    .add(OreGenTools.STEEL_HOE.get())
		    .add(OreGenTools.TIN_HOE.get())
		    .add(OreGenTools.TUNGSTEN_HOE.get())
		    .add(OreGenTools.URANIUM_HOE.get())
		    .add(OreGenTools.ZINC_HOE.get())
		    .add(OreGenTools.BAUXITE_SHOVEL.get())
		    .add(OreGenTools.BAUXITE_SHOVEL.get())
		    .add(OreGenTools.BAUXITE_SHOVEL.get())
		    .add(OreGenTools.BRONZE_SHOVEL.get())
		    .add(OreGenTools.COBALT_SHOVEL.get())
		    .add(OreGenTools.IRIDIUM_SHOVEL.get())
		    .add(OreGenTools.LEAD_SHOVEL.get())
		    .add(OreGenTools.NICKEL_SHOVEL.get())
		    .add(OreGenTools.PLATINUM_SHOVEL.get())
		    .add(OreGenTools.SILVER_SHOVEL.get())
		    .add(OreGenTools.STEEL_SHOVEL.get())
		    .add(OreGenTools.TIN_SHOVEL.get())
		    .add(OreGenTools.TUNGSTEN_SHOVEL.get())
		    .add(OreGenTools.URANIUM_SHOVEL.get())
		    .add(OreGenTools.ZINC_SHOVEL.get())
		    .add(OreGenTools.BAUXITE_SWORD.get())
		    .add(OreGenTools.BAUXITE_SWORD.get())
		    .add(OreGenTools.BAUXITE_SWORD.get())
		    .add(OreGenTools.BRONZE_SWORD.get())
		    .add(OreGenTools.COBALT_SWORD.get())
		    .add(OreGenTools.IRIDIUM_SWORD.get())
		    .add(OreGenTools.LEAD_SWORD.get())
		    .add(OreGenTools.NICKEL_SWORD.get())
		    .add(OreGenTools.PLATINUM_SWORD.get())
		    .add(OreGenTools.SILVER_SWORD.get())
		    .add(OreGenTools.STEEL_SWORD.get())
		    .add(OreGenTools.TIN_SWORD.get())
		    .add(OreGenTools.TUNGSTEN_SWORD.get())
		    .add(OreGenTools.URANIUM_SWORD.get())
		    .add(OreGenTools.ZINC_SWORD.get())
		    .add(OreGenTools.BAUXITE_PAXEL.get())
		    .add(OreGenTools.BAUXITE_PAXEL.get())
		    .add(OreGenTools.BAUXITE_PAXEL.get())
		    .add(OreGenTools.BRONZE_PAXEL.get())
		    .add(OreGenTools.COBALT_PAXEL.get())
		    .add(OreGenTools.IRIDIUM_PAXEL.get())
		    .add(OreGenTools.LEAD_PAXEL.get())
		    .add(OreGenTools.NICKEL_PAXEL.get())
		    .add(OreGenTools.PLATINUM_PAXEL.get())
		    .add(OreGenTools.SILVER_PAXEL.get())
		    .add(OreGenTools.STEEL_PAXEL.get())
		    .add(OreGenTools.TIN_PAXEL.get())
		    .add(OreGenTools.TUNGSTEN_PAXEL.get())
		    .add(OreGenTools.URANIUM_PAXEL.get())
		    .add(OreGenTools.ZINC_PAXEL.get());


	    
	    tag(OreGenTags.Items.ARMORS)
			.add(OreGenArmors.BAUXITE_HELMET.get())
			.add(OreGenArmors.BAUXITE_HELMET.get())
			.add(OreGenArmors.BAUXITE_HELMET.get())
			.add(OreGenArmors.BRONZE_HELMET.get())
			.add(OreGenArmors.COBALT_HELMET.get())
			.add(OreGenArmors.IRIDIUM_HELMET.get())
			.add(OreGenArmors.LEAD_HELMET.get())
			.add(OreGenArmors.NICKEL_HELMET.get())
			.add(OreGenArmors.PLATINUM_HELMET.get())
			.add(OreGenArmors.SILVER_HELMET.get())
			.add(OreGenArmors.STEEL_HELMET.get())
			.add(OreGenArmors.TIN_HELMET.get())
			.add(OreGenArmors.TUNGSTEN_HELMET.get())
			.add(OreGenArmors.URANIUM_HELMET.get())
			.add(OreGenArmors.ZINC_HELMET.get())
			.add(OreGenArmors.BAUXITE_CHESTPLATE.get())
			.add(OreGenArmors.BAUXITE_CHESTPLATE.get())
			.add(OreGenArmors.BAUXITE_CHESTPLATE.get())
			.add(OreGenArmors.BRONZE_CHESTPLATE.get())
			.add(OreGenArmors.COBALT_CHESTPLATE.get())
			.add(OreGenArmors.IRIDIUM_CHESTPLATE.get())
			.add(OreGenArmors.LEAD_CHESTPLATE.get())
			.add(OreGenArmors.NICKEL_CHESTPLATE.get())
			.add(OreGenArmors.PLATINUM_CHESTPLATE.get())
			.add(OreGenArmors.SILVER_CHESTPLATE.get())
			.add(OreGenArmors.STEEL_CHESTPLATE.get())
			.add(OreGenArmors.TIN_CHESTPLATE.get())
			.add(OreGenArmors.TUNGSTEN_CHESTPLATE.get())
			.add(OreGenArmors.URANIUM_CHESTPLATE.get())
			.add(OreGenArmors.ZINC_CHESTPLATE.get())
			.add(OreGenArmors.BAUXITE_LEGGINGS.get())
			.add(OreGenArmors.BAUXITE_LEGGINGS.get())
			.add(OreGenArmors.BAUXITE_LEGGINGS.get())
			.add(OreGenArmors.BRONZE_LEGGINGS.get())
			.add(OreGenArmors.COBALT_LEGGINGS.get())
			.add(OreGenArmors.IRIDIUM_LEGGINGS.get())
			.add(OreGenArmors.LEAD_LEGGINGS.get())
			.add(OreGenArmors.NICKEL_LEGGINGS.get())
			.add(OreGenArmors.PLATINUM_LEGGINGS.get())
			.add(OreGenArmors.SILVER_LEGGINGS.get())
			.add(OreGenArmors.STEEL_LEGGINGS.get())
			.add(OreGenArmors.TIN_LEGGINGS.get())
			.add(OreGenArmors.TUNGSTEN_LEGGINGS.get())
			.add(OreGenArmors.URANIUM_LEGGINGS.get())
			.add(OreGenArmors.ZINC_LEGGINGS.get())
			.add(OreGenArmors.BAUXITE_BOOTS.get())
			.add(OreGenArmors.BAUXITE_BOOTS.get())
			.add(OreGenArmors.BAUXITE_BOOTS.get())
			.add(OreGenArmors.BRONZE_BOOTS.get())
			.add(OreGenArmors.COBALT_BOOTS.get())
			.add(OreGenArmors.IRIDIUM_BOOTS.get())
			.add(OreGenArmors.LEAD_BOOTS.get())
			.add(OreGenArmors.NICKEL_BOOTS.get())
			.add(OreGenArmors.PLATINUM_BOOTS.get())
			.add(OreGenArmors.SILVER_BOOTS.get())
			.add(OreGenArmors.STEEL_BOOTS.get())
			.add(OreGenArmors.TIN_BOOTS.get())
			.add(OreGenArmors.TUNGSTEN_BOOTS.get())
			.add(OreGenArmors.URANIUM_BOOTS.get())
			.add(OreGenArmors.ZINC_BOOTS.get());
        
        
        tag(OreGenTags.Items.TOOL_HANDLES)
			.add(Items.STICK);
        
        tag(OreGenTags.Items.NETHERITE_TEMPLATES)
			.add(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE);
    }
}
