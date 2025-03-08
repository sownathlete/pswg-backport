package com.sownathlete.pswg.item;
import com.sownathlete.pswg.Galaxies;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCustom extends Item {
    public String name;

    public ItemCustom(String name) {
        this.name = name;
        this.setUnlocalizedName("pswg." + this.name);
        this.setTextureName("pswg:" + this.name);
        this.setCreativeTab(Galaxies.TabItems);
    }
}