package fr.xenohart.xeno.data;

import fr.xenohart.xeno.XenoMod;
import fr.xenohart.xeno.blocks.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, XenoMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.RUBY_BLOCK.get());
        simpleBlock(ModBlocks.RUBY_ORE.get());

        simpleBlock(ModBlocks.SAPHIR_BLOCK.get());
        simpleBlock(ModBlocks.SAPHIR_ORE.get());

        simpleBlock(ModBlocks.SILVER_BLOCK.get());
        simpleBlock(ModBlocks.SILVER_ORE.get());

        simpleBlock(ModBlocks.QUICKSAND.get());

        simpleBlock(ModBlocks.CHERRY_BLOSSOM_LEAVES.get());
        simpleBlock(ModBlocks.CHERRY_BLOSSOM_PLANK.get());
        simpleBlock(ModBlocks.CHERRY_BLOSSOM_LOG.get());
        simpleBlock(ModBlocks.CHERRY_BLOSSOM_SAPLING.get(), models().cross("cherry_blossom_sapling", modLoc("item/cherry_blossom_sapling")));

        simpleBlock(ModBlocks.PALM_TREE_LOG.get());
        simpleBlock(ModBlocks.PALM_TREE_LEAVES.get());

        simpleBlock(ModBlocks.RED_AUTUMNAL_LEAVES.get());
        simpleBlock(ModBlocks.RED_AUTUMNAL_SAPLING.get(), models().cross("red_autumnal_sapling", modLoc("item/red_autumnal_sapling")));
        simpleBlock(ModBlocks.ORANGE_AUTUMNAL_LEAVES.get());
        simpleBlock(ModBlocks.ORANGE_AUTUMNAL_SAPLING.get(), models().cross("orange_autumnal_sapling", modLoc("item/orange_autumnal_sapling")));
        simpleBlock(ModBlocks.YELLOW_AUTUMNAL_LEAVES.get());
        simpleBlock(ModBlocks.YELLOW_AUTUMNAL_SAPLING.get(), models().cross("yellow_autumnal_sapling", modLoc("item/yellow_autumnal_sapling")));
        simpleBlock(ModBlocks.BROWN_AUTUMNAL_LEAVES.get());
        simpleBlock(ModBlocks.BROWN_AUTUMNAL_SAPLING.get(), models().cross("brown_autumnal_sapling", modLoc("item/brown_autumnal_sapling")));

        simpleBlock(ModBlocks.RAINBOW_WOOL.get());
        simpleBlock(ModBlocks.RAINBOW_CARPET.get(), models().carpet("rainbow_carpet", modLoc("block/rainbow_wool")));

        simpleBlock(ModBlocks.BUTTERCUP.get(), models().cross("buttercup", modLoc("item/buttercup")));

        simpleBlock(ModBlocks.REDSTONE_BLOCK_BLACK.get());
        simpleBlock(ModBlocks.REDSTONE_BLOCK_BLUE.get());
        simpleBlock(ModBlocks.REDSTONE_BLOCK_BROWN.get());
        simpleBlock(ModBlocks.REDSTONE_BLOCK_CYAN.get());
        simpleBlock(ModBlocks.REDSTONE_BLOCK_GRAY.get());
        simpleBlock(ModBlocks.REDSTONE_BLOCK_GREEN.get());
        simpleBlock(ModBlocks.REDSTONE_BLOCK_LIGHT_BLUE.get());
        simpleBlock(ModBlocks.REDSTONE_BLOCK_LIGHT_GRAY.get());
        simpleBlock(ModBlocks.REDSTONE_BLOCK_LIME.get());
        simpleBlock(ModBlocks.REDSTONE_BLOCK_MAGENTA.get());
        simpleBlock(ModBlocks.REDSTONE_BLOCK_ORANGE.get());
        simpleBlock(ModBlocks.REDSTONE_BLOCK_PINK.get());
        simpleBlock(ModBlocks.REDSTONE_BLOCK_PURPLE.get());
        simpleBlock(ModBlocks.REDSTONE_BLOCK_WHITE.get());
        simpleBlock(ModBlocks.REDSTONE_BLOCK_YELLOW.get());
    }
}
