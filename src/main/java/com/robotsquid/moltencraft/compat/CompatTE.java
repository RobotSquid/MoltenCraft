package com.robotsquid.moltencraft.compat;

import com.robotsquid.moltencraft.init.ModBlocks;
import com.robotsquid.moltencraft.init.ModItems;
import com.robotsquid.moltencraft.utility.compat.ThermalExpansionHelper;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CompatTE
{
    public static void init()
    {
        ThermalExpansionHelper.addSmelterRecipe(10000, new ItemStack(ModItems.ingotTitanium), new ItemStack(Items.blaze_powder, 2), new ItemStack(ModItems.ingotBlazium, 2));
        ThermalExpansionHelper.addSmelterRecipe(10000, new ItemStack(ModItems.ingotTitanium), new ItemStack(ModItems.dustWither, 2), new ItemStack(ModItems.ingotWitherium, 2));

        ThermalExpansionHelper.addPulverizerRecipe(5000, new ItemStack(ModBlocks.oreTitanium), new ItemStack(ModItems.dustTitanium, 2));
    }
}
