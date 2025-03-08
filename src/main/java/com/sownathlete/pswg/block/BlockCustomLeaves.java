package com.sownathlete.pswg.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;

import com.sownathlete.pswg.Galaxies;

public class BlockCustomLeaves extends BlockLeaves {
    private IIcon leavesIcon;
    private IIcon opaqueIcon;

    public BlockCustomLeaves(String name, float hardness, String harvestTool, int harvestLevel, Block.SoundType stepSound) {
        super();
        setBlockName(name);
        setBlockTextureName("galaxies:" + name);
        setHardness(hardness);
        setHarvestLevel(harvestTool, harvestLevel);
        setStepSound(stepSound);
        setLightOpacity(1);  // Leaves typically don't block much light, adjust as needed
        setCreativeTab(Galaxies.TabBlocks);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.leavesIcon = iconRegister.registerIcon("pswg:" + getUnlocalizedName().substring(5));
        this.opaqueIcon = iconRegister.registerIcon("pswg:" + getUnlocalizedName().substring(5) + "_opaque");
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta) {
        // Choose between normal and opaque icons based on the 'field_150121_P' which reflects the graphics setting
        return !this.field_150121_P ? this.leavesIcon : this.opaqueIcon;
    }

    @Override
    public Item getItemDropped(int meta, Random random, int fortune) {
        return Item.getItemFromBlock(Blocks.sapling); // Adjust to your specific drop
    }

    @Override
    public int quantityDropped(Random random) {
        return random.nextInt(20) == 0 ? 1 : 0; // Typically leaves drop saplings infrequently
    }

    @Override
    public boolean isOpaqueCube() {
        return false; // Leaves are not opaque
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false; // Leaves do not render as a normal (solid) block
    }

    @Override
    public boolean shouldSideBeRendered(IBlockAccess blockAccess, int x, int y, int z, int side) {
        return true; // Render sides regardless of adjacent blocks
    }

	@Override
	public String[] func_150125_e() {
		// TODO Auto-generated method stub
		return null;
	}

    // If you have special rotation needs or similar, override methods as in BlockCustomLog
}
