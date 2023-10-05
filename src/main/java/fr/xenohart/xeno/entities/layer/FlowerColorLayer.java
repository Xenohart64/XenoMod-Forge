//package fr.xenohart.xeno.entities.layer;
//
//import com.mojang.blaze3d.matrix.MatrixStack;
//import com.mojang.blaze3d.vertex.IVertexBuilder;
//import fr.xenohart.xeno.XenoMod;
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
//public class FlowerColorLayer extends LayerRenderer<MuddyPigEntity, MuddyPigModel<MuddyPigEntity>> {
//    private static final ResourceLocation FLOWER_TEXTURE = new ResourceLocation(XenoMod.MODID, "textures/entity/pig_muddy_flower.png");
//    private final MuddyPigModel<MuddyPigEntity> model = new MuddyPigModel<>();
//
//    public FlowerColorLayer(IEntityRenderer<MuddyPigEntity, MuddyPigModel<MuddyPigEntity>> p_i50914_1_) {
//        super(p_i50914_1_);
//    }
//
//    @Override
//    public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, MuddyPigEntity entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
//        if (!entitylivingbaseIn.isInvisible() && entitylivingbaseIn.getHasFlower() && !entitylivingbaseIn.isDry()) {
//            this.getEntityModel().copyModelAttributesTo(this.model);
//            float[] afloat = entitylivingbaseIn.getFlowerColor().getColorComponentValues();
//            this.model.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTicks);
//            this.model.setRotationAngles(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
//            IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEntityCutoutNoCull(FLOWER_TEXTURE));
//            this.model.render(matrixStackIn, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY, afloat[0], afloat[1], afloat[2], 1.0F);
//        }
//    }
//}
