package com.gmail.rohzek.simpleoregen.datagen;

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
    }
}
