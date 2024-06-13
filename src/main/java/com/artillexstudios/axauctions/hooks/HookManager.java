package com.artillexstudios.axauctions.hooks;

import com.artillexstudios.axauctions.hooks.currency.CurrencyHook;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;

public class HookManager {
    private static final HashMap<String, CurrencyHook> registry = new HashMap<>();

    public void setupHooks() {
    }

    public void updateHooks() {
    }

    @SuppressWarnings("unused")
    public static void registerCurrencyHook(@NotNull Plugin plugin, @NotNull CurrencyHook currencyHook) {
    }

    public static HashMap<String, CurrencyHook> getRegistry() {
        return registry;
    }

    @Nullable
    public static CurrencyHook getCurrencyHook(@NotNull String name) {
        return null;
    }
}
