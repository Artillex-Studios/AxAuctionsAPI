package com.artillexstudios.axauctions.api;

import com.artillexstudios.axauctions.hooks.HookManager;
import com.artillexstudios.axauctions.hooks.currency.CurrencyHook;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class AxAuctionsAPI {

    public static int getAuctionLimit(@NotNull Player player) {
        return -1;
    }

    public static int getAuctionItemAmount(@NotNull Player player) {
        return -1;
    }

    @NotNull
    public static ArrayList<CurrencyHook> getCurrencyHooks() {
        return HookManager.getCurrency();
    }

    public static void registerCurrencyHook(@NotNull Plugin plugin, @NotNull CurrencyHook currencyHook) {
        HookManager.registerCurrencyHook(plugin, currencyHook);
    }
}
