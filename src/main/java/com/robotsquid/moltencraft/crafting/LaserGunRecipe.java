package com.robotsquid.moltencraft.crafting;

import com.robotsquid.moltencraft.init.ModTools;
import com.robotsquid.moltencraft.utility.NBTHelper;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class LaserGunRecipe extends ShapedOreRecipe
{
    public LaserGunRecipe(ItemStack output, Object... recipe)
    {
        super(output, recipe);
    }

    @Override
    public ItemStack getCraftingResult(InventoryCrafting var1)
    {
        ItemStack stack = new ItemStack(ModTools.gunLaser);
        ItemStack craftingStack = var1.getStackInRowAndColumn(2, 1);
        String displayName;

        if (NBTHelper.hasTag(craftingStack, "displayName"))
        {
            displayName = craftingStack.stackTagCompound.getString("displayName");
        }
        else
        {
            displayName = "blank";
        }

        float damage;
        float explosionRadius;
        String special;
        boolean isMulti = false;

        if (displayName.equalsIgnoreCase("multi"))
        {
            isMulti = true;
        }

        if (displayName.equalsIgnoreCase("damage"))
        {
            damage = 20.0F;
            explosionRadius = 1.0F;
            special = "none";
        }
        else if (displayName.equalsIgnoreCase("explosion"))
        {
            damage = 2.0F;
            explosionRadius = 4.0F;
            special = "none";
        }
        else if (displayName.equalsIgnoreCase("lightning"))
        {
            damage = 4.0F;
            explosionRadius = 1.0F;
            special = "lightning";
        }
        else
        {
            damage = 0.0F;
            explosionRadius = 0.0F;
            special = "none";
        }

        NBTHelper.setString(stack, "displayName", displayName);
        NBTHelper.setFloat(stack, "damage", damage);
        NBTHelper.setFloat(stack, "explosionRadius", explosionRadius);
        NBTHelper.setString(stack, "special", special);
        NBTHelper.setBoolean(stack, "isMulti", isMulti);

        return stack;
    }

    @Override
    public ItemStack getRecipeOutput()
    {
        return new ItemStack(ModTools.gunLaser);
    }
}
