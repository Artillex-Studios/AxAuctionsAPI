package com.artillexstudios.axauctions.hooks;

import com.artillexstudios.axauctions.hooks.currency.CurrencyHook;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class HookManager {
    private static final ArrayList<CurrencyHook> currency = new ArrayList<>();

    public void setupHooks() {
        updateHooks();
    }

    public void updateHooks() {
    }

    @SuppressWarnings("unused")
    public static void registerCurrencyHook(@NotNull Plugin plugin, @NotNull CurrencyHook currencyHook) {
    }

    @NotNull
    public static ArrayList<CurrencyHook> getCurrency() {
        return currency;
    }

    @Nullable
    public static CurrencyHook getCurrencyHook(@NotNull String name) {
        return null;
    }
}
