package fr.xenohart.xeno.data;

import fr.xenohart.xeno.blocks.ModBlocks;
import fr.xenohart.xeno.items.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(ModBlocks.RUBY_BLOCK.get())
                .define('R', ModItems.RUBY.get())
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                //.("ruby", has(ModItems.RUBY.get()))
                .getResult();

        ShapedRecipeBuilder.shaped(ModBlocks.SAPHIR_BLOCK.get())
                .define('S', ModItems.SAPHIR.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                //.addCriterion("saphir", hasItem(ModItems.SAPHIR.get()))
                .getResult();

        ShapedRecipeBuilder.shaped(ModBlocks.SILVER_BLOCK.get())
                .define('S', ModItems.SILVER_INGOT.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                //.addCriterion("silver_ingot", hasItem(ModItems.SILVER_INGOT.get()))
                .getResult();

        ShapedRecipeBuilder.shaped(ModBlocks.CHERRY_BLOSSOM_PLANK.get())
                .define('C', ModBlocks.CHERRY_BLOSSOM_LOG.get())
                .pattern("C")
                //.addCriterion("cherry_blossom_log", hasItem(ModBlocks.CHERRY_BLOSSOM_LOG.get()))
                .getResult();

        ShapedRecipeBuilder.shaped(ModBlocks.RAINBOW_CARPET.get())
                .define('R', ModBlocks.RAINBOW_WOOL.get())
                .pattern("RR")
                //.addCriterion("rainbow_wool", hasItem(ModBlocks.RAINBOW_WOOL.get()))
                .getResult();


    }
}
