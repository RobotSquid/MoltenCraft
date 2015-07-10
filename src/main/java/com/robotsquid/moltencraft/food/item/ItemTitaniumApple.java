package com.robotsquid.moltencraft.food.item;

import com.robotsquid.moltencraft.MoltenCraft;
import com.robotsquid.moltencraft.utility.StringHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemTitaniumApple extends ItemFood
{
    public ItemTitaniumApple()
    {
        super(8, 2.0F, false);
        this.setUnlocalizedName(StringHelper.getModUnlocalizedName("appleTitanium"));
        this.setTextureName(StringHelper.getModUnlocalizedName("appleTitanium"));
        this.setCreativeTab(MoltenCraft.MOLTENCRAFT_TAB);
        this.setMaxStackSize(16);
    }

    @Override
    public int getMaxItemUseDuration(ItemStack itemStack)
    {
        return 8;
    }

    @Override
    protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer player)
    {
        if (!world.isRemote)
        {
            player.addExperienceLevel(32);
            player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 9600, 0));
            player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 9600, 4));
            player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 9600, 0));
            player.addPotionEffect(new PotionEffect(Potion.heal.id, 9600, 4));
            player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 9600, 0));
            player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 9600, 4));
            player.addPotionEffect(new PotionEffect(Potion.resistance.id, 9600, 4));
            player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 9600, 0));
            player.addPotionEffect(new PotionEffect(Potion.field_76434_w.id, 9600, 10));
            player.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 9600, 0));
            player.addPotionEffect(new PotionEffect(Potion.jump.id, 9600, 0));
        }
    }
}

