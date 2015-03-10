package com.robotsquid.moltencraft.init;

import com.robotsquid.moltencraft.item.ItemFluidWrench;
import com.robotsquid.moltencraft.item.ItemMoltenCraft;
import com.robotsquid.moltencraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemMoltenCraft fluidWrench = new ItemFluidWrench();

    public static void init()
    {
        GameRegistry.registerItem(fluidWrench, "fluidWrench");
    }
}
