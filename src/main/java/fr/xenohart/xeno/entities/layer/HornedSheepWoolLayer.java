//package fr.xenohart.xeno.entities.layer;
//
//import com.mojang.blaze3d.matrix.MatrixStack;
//import fr.xenohart.xeno.entities.HornedSheepEntity;
//import fr.xenohart.xeno.entities.model.HornedSheepModel;
//import net.minecraft.client.renderer.IRenderTypeBuffer;
//import net.minecraft.client.renderer.entity.IEntityRenderer;
//import net.minecraft.client.renderer.entity.layers.LayerRenderer;
//import net.minecraft.client.renderer.entity.model.SheepWoolModel;
//import net.minecraft.entity.passive.SheepEntity;
//import net.minecraft.item.DyeColor;
//import net.minecraft.util.ResourceLocation;
//import net.minecraftforge.api.distmarker.Dist;
//import net.minecraftforge.api.distmarker.OnlyIn;
//
//@OnlyIn(Dist.CLIENT)
//public class HornedSheepWoolLayer extends LayerRenderer<HornedSheepEntity, HornedSheepModel<HornedSheepEntity>> {
//    private static final ResourceLocation TEXTURE = new ResourceLocation("textures/entity/sheep_fur.png");
//    private final SheepWoolModel<HornedSheepEntity> sheepModel = new SheepWoolModel<>();
//
//    public HornedSheepWoolLayer(IEntityRenderer<HornedSheepEntity, HornedSheepModel<HornedSheepEntity>> rendererIn) {
//        super(rendererIn);
//    }
//
//    public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, HornedSheepEntity entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
//        if (!entitylivingbaseIn.getSheared() && !entitylivingbaseIn.isInvisible()) {
//            float f;
//            float f1;
//            float f2;
//            if (entitylivingbaseIn.hasCustomName() && "jeb_".equals(entitylivingbaseIn.getName().getUnformattedComponentText())) {
//                int i1 = 25;
//                int i = entitylivingbaseIn.ticksExisted / 25 + entitylivingbaseIn.getEntityId();
//                int j = DyeColor.values().length;
//                int k = i % j;
//                int l = (i + 1) % j;
//                float f3 = ((float) (entitylivingbaseIn.ticksExisted % 25) + partialTicks) / 25.0F;
//                float[] afloat1 = SheepEntity.getDyeRgb(DyeColor.byId(k));
//                float[] afloat2 = SheepEntity.getDyeRgb(DyeColor.byId(l));
//                f = afloat1[0] * (1.0F - f3) + afloat2[0] * f3;
//                f1 = afloat1[1] * (1.0F - f3) + afloat2[1] * f3;
//                f2 = afloat1[2] * (1.0F - f3) + afloat2[2] * f3;
//            } else {
//                float[] afloat = SheepEntity.getDyeRgb(entitylivingbaseIn.getFleeceColor());
//                f = afloat[0];
//                f1 = afloat[1];
//                f2 = afloat[2];
//            }
//
//            renderCopyCutoutModel(this.getEntityModel(), this.sheepModel, TEXTURE, matrixStackIn, bufferIn, packedLightIn, entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, partialTicks, f, f1, f2);
//        }
//    }
//}
