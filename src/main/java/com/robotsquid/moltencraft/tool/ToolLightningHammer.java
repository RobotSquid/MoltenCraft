package com.robotsquid.moltencraft.tool;

import com.robotsquid.moltencraft.item.ItemMC;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class ToolLightningHammer extends ItemMC
{
    public ToolLightningHammer()
    {
        super("lightningHammer", 1);
        this.setMaxDamage(1000);
    }


    //Lightning
    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float px, float py, float pz)
    {
        if (!world.isRemote)
            world.addWeatherEffect(new EntityLightningBolt(world, (double) x, (double) y, (double) z));
        stack.damageItem(1, player);
        return true;
    }

    //Mobs
    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase player)
    {
        if (player instanceof EntityPlayer)
        {
            target.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer)player), 2.0F);
        }
        else
        {
            target.attackEntityFrom(DamageSource.generic, 2.0F);
        }
        target.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 200, 2));
        target.addPotionEffect(new PotionEffect(Potion.blindness.id, 200, 0));
        target.addPotionEffect(new PotionEffect(Potion.confusion.id, 200, 0));
        target.addPotionEffect(new PotionEffect(Potion.weakness.id, 200, 2));
        stack.damageItem(1, player);
        return true;
    }

    //Mining Speed for blocks
    @Override
    public float func_150893_a(ItemStack p_150893_1_, Block p_150893_2_)
    {
        Material material = p_150893_2_.getMaterial();
        return material != Material.plants && material != Material.vine && material != Material.coral && material != Material.leaves && material != Material.gourd ? 1.0F : 1.5F;
    }

    //Slowness 1 on hold
    @Override
    public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean isHeld)
    {
        EntityPlayer player = (EntityPlayer)entity;
        if (isHeld || player.capabilities.isCreativeMode)
        {
            player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 20, 0));
        }
    }
}
