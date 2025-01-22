package com.gmail.rohzek.simpleoregen.data;

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
		if(item.toString().contains("nugget")) 
		{
			return withExistingParent(BuiltInRegistries.ITEM.getKey(item).getPath(), ResourceLocation.withDefaultNamespace("item/generated")).texture("layer0", ResourceLocation.fromNamespaceAndPath(modid, "item/nugget/" + BuiltInRegistries.ITEM.getKey(item).getPath()));
		}
		
		if(item.toString().contains("ingot")) 
		{
			return withExistingParent(BuiltInRegistries.ITEM.getKey(item).getPath(), ResourceLocation.withDefaultNamespace("item/generated")).texture("layer0", ResourceLocation.fromNamespaceAndPath(modid, "item/ingot/" + BuiltInRegistries.ITEM.getKey(item).getPath()));
		}
		
		if(item.toString().contains("raw")) 
		{
			return withExistingParent(BuiltInRegistries.ITEM.getKey(item).getPath(), ResourceLocation.withDefaultNamespace("item/generated")).texture("layer0", ResourceLocation.fromNamespaceAndPath(modid, "item/raw/" + BuiltInRegistries.ITEM.getKey(item).getPath()));
		}
		
		if(item.toString().contains("axe")) 
		{
			return withExistingParent(BuiltInRegistries.ITEM.getKey(item).getPath(), ResourceLocation.withDefaultNamespace("item/generated")).texture("layer0", ResourceLocation.fromNamespaceAndPath(modid, "item/tool/axe/" + BuiltInRegistries.ITEM.getKey(item).getPath()));
		}
		
		if(item.toString().contains("hoe")) 
		{
			return withExistingParent(BuiltInRegistries.ITEM.getKey(item).getPath(), ResourceLocation.withDefaultNamespace("item/generated")).texture("layer0", ResourceLocation.fromNamespaceAndPath(modid, "item/tool/hoe/" + BuiltInRegistries.ITEM.getKey(item).getPath()));
		}
		
		if(item.toString().contains("pickaxe")) 
		{
			return withExistingParent(BuiltInRegistries.ITEM.getKey(item).getPath(), ResourceLocation.withDefaultNamespace("item/generated")).texture("layer0", ResourceLocation.fromNamespaceAndPath(modid, "item/tool/pickaxe/" + BuiltInRegistries.ITEM.getKey(item).getPath()));
		}
		
		if(item.toString().contains("shovel")) 
		{
			return withExistingParent(BuiltInRegistries.ITEM.getKey(item).getPath(), ResourceLocation.withDefaultNamespace("item/generated")).texture("layer0", ResourceLocation.fromNamespaceAndPath(modid, "item/tool/shovel/" + BuiltInRegistries.ITEM.getKey(item).getPath()));
		}
		
		if(item.toString().contains("sword")) 
		{
			return withExistingParent(BuiltInRegistries.ITEM.getKey(item).getPath(), ResourceLocation.withDefaultNamespace("item/generated")).texture("layer0", ResourceLocation.fromNamespaceAndPath(modid, "item/tool/sword/" + BuiltInRegistries.ITEM.getKey(item).getPath()));
		}
		
		return withExistingParent(BuiltInRegistries.ITEM.getKey(item).getPath(), ResourceLocation.withDefaultNamespace("item/generated")).texture("layer0", ResourceLocation.fromNamespaceAndPath(modid, "item/" + BuiltInRegistries.ITEM.getKey(item).getPath()));
	}
	
	protected ItemModelBuilder simpleBlockItem(Item item) 
	{
		String location = "block/", blockName = BuiltInRegistries.ITEM.getKey(item).getPath();
		
		if(blockName.contains("ore")) 
		{
			location += "ore/";
			
			if(blockName.contains("andesite")) 
			{
				location += "andesite/";
			}
			else if(blockName.contains("deepslate")) 
			{
				location += "deepslate/";
			}
			else if(blockName.contains("diorite")) 
			{
				location += "diorite/";
			}
			else if(blockName.contains("end")) 
			{
				location += "end/";
			}
			else if(blockName.contains("granite")) 
			{
				location += "granite/";
			}
			else if(blockName.contains("gravel")) 
			{
				location += "gravel/";
			}
			else if(blockName.contains("nether")) 
			{
				location += "nether/";
			}
			else if(blockName.contains("sand")) 
			{
				if(blockName.contains("sandstone")) 
				{
					location += "sandstone/";
				}
				else 
				{
					location += "sand/";
				}
			}
		}
		else if(blockName.contains("raw")) 
		{
			location += "raw/";
		}
		
		return withExistingParent(BuiltInRegistries.ITEM.getKey(item).getPath(), 
				ResourceLocation.withDefaultNamespace("block/cube_all"))
				.texture("all", ResourceLocation.fromNamespaceAndPath(modid, location + blockName));
	}
}
