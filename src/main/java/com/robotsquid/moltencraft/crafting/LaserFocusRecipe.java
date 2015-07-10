package com.robotsquid.moltencraft.crafting;

import com.robotsquid.moltencraft.init.ModItems;
import com.robotsquid.moltencraft.utility.NBTHelper;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class LaserFocusRecipe extends ShapedOreRecipe
{
    private String displayName;

    public LaserFocusRecipe(ItemStack output, String displayName, Object... recipe)
    {
        super(output, recipe);
        this.displayName = displayName;
    }

    @Override
    public ItemStack getCraftingResult(InventoryCrafting var1)
    {
        ItemStack stack = new ItemStack(ModItems.focusLaser);

        NBTHelper.setString(stack, "displayName", displayName);

        return stack;
    }
}
