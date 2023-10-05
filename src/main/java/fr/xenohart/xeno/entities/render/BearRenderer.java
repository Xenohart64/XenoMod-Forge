package fr.xenohart.xeno.entities.render;

import com.mojang.blaze3d.matrix.MatrixStack;
import fr.xenohart.xeno.XenoMod;
import fr.xenohart.xeno.entities.BearEntity;
import fr.xenohart.xeno.entities.model.BearModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BearRenderer extends MobRenderer<BearEntity, BearModel<BearEntity>> {

    public BearRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new BearModel<>(), 0.9F);
    }

    /**
     * Returns the location of an entity's texture.
     */
    @Override
    public ResourceLocation getEntityTexture(BearEntity entity) {
        return new ResourceLocation(XenoMod.MODID, "textures/entity/bear.png");
    }

    protected void preRenderCallback(BearEntity entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
        matrixStackIn.scale(1.2F, 1.2F, 1.2F);
        super.preRenderCallback(entitylivingbaseIn, matrixStackIn, partialTickTime);
    }
}
