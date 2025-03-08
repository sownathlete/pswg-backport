package com.sownathlete.pswg;

import com.sownathlete.pswg.container.SwgItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabItems extends CreativeTabs {

    public TabItems(String label) {
        super(label);
    }

    @Override
    public Item getTabIconItem() {
        return SwgItems.getRegisteredItem("stormtrooper_helmet");  // Change this to your desired item for the tab icon
    }
}
