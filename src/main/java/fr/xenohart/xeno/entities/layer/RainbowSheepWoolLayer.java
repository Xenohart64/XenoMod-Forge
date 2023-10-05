package fr.xenohart.xeno.entities.layer;

import com.mojang.blaze3d.matrix.MatrixStack;
import fr.xenohart.xeno.XenoMod;
import fr.xenohart.xeno.entities.RainbowSheepEntity;
import fr.xenohart.xeno.entities.model.RainbowSheepFurModel;
import fr.xenohart.xeno.entities.model.RainbowSheepModel;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class RainbowSheepWoolLayer extends LayerRenderer<RainbowSheepEntity, RainbowSheepModel<RainbowSheepEntity>> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(XenoMod.MODID, "textures/entity/rainbow_sheep/rainbow_sheep_fur.png");
    private final RainbowSheepFurModel<RainbowSheepEntity> sheepModel = new RainbowSheepFurModel<>();

    public RainbowSheepWoolLayer(IEntityRenderer<RainbowSheepEntity, RainbowSheepModel<RainbowSheepEntity>> rendererIn) {
        super(rendererIn);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, RainbowSheepEntity entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        if (!entitylivingbaseIn.getSheared() && !entitylivingbaseIn.isInvisible()) {

            renderCopyCutoutModel(this.getEntityModel(), this.sheepModel, TEXTURE, matrixStackIn, bufferIn, packedLightIn, entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, partialTicks, 1.0F, 1.0F, 1.0F);
        }
    }
}
