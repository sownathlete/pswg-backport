package com.sownathlete.pswg.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.Random;

import com.sownathlete.pswg.Galaxies;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCustomWood extends Block {
    private IIcon blockIcon;
    private final String textureName;

    public BlockCustomWood(String name, String textureName, float hardness, String harvestTool, int harvestLevel, Block.SoundType stepSound) {
        super(Material.wood);
        this.textureName = textureName; // Use custom texture name
        setBlockName(name);
        setHardness(hardness);
        setHarvestLevel(harvestTool, harvestLevel);
        setStepSound(stepSound);
        this.setCreativeTab(Galaxies.TabBlocks); // Add to creative tab
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("pswg:" + this.textureName); // Register the correct texture
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return this.blockIcon;
    }

    @Override
    public Item getItemDropped(int meta, Random rand, int fortune) {
        return Item.getItemFromBlock(this); // Drops itself
    }

    @Override
    public int damageDropped(int meta) {
        return meta; // Drops the same metadata variant
    }

    @Override
    public int quantityDropped(Random random) {
        return 1;  // Drop one item by default
    }

    @Override
    public boolean rotateBlock(World world, int x, int y, int z, ForgeDirection axis) {
        return super.rotateBlock(world, x, y, z, axis);
    }
}
