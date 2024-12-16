package com.artillexstudios.axauctions.hooks;

import com.artillexstudios.axauctions.hooks.currency.CurrencyHook;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.ConcurrentHashMap;

public class HookManager {
    private static final ConcurrentHashMap<String, CurrencyHook> registry = new ConcurrentHashMap<>();

    public void setupHooks() {
        // should not be called manually
    }

    public void updateHooks() {
        // should not be called manually
    }

    @SuppressWarnings("unused")
    public static void registerCurrencyHook(@NotNull Plugin plugin, @NotNull CurrencyHook currencyHook) {
        // registers the hook and also creates the configuration with the getName() in the currencies.yml
    }

    public static ConcurrentHashMap<String, CurrencyHook> getRegistry() {
        return registry;
    }

    @Nullable
    public static CurrencyHook getCurrencyHook(@NotNull String name) {

        return null;
    }
}
