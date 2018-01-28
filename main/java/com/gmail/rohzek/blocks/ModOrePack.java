package com.gmail.rohzek.blocks;

import net.minecraft.block.state.IBlockState;

public class ModOrePack 
{
	public String name;
	public IBlockState block;
	
	
	public ModOrePack(String name, IBlockState blockS)
	{
		this.name = name;
		this.block = blockS;
	}
}
