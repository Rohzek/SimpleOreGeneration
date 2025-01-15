package com.gmail.rohzek.simpleoregen.blocks;

import com.gmail.rohzek.simpleoregen.lib.DeferredRegistration;

import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;

public class WorldGenBlocks 
{
	public static final DeferredBlock<Block> CHESHIRE_ROSE_FLOWER = DeferredRegistration.registerBlock("cheshirerose", () -> new CheshireRoseFlower("cheshirerose"));
	public static final DeferredBlock<Block> ROSE_FLOWER = DeferredRegistration.registerBlock("rose", () -> new ModFlowerBlock("rose"));
	public static final DeferredBlock<Block> ROSE_CYAN_FLOWER = DeferredRegistration.registerBlock("rose_cyan", () -> new ModFlowerBlock("rose_cyan"));
	
	/*
	public static final DeferredBlock<Block> CHESHIRE_ROSE_FLOWER_POTTED = DeferredRegistration.registerBlock("cheshirerose_potted", 
			() -> new FlowerPotBlock(() -> (FlowerPotBlock)Blocks.FLOWER_POT, () -> CHESHIRE_ROSE_FLOWER.get() ,BlockBehaviour.Properties.of().noLootTable()));
	public static final DeferredBlock<Block> ROSE_FLOWER_POTTED = DeferredRegistration.registerBlock("rose_potted", 
			() -> new FlowerPotBlock(() -> (FlowerPotBlock)Blocks.FLOWER_POT, () -> CHESHIRE_ROSE_FLOWER.get() ,BlockBehaviour.Properties.of().noLootTable()));
	public static final DeferredBlock<Block> ROSE_CYAN_FLOWER_POTTED = DeferredRegistration.registerBlock("rose_cyan_potted", 
			() -> new FlowerPotBlock(() -> (FlowerPotBlock)Blocks.FLOWER_POT, () -> CHESHIRE_ROSE_FLOWER.get() ,BlockBehaviour.Properties.of().noLootTable()));
	*/
	
    public static void register() {}
}
