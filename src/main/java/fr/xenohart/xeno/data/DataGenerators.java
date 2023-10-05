package fr.xenohart.xeno.data;

import fr.xenohart.xeno.XenoMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = XenoMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    private static final String[] LOCALE_CODES = new String[]{
            "en_us",
            "fr_fr"
    };

    private DataGenerators(){ }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        addLanguageProviders(generator);

        generator.addProvider(new ModBlockStateProvider(generator, existingFileHelper));
        generator.addProvider(new ModItemModelProvider(generator, existingFileHelper));

        ModBlockTagsProvider block_tags = new ModBlockTagsProvider(generator, existingFileHelper);

        generator.addProvider(block_tags);
        generator.addProvider(new ModItemTagsProvider(generator, block_tags, existingFileHelper));

        generator.addProvider(new ModLootTableProvider(generator));

        generator.addProvider(new ModRecipeProvider(generator));
    }

    private static void addLanguageProviders(DataGenerator generator){
        for(String locale : LOCALE_CODES){
            generator.addProvider(new ModLanguageProvider(generator, locale));
        }
    }
}
