package com.sownathlete.pswg.block;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSnow;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockCustomLayered extends BlockSnow {
    private final String textureName;

    public BlockCustomLayered(String name, String textureName, float hardness, String toolType, int harvestLevel, SoundType stepSound) {
        super();
        this.setBlockName(name);
        this.setHardness(hardness);
        this.setHarvestLevel(toolType, harvestLevel);
        this.setStepSound(stepSound);
        this.textureName = textureName;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg) {
        this.blockIcon = reg.registerIcon("pswg:" + this.textureName);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side) {
        return side == 1 || super.shouldSideBeRendered(world, x, y, z, side);
    }

    /**
     * Allows stacking layers like Snow Blocks when right-clicked with the same item.
     */
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
        if (!world.isRemote) {
            ItemStack heldItem = player.getCurrentEquippedItem();
            if (heldItem != null && heldItem.getItem() == Item.getItemFromBlock(this)) {
                int currentLayers = world.getBlockMetadata(x, y, z) & 7;
                if (currentLayers < 7) { // Max stack height is 7 (full block)
                    world.setBlockMetadataWithNotify(x, y, z, currentLayers + 1, 2);
                    if (!player.capabilities.isCreativeMode) {
                        heldItem.stackSize--; // Decrease stack size if survival
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Allows stacking when placed on top of another same block
     */
    @Override
    public void onBlockAdded(World world, int x, int y, int z) {
        if (!world.isRemote) {
            int belowMeta = world.getBlockMetadata(x, y - 1, z) & 7;
            if (world.getBlock(x, y - 1, z) == this && belowMeta < 7) {
                world.setBlockMetadataWithNotify(x, y - 1, z, belowMeta + 1, 2);
                world.setBlockToAir(x, y, z); // Remove extra block
            }
        }
    }

    /**
     * FIX: Prevents grass blocks from turning into snowy grass.
     */
    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block neighborBlock) {
        // Override and DO NOTHING to prevent snow layers from converting grass
    }

    @Override
    public void updateTick(World world, int x, int y, int z, Random random) {
        // Remove the snow-melting logic that checks for light levels
    }

}
