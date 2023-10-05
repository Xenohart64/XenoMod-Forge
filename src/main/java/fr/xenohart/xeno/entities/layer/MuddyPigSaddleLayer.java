//package fr.xenohart.xeno.entities.layer;
//
//import com.mojang.blaze3d.matrix.MatrixStack;
//import com.mojang.blaze3d.vertex.IVertexBuilder;
//import fr.xenohart.xeno.entities.MuddyPigEntity;
//import fr.xenohart.xeno.entities.model.MuddyPigModel;
//import net.minecraft.client.renderer.IRenderTypeBuffer;
//import net.minecraft.client.renderer.RenderType;
//import net.minecraft.client.renderer.entity.IEntityRenderer;
//import net.minecraft.client.renderer.entity.layers.LayerRenderer;
//import net.minecraft.client.renderer.texture.OverlayTexture;
//import net.minecraft.util.ResourceLocation;
//import net.minecraftforge.api.distmarker.Dist;
//import net.minecraftforge.api.distmarker.OnlyIn;
//
//@OnlyIn(Dist.CLIENT)
//public class MuddyPigSaddleLayer extends LayerRenderer<MuddyPigEntity, MuddyPigModel<MuddyPigEntity>> {
//    private static final ResourceLocation TEXTURE = new ResourceLocation("textures/entity/pig/pig_saddle.png");
//    private final MuddyPigModel<MuddyPigEntity> model = new MuddyPigModel<>();
//
//
//    public MuddyPigSaddleLayer(IEntityRenderer<MuddyPigEntity, MuddyPigModel<MuddyPigEntity>> render) {
//        super(render);
//    }
//
//    @Override
//    public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, MuddyPigEntity entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
//        if (entitylivingbaseIn.isHorseSaddled()) {
//            this.getEntityModel().copyModelAttributesTo(this.model);
//            this.model.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTicks);
//            this.model.setRotationAngles(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
//            IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEntityCutoutNoCull(TEXTURE));
//            this.model.render(matrixStackIn, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
//        }
//    }
//
//}
