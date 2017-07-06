package com.gmail.rohzek.blocks;

import com.gmail.rohzek.util.json.JsonLoadICBlocks;
import com.gmail.rohzek.util.json.JsonLoaderIEBlocks;
import com.gmail.rohzek.util.json.JsonNeutralModBlocks;

public class SetMiningLevels 
{
	public static void set()
	{
		setMiningLevels();
	}
	
	public static void setMiningLevels()
	{
		// Surface Ores
		SGOres.SURFACE_BAUXITE_ORE.setHarvestLevel("pickaxe", getMiningLevel(JsonLoaderIEBlocks.loadSurfaceBauxite().get("miningLevel").getAsString()));
		SGOres.SURFACE_COPPER_ORE.setHarvestLevel("pickaxe", getMiningLevel(JsonNeutralModBlocks.loadSurfaceCopper().get("miningLevel").getAsString()));
		SGOres.SURFACE_LEAD_ORE.setHarvestLevel("pickaxe", getMiningLevel(JsonNeutralModBlocks.loadSurfaceLead().get("miningLevel").getAsString()));
		SGOres.SURFACE_NICKEL_ORE.setHarvestLevel("pickaxe", getMiningLevel(JsonLoaderIEBlocks.loadSurfaceNickel().get("miningLevel").getAsString()));
		SGOres.SURFACE_SILVER_ORE.setHarvestLevel("pickaxe", getMiningLevel(JsonLoaderIEBlocks.loadSurfaceSilver().get("miningLevel").getAsString()));
		SGOres.SURFACE_TIN_ORE.setHarvestLevel("pickaxe", getMiningLevel(JsonNeutralModBlocks.loadSurfaceTin().get("miningLevel").getAsString()));
		SGOres.SURFACE_URANIUM_ORE.setHarvestLevel("pickaxe", getMiningLevel(JsonLoadICBlocks.loadSurfaceUranium().get("miningLevel").getAsString()));

		// Nether Ores
		SGOres.NETHER_BAUXITE_ORE.setHarvestLevel("pickaxe", getMiningLevel(JsonLoaderIEBlocks.loadNetherBauxite().get("miningLevel").getAsString()));
		SGOres.NETHER_COAL_ORE.setHarvestLevel("pickaxe", getMiningLevel("WOODEN"));
		SGOres.NETHER_COPPER_ORE.setHarvestLevel("pickaxe", getMiningLevel(JsonNeutralModBlocks.loadNetherCopper().get("miningLevel").getAsString()));
		SGOres.NETHER_DIAMOND_ORE.setHarvestLevel("pickaxe", getMiningLevel("IRON"));
		SGOres.NETHER_EMERALD_ORE.setHarvestLevel("pickaxe", getMiningLevel("IRON"));
		SGOres.NETHER_IRON_ORE.setHarvestLevel("pickaxe", getMiningLevel("STONE"));
		SGOres.NETHER_GOLD_ORE.setHarvestLevel("pickaxe", getMiningLevel("IRON"));
		SGOres.NETHER_LAPIS_ORE.setHarvestLevel("pickaxe", getMiningLevel("STONE"));
		SGOres.NETHER_LEAD_ORE.setHarvestLevel("pickaxe", getMiningLevel(JsonNeutralModBlocks.loadNetherLead().get("miningLevel").getAsString()));
		SGOres.NETHER_NICKEL_ORE.setHarvestLevel("pickaxe", getMiningLevel(JsonLoaderIEBlocks.loadNetherNickel().get("miningLevel").getAsString()));
		SGOres.NETHER_QUARTZ_ORE.setHarvestLevel("pickaxe", getMiningLevel("WOODEN"));
		SGOres.NETHER_REDSTONE_ORE.setHarvestLevel("pickaxe", getMiningLevel("IRON"));
		SGOres.NETHER_SILVER_ORE.setHarvestLevel("pickaxe", getMiningLevel(JsonLoaderIEBlocks.loadNetherSilver().get("miningLevel").getAsString()));
		SGOres.NETHER_TIN_ORE.setHarvestLevel("pickaxe", getMiningLevel(JsonNeutralModBlocks.loadNetherTin().get("miningLevel").getAsString()));
		SGOres.NETHER_URANIUM_ORE.setHarvestLevel("pickaxe", getMiningLevel(JsonLoadICBlocks.loadNetherUranium().get("miningLevel").getAsString()));

		// End Ores
		SGOres.END_BAUXITE_ORE.setHarvestLevel("pickaxe", getMiningLevel(JsonLoaderIEBlocks.loadEndBauxite().get("miningLevel").getAsString()));
		SGOres.END_COAL_ORE.setHarvestLevel("pickaxe", getMiningLevel("WOODEN"));
		SGOres.END_COPPER_ORE.setHarvestLevel("pickaxe", getMiningLevel(JsonNeutralModBlocks.loadEndCopper().get("miningLevel").getAsString()));
		SGOres.	END_DIAMOND_ORE.setHarvestLevel("pickaxe", getMiningLevel("IRON"));
		SGOres.END_EMERALD_ORE.setHarvestLevel("pickaxe", getMiningLevel("IRON"));
		SGOres.	END_IRON_ORE.setHarvestLevel("pickaxe", getMiningLevel("STONE"));
		SGOres.END_GOLD_ORE.setHarvestLevel("pickaxe", getMiningLevel("IRON"));
		SGOres.	END_LAPIS_ORE.setHarvestLevel("pickaxe", getMiningLevel("STONE"));
		SGOres.	END_LEAD_ORE.setHarvestLevel("pickaxe", getMiningLevel(JsonNeutralModBlocks.loadEndLead().get("miningLevel").getAsString()));
		SGOres.	END_NICKEL_ORE.setHarvestLevel("pickaxe", getMiningLevel(JsonLoaderIEBlocks.loadEndNickel().get("miningLevel").getAsString()));
		SGOres.	END_REDSTONE_ORE.setHarvestLevel("pickaxe", getMiningLevel("IRON"));
		SGOres.	END_SILVER_ORE.setHarvestLevel("pickaxe", getMiningLevel(JsonLoaderIEBlocks.loadEndSilver().get("miningLevel").getAsString()));
		SGOres.	END_TIN_ORE.setHarvestLevel("pickaxe", getMiningLevel(JsonNeutralModBlocks.loadEndTin().get("miningLevel").getAsString()));
		SGOres.	END_URANIUM_ORE.setHarvestLevel("pickaxe", getMiningLevel(JsonLoadICBlocks.loadEndUranium().get("miningLevel").getAsString()));
	}
	
	public static int getMiningLevel(String level)
	{
		if(level.equalsIgnoreCase("wooden") || level.equalsIgnoreCase("wood") || level.equalsIgnoreCase("gold"))
		{
			return 0;
		}
		
		else if(level.equalsIgnoreCase("stone"))
		{
			return 1;
		}
		
		else if(level.equalsIgnoreCase("iron"))
		{
			return 2;
		}
		
		else if(level.equalsIgnoreCase("diamond"))
		{
			return 3;
		}
		
		else if(level.equalsIgnoreCase("custom"))
		{
			return 4;
		}
		
		return 0;
	}
}
