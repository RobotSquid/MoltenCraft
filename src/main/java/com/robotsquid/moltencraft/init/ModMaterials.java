package com.robotsquid.moltencraft.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ModMaterials
{
    public static Item.ToolMaterial BLAZIUM = EnumHelper.addToolMaterial("BLAZIUM", 3, 1024, 6.0F, 1.0F, 24);
    public static Item.ToolMaterial TITANIUM = EnumHelper.addToolMaterial("TITANIUM", 3, 4096, 8.0F, 4.0F, 16);
    public static Item.ToolMaterial UNOBTANIUM = EnumHelper.addToolMaterial("UNOBTANIUM", 8, 1, 16.0F, 1.0F, 1);
    public static Item.ToolMaterial STICKIUM = EnumHelper.addToolMaterial("STICKIUM", 0, 1, 1.0F, 1.0F, 1);

    public static ItemArmor.ArmorMaterial ARMOR_TITANIUM = EnumHelper.addArmorMaterial("TITANIUM", 40, new int[] {3, 8, 6, 3}, 24);
    public static ItemArmor.ArmorMaterial ARMOR_UNOBTANIUM = EnumHelper.addArmorMaterial("UNOBTANIUM", 1, new int[] {4, 10, 7, 4}, 1);
}