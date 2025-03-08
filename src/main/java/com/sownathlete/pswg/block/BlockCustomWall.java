package com.sownathlete.pswg.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class BlockCustomWall extends BlockWall {

    private Block mainBlock;

    public BlockCustomWall(Block mainBlock) {
        super(mainBlock);
        this.mainBlock = mainBlock;
        String name = mainBlock.getUnlocalizedName().substring(5); // Assuming the unlocalized name has "pswg." prefix
        this.setBlockName(name + "_wall");
        this.setBlockTextureName("pswg:" + name);
        this.setHardness(mainBlock.getBlockHardness(null, 0, 0, 0));
        this.setStepSound(mainBlock.stepSound);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    // Use the @SuppressWarnings annotation to suppress the unchecked warning
    @SuppressWarnings("unchecked")
    @Override
    public void getSubBlocks(Item item, CreativeTabs tab, @SuppressWarnings("rawtypes") List list) {
        // Check if the item is the one corresponding to the default subtype
        if (Item.getItemFromBlock(this) == item) {
            list.add(new ItemStack(item));
        }
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        // Assuming your main block has 6 textures, one for each side.
        // You may need to adjust this based on your setup.
        return this.mainBlock.getIcon(side, meta);
    }
}
