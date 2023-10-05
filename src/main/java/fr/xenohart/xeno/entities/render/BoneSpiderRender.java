package fr.xenohart.xeno.entities.render;

import fr.xenohart.xeno.XenoMod;
import fr.xenohart.xeno.entities.BoneSpiderEntity;
import fr.xenohart.xeno.entities.layer.BoneSpiderEyesLayer;
import fr.xenohart.xeno.entities.model.BoneSpiderModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

@OnlyIn(Dist.CLIENT)
public class BoneSpiderRender extends MobRenderer<BoneSpiderEntity, BoneSpiderModel<BoneSpiderEntity>> {
    private static final ResourceLocation TEXTURES = new ResourceLocation(XenoMod.MODID, "textures/entity/bone_spider.png");

    public BoneSpiderRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new BoneSpiderModel<>(), 0.5F);
        this.addLayer(new BoneSpiderEyesLayer<>(this));
    }

    @Nullable
    @Override
    public ResourceLocation getEntityTexture(BoneSpiderEntity entity) {
        return TEXTURES;
    }
}
