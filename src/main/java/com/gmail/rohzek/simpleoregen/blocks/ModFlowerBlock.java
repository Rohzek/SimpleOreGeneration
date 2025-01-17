package com.gmail.rohzek.simpleoregen.blocks;

import java.util.List;

import net.minecraft.core.Holder;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.component.SuspiciousStewEffects;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;

public class ModFlowerBlock extends FlowerBlock
{
	public ModFlowerBlock(String name) 
	 {
		 this(makeEffectList(MobEffects.ABSORPTION, 4f), BlockBehaviour.Properties.of().sound(SoundType.PINK_PETALS).instabreak().noCollission()
				                                             .offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY));
	 }
	 
	 public ModFlowerBlock(SuspiciousStewEffects suspiciousStewEffects, BlockBehaviour.Properties properties) 
	 {
		 super(suspiciousStewEffects, properties);
	 }

	 protected static SuspiciousStewEffects makeEffectList(Holder<MobEffect> effect, float seconds) 
	 {
		 return new SuspiciousStewEffects(List.of(new SuspiciousStewEffects.Entry(effect, Mth.floor(seconds * 20.0F))));
	 }
}
