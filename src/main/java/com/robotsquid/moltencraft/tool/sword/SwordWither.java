package com.robotsquid.moltencraft.tool.sword;

import com.robotsquid.moltencraft.init.ModMaterials;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class SwordWither extends SwordMC
{
    public SwordWither()
    {
        super(ModMaterials.STICKIUM, "witherStick");
    }

    @Override
    public boolean hitEntity(ItemStack currentItem, EntityLivingBase target, EntityLivingBase player)
    {
        target.addPotionEffect(new PotionEffect(Potion.wither.id, 9600, 0));
        return super.hitEntity(currentItem, target, player);
    }
}
