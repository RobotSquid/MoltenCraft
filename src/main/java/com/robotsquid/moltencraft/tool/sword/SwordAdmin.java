package com.robotsquid.moltencraft.tool.sword;

import com.robotsquid.moltencraft.init.ModMaterials;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class SwordAdmin extends SwordMC
{
    public SwordAdmin()
    {
        super(ModMaterials.UNOBTANIUM, "adminSword");
    }

    @Override
    public boolean hitEntity(ItemStack currentItem, EntityLivingBase target, EntityLivingBase player)
    {
        target.setHealth(0);
        return true;
    }
}
