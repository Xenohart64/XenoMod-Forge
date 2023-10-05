package fr.xenohart.xeno.data;

import fr.xenohart.xeno.blocks.ModBlocks;
import fr.xenohart.xeno.util.Registration;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraftforge.fml.RegistryObject;

public class ModBlockLootTables extends BlockLootTables {
    @Override
    protected void addTables() {
        this.registerDropSelfLootTable(ModBlocks.RUBY_BLOCK.get());
        this.registerDropSelfLootTable(ModBlocks.RUBY_ORE.get());

        this.registerDropSelfLootTable(ModBlocks.SAPHIR_BLOCK.get());
        this.registerDropSelfLootTable(ModBlocks.SAPHIR_ORE.get());

        this.registerDropSelfLootTable(ModBlocks.SILVER_BLOCK.get());
        this.registerDropSelfLootTable(ModBlocks.SILVER_ORE.get());

        this.registerDropSelfLootTable(ModBlocks.QUICKSAND.get());

        this.registerDropSelfLootTable(ModBlocks.CHERRY_BLOSSOM_LEAVES.get());
        this.registerDropSelfLootTable(ModBlocks.CHERRY_BLOSSOM_LOG.get());
        this.registerDropSelfLootTable(ModBlocks.CHERRY_BLOSSOM_PLANK.get());
        this.registerDropSelfLootTable(ModBlocks.CHERRY_BLOSSOM_SAPLING.get());

        this.registerDropSelfLootTable(ModBlocks.PALM_TREE_LEAVES.get());
        this.registerDropSelfLootTable(ModBlocks.PALM_TREE_LOG.get());

        this.registerDropSelfLootTable(ModBlocks.RED_AUTUMNAL_LEAVES.get());
        this.registerDropSelfLootTable(ModBlocks.RED_AUTUMNAL_SAPLING.get());
        this.registerDropSelfLootTable(ModBlocks.ORANGE_AUTUMNAL_LEAVES.get());
        this.registerDropSelfLootTable(ModBlocks.ORANGE_AUTUMNAL_SAPLING.get());
        this.registerDropSelfLootTable(ModBlocks.YELLOW_AUTUMNAL_LEAVES.get());
        this.registerDropSelfLootTable(ModBlocks.YELLOW_AUTUMNAL_SAPLING.get());
        this.registerDropSelfLootTable(ModBlocks.BROWN_AUTUMNAL_LEAVES.get());
        this.registerDropSelfLootTable(ModBlocks.BROWN_AUTUMNAL_SAPLING.get());

        this.registerDropSelfLootTable(ModBlocks.RAINBOW_WOOL.get());
        this.registerDropSelfLootTable(ModBlocks.RAINBOW_CARPET.get());

        this.registerDropSelfLootTable(ModBlocks.BUTTERCUP.get());

        this.registerDropSelfLootTable(ModBlocks.REDSTONE_DUST_BLACK.get());
        this.registerDropSelfLootTable(ModBlocks.REDSTONE_DUST_BLUE.get());
        this.registerDropSelfLootTable(ModBlocks.REDSTONE_DUST_BROWN.get());
        this.registerDropSelfLootTable(ModBlocks.REDSTONE_DUST_CYAN.get());
        this.registerDropSelfLootTable(ModBlocks.REDSTONE_DUST_GRAY.get());
        this.registerDropSelfLootTable(ModBlocks.REDSTONE_DUST_GREEN.get());
        this.registerDropSelfLootTable(ModBlocks.REDSTONE_DUST_LIGHT_BLUE.get());
        this.registerDropSelfLootTable(ModBlocks.REDSTONE_DUST_LIGHT_GRAY.get());
        this.registerDropSelfLootTable(ModBlocks.REDSTONE_DUST_LIME.get());
        this.registerDropSelfLootTable(ModBlocks.REDSTONE_DUST_MAGENTA.get());
        this.registerDropSelfLootTable(ModBlocks.REDSTONE_DUST_ORANGE.get());
        this.registerDropSelfLootTable(ModBlocks.REDSTONE_DUST_PINK.get());
        this.registerDropSelfLootTable(ModBlocks.REDSTONE_DUST_PURPLE.get());
        this.registerDropSelfLootTable(ModBlocks.REDSTONE_DUST_WHITE.get());
        this.registerDropSelfLootTable(ModBlocks.REDSTONE_DUST_YELLOW.get());

        this.registerDropSelfLootTable(ModBlocks.REDSTONE_BLOCK_BLACK.get());
        this.registerDropSelfLootTable(ModBlocks.REDSTONE_BLOCK_BLUE.get());
        this.registerDropSelfLootTable(ModBlocks.REDSTONE_BLOCK_BROWN.get());
        this.registerDropSelfLootTable(ModBlocks.REDSTONE_BLOCK_CYAN.get());
        this.registerDropSelfLootTable(ModBlocks.REDSTONE_BLOCK_GRAY.get());
        this.registerDropSelfLootTable(ModBlocks.REDSTONE_BLOCK_GREEN.get());
        this.registerDropSelfLootTable(ModBlocks.REDSTONE_BLOCK_LIGHT_BLUE.get());
        this.registerDropSelfLootTable(ModBlocks.REDSTONE_BLOCK_LIGHT_GRAY.get());
        this.registerDropSelfLootTable(ModBlocks.REDSTONE_BLOCK_LIME.get());
        this.registerDropSelfLootTable(ModBlocks.REDSTONE_BLOCK_MAGENTA.get());
        this.registerDropSelfLootTable(ModBlocks.REDSTONE_BLOCK_ORANGE.get());
        this.registerDropSelfLootTable(ModBlocks.REDSTONE_BLOCK_PINK.get());
        this.registerDropSelfLootTable(ModBlocks.REDSTONE_BLOCK_PURPLE.get());
        this.registerDropSelfLootTable(ModBlocks.REDSTONE_BLOCK_WHITE.get());
        this.registerDropSelfLootTable(ModBlocks.REDSTONE_BLOCK_YELLOW.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return Registration.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
