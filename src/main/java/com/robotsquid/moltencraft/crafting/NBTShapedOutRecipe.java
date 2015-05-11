package com.robotsquid.moltencraft.crafting;

import com.robotsquid.moltencraft.utility.NBTHelper;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class NBTShapedOutRecipe extends ShapedOreRecipe
{
    private String tagNBT;
    private String valueNBT;

    public NBTShapedOutRecipe(ItemStack output, String tag, String value, Object... recipe)
    {
        super(output, recipe);
        this.tagNBT = tag;
        this.valueNBT = value;
    }

    @Override
    public ItemStack getCraftingResult(InventoryCrafting var1)
    {
        ItemStack stack = super.getCraftingResult(var1);

        NBTHelper.setString(stack, tagNBT, valueNBT);

        return stack;
    }
}
