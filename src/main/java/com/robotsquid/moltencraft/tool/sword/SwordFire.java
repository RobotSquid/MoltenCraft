package com.robotsquid.moltencraft.tool.sword;

import com.robotsquid.moltencraft.init.ModMaterials;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class SwordFire extends SwordMC
{
    public SwordFire()
    {
        super(ModMaterials.BLAZIUM, "fireStick");
    }

    @Override
    public boolean hitEntity(ItemStack currentItem, EntityLivingBase target, EntityLivingBase player)
    {
        target.setFire(3600);
        return super.hitEntity(currentItem, target, player);
    }
}
