package com.hz6826.structure_saplings.fabric;

import net.fabricmc.api.ModInitializer;

import com.hz6826.structure_saplings.fabriclike.ExampleModFabricLike;

public final class StructureSaplings implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run the Fabric-like setup.
        ExampleModFabricLike.init();
    }
}
