package com.sownathlete.pswg.item;

import com.sownathlete.pswg.Galaxies;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemCustomArmor extends ItemArmor {

    public ItemCustomArmor(ArmorMaterial material, int armorType, String armorName) {
        super(material, 0, armorType);
        this.setUnlocalizedName("pswg." + armorName);
        this.setTextureName("pswg:" + armorName);
        this.setCreativeTab(Galaxies.TabItems);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (this.armorType == 2)
            return "pswg:textures/models/armor/" + this.getArmorMaterial().name().toLowerCase() + "_layer_2.png";
        else
            return "pswg:textures/models/armor/" + this.getArmorMaterial().name().toLowerCase() + "_layer_1.png";
    }
}
