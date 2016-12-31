package com.gmail.rohzek.lib;

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
	
	// We only have to change it here... MCMOD.info is gone and the ModData is hardcoded to check here
	public static final String VERSION = "2.1";
	
	public static final String CLIENTSIDEPROXY = "com.gmail.rohzek.proxys.ClientProxy";
	
	public static final String SERVERSIDEPROXY = "com.gmail.rohzek.proxys.CommonProxy";
}
