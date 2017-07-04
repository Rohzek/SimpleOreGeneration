package com.gmail.rohzek.util.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.gmail.rohzek.lib.Reference;
import com.gmail.rohzek.util.LogHelper;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class JsonCreator 
{
	static File jsonFile = new File(Reference.LOCATION + "/OreGen.json");
	static File updateFile = new File(Reference.LOCATION + "/OreGen.json.bak");
	static boolean runOnce = true;
	
	public static String createJson()
	{
		int surfaceMinY = 0;
		
		int netherMinY = 0;
		int netherMaxY = 126;
		
		int endMinY = 10;
		int endMaxY = 60;
		
		// The holder object
		JsonObject root = new JsonObject();
		
		// Holder array
		JsonArray basic = new JsonArray();
		
		// Vanilla Array
		JsonArray vanilla = new JsonArray();
		
		// Neutral Array
		JsonArray neutral = new JsonArray();
		
		// Forestry Array
		JsonArray forestry = new JsonArray();
		
		// IC2 Array
		JsonArray ic = new JsonArray();
		
		// IE Array
		JsonArray ie = new JsonArray();
		
		// vanillaCoalOre
		JsonObject vCoalOre = new JsonObject();
		
		vCoalOre.addProperty("ore", "SurfaceCoalOre");
		vCoalOre.addProperty("minY", surfaceMinY);
		vCoalOre.addProperty("maxY", 213);
		vCoalOre.addProperty("rarity", 12 * 2);
		vCoalOre.addProperty("veinMinimum", 6);
		vCoalOre.addProperty("veinMultiplier", 31);
		vCoalOre.addProperty("disableOre", false);
		
		vanilla.add(vCoalOre);
		
		 // vanillaDiamondOre
		JsonObject vDiamondOre = new JsonObject();
		
		vDiamondOre.addProperty("ore", "SurfaceDiamondOre");
		vDiamondOre.addProperty("minY", surfaceMinY);
		vDiamondOre.addProperty("maxY", 21);
		vDiamondOre.addProperty("rarity", 2 * 2);
		vDiamondOre.addProperty("veinMinimum", 3);
		vDiamondOre.addProperty("veinMultiplier", 6);
		vDiamondOre.addProperty("disableOre", false);
		
		vanilla.add(vDiamondOre);
		
		 // vanillaEmeraldOre
		JsonObject vEmeraldOre = new JsonObject();
		
		vEmeraldOre.addProperty("ore", "SurfaceEmeraldOre");
		vEmeraldOre.addProperty("minY", surfaceMinY);
		vEmeraldOre.addProperty("maxY", 33);
		vEmeraldOre.addProperty("rarity", 4 * 2);
		vEmeraldOre.addProperty("veinMinimum", 6);
		vEmeraldOre.addProperty("veinMultiplier", 6);
		vEmeraldOre.addProperty("disableOre", false);
		
		vanilla.add(vEmeraldOre);
		
		// vanillaGoldOre
		JsonObject vGoldOre = new JsonObject();
		
		vGoldOre.addProperty("ore", "SurfaceGoldOre");
		vGoldOre.addProperty("minY", surfaceMinY);
		vGoldOre.addProperty("maxY", 34);
		vGoldOre.addProperty("rarity", 6 * 2);
		vGoldOre.addProperty("veinMinimum", 9);
		vGoldOre.addProperty("veinMultiplier", 9);
		vGoldOre.addProperty("disableOre", false);
		
		vanilla.add(vGoldOre);
		
		 // vanillaIronOre
		JsonObject vIronOre = new JsonObject();
		
		vIronOre.addProperty("ore", "SurfaceIronOre");
		vIronOre.addProperty("minY", surfaceMinY);
		vIronOre.addProperty("maxY", 69);
		vIronOre.addProperty("rarity", 10 * 2);
		vIronOre.addProperty("veinMinimum", 5);
		vIronOre.addProperty("veinMultiplier", 19);
		vIronOre.addProperty("disableOre", false);
		
		vanilla.add(vIronOre);
		
		 // vanillaLapisOre
		JsonObject vLapisOre = new JsonObject();
		
		vLapisOre.addProperty("ore", "SurfaceLapisOre");
		vLapisOre.addProperty("minY", surfaceMinY);
		vLapisOre.addProperty("maxY", 34);
		vLapisOre.addProperty("rarity", 8 * 2);
		vLapisOre.addProperty("veinMinimum", 7);
		vLapisOre.addProperty("veinMultiplier", 7);
		vLapisOre.addProperty("disableOre", false);
		
		vanilla.add(vLapisOre);
		
		 // vanillaRedstoneOre
		JsonObject vRedstoneOre = new JsonObject();
		
		vRedstoneOre.addProperty("ore", "SurfaceRedstoneOre");
		vRedstoneOre.addProperty("minY", surfaceMinY);
		vRedstoneOre.addProperty("maxY", 17);
		vRedstoneOre.addProperty("rarity", 24);
		vRedstoneOre.addProperty("veinMinimum", 3);
		vRedstoneOre.addProperty("veinMultiplier", 7);
		vRedstoneOre.addProperty("disableOre", false);
		
		vanilla.add(vRedstoneOre);
		
		// --------------------------------------- End Surface Ores -------------------------------------------------- \\
		
		// Nether array
		JsonArray nether = new JsonArray();
		
		// netherCoalOre
		JsonObject nCoalOre = new JsonObject();
		
		nCoalOre.addProperty("ore", "NetherCoalOre");
		nCoalOre.addProperty("minY", netherMinY);
		nCoalOre.addProperty("maxY", netherMaxY);
		nCoalOre.addProperty("rarity", 12 * 3);
		nCoalOre.addProperty("veinMinimum", 2);
		nCoalOre.addProperty("veinMultiplier", 17);
		nCoalOre.addProperty("disableOre", false);
		
		nether.add(nCoalOre);
		
		// netherDiamondOre
		JsonObject nDiamondOre = new JsonObject();
		
		nDiamondOre.addProperty("ore", "NetherDiamondOre");
		nDiamondOre.addProperty("minY", netherMinY);
		nDiamondOre.addProperty("maxY", netherMaxY);
		nDiamondOre.addProperty("rarity", 2 * 3);
		nDiamondOre.addProperty("veinMinimum", 3);
		nDiamondOre.addProperty("veinMultiplier", 6);
		nDiamondOre.addProperty("disableOre", false);
		
		nether.add(nDiamondOre);
		
		// netherEmeraldOre
		JsonObject nEmeraldOre = new JsonObject();
		
		nEmeraldOre.addProperty("ore", "NetherEmeraldOre");
		nEmeraldOre.addProperty("minY", netherMinY);
		nEmeraldOre.addProperty("maxY", netherMaxY);
		nEmeraldOre.addProperty("rarity", 4 * 3);
		nEmeraldOre.addProperty("veinMinimum", 6);
		nEmeraldOre.addProperty("veinMultiplier", 6);
		nEmeraldOre.addProperty("disableOre", false);
		
		nether.add(nEmeraldOre);
		
		// netherGoldOre
		JsonObject nGoldOre = new JsonObject();
		
		nGoldOre.addProperty("ore", "NetherGoldOre");
		nGoldOre.addProperty("minY", netherMinY);
		nGoldOre.addProperty("maxY", netherMaxY);
		nGoldOre.addProperty("rarity", 6 * 3);
		nGoldOre.addProperty("veinMinimum", 9);
		nGoldOre.addProperty("veinMultiplier", 9);
		nGoldOre.addProperty("disableOre", false);
		
		nether.add(nGoldOre);
		
		// netherIronOre
		JsonObject nIronOre = new JsonObject();
		
		nIronOre.addProperty("ore", "NetherIronOre");
		nIronOre.addProperty("minY", netherMinY);
		nIronOre.addProperty("maxY", netherMaxY);
		nIronOre.addProperty("rarity", 10 * 3);
		nIronOre.addProperty("veinMinimum", 5);
		nIronOre.addProperty("veinMultiplier", 19);
		nIronOre.addProperty("disableOre", false);
		
		nether.add(nIronOre);
		
		// netherLapisOre
		JsonObject nLapisOre = new JsonObject();
		
		nLapisOre.addProperty("ore", "NetherLapisOre");
		nLapisOre.addProperty("minY", netherMinY);
		nLapisOre.addProperty("maxY", netherMaxY);
		nLapisOre.addProperty("rarity", 8 * 3);
		nLapisOre.addProperty("veinMinimum", 7);
		nLapisOre.addProperty("veinMultiplier", 7);
		nLapisOre.addProperty("disableOre", false);
		
		nether.add(nLapisOre);
		
		// netherQuartzOre
		JsonObject nQuartz = new JsonObject();
		
		nQuartz.addProperty("ore", "NetherQuartzOre");
		nQuartz.addProperty("minY", netherMinY);
		nQuartz.addProperty("maxY", netherMaxY);
		nQuartz.addProperty("rarity", 12 * 3);
		nQuartz.addProperty("veinMinimum", 5);
		nQuartz.addProperty("veinMultiplier", 9);
		nQuartz.addProperty("disableOre", false);
		
		nether.add(nQuartz);
		
		// netherRedstoneOre
		JsonObject nRedstoneOre = new JsonObject();
		
		nRedstoneOre.addProperty("ore", "NetherRedstoneOre");
		nRedstoneOre.addProperty("minY", netherMinY);
		nRedstoneOre.addProperty("maxY", netherMaxY);
		nRedstoneOre.addProperty("rarity", 24 * 3);
		nRedstoneOre.addProperty("veinMinimum", 3);
		nRedstoneOre.addProperty("veinMultiplier", 7);
		nRedstoneOre.addProperty("disableOre", false);
		
		nether.add(nRedstoneOre);
		
		// --------------------------------------- End Nether Ores -------------------------------------------------- \\
		
		// End array
		JsonArray end = new JsonArray();
		
		// netherCoalOre
		JsonObject eCoalOre = new JsonObject();
		
		eCoalOre.addProperty("ore", "EndCoalOre");
		eCoalOre.addProperty("minY", endMinY);
		eCoalOre.addProperty("maxY", endMaxY);
		eCoalOre.addProperty("rarity", 12);
		eCoalOre.addProperty("veinMinimum", 2);
		eCoalOre.addProperty("veinMultiplier", 17);
		eCoalOre.addProperty("disableOre", false);
		
		end.add(eCoalOre);
		
		// netherDiamondOre
		JsonObject eDiamondOre = new JsonObject();
		
		eDiamondOre.addProperty("ore", "EndDiamondOre");
		eDiamondOre.addProperty("minY", endMinY);
		eDiamondOre.addProperty("maxY", endMaxY);
		eDiamondOre.addProperty("rarity", 2);
		eDiamondOre.addProperty("veinMinimum", 3);
		eDiamondOre.addProperty("veinMultiplier", 6);
		eDiamondOre.addProperty("disableOre", false);
		
		end.add(eDiamondOre);
		
		// netherEmeraldOre
		JsonObject eEmeraldOre = new JsonObject();
		
		eEmeraldOre.addProperty("ore", "EndEmeraldOre");
		eEmeraldOre.addProperty("minY", endMinY);
		eEmeraldOre.addProperty("maxY", endMaxY);
		eEmeraldOre.addProperty("rarity", 4);
		eEmeraldOre.addProperty("veinMinimum", 6);
		eEmeraldOre.addProperty("veinMultiplier", 6);
		eEmeraldOre.addProperty("disableOre", false);
		
		end.add(eEmeraldOre);
		
		// netherGoldOre
		JsonObject eGoldOre = new JsonObject();
		
		eGoldOre.addProperty("ore", "EndGoldOre");
		eGoldOre.addProperty("minY", endMinY);
		eGoldOre.addProperty("maxY", endMaxY);
		eGoldOre.addProperty("rarity", 6);
		eGoldOre.addProperty("veinMinimum", 9);
		eGoldOre.addProperty("veinMultiplier", 9);
		eGoldOre.addProperty("disableOre", false);
		
		end.add(eGoldOre);
		
		// netherIronOre
		JsonObject eIronOre = new JsonObject();
		
		eIronOre.addProperty("ore", "EndIronOre");
		eIronOre.addProperty("minY", endMinY);
		eIronOre.addProperty("maxY", endMaxY);
		eIronOre.addProperty("rarity", 10);
		eIronOre.addProperty("veinMinimum", 5);
		eIronOre.addProperty("veinMultiplier", 19);
		eIronOre.addProperty("disableOre", false);
		
		end.add(eIronOre);
		
		// netherLapisOre
		JsonObject eLapisOre = new JsonObject();
		
		eLapisOre.addProperty("ore", "EndLapisOre");
		eLapisOre.addProperty("minY", endMinY);
		eLapisOre.addProperty("maxY", endMaxY);
		eLapisOre.addProperty("rarity", 8);
		eLapisOre.addProperty("veinMinimum", 7);
		eLapisOre.addProperty("veinMultiplier", 7);
		eLapisOre.addProperty("disableOre", false);
		
		end.add(eLapisOre);
		
		// netherRedstoneOre
		JsonObject eRedstoneOre = new JsonObject();
		
		eRedstoneOre.addProperty("ore", "EndRedstoneOre");
		eRedstoneOre.addProperty("minY", endMinY);
		eRedstoneOre.addProperty("maxY", endMaxY);
		eRedstoneOre.addProperty("rarity", 24);
		eRedstoneOre.addProperty("veinMinimum", 3);
		eRedstoneOre.addProperty("veinMultiplier", 7);
		eRedstoneOre.addProperty("disableOre", false);
		
		end.add(eRedstoneOre);
		
		// --------------------------------------- End Ender Ores -------------------------------------------------- \\
		
		basic.add(vanilla);
		basic.add(nether);
		basic.add(end);
		
		root.add("basic", basic);
		
		// --------------------------------------- Neutral Ores --------------------------------------------------- \\
		
		// surfaceCopperOre
		JsonObject oCopper = new JsonObject();
		
		oCopper.addProperty("ore", "SurfaceCopperOre");
		oCopper.addProperty("minY", 10);
		oCopper.addProperty("maxY", 256);
		oCopper.addProperty("rarity", 10 * 3);
		oCopper.addProperty("veinMinimum", 5);
		oCopper.addProperty("veinMultiplier", 19);
		oCopper.addProperty("miningLevel", "STONE");
		oCopper.addProperty("disableOre", false);
		
		neutral.add(oCopper);
		
		// surfaceTinOre
		JsonObject oTin = new JsonObject();
		
		oTin.addProperty("ore", "SurfaceTinOre");
		oTin.addProperty("minY", 20);
		oTin.addProperty("maxY", 256);
		oTin.addProperty("rarity", 24 * 3);
		oTin.addProperty("veinMinimum", 3);
		oTin.addProperty("veinMultiplier", 19);
		oTin.addProperty("miningLevel", "STONE");
		oTin.addProperty("disableOre", false);
		
		neutral.add(oTin);
		
		// surfaceLeadOre
		JsonObject oLead = new JsonObject();
		
		oLead.addProperty("ore", "SurfaceLeadOre");
		oLead.addProperty("minY", 16);
		oLead.addProperty("maxY", 60);
		oLead.addProperty("rarity", 10 * 2);
		oLead.addProperty("veinMinimum", 5);
		oLead.addProperty("veinMultiplier", 19);
		oLead.addProperty("miningLevel", "IRON");
		oLead.addProperty("disableOre", false);
		
		neutral.add(oLead);
		
		// netherCopperOre
		JsonObject nCopper = new JsonObject();
		
		nCopper.addProperty("ore", "NetherCopperOre");
		nCopper.addProperty("minY", netherMinY);
		nCopper.addProperty("maxY", netherMaxY);
		nCopper.addProperty("rarity", 10 * 3);
		nCopper.addProperty("veinMinimum", 5);
		nCopper.addProperty("veinMultiplier", 19);
		nCopper.addProperty("miningLevel", "STONE");
		nCopper.addProperty("disableOre", false);
				
		neutral.add(nCopper);
		
		// netherCopperOre
		JsonObject nTin = new JsonObject();
		
		nTin.addProperty("ore", "NetherTinOre");
		nTin.addProperty("minY", netherMinY);
		nTin.addProperty("maxY", netherMaxY);
		nTin.addProperty("rarity", 24 * 3);
		nTin.addProperty("veinMinimum", 5);
		nTin.addProperty("veinMultiplier", 19);
		nTin.addProperty("miningLevel", "STONE");
		nTin.addProperty("disableOre", false);
				
		neutral.add(nTin);
		
		// netherLeadOre
		JsonObject nLead = new JsonObject();
		
		nLead.addProperty("ore", "NetherLeadOre");
		nLead.addProperty("minY", netherMinY);
		nLead.addProperty("maxY", netherMaxY);
		nLead.addProperty("rarity", 10 * 3);
		nLead.addProperty("veinMinimum", 5);
		nLead.addProperty("veinMultiplier", 19);
		nLead.addProperty("miningLevel", "IRON");
		nLead.addProperty("disableOre", false);
		
		neutral.add(nLead);
		
		// endCopperOre
		JsonObject eCopper = new JsonObject();
		
		eCopper.addProperty("ore", "EndCopperOre");
		eCopper.addProperty("minY", endMinY);
		eCopper.addProperty("maxY", endMaxY);
		eCopper.addProperty("rarity", 10 * 3);
		eCopper.addProperty("veinMinimum", 5);
		eCopper.addProperty("veinMultiplier", 17);
		eCopper.addProperty("miningLevel", "STONE");
		eCopper.addProperty("disableOre", false);
				
		neutral.add(eCopper);
		
		// endTinOre
		JsonObject eTin = new JsonObject();
		
		eTin.addProperty("ore", "EndTinOre");
		eTin.addProperty("minY", endMinY);
		eTin.addProperty("maxY", endMaxY);
		eTin.addProperty("rarity", 24 * 2);
		eTin.addProperty("veinMinimum", 7);
		eTin.addProperty("veinMultiplier", 10);
		eTin.addProperty("miningLevel", "STONE");
		eTin.addProperty("disableOre", false);
				
		neutral.add(eTin);
		
		// endLeadOre
		JsonObject eLead = new JsonObject();
		
		eLead.addProperty("ore", "EndLeadOre");
		eLead.addProperty("minY", endMinY);
		eLead.addProperty("maxY", endMaxY);
		eLead.addProperty("rarity", 10 * 3);
		eLead.addProperty("veinMinimum", 4);
		eLead.addProperty("veinMultiplier", 9);
		eLead.addProperty("miningLevel", "IRON");
		eLead.addProperty("disableOre", false);
		
		neutral.add(eLead);
		
		// --------------------------------------- End Neutral Ores ------------------------------------------------ \\
		
		root.add("neutral", neutral);
		
		
		// --------------------------------------- Forestry Ores --------------------------------------------------- \\
		
		// surfaceApatiteOre
		JsonObject oApatite = new JsonObject();
		
		oApatite.addProperty("ore", "ApatiteOre");
		oApatite.addProperty("minY", 64);
		oApatite.addProperty("maxY", 256);
		oApatite.addProperty("rarity", 24);
		oApatite.addProperty("veinMinimum", 7);
		oApatite.addProperty("veinMultiplier", 11);
		oApatite.addProperty("disableOre", false);
		
		forestry.add(oApatite);
		
		// --------------------------------------- End Forestry Ores ------------------------------------------------ \\
		
		root.add("forestry", forestry);
		
		
		// --------------------------------------- IC2 Ores --------------------------------------------------- \\
		// surfaceUraniumOre
		JsonObject oUranium = new JsonObject();
		
		oUranium.addProperty("ore", "SurfaceUraniumOre");
		oUranium.addProperty("minY", surfaceMinY);
		oUranium.addProperty("maxY", 60);
		oUranium.addProperty("rarity", 2 * 2);
		oUranium.addProperty("veinMinimum", 4);
		oUranium.addProperty("veinMultiplier", 8);
		oUranium.addProperty("miningLevel", "IRON");
		oUranium.addProperty("disableOre", false);
		
		ic.add(oUranium);
		
		// netherUraniumOre
		JsonObject nUranium = new JsonObject();
		
		nUranium.addProperty("ore", "NetherUraniumOre");
		nUranium.addProperty("minY", netherMinY);
		nUranium.addProperty("maxY", netherMaxY);
		nUranium.addProperty("rarity", 2 * 3);
		nUranium.addProperty("veinMinimum", 4);
		nUranium.addProperty("veinMultiplier", 8);
		nUranium.addProperty("miningLevel", "IRON");
		nUranium.addProperty("disableOre", false);
			
		ic.add(nUranium);
				
		// endUraniumOre
		JsonObject eUranium = new JsonObject();
		
		eUranium.addProperty("ore", "EndUraniumOre");
		eUranium.addProperty("minY", endMinY);
		eUranium.addProperty("maxY", endMaxY);
		eUranium.addProperty("rarity", 2 * 3);
		eUranium.addProperty("veinMinimum", 4);
		eUranium.addProperty("veinMultiplier", 8);
		eUranium.addProperty("miningLevel", "IRON");
		eUranium.addProperty("disableOre", false);
		
		ic.add(eUranium);
		
		// --------------------------------------- End IC2 Ores ------------------------------------------------ \\
		
		root.add("IC2", ic);
		
		
		// --------------------------------------- IE Ores ------------------------------------------------ \\
		// Surface Aluminum Ore
		JsonObject oBauxite = new JsonObject();
		
		oBauxite.addProperty("ore", "SurfaceBauxiteOre");
		oBauxite.addProperty("minY", 40);
		oBauxite.addProperty("maxY", 85);
		oBauxite.addProperty("rarity", 12 * 4);
		oBauxite.addProperty("veinMinimum", 6);
		oBauxite.addProperty("veinMultiplier", 20);
		oBauxite.addProperty("miningLevel", "STONE");
		oBauxite.addProperty("disableOre", false);
		
		ie.add(oBauxite);
		
		// Surface Nickel Ore
		JsonObject oNickel = new JsonObject();
		
		oNickel.addProperty("ore", "SurfaceNickelOre");
		oNickel.addProperty("minY", 8);
		oNickel.addProperty("maxY", 24);
		oNickel.addProperty("rarity", 6);
		oNickel.addProperty("veinMinimum", 9);
		oNickel.addProperty("veinMultiplier", 9);
		oNickel.addProperty("miningLevel", "STONE");
		oNickel.addProperty("disableOre", false);
		
		ie.add(oNickel);
		
		// Surface Silver Ore
		JsonObject oSilver = new JsonObject();
		
		oSilver.addProperty("ore", "SurfaceSilverOre");
		oSilver.addProperty("minY", 8);
		oSilver.addProperty("maxY", 40);
		oSilver.addProperty("rarity", 2 * 2);
		oSilver.addProperty("veinMinimum", 3);
		oSilver.addProperty("veinMultiplier", 6);
		oSilver.addProperty("miningLevel", "IRON");
		oSilver.addProperty("disableOre", false);
		
		ie.add(oSilver);
		
		// Nether Aluminum Ore
		JsonObject nBauxite = new JsonObject();
		
		nBauxite.addProperty("ore", "NetherBauxiteOre");
		nBauxite.addProperty("minY", netherMinY);
		nBauxite.addProperty("maxY", netherMaxY);
		nBauxite.addProperty("rarity", 12 * 4);
		nBauxite.addProperty("veinMinimum", 6);
		nBauxite.addProperty("veinMultiplier", 20);
		nBauxite.addProperty("miningLevel", "STONE");
		nBauxite.addProperty("disableOre", false);
		
		ie.add(nBauxite);
		
		// Nether Nickel Ore
		JsonObject nNickel = new JsonObject();
		
		nNickel.addProperty("ore", "NetherNickelOre");
		nNickel.addProperty("minY", netherMinY);
		nNickel.addProperty("maxY", netherMaxY);
		nNickel.addProperty("rarity", 6);
		nNickel.addProperty("veinMinimum", 9);
		nNickel.addProperty("veinMultiplier", 9);
		nNickel.addProperty("miningLevel", "STONE");
		nNickel.addProperty("disableOre", false);
		
		ie.add(nNickel);
		
		// Nether Silver Ore
		JsonObject nSilver = new JsonObject();
		
		nSilver.addProperty("ore", "NetherSilverOre");
		nSilver.addProperty("minY", netherMinY);
		nSilver.addProperty("maxY", netherMaxY);
		nSilver.addProperty("rarity", 2 * 2);
		nSilver.addProperty("veinMinimum", 3);
		nSilver.addProperty("veinMultiplier", 6);
		nSilver.addProperty("miningLevel", "IRON");
		nSilver.addProperty("disableOre", false);
		
		ie.add(nSilver);
		
		// End Aluminum Ore
		JsonObject eBauxite = new JsonObject();
		
		eBauxite.addProperty("ore", "EndBauxiteOre");
		eBauxite.addProperty("minY", endMinY);
		eBauxite.addProperty("maxY", endMaxY);
		eBauxite.addProperty("rarity", 12 * 4);
		eBauxite.addProperty("veinMinimum", 6);
		eBauxite.addProperty("veinMultiplier", 20);
		eBauxite.addProperty("miningLevel", "STONE");
		eBauxite.addProperty("disableOre", false);
		
		ie.add(eBauxite);
		
		// End Nickel Ore
		JsonObject eNickel = new JsonObject();
		
		eNickel.addProperty("ore", "EndNickelOre");
		eNickel.addProperty("minY", endMinY);
		eNickel.addProperty("maxY", endMaxY);
		eNickel.addProperty("rarity", 6);
		eNickel.addProperty("veinMinimum", 9);
		eNickel.addProperty("veinMultiplier", 9);
		eNickel.addProperty("miningLevel", "STONE");
		eNickel.addProperty("disableOre", false);
		
		ie.add(eNickel);
		
		// End Silver Ore
		JsonObject eSilver = new JsonObject();
		
		eSilver.addProperty("ore", "EndSilverOre");
		eSilver.addProperty("minY", endMinY);
		eSilver.addProperty("maxY", endMaxY);
		eSilver.addProperty("rarity", 2 * 2);
		eSilver.addProperty("veinMinimum", 3);
		eSilver.addProperty("veinMultiplier", 6);
		eSilver.addProperty("miningLevel", "IRON");
		eSilver.addProperty("disableOre", false);
		
		ie.add(eSilver);
		
		// --------------------------------------- End IE Ores ------------------------------------------------ \\
		
		root.add("IE", ie);
		
		createFile(root);
		return JsonFormatting(root);
	}
	
	public static void createFile(JsonObject obj)
	{
		try(PrintWriter writer = new PrintWriter(jsonFile))
		{
			writer.print(JsonFormatting(obj));
		}
		catch(FileNotFoundException fnf){}
	}
	
	public static void updateFile()
	{
		if(runOnce)
		{
			LogHelper.log("Mod has been updated from previous version");
			LogHelper.log("OreGen.json has been renamed to OreGen.json.bak, and re-generated");
			LogHelper.log("If you used custom values for old ores, please go re-add them.");
			
			runOnce = false;
		}
		
		if(updateFile.exists() && !updateFile.isDirectory())
		{
			updateFile.delete();
		}
		jsonFile.renameTo(updateFile);
		createJson();
	}
	
	public static String JsonFormatting(JsonObject obj)
	{
	    Gson gson = new GsonBuilder().setPrettyPrinting().create();
	    
	    String prettyJson = gson.toJson(obj);
	    
	    return prettyJson;
	}
}
