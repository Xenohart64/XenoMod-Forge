package fr.xenohart.xeno.data;

import fr.xenohart.xeno.blocks.ModBlocks;
import fr.xenohart.xeno.util.Registration;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    protected ModBlockLootTables(Set<Item> p_249153_, FeatureFlagSet p_251215_) {
        super(p_249153_, p_251215_);
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.RUBY_BLOCK.get());
        this.dropSelf(ModBlocks.RUBY_ORE.get());

        this.dropSelf(ModBlocks.SAPHIR_BLOCK.get());
        this.dropSelf(ModBlocks.SAPHIR_ORE.get());

        this.dropSelf(ModBlocks.SILVER_BLOCK.get());
        this.dropSelf(ModBlocks.SILVER_ORE.get());

        this.dropSelf(ModBlocks.QUICKSAND.get());

        this.dropSelf(ModBlocks.CHERRY_BLOSSOM_LEAVES.get());
        this.dropSelf(ModBlocks.CHERRY_BLOSSOM_LOG.get());
        this.dropSelf(ModBlocks.CHERRY_BLOSSOM_PLANK.get());
        //this.dropSelf(ModBlocks.CHERRY_BLOSSOM_SAPLING.get());

        this.dropSelf(ModBlocks.PALM_TREE_LEAVES.get());
        this.dropSelf(ModBlocks.PALM_TREE_LOG.get());

        this.dropSelf(ModBlocks.RED_AUTUMNAL_LEAVES.get());
        //this.dropSelf(ModBlocks.RED_AUTUMNAL_SAPLING.get());
        this.dropSelf(ModBlocks.ORANGE_AUTUMNAL_LEAVES.get());
        //this.dropSelf(ModBlocks.ORANGE_AUTUMNAL_SAPLING.get());
        this.dropSelf(ModBlocks.YELLOW_AUTUMNAL_LEAVES.get());
        //this.dropSelf(ModBlocks.YELLOW_AUTUMNAL_SAPLING.get());
        this.dropSelf(ModBlocks.BROWN_AUTUMNAL_LEAVES.get());
        //this.dropSelf(ModBlocks.BROWN_AUTUMNAL_SAPLING.get());

        this.dropSelf(ModBlocks.RAINBOW_WOOL.get());
        this.dropSelf(ModBlocks.RAINBOW_CARPET.get());

        //this.dropSelf(ModBlocks.BUTTERCUP.get());

        this.dropSelf(ModBlocks.REDSTONE_DUST_BLACK.get());
        this.dropSelf(ModBlocks.REDSTONE_DUST_BLUE.get());
        this.dropSelf(ModBlocks.REDSTONE_DUST_BROWN.get());
        this.dropSelf(ModBlocks.REDSTONE_DUST_CYAN.get());
        this.dropSelf(ModBlocks.REDSTONE_DUST_GRAY.get());
        this.dropSelf(ModBlocks.REDSTONE_DUST_GREEN.get());
        this.dropSelf(ModBlocks.REDSTONE_DUST_LIGHT_BLUE.get());
        this.dropSelf(ModBlocks.REDSTONE_DUST_LIGHT_GRAY.get());
        this.dropSelf(ModBlocks.REDSTONE_DUST_LIME.get());
        this.dropSelf(ModBlocks.REDSTONE_DUST_MAGENTA.get());
        this.dropSelf(ModBlocks.REDSTONE_DUST_ORANGE.get());
        this.dropSelf(ModBlocks.REDSTONE_DUST_PINK.get());
        this.dropSelf(ModBlocks.REDSTONE_DUST_PURPLE.get());
        this.dropSelf(ModBlocks.REDSTONE_DUST_WHITE.get());
        this.dropSelf(ModBlocks.REDSTONE_DUST_YELLOW.get());

        this.dropSelf(ModBlocks.REDSTONE_BLOCK_BLACK.get());
        this.dropSelf(ModBlocks.REDSTONE_BLOCK_BLUE.get());
        this.dropSelf(ModBlocks.REDSTONE_BLOCK_BROWN.get());
        this.dropSelf(ModBlocks.REDSTONE_BLOCK_CYAN.get());
        this.dropSelf(ModBlocks.REDSTONE_BLOCK_GRAY.get());
        this.dropSelf(ModBlocks.REDSTONE_BLOCK_GREEN.get());
        this.dropSelf(ModBlocks.REDSTONE_BLOCK_LIGHT_BLUE.get());
        this.dropSelf(ModBlocks.REDSTONE_BLOCK_LIGHT_GRAY.get());
        this.dropSelf(ModBlocks.REDSTONE_BLOCK_LIME.get());
        this.dropSelf(ModBlocks.REDSTONE_BLOCK_MAGENTA.get());
        this.dropSelf(ModBlocks.REDSTONE_BLOCK_ORANGE.get());
        this.dropSelf(ModBlocks.REDSTONE_BLOCK_PINK.get());
        this.dropSelf(ModBlocks.REDSTONE_BLOCK_PURPLE.get());
        this.dropSelf(ModBlocks.REDSTONE_BLOCK_WHITE.get());
        this.dropSelf(ModBlocks.REDSTONE_BLOCK_YELLOW.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return Registration.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
