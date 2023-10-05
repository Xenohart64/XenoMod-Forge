package fr.xenohart.xeno.world.feature;

import com.google.common.collect.ImmutableList;
import fr.xenohart.xeno.blocks.ModBlocks;
import fr.xenohart.xeno.fluid.ModFluids;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

public class ModConfiguredFeatures {
    public static final ConfiguredFeature<?, ?> MUD_LAKE = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "lake_mud", Feature.LAKE.withConfiguration(new BlockStateFeatureConfig(ModFluids.MUD_BLOCK.get().getDefaultState())).withPlacement(Placement.WATER_LAKE.configure(new ChanceConfig(4))));

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> CHERRY_BLOSSOM = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE,"cherry_blossom", Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.CHERRY_BLOSSOM_LOG.get().getDefaultState()), new SimpleBlockStateProvider(ModBlocks.CHERRY_BLOSSOM_LEAVES.get().getDefaultState()), new BlobFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(0), 3), new StraightTrunkPlacer(5, 2, 0), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> CHERRY_BLOSSOM_BEES_0002 = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE,"cherry_blossom_bees_0002", Feature.TREE.withConfiguration(CHERRY_BLOSSOM.getConfig().func_236685_a_(ImmutableList.of(Features.Placements.BEES_0002_PLACEMENT))));
    public static final ConfiguredFeature<?, ?> CHERRY_BLOSSOM_TREES = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE,"cherry_blossom_trees", CHERRY_BLOSSOM_BEES_0002.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> RED_AUTUMNAL = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE,"red_autumnal", Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()), new SimpleBlockStateProvider(ModBlocks.RED_AUTUMNAL_LEAVES.get().getDefaultState()), new BlobFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(0), 3), new StraightTrunkPlacer(5, 2, 0), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> RED_AUTUMNAL_BEES_0002 = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE,"red_autumnal_bees_0002", Feature.TREE.withConfiguration(RED_AUTUMNAL.getConfig().func_236685_a_(ImmutableList.of(Features.Placements.BEES_0002_PLACEMENT))));
    public static final ConfiguredFeature<?, ?> RED_AUTUMNAL_TREES = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE,"red_autumnal_trees", RED_AUTUMNAL_BEES_0002.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> ORANGE_AUTUMNAL = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE,"orange_autumnal", Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()), new SimpleBlockStateProvider(ModBlocks.ORANGE_AUTUMNAL_LEAVES.get().getDefaultState()), new BlobFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(0), 3), new StraightTrunkPlacer(5, 2, 0), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> ORANGE_AUTUMNAL_BEES_0002 = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE,"orange_autumnal_bees_0002", Feature.TREE.withConfiguration(ORANGE_AUTUMNAL.getConfig().func_236685_a_(ImmutableList.of(Features.Placements.BEES_0002_PLACEMENT))));
    public static final ConfiguredFeature<?, ?> ORANGE_AUTUMNAL_TREES = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE,"orange_autumnal_trees", ORANGE_AUTUMNAL_BEES_0002.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> YELLOW_AUTUMNAL = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE,"yellow_autumnal", Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()), new SimpleBlockStateProvider(ModBlocks.YELLOW_AUTUMNAL_LEAVES.get().getDefaultState()), new BlobFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(0), 3), new StraightTrunkPlacer(5, 2, 0), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> YELLOW_AUTUMNAL_BEES_0002 = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE,"yellow_autumnal_bees_0002", Feature.TREE.withConfiguration(YELLOW_AUTUMNAL.getConfig().func_236685_a_(ImmutableList.of(Features.Placements.BEES_0002_PLACEMENT))));
    public static final ConfiguredFeature<?, ?> YELLOW_AUTUMNAL_TREES = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE,"yellow_autumnal_trees", YELLOW_AUTUMNAL_BEES_0002.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> BROWN_AUTUMNAL = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE,"brown_autumnal", Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()), new SimpleBlockStateProvider(ModBlocks.BROWN_AUTUMNAL_LEAVES.get().getDefaultState()), new BlobFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(0), 3), new StraightTrunkPlacer(5, 2, 0), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> BROWN_AUTUMNAL_BEES_0002 = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE,"brown_autumnal_bees_0002", Feature.TREE.withConfiguration(BROWN_AUTUMNAL.getConfig().func_236685_a_(ImmutableList.of(Features.Placements.BEES_0002_PLACEMENT))));
    public static final ConfiguredFeature<?, ?> BROWN_AUTUMNAL_TREES = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE,"brown_autumnal_trees", BROWN_AUTUMNAL_BEES_0002.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

}
