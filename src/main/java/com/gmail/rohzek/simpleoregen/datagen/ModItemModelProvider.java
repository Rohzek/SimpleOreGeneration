package com.gmail.rohzek.simpleoregen.datagen;

import com.gmail.rohzek.simpleoregen.lib.DeferredRegistration;
import com.gmail.rohzek.simpleoregen.lib.Reference;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModItemModelProvider extends ItemModelProvider 
{
	public ModItemModelProvider(PackOutput packOutput, ExistingFileHelper existingFileHelper) 
	{
		super(packOutput, Reference.MODID, existingFileHelper);
	}

	@Override
	protected void registerModels() 
	{
		for (DeferredHolder<Item, ? extends Item> entry : DeferredRegistration.ITEMS.getEntries()) 
		{
			simpleItem(entry.get());
		}
		
		for (DeferredHolder<Item, ? extends Item> entry : DeferredRegistration.ITEM_BLOCKS.getEntries()) 
		{
			simpleBlockItem(entry.get());
		}
	}

	protected ItemModelBuilder simpleItem(Item item) 
	{
		return withExistingParent(BuiltInRegistries.ITEM.getKey(item).getPath(), ResourceLocation.withDefaultNamespace("item/generated")).texture("layer0", ResourceLocation.fromNamespaceAndPath(modid, "item/" + BuiltInRegistries.ITEM.getKey(item).getPath()));
	}
	
	protected ItemModelBuilder simpleBlockItem(Item item) 
	{
		return withExistingParent(BuiltInRegistries.ITEM.getKey(item).getPath(), ResourceLocation.withDefaultNamespace("block/cube_all")).texture("all", ResourceLocation.fromNamespaceAndPath(modid, "block/" + BuiltInRegistries.ITEM.getKey(item).getPath()));
	}
}
