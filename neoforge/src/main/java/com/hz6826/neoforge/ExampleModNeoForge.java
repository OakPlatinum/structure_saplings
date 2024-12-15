package com.hz6826.neoforge;

import net.neoforged.fml.common.Mod;

import com.hz6826.ExampleMod;

@Mod(ExampleMod.MOD_ID)
public final class ExampleModNeoForge {
    public ExampleModNeoForge() {
        // Run our common setup.
        ExampleMod.init();
    }
}
