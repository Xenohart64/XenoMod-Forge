package fr.xenohart.xeno.trees;

import fr.xenohart.xeno.blocks.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

import java.util.Random;

public class BrownAutumnalTree extends Tree {
    public static final int BASE_HEIGHT = 0;
    public static final int FIRST_RANDOM_HEIGHT = 1;
    public static final int SECOND_RANDOM_HEIGHT = 3;

    public static final int LEAVE_RADIUS = 3;
    public static final int LEAVE_OFFSET = 3;
    public static final int LEAVE_HEIGHT = 4;


    public static final BaseTreeFeatureConfig BROWN_AUTUMNAL_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()), new SimpleBlockStateProvider(ModBlocks.BROWN_AUTUMNAL_LEAVES.get().getDefaultState()), new BlobFoliagePlacer(FeatureSpread.func_242252_a(LEAVE_RADIUS), FeatureSpread.func_242252_a(LEAVE_OFFSET), LEAVE_HEIGHT), new StraightTrunkPlacer(BASE_HEIGHT, FIRST_RANDOM_HEIGHT, SECOND_RANDOM_HEIGHT), new TwoLayerFeature(1,0,1))).build();



    @Override
    protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean largeHive) {
        return Feature.TREE.withConfiguration(BROWN_AUTUMNAL_CONFIG);
    }
}
