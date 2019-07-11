package com.gmail.rohzek.simpleoregeneration.compatibility;

import java.util.Objects;

import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ModOre 
{
	String name;
	boolean enabled;
	
	public ModOre(String name, boolean enabled)
	{
		this.name = name;
		this. enabled = enabled;
	}
	
	@Override
	public int hashCode() 
	{
		return Objects.hash(name);
	}
	
	@Override
	public boolean equals(Object obj) 
	{	
		if(!(obj instanceof ModOre))
		{
			return false;
		}
		
		ModOre ore = (ModOre) obj;
		return this.name.equals(ore.name);
	}
}
