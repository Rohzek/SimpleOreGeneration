package com.gmail.rohzek.simpleoregen.blocks;

import com.gmail.rohzek.simpleoregen.lib.DeferredRegistration;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;

public class WorldGenBlocks 
{
	public static final DeferredBlock<Block> CHESHIRE_ROSE_FLOWER = DeferredRegistration.registerBlock("cheshirerose", () -> new CheshireRoseFlower("cheshirerose"));
	public static final DeferredBlock<Block> ROSE_FLOWER = DeferredRegistration.registerBlock("rose", () -> new ModFlowerBlock("rose"));
	public static final DeferredBlock<Block> ROSE_CYAN_FLOWER = DeferredRegistration.registerBlock("rose_cyan", () -> new ModFlowerBlock("rose_cyan"));
	
	//FlowerPotBlock(@Nullable java.util.function.Supplier<FlowerPotBlock> emptyPot, java.util.function.Supplier<? extends Block> p_53528_, BlockBehaviour.Properties properties) {
	public static final DeferredBlock<Block> CHESHIRE_ROSE_FLOWER_POTTED = DeferredRegistration.registerBlock("cheshirerose_potted", 
			() -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), CHESHIRE_ROSE_FLOWER, BlockBehaviour.Properties.of()));
	
	public static final DeferredBlock<Block> ROSE_FLOWER_POTTED = DeferredRegistration.registerBlock("rose_potted", 
			() -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ROSE_FLOWER, BlockBehaviour.Properties.of()));
	
	public static final DeferredBlock<Block> CYAN_ROSE_FLOWER_POTTED = DeferredRegistration.registerBlock("rose_cyan_potted", 
			() -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ROSE_CYAN_FLOWER, BlockBehaviour.Properties.of()));

    public static void register() {}
}
