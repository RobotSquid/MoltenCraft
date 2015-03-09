package com.robotsquid.moltencraft.handler;

import com.robotsquid.moltencraft.reference.ConfigurationReference;
import com.robotsquid.moltencraft.reference.Reference;
import com.robotsquid.moltencraft.utility.LogHelper;
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
        ConfigurationReference.isAwesome = configuration.getBoolean("isAwesome", Configuration.CATEGORY_GENERAL, true, "Is this mod awesome??");
        ConfigurationReference.isActive = configuration.getBoolean("isActive", Configuration.CATEGORY_GENERAL, true, "Do you want this mod to be active?");
        ConfigurationReference.isHard = configuration.getBoolean("isHard", Configuration.CATEGORY_GENERAL, false, "Do you want to play with an extra hard mod?");

        if (configuration.hasChanged())
        {
            configuration.save();
        }

        //LogHelper.info("isAwesome: " + ConfigurationReference.isAwesome);
        //LogHelper.info("isActive: " + ConfigurationReference.isActive);
        //LogHelper.info("isHard: " + ConfigurationReference.isHard);
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