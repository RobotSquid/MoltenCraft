package com.robotsquid.moltencraft.init;

import com.robotsquid.moltencraft.utility.NBTHelper;
import com.robotsquid.moltencraft.world.WorldGenMC;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class ModWorldGen
{
    public static void init()
    {
        ItemStack stackFocus = new ItemStack(ModItems.focusLaser);
        NBTHelper.setString(stackFocus, "displayName", "Multi");
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(stackFocus, 1, 1, 1));

        GameRegistry.registerWorldGenerator(new WorldGenMC(), 1);
    }
}
