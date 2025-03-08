/*
 * Decompiled with CFR 0.148.
 *
 * Could not load the following classes:
 *  cpw.mods.fml.common.registry.GameRegistry
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockSlab
 *  net.minecraft.tileentity.TileEntity
 */
package com.sownathlete.pswg.container;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sownathlete.pswg.Galaxies;
import com.sownathlete.pswg.block.BlockConstants;
import com.sownathlete.pswg.block.BlockCustomBush;
import com.sownathlete.pswg.block.BlockCustomButton;
import com.sownathlete.pswg.block.BlockCustomFence;
import com.sownathlete.pswg.block.BlockCustomLayered;
import com.sownathlete.pswg.block.BlockCustomLeaves;
import com.sownathlete.pswg.block.BlockCustomLog;
import com.sownathlete.pswg.block.BlockCustomPressurePlate;
import com.sownathlete.pswg.block.BlockCustomSlab;
import com.sownathlete.pswg.block.BlockCustomSolid;
import com.sownathlete.pswg.block.BlockCustomStairs;
import com.sownathlete.pswg.block.BlockCustomTransparent;
import com.sownathlete.pswg.block.BlockCustomTrapdoor;
import com.sownathlete.pswg.block.BlockCustomWall;
import com.sownathlete.pswg.block.BlockCustomWood;
import com.sownathlete.pswg.block.ItemBlockCustomSlab;
import com.sownathlete.pswg.block.ItemBlockCustomSlabDouble;
import com.sownathlete.pswg.block.ORBlockContainer;
import com.sownathlete.pswg.block.fluid.BlockFluidCustom;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.oredict.OreDictionary;



public class SwgBlocks {
	static Map<String, Block> registeredBlocks = new HashMap<>();
	public static List<Block> solidBlocks = new ArrayList<Block>();
	public static List<Block> slabBlocks = new ArrayList<Block>();
	public static List<Block> stairsBlocks = new ArrayList<Block>();
	public static List<Block> wallBlocks = new ArrayList<Block>();
	public static List<Block> fenceBlocks = new ArrayList<Block>();
	public static List<Block> pressurePlateBlocks = new ArrayList<Block>();
	public static List<Block> buttonBlocks = new ArrayList<Block>();
	public static List<Block> trapdoorBlocks = new ArrayList<Block>();
	public static List<Block> decorationBlocks = new ArrayList<Block>();
	public static List<Block> leavesBlocks = new ArrayList<Block>();
	public static List<Block> utilBlocks = new ArrayList<Block>();
	public static List<Block> redstoneComponentsList = new ArrayList<Block>();

    public static void register() {
        registerBlock(BlockCustomSolid.class, "thermal_detonator_block", BlockConstants.MATERIAL_TNT, 0.5f, "pickaxe", 0, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);
        
        registerTransparentBlock("creature_cage", "creature_cage", BlockConstants.MATERIAL_IRON, 3.5f, "pickaxe", 2, BlockConstants.SOUND_METAL, "CUTOUT");
        registerTransparentBlock("creature_terrarium", "creature_terrarium", BlockConstants.MATERIAL_IRON, 3.5f, "pickaxe", 2, BlockConstants.SOUND_METAL, "CUTOUT");
        registerBlock(BlockCustomSolid.class, "stained_creature_terrarium", BlockConstants.MATERIAL_IRON, 3.5f, "pickaxe", 2, BlockConstants.SOUND_METAL, 0.0f, null, null, true, true, false, false, false, false, false);
        
        registerBlock(BlockCustomSolid.class, "fusion_fuel_tank", BlockConstants.MATERIAL_IRON, 3.5f, "pickaxe", 2, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "starship_fuel_tank", BlockConstants.MATERIAL_IRON, 3.5f, "pickaxe", 2, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        
        registerBlock(BlockCustomSolid.class, "large_pipe", BlockConstants.MATERIAL_IRON, 3.5f, "pickaxe", 2, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        
        registerBlock(BlockCustomSolid.class, "power_coupling", BlockConstants.MATERIAL_IRON, 3.5f, "pickaxe", 2, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        
        registerBlock(BlockCustomSolid.class, "gx8_moisture_vaporator", BlockConstants.MATERIAL_IRON, 10.0f, "pickaxe", 2, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        
        registerBlock(BlockCustomSolid.class, "spoked_machine", BlockConstants.MATERIAL_IRON, 5.0f, "pickaxe", 2, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "electrostatic_repeller", BlockConstants.MATERIAL_IRON, 5.0f, "pickaxe", 2, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        
        registerBlock(BlockCustomSolid.class, "desh_barrel", BlockConstants.MATERIAL_WOOD, 2.5f, "axe", 0, BlockConstants.SOUND_WOOD, 0.0f, null, null, true, false, false, false, false, false, false);
        
        registerBlock(BlockCustomSolid.class, "corrugated_crate", BlockConstants.MATERIAL_WOOD, 2.5f, "axe", 0, BlockConstants.SOUND_WOOD, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "imperial_corrugated_crate", BlockConstants.MATERIAL_WOOD, 2.5f, "axe", 0, BlockConstants.SOUND_WOOD, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "medical_corrugated_crate", BlockConstants.MATERIAL_WOOD, 2.5f, "axe", 0, BlockConstants.SOUND_WOOD, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "orange_kyber_crate", BlockConstants.MATERIAL_WOOD, 2.5f, "axe", 0, BlockConstants.SOUND_WOOD, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "gray_kyber_crate", BlockConstants.MATERIAL_WOOD, 2.5f, "axe", 0, BlockConstants.SOUND_WOOD, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "black_kyber_crate", BlockConstants.MATERIAL_WOOD, 2.5f, "axe", 0, BlockConstants.SOUND_WOOD, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "toolbox", BlockConstants.MATERIAL_WOOD, 2.5f, "axe", 0, BlockConstants.SOUND_WOOD, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "segmented_crate", BlockConstants.MATERIAL_WOOD, 2.5f, "axe", 0, BlockConstants.SOUND_WOOD, 0.0f, null, null, true, false, false, false, false, false, false);

        registerBlock(BlockCustomSolid.class, "sliding_door", BlockConstants.MATERIAL_IRON, 3.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);

        // Light Blocks
        registerBlock(BlockCustomSolid.class, "light_fixture", BlockConstants.MATERIAL_GLASS, 0.3f, "pickaxe", 0, BlockConstants.SOUND_GLASS, 0.0f, null, null, true, false, false, false, true, false, false);
        registerBlock(BlockCustomSolid.class, "red_hangar_light", BlockConstants.MATERIAL_GLASS, 0.5f, "pickaxe", 0, BlockConstants.SOUND_GLASS, 15.0f, null, null, true, false, false, false, true, false, false);
        registerBlock(BlockCustomSolid.class, "blue_hangar_light", BlockConstants.MATERIAL_GLASS, 0.5f, "pickaxe", 0, BlockConstants.SOUND_GLASS, 15.0f, null, null, true, false, false, false, true, false, false);
        registerBlock(BlockCustomSolid.class, "wall_cluster_light", BlockConstants.MATERIAL_GLASS, 0.5f, "pickaxe", 0, BlockConstants.SOUND_GLASS, 15.0f, null, null, true, false, false, false, true, false, false);
        registerBlock(BlockCustomSolid.class, "tall_lamp", BlockConstants.MATERIAL_GLASS, 0.5f, "pickaxe", 0, BlockConstants.SOUND_GLASS, 15.0f, null, null, true, false, false, false, true, false, false);

        // Vent Blocks
        registerBlock(BlockCustomSolid.class, "air_vent", BlockConstants.MATERIAL_IRON, 3.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, true, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "imperial_vent", BlockConstants.MATERIAL_IRON, 3.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerTransparentBlock("imperial_grated_vent", "imperial_grated_vent", BlockConstants.MATERIAL_IRON, 3.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, "CUTOUT");
        
        registerBlock(BlockCustomSolid.class, "scaffold", BlockConstants.MATERIAL_WOOD, 3.5f, "pickaxe", 1, BlockConstants.SOUND_WOOD, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "scaffold_stairs", BlockConstants.MATERIAL_WOOD, 3.5f, "pickaxe", 1, BlockConstants.SOUND_WOOD, 0.0f, null, null, true, false, false, false, false, false, false);

        // Grate Blocks (Imperial Opaque Grate has 3 variants, Imperial Trapdoor has 5)
        for (int i = 1; i <= 3; i++) { // Starts at 1, ends at 3
            registerBlock(BlockCustomSolid.class, "imperial_opaque_grate_" + i, BlockConstants.MATERIAL_IRON, 3.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        }
        for (int i = 1; i <= 5; i++) { // Starts at 1, ends at 5
            registerTransparentBlock("imperial_grate_" + i, "imperial_grate_" + i, BlockConstants.MATERIAL_IRON, 3.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, "CUTOUT");
        }

        // Panel Blocks
        registerBlock(BlockCustomSolid.class, "rusted_metal", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "imperial_cutout_pipes", BlockConstants.MATERIAL_IRON, 3.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "imperial_cutout_caged_pipes", BlockConstants.MATERIAL_IRON, 3.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "imperial_cutout", BlockConstants.MATERIAL_IRON, 3.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "imperial_cutout_caged", BlockConstants.MATERIAL_IRON, 3.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);

        // Imperial Panel Blanks
        registerBlock(BlockCustomSolid.class, "black_imperial_panel_blank", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "gray_imperial_panel_blank", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "light_gray_imperial_panel_blank", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "white_imperial_panel_blank", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);

        // Black Imperial Panels
        registerBlock(BlockCustomSolid.class, "black_imperial_panel_tile", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "black_imperial_panel_sectional", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "black_imperial_panel_sectional_1", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "black_imperial_panel_sectional_2", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);

        // Gray Imperial Panels
        registerBlock(BlockCustomSolid.class, "gray_imperial_panel_sectional", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "gray_imperial_panel_sectional_1", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "gray_imperial_panel_sectional_2", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);

        // Light Gray Imperial Panels
        registerBlock(BlockCustomSolid.class, "light_gray_imperial_panel_sectional", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "light_gray_imperial_panel_sectional_1", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "light_gray_imperial_panel_sectional_2", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);

        // White Imperial Panels
        registerBlock(BlockCustomSolid.class, "white_imperial_panel_sectional", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "white_imperial_panel_sectional_1", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "white_imperial_panel_sectional_2", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);

        // Special Black Imperial Panels
        registerBlock(BlockCustomSolid.class, "black_imperial_panel_bordered", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "black_imperial_panel_split", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "black_imperial_panel_thin_bordered", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);

        // Large and External Imperial Plating
        registerBlock(BlockCustomSolid.class, "external_imperial_plating", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "large_imperial_plating", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "rusted_large_imperial_plating", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        // Connected Large Imperial Plating
        registerBlock(BlockCustomSolid.class, "rusted_large_imperial_plating_connected", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "mossy_large_imperial_plating", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "large_light_gray_imperial_plating", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);

     // Black Imperial Panel Patterns (A, B, D, E) - Start at 1 and go to 4
        for (int i = 1; i <= 4; i++) {
            registerBlock(BlockCustomSolid.class, "black_imperial_panel_pattern_a_" + i, BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
            registerBlock(BlockCustomSolid.class, "black_imperial_panel_pattern_b_" + i, BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
            registerBlock(BlockCustomSolid.class, "black_imperial_panel_pattern_d_" + i, BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
            registerBlock(BlockCustomSolid.class, "black_imperial_panel_pattern_e_" + i, BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        }

        // Black Imperial Panel Pattern C - Start at 1 and go to 2
        for (int i = 1; i <= 2; i++) {
            registerBlock(BlockCustomSolid.class, "black_imperial_panel_pattern_c_" + i, BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        }

        // Gray and Light Gray Imperial Panel Patterns
        registerBlock(BlockCustomSolid.class, "gray_imperial_panel_pattern_3", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "light_gray_imperial_panel_pattern_3", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "light_gray_imperial_panel_pattern_4", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "light_gray_imperial_panel_pattern_5", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        
        // Rusted and Mossy Gray Imperial Panel Patterns
        registerBlock(BlockCustomSolid.class, "rusted_gray_imperial_panel_pattern_3", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "mossy_gray_imperial_panel_pattern_3", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "gray_imperial_panel_pattern_4", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "rusted_gray_imperial_panel_pattern_4", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "mossy_gray_imperial_panel_pattern_4", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);

        // Additional Patterns
        registerBlock(BlockCustomSolid.class, "gray_imperial_panel_pattern_5", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "rusted_gray_imperial_panel_pattern_5", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "mossy_gray_imperial_panel_pattern_5", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);

        // Pattern 6 Variants
        registerBlock(BlockCustomSolid.class, "gray_imperial_panel_pattern_6", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "rusted_gray_imperial_panel_pattern_6", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "mossy_gray_imperial_panel_pattern_6", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);

        // Pattern 7 and beyond
        registerBlock(BlockCustomSolid.class, "gray_imperial_panel_pattern_7", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);

        registerBlock(BlockCustomSolid.class, "gray_imperial_panel_pattern_8", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "gray_imperial_panel_pattern_9", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "rusted_gray_imperial_panel_pattern_9", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "mossy_gray_imperial_panel_pattern_9", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "gray_imperial_panel_pattern_10", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "gray_imperial_panel_pattern_11", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "gray_imperial_panel_pattern_12", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "gray_imperial_panel_pattern_13", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);

        // Gray Imperial Flooring
        registerBlock(BlockCustomSolid.class, "gray_imperial_flooring_0", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "gray_imperial_flooring_3", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "gray_imperial_flooring_4", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);

        // Light Gray Imperial Flooring
        registerBlock(BlockCustomSolid.class, "light_gray_imperial_flooring_0", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "light_gray_imperial_flooring_3", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "light_gray_imperial_flooring_4", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);

        // Black Imperial Flooring
        registerBlock(BlockCustomSolid.class, "black_imperial_flooring_3", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "black_imperial_flooring_4", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);

        // White Imperial Flooring
        registerBlock(BlockCustomSolid.class, "white_imperial_flooring_3", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "white_imperial_flooring_4", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);

        // Imperial Flooring Patterns
        registerBlock(BlockCustomSolid.class, "imperial_flooring_pattern_1", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "imperial_flooring_pattern_2", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);

        // Gray Imperial Light Half Blocks
        registerBlock(BlockCustomSolid.class, "gray_imperial_light_half_1", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 13.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "gray_imperial_light_half_2", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 13.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "gray_imperial_light_half_3", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 13.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "gray_imperial_light_half_4", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 13.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "gray_imperial_light_half_5", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 13.0f, null, null, true, false, false, false, false, false, false);

        // Lighting Slab
        registerBlock(BlockCustomSolid.class, "gray_imperial_lighting_panel_slab", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 12.0f, null, null, true, false, false, false, false, false, false);

        // Gray Imperial Panel Patterns
        registerBlock(BlockCustomSolid.class, "gray_imperial_panel_pattern_1", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "gray_imperial_panel_pattern_2", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);

        // Tall Imperial Panels
        registerBlock(BlockCustomSolid.class, "gray_imperial_tall_panel_1", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "gray_imperial_tall_panel_2", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);

        // Tall Imperial Light Panels
        registerBlock(BlockCustomSolid.class, "gray_imperial_tall_light_1", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "gray_imperial_tall_light_2", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);

        // Gray Imperial Light Panels
        registerBlock(BlockCustomSolid.class, "gray_imperial_light_panel_1", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 11.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "gray_imperial_light_panel_2", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 9.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "gray_imperial_light_panel_3", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 14.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "gray_imperial_light_1", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 15.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "gray_imperial_light_2", BlockConstants.MATERIAL_IRON, 1.5f, "pickaxe", 1, BlockConstants.SOUND_METAL, 15.0f, null, null, true, false, false, false, false, false, false);

        // Imperial Glass
        registerTransparentBlock("imperial_glass", "imperial_glass", BlockConstants.MATERIAL_GLASS, 0.3f, "pickaxe", 0, BlockConstants.SOUND_GLASS, "CUTOUT");

        // Stained Imperial Glass
        String[] colors = {
        	    "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray",
        	    "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
        	};

        	for (String color : colors) {
        	    registerTransparentBlock(color + "_stained_imperial_glass", color + "_stained_imperial_glass",
        	        BlockConstants.MATERIAL_GLASS, 0.3f, "pickaxe", 0, BlockConstants.SOUND_GLASS, "TRANSLUCENT");
        	}

        // Composite Blocks
        registerBlock(BlockCustomSolid.class, "durasteel_block", BlockConstants.MATERIAL_IRON, 5.0f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "plasteel_block", BlockConstants.MATERIAL_IRON, 3.0f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);

        // Ore Blocks
        registerBlock(BlockCustomSolid.class, "beskar_ore", BlockConstants.MATERIAL_ROCK, 5.0f, "pickaxe", 2, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "beskar_block", BlockConstants.MATERIAL_IRON, 5.0f, "pickaxe", 2, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "chromium_ore", BlockConstants.MATERIAL_ROCK, 3.0f, "pickaxe", 1, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "chromium_block", BlockConstants.MATERIAL_IRON, 3.0f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "cortosis_ore", BlockConstants.MATERIAL_ROCK, 5.0f, "pickaxe", 2, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "cortosis_block", BlockConstants.MATERIAL_IRON, 5.0f, "pickaxe", 2, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "desh_ore", BlockConstants.MATERIAL_ROCK, 3.0f, "pickaxe", 1, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "desh_block", BlockConstants.MATERIAL_IRON, 3.0f, "pickaxe", 1, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "diatium_ore", BlockConstants.MATERIAL_ROCK, 3.0f, "pickaxe", 1, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "diatium_block", BlockConstants.MATERIAL_IRON, 5.0f, "pickaxe", 2, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "ionite_ore", BlockConstants.MATERIAL_ROCK, 3.0f, "pickaxe", 1, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "ionite_block", BlockConstants.MATERIAL_IRON, 5.0f, "pickaxe", 2, BlockConstants.SOUND_METAL, 3.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "lommite_ore", BlockConstants.MATERIAL_ROCK, 3.0f, "pickaxe", 1, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "lommite_block", BlockConstants.MATERIAL_IRON, 5.0f, "pickaxe", 2, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "titanium_ore", BlockConstants.MATERIAL_ROCK, 4.0f, "pickaxe", 2, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "titanium_block", BlockConstants.MATERIAL_IRON, 5.0f, "pickaxe", 2, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "zersium_ore", BlockConstants.MATERIAL_ROCK, 3.0f, "pickaxe", 1, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "zersium_block", BlockConstants.MATERIAL_IRON, 5.0f, "pickaxe", 2, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "thorilide_ore", BlockConstants.MATERIAL_ROCK, 3.0f, "pickaxe", 1, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "thorilide_block", BlockConstants.MATERIAL_IRON, 5.0f, "pickaxe", 2, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "helicite_ore", BlockConstants.MATERIAL_ROCK, 3.0f, "pickaxe", 1, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "helicite_block", BlockConstants.MATERIAL_IRON, 5.0f, "pickaxe", 2, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
        // Sequoia Tree Blocks
        registerTree("sequoia");
        registerLog("stripped_sequoia_log");
        registerLog("mossy_sequoia_log");

        // Japor Tree Blocks
        registerTree("japor");
        
        // Tatooine Tree Blocks
        registerWood("tatooine_wood", "tatooine_log");
        registerLog("tatooine_log");
        
        // Plant Blocks
        registerBush("funnel_flower", 0, false);
        registerBush("blossoming_funnel_flower", 0, false);
        registerBush("poonten_grass", 0, false);
        registerBush("dried_poonten_grass", 0, false);
        registerBush("tuber_stalk", 0, false);
        registerBush("chasuka", 3, false);
        registerBush("hkak_bush", 4, false);
        registerBush("molo_shrub", 4, true);
        registerBush("vaporator_mushroom_colony", 0, false);

        // Dirt Blocks
        registerBlock(BlockCustomSolid.class, "wet_pourstone", BlockConstants.MATERIAL_ROCK, 0.5f, "pickaxe", 0, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, true, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "ruined_wet_pourstone", BlockConstants.MATERIAL_ROCK, 0.5f, "pickaxe", 0, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, true, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "desert_loam", BlockConstants.MATERIAL_GROUND, 0.5f, "shovel", 0, BlockConstants.SOUND_GRAVEL, 0.0f, null, null, true, false, false, false, false, false, false);
        // Gravel
        registerBlock(BlockCustomSolid.class, "jundland_gravel", BlockConstants.MATERIAL_SAND, 0.5f, "shovel", 0, BlockConstants.SOUND_GRAVEL, 0.0f, null, null, true, false, false, false, false, false, false);

        // Salt
        registerBlock(BlockCustomSolid.class, "caked_salt", BlockConstants.MATERIAL_CLAY, 0.5f, "shovel", 0, BlockConstants.SOUND_SAND, 0.0f, null, null, true, false, false, false, false, false, false);

        // Sand Blocks
        registerBlock(BlockCustomSolid.class, "desert_sand", BlockConstants.MATERIAL_SAND, 0.5f, "shovel", 0, BlockConstants.SOUND_SAND, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "pit_sand", BlockConstants.MATERIAL_SAND, 0.5f, "shovel", 0, BlockConstants.SOUND_SAND, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "fine_sand", BlockConstants.MATERIAL_SAND, 0.5f, "shovel", 0, BlockConstants.SOUND_SAND, 0.0f, null, null, true, false, false, false, false, false, false);
        registerLayeredBlock("loose_desert_sand", "desert_sand", Material.sand, 0.5F, "shovel", 0, Block.soundTypeSand);
        registerBlock(BlockCustomSolid.class, "canyon_sand", BlockConstants.MATERIAL_SAND, 0.5f, "shovel", 0, BlockConstants.SOUND_SAND, 0.0f, null, null, true, false, false, false, false, false, false);

        // Sandstone Blocks
        registerBlock(BlockCustomSolid.class, "desert_sandstone", BlockConstants.MATERIAL_ROCK, 1.25f, "pickaxe", 0, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "dunestone", BlockConstants.MATERIAL_ROCK, 1.25f, "pickaxe", 0, BlockConstants.SOUND_STONE, 0.0f, null, null, true, true, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "smooth_desert_sandstone", BlockConstants.MATERIAL_ROCK, 0.5f, "pickaxe", 0, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "polished_desert_sandstone", BlockConstants.MATERIAL_ROCK, 0.5f, "pickaxe", 0, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "chiseled_desert_sandstone", BlockConstants.MATERIAL_ROCK, 0.5f, "pickaxe", 0, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);
        // Canyon Stone Blocks
        registerBlock(BlockCustomSolid.class, "canyon_stone", BlockConstants.MATERIAL_ROCK, 0.5f, "pickaxe", 0, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "canyon_stone_bricks", BlockConstants.MATERIAL_ROCK, 0.5f, "pickaxe", 0, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "polished_canyon_stone", BlockConstants.MATERIAL_ROCK, 0.5f, "pickaxe", 0, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "chiseled_canyon_stone", BlockConstants.MATERIAL_ROCK, 0.5f, "pickaxe", 0, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "canyon_cobblestone", BlockConstants.MATERIAL_ROCK, 1.25f, "pickaxe", 0, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);

        // Pourstone Blocks
        registerBlock(BlockCustomSolid.class, "pourstone", BlockConstants.MATERIAL_ROCK, 1.25f, "pickaxe", 0, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "smooth_pourstone", BlockConstants.MATERIAL_ROCK, 1.25f, "pickaxe", 0, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "cracked_pourstone", BlockConstants.MATERIAL_ROCK, 1.0f, "pickaxe", 0, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "durasteel_bordered_pourstone", BlockConstants.MATERIAL_ROCK, 1.5f, "pickaxe", 0, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);

        // Massassi Stone Blocks
        registerBlock(BlockCustomSolid.class, "massassi_stone", BlockConstants.MATERIAL_ROCK, 1.5f, "pickaxe", 0, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "smooth_massassi_stone", BlockConstants.MATERIAL_ROCK, 2.0f, "pickaxe", 0, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, true, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "massassi_stone_bricks", BlockConstants.MATERIAL_ROCK, 1.5f, "pickaxe", 0, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "mossy_smooth_massassi_stone", BlockConstants.MATERIAL_ROCK, 2.0f, "pickaxe", 0, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, true, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "mossy_massassi_stone_bricks", BlockConstants.MATERIAL_ROCK, 1.5f, "pickaxe", 0, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);

        // Ilum Stone Blocks
        registerBlock(BlockCustomSolid.class, "ilum_stone", BlockConstants.MATERIAL_ROCK, 1.5f, "pickaxe", 0, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "smooth_ilum_stone", BlockConstants.MATERIAL_ROCK, 2.0f, "pickaxe", 0, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, true, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "ilum_stone_bricks", BlockConstants.MATERIAL_ROCK, 1.5f, "pickaxe", 0, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "chiseled_ilum_stone_bricks", BlockConstants.MATERIAL_ROCK, 1.5f, "pickaxe", 0, BlockConstants.SOUND_STONE, 0.0f, null, null, true, false, false, false, false, false, false);
        // Workbenches
        registerBlock(BlockCustomSolid.class, "blaster_workbench", BlockConstants.MATERIAL_WOOD, 3.5f, "pickaxe", 0, BlockConstants.SOUND_WOOD, 0.0f, null, null, true, false, false, false, false, false, false);
        registerBlock(BlockCustomSolid.class, "lightsaber_forge", BlockConstants.MATERIAL_IRON, 2.5f, "pickaxe", 0, BlockConstants.SOUND_METAL, 0.0f, null, null, true, false, false, false, false, false, false);
    }

	public static <T extends BlockCustomSolid> T registerBlock(Class<T> blockClass, String name, Material material,
			float hardness, String toolType, int harvestLevel, SoundType stepSound, float lightLevel,
			Block blockDropped, Item itemDropped, boolean dropItself, boolean isMultiSided, boolean additionalBlocks,
			boolean redstoneBlocks, boolean isDecorative, boolean includeFence, boolean includeWall) {
		// Create an instance of the block using reflection.
		T block;
		try {
			Constructor<T> constructor = blockClass.getConstructor(String.class, Material.class, float.class,
					String.class, int.class, SoundType.class, boolean.class);
			block = constructor.newInstance(name, material, hardness, toolType, harvestLevel, stepSound, isMultiSided);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		block.setHardness(hardness);
		block.setHarvestLevel(toolType, harvestLevel);
		block.setStepSound(stepSound);
		block.setLightLevel(lightLevel);

		// Handle custom drop logic. Requires implementation in BlockCustomSolid.
		if (dropItself) {
			block.setSelfDropped(true);
		} else {
			if (blockDropped != null) {
				block.setBlockDropped(blockDropped);
			} else if (itemDropped != null) {
				block.setItemDropped(itemDropped);
			}
		}

		GameRegistry.registerBlock(block, name);

		if (isDecorative) {
			decorationBlocks.add(block);
			block.setCreativeTab(Galaxies.TabBlocks);
		} else {
			solidBlocks.add(block);
		}

		// Store the registered block in the HashMap using its name as the key
		registeredBlocks.put(name, block);

		if (additionalBlocks) {

			// Register stairs
			BlockCustomStairs stairs = new BlockCustomStairs(block);
			GameRegistry.registerBlock(stairs, name + "_stairs");
			registeredBlocks.put(name + "_stairs", stairs);
			stairsBlocks.add(stairs);
			
			// Register single and double slabs
			Item singleSlabItem = Item.getItemFromBlock(SwgBlocks.getRegisteredBlock(name + "_slab"));

			// Create instances of single and double slabs
			BlockCustomSlab singleSlabInstance = new BlockCustomSlab(false, block, singleSlabItem);
			BlockCustomSlab doubleSlabInstance = new BlockCustomSlab(true, block, singleSlabItem);

			GameRegistry.registerBlock(singleSlabInstance, ItemBlockCustomSlab.class, name + "_slab",
					singleSlabInstance, doubleSlabInstance, false);
			GameRegistry.registerBlock(doubleSlabInstance, ItemBlockCustomSlabDouble.class, name + "_slab_double");
			slabBlocks.add(singleSlabInstance);
			// slabBlocks.add(doubleSlabInstance);

			// Crafting recipe for stairs
			GameRegistry.addRecipe(new ItemStack(stairs, 4), "  X", " XX", "XXX", 'X', block);

			// Add crafting recipes for slabs
			GameRegistry.addRecipe(new ItemStack(singleSlabInstance, 6), "XXX", 'X', block);
		}

		if (includeWall) {
			// Register wall
			BlockCustomWall wall = new BlockCustomWall(block);
			GameRegistry.registerBlock(wall, name + "_wall");
			registeredBlocks.put(name + "_wall", wall);
			wallBlocks.add(wall);

			// Crafting recipe for wall
			GameRegistry.addRecipe(new ItemStack(wall, 6), "XXX", "XXX", "   ", 'X', block);
		}

		if (includeFence) { // Register fence if the flag is true
			BlockCustomFence fence = new BlockCustomFence(block);
			GameRegistry.registerBlock(fence, name + "_fence");
			registeredBlocks.put(name + "_fence", fence);
			// Optionally add the fence to a creative tab or collections
			fenceBlocks.add(fence);
		}

		if (redstoneBlocks) {
			// Create and register trapdoor, button, and pressure plate of the same texture
			// Here we use 'block' as the base block for your custom blocks to share
			// textures with
			// BlockCustomTrapdoor trapdoor = new BlockCustomTrapdoor(name + "_trapdoor",
			// block, hardness, toolType,
			// harvestLevel, stepSound, isMultiSided);
			BlockCustomButton button = new BlockCustomButton(name + "_button", block, hardness, toolType, harvestLevel,
					stepSound, isMultiSided);
			BlockCustomPressurePlate pressurePlate = new BlockCustomPressurePlate(name + "_pressure_plate", block,
					hardness, toolType, harvestLevel, stepSound, isMultiSided);

			// GameRegistry.registerBlock(trapdoor, name + "_trapdoor");
			GameRegistry.registerBlock(button, name + "_button");
			GameRegistry.registerBlock(pressurePlate, name + "_pressure_plate");

			// registeredBlocks.put(name + "_trapdoor", trapdoor);
			registeredBlocks.put(name + "_button", button);
			registeredBlocks.put(name + "_pressure_plate", pressurePlate);
			// trapdoorBlocks.add(trapdoor);
			buttonBlocks.add(button);
			pressurePlateBlocks.add(pressurePlate);

			// Crafting recipes for trapdoor, button, and pressure plate
			// GameRegistry.addRecipe(new ItemStack(trapdoor), " ", "XXX", "XXX", 'X',
			// block);
			GameRegistry.addShapelessRecipe(new ItemStack(button), block);
			GameRegistry.addRecipe(new ItemStack(pressurePlate), "XX", 'X', block);
		}

		return block;
	}

	public static <T extends BlockCustomSolid> T registerOre(
		    Class<T> blockClass,
		    String name,
		    Material material,
		    float hardness,
		    String toolType,
		    int harvestLevel,
		    SoundType stepSound,
		    float lightLevel,
		    boolean dropsItem,
		    Item itemDropped,
		    Integer itemDroppedMeta, // Metadata support for dropped items
		    Block blockDropped,
		    int minDrop,
		    int maxDrop,
		    float experience,
		    boolean isMultiSided
		) {
		    T block;
		    try {
		        Constructor<T> constructor = blockClass.getConstructor(String.class, Material.class, float.class, String.class, int.class, SoundType.class, boolean.class);
		        block = constructor.newInstance(name, material, hardness, toolType, harvestLevel, stepSound, isMultiSided);
		    } catch (Exception e) {
		        e.printStackTrace();
		        return null;
		    }

		    // Set basic block properties
		    block.setHardness(hardness);
		    block.setHarvestLevel(toolType, harvestLevel);
		    block.setStepSound(stepSound);
		    block.setLightLevel(lightLevel);

			if (dropsItem) {
				block.setItemDropped(itemDropped);
			} else {
				block.setSelfDropped(true);
				block.setBlockDropped(blockDropped);
			}

		    // Register block
		    GameRegistry.registerBlock(block, name);

		    // Handle experience drops
		    if (experience > 0) {
		        block.setExperience(experience); // Ensure BlockCustomSolid has this method
		    }

		    // Store in registered blocks map
		    registeredBlocks.put(name, block);

		    // Configure drop amounts
		    block.setMinMaxDrops(minDrop, maxDrop);

		    return block;
		}

    public static Block getRegisteredBlock(String name) {
        return registeredBlocks.get(name);
    }

    public static <T extends ORBlockContainer, E extends TileEntity> T registerBlockWithTileEntity(
            Class<T> blockClass, Class<E> tileEntityClass, String name, Material material, float hardness,
            String toolType, int harvestLevel, SoundType stepSound, float lightLevel, Block blockDropped,
            Item itemDropped, boolean dropItself, boolean isMultiSided, boolean additionalBlocks, boolean redstoneBlocks
            ) {
        T block;
        try {
            Constructor<T> constructor = blockClass.getConstructor(String.class, Material.class, float.class,
                    String.class, int.class, SoundType.class, boolean.class);
            block = constructor.newInstance(name, material, hardness, toolType, harvestLevel, stepSound, isMultiSided);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        block.setHardness(hardness);
        block.setHarvestLevel(toolType, harvestLevel);
        block.setStepSound(stepSound);
        block.setLightLevel(lightLevel);

        GameRegistry.registerBlock(block, name);

        // Register the tile entity class with the block
        GameRegistry.registerTileEntity(tileEntityClass, name);

        registeredBlocks.put(name, block);

        // The rest of your code follows...
        // ...

        return block;
    }
    
    public static BlockCustomLayered registerLayeredBlock(String name, String textureName, Material material, float hardness, String toolType, int harvestLevel, Block.SoundType stepSound) {
        // Create an instance of BlockCustomLayered with custom texture
        BlockCustomLayered block = new BlockCustomLayered(name, textureName, hardness, toolType, harvestLevel, stepSound);

        // Register the block
        GameRegistry.registerBlock(block, name);

        // Store the registered block in a HashMap
        registeredBlocks.put(name, block);
        solidBlocks.add(block);

        return block;
    }
    
    public static List<BlockCustomBush> registerBush(String name, int stages, boolean hasBloomingVariant) {
        List<BlockCustomBush> bushes = new ArrayList<>();

        for (int i = 0; i < stages; i++) {
            String stageName = name + "_stage" + i;
            BlockCustomBush bush = new BlockCustomBush(stageName);
            GameRegistry.registerBlock(bush, stageName);
            decorationBlocks.add(bush);
            registeredBlocks.put(stageName, bush);
            bushes.add(bush);

            // Register a blooming variant if needed
            if (hasBloomingVariant) {
                String bloomingName = stageName + "_blooming";
                BlockCustomBush bloomingBush = new BlockCustomBush(bloomingName);
                GameRegistry.registerBlock(bloomingBush, bloomingName);
                decorationBlocks.add(bloomingBush);
                registeredBlocks.put(bloomingName, bloomingBush);
                bushes.add(bloomingBush);
            }
        }

        // Register the base bush if there are no stages
        if (stages == 0) {
            BlockCustomBush bush = new BlockCustomBush(name);
            GameRegistry.registerBlock(bush, name);
            decorationBlocks.add(bush);
            registeredBlocks.put(name, bush);
            bushes.add(bush);
        }

        return bushes;
    }

	public static BlockCustomLeaves registerLeaves(String name) {
		// Assuming properties like hardness and tool might vary, they could be
		// parameters or configured here
		Material material = BlockConstants.MATERIAL_LEAVES;
		float hardness = 0.2F; // Suitable for leaves
		String toolType = "shears";
		int harvestLevel = 0;
		Block.SoundType stepSound = Block.soundTypeGrass;
		float lightLevel = 0.0F;

		// Direct instantiation without using reflection
		BlockCustomLeaves block = new BlockCustomLeaves(name, hardness, toolType, harvestLevel, stepSound);
		block.setLightOpacity(1); // Leaves are semi-transparent
		block.setHardness(hardness);
		block.setStepSound(stepSound);
		block.setHarvestLevel(toolType, harvestLevel);

		GameRegistry.registerBlock(block, name);

		// Store the registered block in a HashMap if you have a tracking system
		registeredBlocks.put(name, block);
		leavesBlocks.add(block);

		return block;
	}

	public static BlockCustomLog registerLog(String name) {
		// Default properties for a log block
		Material material = BlockConstants.MATERIAL_WOOD;
		float hardness = 2.0F;
		String toolType = "axe";
		int harvestLevel = 0;
		Block.SoundType stepSound = Block.soundTypeWood;
		float lightLevel = 0.0F;

		// Create an instance of the BlockCustomLog.
		BlockCustomLog block;
		try {
			Constructor<BlockCustomLog> constructor = BlockCustomLog.class.getConstructor(String.class, float.class,
					String.class, int.class, Block.SoundType.class);
			block = constructor.newInstance(name, hardness, toolType, harvestLevel, stepSound);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		// Setting the block properties
		block.setHardness(hardness);
		block.setHarvestLevel(toolType, harvestLevel);
		block.setStepSound(stepSound);
		block.setLightLevel(lightLevel);

		// Register the block
		GameRegistry.registerBlock(block, name);

		// Store the registered block in the HashMap
		registeredBlocks.put(name, block);
		solidBlocks.add(block);

		return block;
	}
	
	public static BlockCustomTransparent registerTransparentBlock(String name, String textureName, Material material, float hardness, String toolType, int harvestLevel, Block.SoundType stepSound, String renderLayer) {
	    // Create the block with specified properties
	    BlockCustomTransparent block = new BlockCustomTransparent(name, textureName, material, hardness, toolType, harvestLevel, stepSound, renderLayer);

	    // Register the block
	    GameRegistry.registerBlock(block, name);

	    // Store the registered block in the HashMap
	    registeredBlocks.put(name, block);
	    decorationBlocks.add(block);

	    return block;
	}

	public static BlockCustomWood registerWood(String name, String textureName) {
	    // Default properties for a wood block
	    float hardness = 2.0F;
	    String toolType = "axe";
	    int harvestLevel = 0;
	    Block.SoundType stepSound = Block.soundTypeWood;

	    // Create an instance of the BlockCustomWood with the correct texture
	    BlockCustomWood block = new BlockCustomWood(name, textureName, hardness, toolType, harvestLevel, stepSound);

	    // Register the block
	    GameRegistry.registerBlock(block, name);

	    // Store the registered block in the HashMap
	    registeredBlocks.put(name, block);
	    solidBlocks.add(block);

	    return block;
	}
	
	public static void registerTree(String treeName) {
		// Register leaves
		BlockCustomLeaves leaves = registerLeaves(treeName + "_leaves");

		// Register wood
		BlockCustomWood wood = registerWood(treeName + "_wood", treeName + "_log");

		// Register log
		BlockCustomLog log = registerLog(treeName + "_log");

		// Register planks
		BlockCustomSolid planks = registerBlock(BlockCustomSolid.class, treeName + "_planks",
				BlockConstants.MATERIAL_WOOD, 2.0F, "axe", 0, Block.soundTypeWood, BlockConstants.LIGHT_NONE,
				BlockConstants.NO_BLOCK_DROPPED, BlockConstants.NO_ITEM_DROPPED, BlockConstants.DROPS_ITSELF,
				BlockConstants.SINGLE_SIDED, BlockConstants.HAS_ADDITIONAL_BLOCKS, false, false, false, false);
		

		BlockCustomStairs stairs = new BlockCustomStairs(planks);
				GameRegistry.registerBlock(stairs, treeName + "_stairs");
				registeredBlocks.put(treeName + "_stairs", stairs);
				stairsBlocks.add(stairs);

		// Recipe: Log to Planks
		GameRegistry.addRecipe(new ItemStack(planks, 4), "X", 'X', log);

		// Recipe: Planks to Sticks
		GameRegistry.addRecipe(new ItemStack(Items.stick, 4), "X", "X", 'X', planks);

		// Recipe: Planks to Crafting Table
		GameRegistry.addRecipe(new ItemStack(Blocks.crafting_table, 1), "XX", "XX", 'X', planks);

		// Register Ore Dictionary entries
		OreDictionary.registerOre("logWood", log);
		OreDictionary.registerOre("treeLeaves", leaves);
		OreDictionary.registerOre("plankWood", planks);
		// Assuming slabs and stairs are also registered somewhere in your mod:
		Block slab = SwgBlocks.getRegisteredBlock(treeName + "_slab");
		OreDictionary.registerOre("slabWood", slab);
		OreDictionary.registerOre("stairWood", stairs);
	}

    public static Block registerBlockFluidCustom(Fluid fluid, String name, Material material) {
        // Create and register the corresponding block.
        BlockFluidCustom blockFluid = new BlockFluidCustom(fluid, material);
        blockFluid.setBlockName(name); // Make sure this is unique.
        GameRegistry.registerBlock(blockFluid, name);

        // Store the registered block in the HashMap using its name as the key
        registeredBlocks.put(name, blockFluid);

        return blockFluid;
    }

}

