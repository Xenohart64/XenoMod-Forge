package fr.xenohart.xeno.fluid;

import fr.xenohart.xeno.XenoMod;
import fr.xenohart.xeno.items.ModItems;
import fr.xenohart.xeno.util.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;

public class ModFluids {
    //mud
    public static final ResourceLocation MUD_STILL_RL = new ResourceLocation(XenoMod.MODID, "block/mud");
    public static final ResourceLocation MUD_FLOWING_RL = new ResourceLocation(XenoMod.MODID, "block/flow_mud");
    public static final ResourceLocation MUD_OVERLAY_RL = new ResourceLocation(XenoMod.MODID, "block/mud_overlay");

    public static final RegistryObject<FlowingFluid> MUD_FLUID = Registration.FLUIDS.register("mud_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.MUD_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MUD_FLOWING = Registration.FLUIDS.register("mud_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.MUD_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MUD_PROPERTIES = new ForgeFlowingFluid.Properties(() -> MUD_FLUID.get(), () -> MUD_FLOWING.get(), FluidAttributes.builder(MUD_STILL_RL, MUD_FLOWING_RL)).slopeFindDistance(3).levelDecreasePerBlock(3).block(() -> ModFluids.MUD_BLOCK.get()).bucket(() -> ModItems.MUD_BUCKET.get());

    public static final RegistryObject<FlowingFluidBlock> MUD_BLOCK = Registration.BLOCKS.register("mud", () -> new FlowingFluidBlock(() -> ModFluids.MUD_FLUID.get(), AbstractBlock.Properties.create(Material.WATER).doesNotBlockMovement().hardnessAndResistance(100f).noDrops()));


    //acid

    public static void register(){ };
}
