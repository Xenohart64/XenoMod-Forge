package fr.xenohart.xeno.entities.render;

import com.mojang.blaze3d.matrix.MatrixStack;
import fr.xenohart.xeno.XenoMod;
import fr.xenohart.xeno.entities.BlueSlimeEntity;
import fr.xenohart.xeno.entities.model.BlueSlimeModel;
import fr.xenohart.xeno.entities.slimes.BlueSlimeGelLayer;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.monster.SlimeEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class BlueSlimeRenderer  extends MobRenderer<BlueSlimeEntity, BlueSlimeModel<BlueSlimeEntity>> {
    public BlueSlimeRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new BlueSlimeModel<>(16), 0.25F);
        this.addLayer(new BlueSlimeGelLayer<>(this));
    }

    @Override
    public ResourceLocation getEntityTexture(BlueSlimeEntity entity) {
        return new ResourceLocation(XenoMod.MODID, "textures/entity/blue_slime.png");
    }

    public void render(BlueSlimeEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        this.shadowSize = 0.25F * (float)entityIn.getSlimeSize();
        super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
    }

    protected void preRenderCallback(SlimeEntity entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
        float f = 0.999F;
        matrixStackIn.scale(0.999F, 0.999F, 0.999F);
        matrixStackIn.translate(0.0D, (double)0.001F, 0.0D);
        float f1 = (float)entitylivingbaseIn.getSlimeSize();
        float f2 = MathHelper.lerp(partialTickTime, entitylivingbaseIn.prevSquishFactor, entitylivingbaseIn.squishFactor) / (f1 * 0.5F + 1.0F);
        float f3 = 1.0F / (f2 + 1.0F);
        matrixStackIn.scale(f3 * f1, 1.0F / f3 * f1, f3 * f1);
    }
}
