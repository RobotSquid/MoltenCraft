package com.robotsquid.moltencraft.init;

import com.robotsquid.moltencraft.item.ItemFluidWrench;
import com.robotsquid.moltencraft.item.ItemMoltenCraft;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemMoltenCraft fluidWrench = new ItemFluidWrench();

    public static void init()
    {
        GameRegistry.registerItem(fluidWrench, "fluidWrench");
    }
}
