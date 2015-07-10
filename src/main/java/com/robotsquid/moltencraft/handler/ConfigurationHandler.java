package com.robotsquid.moltencraft.handler;

import com.robotsquid.moltencraft.reference.ConfigurationReference;
import com.robotsquid.moltencraft.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;

    public static void init(File configFile)
    {
        // Initialize the config object
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfigurations();
        }
    }

    private static void loadConfigurations()
    {
        ConfigurationReference.enableOPTools = configuration.getBoolean("isOPTools", Configuration.CATEGORY_GENERAL, true, "Do you want to enable OP tools?");

        ConfigurationReference.veinSizeTitanium = configuration.getInt("minVeinSizeTitanium", ConfigurationReference.CATEGORY_WORLDGEN, 4, 0, 10, "Average vein size of Titanium (+- 1)");
        ConfigurationReference.veinsInChunkTitanium = configuration.getInt("veinsInChunkTitanium", ConfigurationReference.CATEGORY_WORLDGEN, 10, 0, 20, "Amount of veins in chunk");
        ConfigurationReference.minHeightTitanium = configuration.getInt("minHeightTitanium", ConfigurationReference.CATEGORY_WORLDGEN, 4, 0, 128, "Minimum height fot Titanium to spawn");
        ConfigurationReference.maxHeightTitanium = configuration.getInt("maxHeightTitanium", ConfigurationReference.CATEGORY_WORLDGEN, 20, 0, 128, "Maximum height for Titanium to spawn");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfigurations();
        }
    }
}