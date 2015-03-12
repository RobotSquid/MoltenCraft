package com.robotsquid.moltencraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModRecipes
{
    public static void init()
    {
        GameRegistry.addSmelting(ModBlocks.oreTitanium, new ItemStack(ModItems.ingotTitanium), 0.0F);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockTitanium), "ttt", "ttt", "ttt", 't', new ItemStack(ModItems.ingotTitanium));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.fluidWrench), "t t", " i ", " t ", 't', new ItemStack(ModItems.ingotTitanium), 'i', new ItemStack(Items.iron_ingot));
    }
}