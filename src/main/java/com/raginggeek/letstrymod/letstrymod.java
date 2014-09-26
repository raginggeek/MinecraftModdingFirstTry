package com.raginggeek.letstrymod;

import com.raginggeek.letstrymod.client.handler.KeyInputEventHandler;
import com.raginggeek.letstrymod.handler.ConfigurationHandler;
import com.raginggeek.letstrymod.init.ModBlocks;
import com.raginggeek.letstrymod.init.ModItems;
import com.raginggeek.letstrymod.init.Recipes;
import com.raginggeek.letstrymod.proxy.IProxy;
import com.raginggeek.letstrymod.reference.Reference;
import com.raginggeek.letstrymod.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID,name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class letstrymod {
	
	@Mod.Instance(Reference.MOD_ID)
	public static letstrymod instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		proxy.registerKeyBindings();
		ModItems.init();
		ModBlocks.init();
		LogHelper.info("Pre Initialization Complete");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		Recipes.init();
		FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
		LogHelper.info("Initialization Complete");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		LogHelper.info("Post Initialization Complete");
	}
}
