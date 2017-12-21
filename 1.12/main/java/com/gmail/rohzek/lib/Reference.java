package com.gmail.rohzek.lib;

import java.io.File;

/**
 * Holds global variables to be called elsewhere
 * @author Rohzek
 *
 */
public class Reference 
{
	// Mod ID
	public static final String MODID = "simpleoregen";
	
	// Just like MODID but with : attached to save time while assigning resource locations
	public static final String RESOURCEID = "simpleoregen:";
	
	// The name that gets seen in brackets when we log to the console.
	public static final String LOG = "SIMPOREGEN";
	
	// Human readable title
	public static final String NAME = "Simple Ore Generation";
	
	// Mods to load after
	public static final String DEPENDENCIES = "after:forestry,ic2,immersiveengineering,techreborn,thermalfoundation,tconstruct,mekanism;";
	
	// Folder holding config data
	public static File LOCATION; 
	
	// We only have to change it here... MCMOD.info is gone and the ModData is hardcoded to check here
	public static final String VERSION = "4.1.1";
	
	static String address = "com.gmail.rohzek.proxy";
	
	public static final String CLIENTSIDEPROXY = "com.gmail.rohzek.proxy.ClientProxy";
	public static final String SERVERSIDEPROXY = "com.gmail.rohzek.proxy.CommonProxy";
}