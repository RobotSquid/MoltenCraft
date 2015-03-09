package com.robotsquid.moltencraft;

import com.robotsquid.moltencraft.handler.ConfigurationHandler;
import com.robotsquid.moltencraft.init.ModItems;
import com.robotsquid.moltencraft.proxy.IProxy;
import com.robotsquid.moltencraft.reference.Reference;
import com.robotsquid.moltencraft.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version= Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class MoltenCraft
{
    @Mod.Instance(Reference.MOD_ID)
    public static MoltenCraft instance;

    @SidedProxy(clientSide = Reference.SERVER_PROXY_CLASS, serverSide = Reference.CLIENT_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        LogHelper.info("Reading Configs...");
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Reading Configs done!");
        LogHelper.info("Registering Items...");
        ModItems.init();
        LogHelper.info("Items Registered!");
        LogHelper.info("Pre-Init Done!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Init Done!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post-Init Done!");
    }
}