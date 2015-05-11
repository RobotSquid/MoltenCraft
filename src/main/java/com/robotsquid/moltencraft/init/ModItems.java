package com.robotsquid.moltencraft.init;

import com.robotsquid.moltencraft.item.*;
import com.robotsquid.moltencraft.item.food.ItemTitaniumApple;
import com.robotsquid.moltencraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemIngot ingotTitanium = new ItemIngot("ingotTitanium", 64);
    public static final ItemIngot ingotBlazium = new ItemIngot("ingotBlazium", 64);
    public static final ItemIngot blendBlazium = new ItemIngot("blendBlazium", 64);
    public static final ItemIngot ingotWitherium = new ItemIngot("ingotWitherium", 64);
    public static final ItemIngot blendWitherium = new ItemIngot("blendWitherium", 64);

    public static final ItemDust dustWither = new ItemDust("dustWither", 16);
    public static final ItemDust dustTitanium = new ItemDust("dustTitanium", 64);

    public static final ItemTitaniumApple appleTitanium = new ItemTitaniumApple();

    public static final ItemWitherPearl witherPearl = new ItemWitherPearl();

    public static final ItemLaserFocus focusLaser = new ItemLaserFocus();
    public static final ItemMC crystalLaser = new ItemMC("crystalLaser", 1);

    public static void init()
    {
        GameRegistry.registerItem(ingotTitanium, "ingotTitanium");
        GameRegistry.registerItem(ingotBlazium, "ingotBlazium");
        GameRegistry.registerItem(blendBlazium, "blendBlazium");
        GameRegistry.registerItem(ingotWitherium, "ingotWitherium");
        GameRegistry.registerItem(blendWitherium, "blendWitherium");

        GameRegistry.registerItem(dustWither, "dustWither");
        GameRegistry.registerItem(dustTitanium, "dustTitanium");

        GameRegistry.registerItem(appleTitanium, "appleTitanium");

        GameRegistry.registerItem(witherPearl, "witherPearl");

        GameRegistry.registerItem(focusLaser, "focusLaser");
        GameRegistry.registerItem(crystalLaser, "crystalLaser");
    }
}