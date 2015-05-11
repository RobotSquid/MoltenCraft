package com.robotsquid.moltencraft.utility;

import com.robotsquid.moltencraft.reference.Reference;

public class StringHelper
{
    public static String getModUnlocalizedName(String itemName)
    {
        return String.format("%s:%s", Reference.MOD_ID.toLowerCase(), itemName);
    }
}
