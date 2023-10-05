package fr.xenohart.xeno.data;

import fr.xenohart.xeno.blocks.ModBlocks;
import fr.xenohart.xeno.items.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.crafting.ShapedRecipe;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.RUBY_BLOCK.get())
                .key('R', ModItems.RUBY.get())
                .patternLine("RRR")
                .patternLine("RRR")
                .patternLine("RRR")
                .addCriterion("ruby", hasItem(ModItems.RUBY.get()))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.SAPHIR_BLOCK.get())
                .key('S', ModItems.SAPHIR.get())
                .patternLine("SSS")
                .patternLine("SSS")
                .patternLine("SSS")
                .addCriterion("saphir", hasItem(ModItems.SAPHIR.get()))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.SILVER_BLOCK.get())
                .key('S', ModItems.SILVER_INGOT.get())
                .patternLine("SSS")
                .patternLine("SSS")
                .patternLine("SSS")
                .addCriterion("silver_ingot", hasItem(ModItems.SILVER_INGOT.get()))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.CHERRY_BLOSSOM_PLANK.get())
                .key('C', ModBlocks.CHERRY_BLOSSOM_LOG.get())
                .patternLine("C")
                .addCriterion("cherry_blossom_log", hasItem(ModBlocks.CHERRY_BLOSSOM_LOG.get()))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.RAINBOW_CARPET.get())
                .key('R', ModBlocks.RAINBOW_WOOL.get())
                .patternLine("RR")
                .addCriterion("rainbow_wool", hasItem(ModBlocks.RAINBOW_WOOL.get()))
                .build(consumer);


    }
}
