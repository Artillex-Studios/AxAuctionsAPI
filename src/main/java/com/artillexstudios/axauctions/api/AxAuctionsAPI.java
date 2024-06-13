package com.artillexstudios.axauctions.api;

import com.artillexstudios.axauctions.hooks.HookManager;
import com.artillexstudios.axauctions.hooks.currency.CurrencyHook;
import com.artillexstudios.axauctions.items.AuctionManager;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;

public class AxAuctionsAPI {

    public static int getAuctionLimit(@NotNull Player player) {
        return 0;
    }

    public static int getAuctionItemAmount(@NotNull Player player) {
        return AuctionManager.getItemsByUser(player.getUniqueId()).size();
    }

    public static ArrayList<CurrencyHook> getCurrencyHooks() {
        return new ArrayList<>(HookManager.getRegistry().values());
    }

    public static HashMap<String, CurrencyHook> getRegistry() {
        return HookManager.getRegistry();
    }

    public static void registerCurrencyHook(@NotNull Plugin plugin, @NotNull CurrencyHook currencyHook) {
        HookManager.registerCurrencyHook(plugin, currencyHook);
    }
}
