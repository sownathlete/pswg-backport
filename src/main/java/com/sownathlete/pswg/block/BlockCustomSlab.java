package com.sownathlete.pswg.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockCustomSlab extends BlockSlab {
    private final boolean isDouble;
    private final Block mainBlock;
    private final Item singleSlabItem; // This field will store the item to be dropped for single slabs

    public BlockCustomSlab(boolean isDouble, Block mainBlock, Item singleSlabItem) {
        super(isDouble, mainBlock.getMaterial());
        this.isDouble = isDouble;
        this.mainBlock = mainBlock;
        this.singleSlabItem = singleSlabItem; // Store the passed item in the field

        String name = mainBlock.getUnlocalizedName().substring(5); // Assuming the unlocalized name has "pswg." prefix
        this.setBlockName(name + "_slab");
        this.setHardness(mainBlock.getBlockHardness(null, 0, 0, 0));
        this.setStepSound(mainBlock.stepSound);

        // Add single slabs to creative tab only
        if (!isDouble) {
            this.setCreativeTab(CreativeTabs.tabBlock);
        }
    }

    @Override
    public int quantityDropped(Random random) {
        return this.isDouble ? 1 : 1;
    }

    @Override
    public Item getItemDropped(int metadata, Random rand, int fortune) {
        Item item;
        if (this.isDouble) {
            item = Item.getItemFromBlock(this.mainBlock); // Drop the main block's item for double slabs
        } else
            return Item.getItemFromBlock(this); // Drop this block's item
        return item;
    }

    // Overriding the getIcon method to return the correct texture for each side
    @Override
    public IIcon getIcon(int side, int meta) {
        // Assuming mainBlock has a correct implementation of getIcon
        // If mainBlock is a BlockRotatedPillar, you might need to adjust the logic to properly handle its orientation
        return this.mainBlock.getIcon(side, meta);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        // No need to register the icon here as we're using the main block's icon for all sides
    }

    @Override
    public String func_150002_b(int metadata) {
        return this.getUnlocalizedName();
    }

    public String getUnlocalizedName(int id) {
        return this.getUnlocalizedName();
    }

    @Override
    protected ItemStack createStackedBlock(int id) {
        return new ItemStack(this, 1, id);
    }

    @SideOnly(Side.CLIENT)
    private static boolean func_150003_a(Block block) {
        return block instanceof BlockCustomSlab;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public Item getItem(World world, int x, int y, int z) {
        if (this.isDouble)
            return Item.getItemFromBlock(this.mainBlock); // Return the main block's item for double slabs
        else
            return Item.getItemFromBlock(this);
    }
}