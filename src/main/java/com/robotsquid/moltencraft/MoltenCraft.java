package com.robotsquid.moltencraft;

import com.robotsquid.moltencraft.compat.CompatTE;
import com.robotsquid.moltencraft.creativetab.CreativeTabMC;
import com.robotsquid.moltencraft.handler.ConfigurationHandler;
import com.robotsquid.moltencraft.init.*;
import com.robotsquid.moltencraft.proxy.IProxy;
import com.robotsquid.moltencraft.reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version= Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class MoltenCraft
{
    public static CreativeTabs MOLTENCRAFT_TAB = new CreativeTabMC(CreativeTabs.getNextID(), "moltencraft");

    @Mod.Instance(Reference.MOD_ID)
    public static MoltenCraft instance;

    @SidedProxy(clientSide = Reference.SERVER_PROXY_CLASS, serverSide = Reference.CLIENT_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //Configs
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        //Items
        ModItems.init();
        //Tools
        ModTools.init();
        //Armor
        ModArmor.init();
        //Blocks
        ModBlocks.init();
        //TileEntities
        ModTileEntities.init();
        //Entities
        ModEntities.init();
        //Renderers
        ModRenderers.init();
        //WorldGen
        ModWorldGen.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        //Recipes
        ModRecipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        //TE Compat
        if (Loader.isModLoaded("ThermalExpansion"))
        {
            CompatTE.init();
        }
    }
}