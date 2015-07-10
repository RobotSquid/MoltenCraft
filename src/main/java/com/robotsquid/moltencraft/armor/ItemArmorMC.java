package com.robotsquid.moltencraft.armor;

import com.robotsquid.moltencraft.MoltenCraft;
import com.robotsquid.moltencraft.reference.Reference;
import com.robotsquid.moltencraft.utility.StringHelper;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorMC extends ItemArmor
{
    public String textureName;

    public ItemArmorMC(ArmorMaterial material, int armorType, String unlocalizedName, String textureName)
    {
        super(material, 0, armorType);
        this.textureName = textureName;
        this.setUnlocalizedName(StringHelper.getModUnlocalizedName(unlocalizedName));
        this.setTextureName(StringHelper.getModUnlocalizedName(unlocalizedName));
        this.setCreativeTab(MoltenCraft.MOLTENCRAFT_TAB);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        return String.format("%s:textures/model/armor/%s_%s.png", Reference.MOD_ID.toLowerCase(), textureName, (this.armorType == 2 ? "2" : "1"));
    }
}
