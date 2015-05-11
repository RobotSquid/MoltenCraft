package com.robotsquid.moltencraft.crafting;

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
        ItemStack stack = super.getCraftingResult(var1);
        ItemStack craftingStack = var1.getStackInRowAndColumn(2, 1);
        String displayName;

        if (NBTHelper.hasTag(craftingStack, "displayName"))
        {
            displayName = craftingStack.stackTagCompound.getString("displayName");
        }
        else
        {
            displayName = "Blank";
        }

        float damage;
        float explosionRadius;

        if (displayName.equalsIgnoreCase("damage"))
        {
            damage = 20.0F;
            explosionRadius = 1.0F;
        }
        else if (displayName.equalsIgnoreCase("explosion"))
        {
            damage = 2.0F;
            explosionRadius = 4.0F;
        }
        else
        {
            damage = 0.0F;
            explosionRadius = 0.0F;
        }

        NBTHelper.setString(stack, "displayName", displayName);
        NBTHelper.setFloat(stack, "damage", damage);
        NBTHelper.setFloat(stack, "explosionRadius", explosionRadius);

        return stack;
    }
}
