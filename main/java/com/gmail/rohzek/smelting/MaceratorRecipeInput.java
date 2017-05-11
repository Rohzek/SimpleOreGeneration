package com.gmail.rohzek.smelting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import ic2.api.recipe.IRecipeInput;
import ic2.core.util.StackUtil;
import net.minecraft.item.ItemStack;

public class MaceratorRecipeInput implements IRecipeInput
{
	public final ItemStack input;
	public final int amount;
	
	public MaceratorRecipeInput(ItemStack input) 
	{
		this(input, StackUtil.getSize(input));
	}

	public MaceratorRecipeInput(ItemStack input, int amount) 
	{
		if (StackUtil.isEmpty(input))
		{
			throw new IllegalArgumentException("invalid input stack");
		}
		
		this.input = input.copy();
		this.amount = amount;
	}

	@Override
	public boolean matches(ItemStack subject) 
	{
		return ((subject.getItem() == this.input.getItem())
				&& (((subject.getMetadata() == this.input.getMetadata()) || (this.input.getMetadata() == 32767)))
				&& (((this.input.getMetadata() == 32767)
						|| (StackUtil.matchesNBT(subject.getTagCompound(), this.input.getTagCompound())))));
	}

	public int getAmount() {
		return this.amount;
	}

	public List<ItemStack> getInputs() 
	{
		return Collections.unmodifiableList(Arrays.asList(new ItemStack[] { StackUtil.setImmutableSize(this.input, getAmount())}));
	}

	public String toString() {
		return "RInputItemStack<" + StackUtil.setImmutableSize(this.input, this.amount) + ">";
	}
}
