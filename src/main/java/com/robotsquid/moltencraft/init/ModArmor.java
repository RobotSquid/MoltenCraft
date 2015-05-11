package com.robotsquid.moltencraft.init;

import com.robotsquid.moltencraft.armor.ItemArmorMC;
import com.robotsquid.moltencraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModArmor
{
    public static final ItemArmorMC helmetTitanium = new ItemArmorMC(ModMaterials.ARMOR_TITANIUM, 0, "helmetTitanium", "titanium");
    public static final ItemArmorMC chestplateTitanium = new ItemArmorMC(ModMaterials.ARMOR_TITANIUM, 1, "chestplateTitanium", "titanium");
    public static final ItemArmorMC leggingsTitanium = new ItemArmorMC(ModMaterials.ARMOR_TITANIUM, 2, "leggingsTitanium", "titanium");
    public static final ItemArmorMC bootsTitanium = new ItemArmorMC(ModMaterials.ARMOR_TITANIUM, 3, "bootsTitanium", "titanium");

    public static void init()
    {
        GameRegistry.registerItem(helmetTitanium, "helmetTitanium");
        GameRegistry.registerItem(chestplateTitanium, "chestplateTitanium");
        GameRegistry.registerItem(leggingsTitanium, "leggingsTitanium");
        GameRegistry.registerItem(bootsTitanium, "bootsTitanium");
    }
}
