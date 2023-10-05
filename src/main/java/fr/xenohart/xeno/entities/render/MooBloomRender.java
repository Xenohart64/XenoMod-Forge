package fr.xenohart.xeno.entities.render;

import fr.xenohart.xeno.XenoMod;
import fr.xenohart.xeno.entities.MooBloomEntity;
import fr.xenohart.xeno.entities.layer.EyelidsLayer;
import fr.xenohart.xeno.entities.model.MooBloomModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

@OnlyIn(Dist.CLIENT)
public class MooBloomRender extends MobRenderer<MooBloomEntity, MooBloomModel<MooBloomEntity>> {
    private static final ResourceLocation TEXTURES = new ResourceLocation(XenoMod.MODID, "textures/entity/moobloom.png");

    public MooBloomRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new MooBloomModel<>(), 0.5F);
        this.addLayer(new EyelidsLayer(this));
    }

    @Nullable
    @Override
    public ResourceLocation getEntityTexture(MooBloomEntity entity) {
        return TEXTURES;
    }
}
