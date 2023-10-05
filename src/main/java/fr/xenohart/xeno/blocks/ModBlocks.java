package fr.xenohart.xeno.blocks;

import fr.xenohart.xeno.XenoMod;
import fr.xenohart.xeno.trees.*;
import fr.xenohart.xeno.util.Registration;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.potion.Effects;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    //ruby
    public static final RegistryObject<Block> RUBY_BLOCK = register("ruby_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3f, 15f).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RUBY_ORE = register("ruby_ore", () -> new OreBlock(AbstractBlock.Properties.from(Blocks.DIAMOND_ORE)));

    //saphir
    public static final RegistryObject<Block> SAPHIR_BLOCK = register("saphir_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3f, 15f).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)));
    public static final RegistryObject<Block> SAPHIR_ORE = register("saphir_ore", () -> new OreBlock(AbstractBlock.Properties.from(Blocks.DIAMOND_ORE)));

    public static final RegistryObject<Block> SILVER_ORE = register("silver_ore", () -> new OreBlock(AbstractBlock.Properties.from(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> SILVER_BLOCK = register("silver_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3f, 15f).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)));

    //quicksand
    public static final RegistryObject<Block> QUICKSAND = register("quicksand", () -> new Block(AbstractBlock.Properties.create(Material.SAND).hardnessAndResistance(3f, 15f).harvestTool(ToolType.SHOVEL).harvestLevel(0).sound(SoundType.SAND)));

    public static final RegistryObject<Block> CHERRY_BLOSSOM_LEAVES = registerDecoration("cherry_blossom_leaves", () -> new LeavesBlock(AbstractBlock.Properties.from(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> CHERRY_BLOSSOM_PLANK = register("cherry_blossom_plank", () -> new Block(AbstractBlock.Properties.from(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CHERRY_BLOSSOM_LOG = register("cherry_blossom_log", () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> CHERRY_BLOSSOM_SAPLING = registerDecoration("cherry_blossom_sapling", () -> new SaplingBlock(new CherryBlossomTree(), AbstractBlock.Properties.from(Blocks.OAK_SAPLING)));

    //    public static final RegistryObject<Block> PALM_TREE_PLANK = register("palm_tree_plank", () -> new Block(AbstractBlock.Properties.from(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PALM_TREE_LOG = register("palm_tree_log", () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> PALM_TREE_LEAVES = registerDecoration("palm_tree_leaves", () -> new LeavesBlock(AbstractBlock.Properties.from(Blocks.OAK_LEAVES)));
//    public static final RegistryObject<Block> PALM_TREE_SAPLING = register("palm_tree_sapling", () -> new SaplingBlock(new PalmTree(), AbstractBlock.Properties.from(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> RED_AUTUMNAL_LEAVES = registerDecoration("red_autumnal_leaves", () -> new LeavesBlock(AbstractBlock.Properties.from(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> ORANGE_AUTUMNAL_LEAVES = registerDecoration("orange_autumnal_leaves", () -> new LeavesBlock(AbstractBlock.Properties.from(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> YELLOW_AUTUMNAL_LEAVES = registerDecoration("yellow_autumnal_leaves", () -> new LeavesBlock(AbstractBlock.Properties.from(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> BROWN_AUTUMNAL_LEAVES = registerDecoration("brown_autumnal_leaves", () -> new LeavesBlock(AbstractBlock.Properties.from(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> RED_AUTUMNAL_SAPLING = registerDecoration("red_autumnal_sapling", () -> new SaplingBlock(new RedAutumnalTree(), AbstractBlock.Properties.from(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> ORANGE_AUTUMNAL_SAPLING = registerDecoration("orange_autumnal_sapling", () -> new SaplingBlock(new OrangeAutumnalTree(), AbstractBlock.Properties.from(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> YELLOW_AUTUMNAL_SAPLING = registerDecoration("yellow_autumnal_sapling", () -> new SaplingBlock(new YellowAutumnalTree(), AbstractBlock.Properties.from(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> BROWN_AUTUMNAL_SAPLING = registerDecoration("brown_autumnal_sapling", () -> new SaplingBlock(new BrownAutumnalTree(), AbstractBlock.Properties.from(Blocks.OAK_SAPLING)));

    public static final RegistryObject<FlowerBlock> BUTTERCUP = registerDecoration("buttercup", () -> new FlowerBlock(Effects.REGENERATION, 160, Block.Properties.from(Blocks.POPPY)));
//    public static final RegistryObject<FlowerPotBlock> POTTED_BUTTERCUP = register("potted_buttercup", () -> new FlowerPotBlock(BUTTERCUP.get().getBlock(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0F).sound(SoundType.PLANT)));
    public static final RegistryObject<Block> RAINBOW_WOOL = register("rainbow_wool", () -> new Block(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.8F).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> RAINBOW_CARPET = registerDecoration("rainbow_carpet", () -> new CarpetBlock(DyeColor.BLACK, Block.Properties.create(Material.WOOL).hardnessAndResistance(0.8F).sound(SoundType.CLOTH)));

//    public static final RegistryObject<Block> DIAMOND_CHEST = register("diamond_chest", () -> new ChestBlock(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(2.5F).sound(SoundType.METAL), () -> TileEntityType.CHEST));
//    public static final RegistryObject<Block> IRON_CHEST = register("iron_chest", () -> new ChestBlock(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(2.5F).sound(SoundType.METAL), () -> TileEntityType.CHEST));
//    public static final RegistryObject<Block> GOLD_CHEST = register("gold_chest", () -> new ChestBlock(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(2.5F).sound(SoundType.METAL), () -> TileEntityType.CHEST));
//    public static final RegistryObject<Block> COPPER_CHEST = register("copper_chest", () -> new ChestBlock(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(2.5F).sound(SoundType.METAL), () -> TileEntityType.CHEST));
//    public static final RegistryObject<Block> RUBY_CHEST = register("ruby_chest", () -> new ChestBlock(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(2.5F).sound(SoundType.METAL), () -> TileEntityType.CHEST));
//    public static final RegistryObject<Block> SAPHIR_CHEST = register("saphir_chest", () -> new ChestBlock(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(2.5F).sound(SoundType.METAL), () -> TileEntityType.CHEST));
//    public static final RegistryObject<Block> EMERALD_CHEST = register("emerald_chest", () -> new ChestBlock(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(2.5F).sound(SoundType.METAL), () -> TileEntityType.CHEST));
//    public static final RegistryObject<Block> SILVER_CHEST = register("silver_chest", () -> new ChestBlock(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(2.5F).sound(SoundType.METAL), () -> TileEntityType.CHEST));
//    public static final RegistryObject<Block> STEEL_CHEST = register("steel_chest", () -> new ChestBlock(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(2.5F).sound(SoundType.METAL), () -> TileEntityType.CHEST));
//    public static final RegistryObject<Block> AMETHYST_CHEST = register("amethyst_chest", () -> new ChestBlock(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(2.5F).sound(SoundType.METAL), () -> TileEntityType.CHEST));

//    public static final RegistryObject<Block> BIRCH_LADDER = register("birch_ladder", () -> new LadderBlock(AbstractBlock.Properties.from(Blocks.LADDER)));

    public static final RegistryObject<Block> REDSTONE_DUST_BLUE = registerRedstone("redstone_dust_blue", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));
    public static final RegistryObject<Block> REDSTONE_DUST_BLACK = registerRedstone("redstone_dust_black", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));
    public static final RegistryObject<Block> REDSTONE_DUST_BROWN = registerRedstone("redstone_dust_brown", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));
    public static final RegistryObject<Block> REDSTONE_DUST_CYAN = registerRedstone("redstone_dust_cyan", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));
    public static final RegistryObject<Block> REDSTONE_DUST_GRAY = registerRedstone("redstone_dust_gray", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));
    public static final RegistryObject<Block> REDSTONE_DUST_GREEN = registerRedstone("redstone_dust_green", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));
    public static final RegistryObject<Block> REDSTONE_DUST_LIGHT_BLUE = registerRedstone("redstone_dust_light_blue", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));
    public static final RegistryObject<Block> REDSTONE_DUST_LIGHT_GRAY = registerRedstone("redstone_dust_light_gray", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));
    public static final RegistryObject<Block> REDSTONE_DUST_LIME = registerRedstone("redstone_dust_lime", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));
    public static final RegistryObject<Block> REDSTONE_DUST_MAGENTA = registerRedstone("redstone_dust_magenta", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));
    public static final RegistryObject<Block> REDSTONE_DUST_ORANGE = registerRedstone("redstone_dust_orange", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));
    public static final RegistryObject<Block> REDSTONE_DUST_PINK = registerRedstone("redstone_dust_pink", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));
    public static final RegistryObject<Block> REDSTONE_DUST_PURPLE = registerRedstone("redstone_dust_purple", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));
    public static final RegistryObject<Block> REDSTONE_DUST_WHITE = registerRedstone("redstone_dust_white", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));
    public static final RegistryObject<Block> REDSTONE_DUST_YELLOW = registerRedstone("redstone_dust_yellow", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));

    public static final RegistryObject<Block> REDSTONE_BLOCK_BLUE = registerRedstone("redstone_block_blue", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> REDSTONE_BLOCK_BLACK = registerRedstone("redstone_block_black", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> REDSTONE_BLOCK_BROWN = registerRedstone("redstone_block_brown", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> REDSTONE_BLOCK_CYAN = registerRedstone("redstone_block_cyan", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> REDSTONE_BLOCK_GRAY = registerRedstone("redstone_block_gray", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> REDSTONE_BLOCK_GREEN = registerRedstone("redstone_block_green", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> REDSTONE_BLOCK_LIGHT_BLUE = registerRedstone("redstone_block_light_blue", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> REDSTONE_BLOCK_LIGHT_GRAY = registerRedstone("redstone_block_light_gray", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> REDSTONE_BLOCK_LIME = registerRedstone("redstone_block_lime", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> REDSTONE_BLOCK_MAGENTA = registerRedstone("redstone_block_magenta", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> REDSTONE_BLOCK_ORANGE = registerRedstone("redstone_block_orange", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> REDSTONE_BLOCK_PINK = registerRedstone("redstone_block_pink", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> REDSTONE_BLOCK_PURPLE = registerRedstone("redstone_block_purple", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> REDSTONE_BLOCK_WHITE = registerRedstone("redstone_block_white", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> REDSTONE_BLOCK_YELLOW = registerRedstone("redstone_block_yellow", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));

    public static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block){
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(), new Item.Properties().group(XenoMod.XENO_BLOCK)));
        return toReturn;
    }

    public static <T extends Block>RegistryObject<T> registerRedstone(String name, Supplier<T> block){
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(), new Item.Properties().group(XenoMod.XENO_REDSTONE)));
        return toReturn;
    }

    public static <T extends Block>RegistryObject<T> registerDecoration(String name, Supplier<T> block){
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(), new Item.Properties().group(XenoMod.XENO_DECORATION)));
        return toReturn;
    }

    public static void register() { }
}