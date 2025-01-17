package com.gmail.rohzek.simpleoregen.data;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import com.gmail.rohzek.simpleoregen.items.OreGenItems;
import com.gmail.rohzek.simpleoregen.lib.Reference;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
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
        tag(OreGenTags.Items.DIAMONDS)
        	.add(OreGenItems.HEART_DIAMOND.get())
        	.add(Items.DIAMOND);
        
        tag(OreGenTags.Items.RUBIES)
        	.add(OreGenItems.RUBY.get());
        
        tag(OreGenTags.Items.SAPPHIRES)
    		.add(OreGenItems.SAPPHIRE.get());
        
        tag(OreGenTags.Items.RAW_BAUXITES)
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
        
        tag(OreGenTags.Items.COBALT_NUGGETS)
			.add(OreGenItems.COBALT_NUGGET.get());
        
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
        
        tag(OreGenTags.Items.TIN_NUGGETS)
			.add(OreGenItems.TIN_NUGGET.get());
        
        tag(OreGenTags.Items.TUNGSTEN_NUGGETS)
			.add(OreGenItems.TUNGSTEN_NUGGET.get());
        
        tag(OreGenTags.Items.URANIUM_NUGGETS)
        	.add(OreGenItems.URANIUM_NUGGET.get());
        
        tag(OreGenTags.Items.ZINC_NUGGETS)
			.add(OreGenItems.ZINC_NUGGET.get());
        
        
        tag(OreGenTags.Items.TOOL_HANDLES)
			.add(Items.STICK);
    }
}
