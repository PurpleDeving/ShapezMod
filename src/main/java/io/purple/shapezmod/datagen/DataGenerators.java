package io.purple.shapezmod.datagen;


import io.purple.purplelib.datagen.ModBlockStatesProvider;
import io.purple.purplelib.datagen.ModItemModelProvider;
import io.purple.shapezmod.ShapezMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

import static io.purple.shapezmod.ShapezMod.PLMod;

@EventBusSubscriber(modid = ShapezMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        // Generators are in PL
        generator.addProvider(event.includeClient(), new ModBlockStatesProvider(packOutput, PLMod, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput, PLMod, existingFileHelper));

    }

}
