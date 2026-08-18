package com.gmail.rohzek.simpleoregen.blocks;

import com.gmail.rohzek.simpleoregen.blocks.flowertypes.CheshireRoseFlower;
import com.gmail.rohzek.simpleoregen.blocks.flowertypes.ModFlower;
import com.gmail.rohzek.simpleoregen.lib.DeferredRegistration;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;

public class WorldGenBlocks 
{
	public static final DeferredBlock<Block> CHESHIRE_ROSE_FLOWER = DeferredRegistration.registerBlock("cheshirerose", () -> new CheshireRoseFlower("cheshirerose"));
	public static final DeferredBlock<Block> ROSE_FLOWER = DeferredRegistration.registerBlock("rose", () -> new ModFlower("rose"));
	public static final DeferredBlock<Block> ROSE_CYAN_FLOWER = DeferredRegistration.registerBlock("rose_cyan", () -> new ModFlower("rose_cyan"));
	public static final DeferredBlock<Block> ROSE_WHITE_FLOWER = DeferredRegistration.registerBlock("rose_white", () -> new ModFlower("rose_white"));
	public static final DeferredBlock<Block> ROSE_PINK_FLOWER = DeferredRegistration.registerBlock("rose_pink", () -> new ModFlower("rose_pink"));
	public static final DeferredBlock<Block> ROSE_YELLOW_FLOWER = DeferredRegistration.registerBlock("rose_yellow", () -> new ModFlower("rose_yellow"));
	public static final DeferredBlock<Block> ROSE_PURPLE_FLOWER = DeferredRegistration.registerBlock("rose_purple", () -> new ModFlower("rose_purple"));
	public static final DeferredBlock<Block> ROSE_BLACK_FLOWER = DeferredRegistration.registerBlock("rose_black", () -> new ModFlower("rose_black"));
	
	//FlowerPotBlock(@Nullable java.util.function.Supplier<FlowerPotBlock> emptyPot, java.util.function.Supplier<? extends Block> p_53528_, BlockBehaviour.Properties properties) {
	public static final DeferredBlock<Block> CHESHIRE_ROSE_FLOWER_POTTED = DeferredRegistration.registerBlock("cheshirerose_potted", 
			() -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), CHESHIRE_ROSE_FLOWER, BlockBehaviour.Properties.of()));
	
	public static final DeferredBlock<Block> ROSE_FLOWER_POTTED = DeferredRegistration.registerBlock("rose_potted", 
			() -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ROSE_FLOWER, BlockBehaviour.Properties.of()));
	
	public static final DeferredBlock<Block> CYAN_ROSE_FLOWER_POTTED = DeferredRegistration.registerBlock("rose_cyan_potted", 
			() -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ROSE_CYAN_FLOWER, BlockBehaviour.Properties.of()));
	
	public static final DeferredBlock<Block> WHITE_ROSE_FLOWER_POTTED = DeferredRegistration.registerBlock("rose_white_potted", 
			() -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ROSE_WHITE_FLOWER, BlockBehaviour.Properties.of()));
	
	public static final DeferredBlock<Block> PINK_ROSE_FLOWER_POTTED = DeferredRegistration.registerBlock("rose_pink_potted", 
			() -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ROSE_PINK_FLOWER, BlockBehaviour.Properties.of()));
	
	public static final DeferredBlock<Block> YELLOW_ROSE_FLOWER_POTTED = DeferredRegistration.registerBlock("rose_yellow_potted", 
			() -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ROSE_YELLOW_FLOWER, BlockBehaviour.Properties.of()));
	
	public static final DeferredBlock<Block> PURPLE_ROSE_FLOWER_POTTED = DeferredRegistration.registerBlock("rose_purple_potted", 
			() -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ROSE_PURPLE_FLOWER, BlockBehaviour.Properties.of()));
	
	public static final DeferredBlock<Block> BLACK_ROSE_FLOWER_POTTED = DeferredRegistration.registerBlock("rose_black_potted", 
			() -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ROSE_BLACK_FLOWER, BlockBehaviour.Properties.of()));

    public static void register() {}
}
