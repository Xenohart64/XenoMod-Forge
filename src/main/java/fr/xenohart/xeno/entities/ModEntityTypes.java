package fr.xenohart.xeno.entities;

import fr.xenohart.xeno.XenoMod;
import fr.xenohart.xeno.entities.projectile.FleshEntity;
import fr.xenohart.xeno.entities.projectile.SmellyEggEntity;
import fr.xenohart.xeno.util.Registration;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

public class ModEntityTypes {
    public static final RegistryObject<EntityType<BoarEntity>> BOAR = Registration.ENTITIES.register("boar", () -> EntityType.Builder.create(BoarEntity::new, EntityClassification.CREATURE).build(new ResourceLocation(XenoMod.MODID + "boar").toString()));
    public static final RegistryObject<EntityType<DuckEntity>> DUCK = Registration.ENTITIES.register("duck", () -> EntityType.Builder.create(DuckEntity::new, EntityClassification.CREATURE).build(new ResourceLocation(XenoMod.MODID + "duck").toString()));
    public static final RegistryObject<EntityType<MooBloomEntity>> MOOBLOOM = Registration.ENTITIES.register("moobloom", () -> EntityType.Builder.create(MooBloomEntity::new, EntityClassification.CREATURE).build(new ResourceLocation(XenoMod.MODID + "moobloom").toString()));
    public static final RegistryObject<EntityType<BoneSpiderEntity>> BONE_SPIDER = Registration.ENTITIES.register("bone_spider", () -> EntityType.Builder.create(BoneSpiderEntity::new, EntityClassification.CREATURE).build(new ResourceLocation(XenoMod.MODID + "bone_spider").toString()));
    //public static final RegistryObject<EntityType<BoulderingZombieEntity>> BOULDERING_ZOMBIE = Registration.ENTITIES.register("bouldering_zombie", () -> EntityType.Builder.create(BoulderingZombieEntity::new, EntityClassification.CREATURE).build(new ResourceLocation(XenoMod.MODID + "bouldering_zombie").toString()));
    public static final RegistryObject<EntityType<CluckShroomEntity>> CLUCKSHROOM = Registration.ENTITIES.register("cluckshroom", () -> EntityType.Builder.create(CluckShroomEntity::new, EntityClassification.CREATURE).build(new ResourceLocation(XenoMod.MODID + "cluckshroom").toString()));
    //public static final RegistryObject<EntityType<HornedSheepEntity>> HORNED_SHEEP = Registration.ENTITIES.register("horned_sheep", () -> EntityType.Builder.create(HornedSheepEntity::new, EntityClassification.CREATURE).build(new ResourceLocation(XenoMod.MODID + "horned_sheep").toString()));
    public static final RegistryObject<EntityType<JollyLlamaEntity>> JOLLY_LLAMA = Registration.ENTITIES.register("jolly_llama", () -> EntityType.Builder.create(JollyLlamaEntity::new, EntityClassification.CREATURE).build(new ResourceLocation(XenoMod.MODID + "jolly_llama").toString()));
    //public static final RegistryObject<EntityType<LobberZombieEntity>> LOBBER_ZOMBIE = Registration.ENTITIES.register("lobber_zombie", () -> EntityType.Builder.create(LobberZombieEntity::new, EntityClassification.CREATURE).build(new ResourceLocation(XenoMod.MODID + "lobber_zombie").toString()));
    //public static final RegistryObject<EntityType<MuddyPigEntity>> MUDDYPIG = Registration.ENTITIES.register("muddy_pig", () -> EntityType.Builder.create(MuddyPigEntity::new, EntityClassification.CREATURE).build(new ResourceLocation(XenoMod.MODID + "muddy_pig").toString()));
    public static final RegistryObject<EntityType<RainbowSheepEntity>> RAINBOW_SHEEP = Registration.ENTITIES.register("rainbow_sheep", () -> EntityType.Builder.create(RainbowSheepEntity::new, EntityClassification.CREATURE).build(new ResourceLocation(XenoMod.MODID + "rainbow_sheep").toString()));
    public static final RegistryObject<EntityType<VilerWitchEntity>> VILER_WITCH = Registration.ENTITIES.register("viler_witch", () -> EntityType.Builder.create(VilerWitchEntity::new, EntityClassification.CREATURE).build(new ResourceLocation(XenoMod.MODID + "viler_witch").toString()));
    public static final RegistryObject<EntityType<WoolyCowEntity>> WOOLY_COW = Registration.ENTITIES.register("wooly_cow", () -> EntityType.Builder.create(WoolyCowEntity::new, EntityClassification.CREATURE).build(new ResourceLocation(XenoMod.MODID + "wooly_cow").toString()));
    public static final RegistryObject<EntityType<BearEntity>> BEAR = Registration.ENTITIES.register("bear", () -> EntityType.Builder.create(BearEntity::new, EntityClassification.CREATURE).build(new ResourceLocation(XenoMod.MODID + "bear").toString()));
    public static final RegistryObject<EntityType<PenguinEntity>> PENGUIN = Registration.ENTITIES.register("penguin", () -> EntityType.Builder.create(PenguinEntity::new, EntityClassification.CREATURE).build(new ResourceLocation(XenoMod.MODID + "penguin").toString()));
    public static final RegistryObject<EntityType<BlueSlimeEntity>> BLUE_SLIME = Registration.ENTITIES.register("blue_slime", () -> EntityType.Builder.create(BlueSlimeEntity::new, EntityClassification.CREATURE).build(new ResourceLocation(XenoMod.MODID + "blue_slime").toString()));


    public static final RegistryObject<EntityType<SmellyEggEntity>> SMELLY_EGG = Registration.ENTITIES.register("smelly_egg", () -> EntityType.Builder.<SmellyEggEntity>create(SmellyEggEntity::new, EntityClassification.MISC).setTrackingRange(64).setUpdateInterval(1).setShouldReceiveVelocityUpdates(true).setCustomClientFactory(SmellyEggEntity::new).size(0.25F, 0.25F).build(new ResourceLocation(XenoMod.MODID + "smelly_egg").toString()));
    public static final RegistryObject<EntityType<FleshEntity>> FLESH = Registration.ENTITIES.register("flesh", () -> EntityType.Builder.<FleshEntity>create(FleshEntity::new, EntityClassification.MISC).setTrackingRange(64).setUpdateInterval(1).setShouldReceiveVelocityUpdates(true).setCustomClientFactory(FleshEntity::new).size(0.3F, 0.3F).build(new ResourceLocation(XenoMod.MODID + "flesh").toString()));


    public static void register() { }
}
