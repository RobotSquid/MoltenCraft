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

        ConfigurationReference.minVeinSizeTitanium = configuration.getInt("minVeinSizeTitanium", Configuration.CATEGORY_GENERAL, 7, 2, 8, "Min vein size of Titanium");
        ConfigurationReference.maxVeinSizeTitanium = configuration.getInt("maxVeinSizeTitanium", Configuration.CATEGORY_GENERAL, 7, 2, 8, "Max vein size of Titanium");
        ConfigurationReference.veinsInChunkTitanium = configuration.getInt("veinsInChunkTitanium", Configuration.CATEGORY_GENERAL, 10, 2, 20, "Amount of veins in chunk");
        ConfigurationReference.minHeightTitanium = configuration.getInt("minHeightTitanium", Configuration.CATEGORY_GENERAL, 4, 2, 12, "Minimum height fot Titanium to spawn");
        ConfigurationReference.maxHeightTitanium = configuration.getInt("maxHeightTitanium", Configuration.CATEGORY_GENERAL, 20, 14, 64, "Maximum height for Titanium to spawn");

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