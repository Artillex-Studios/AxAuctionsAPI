package com.artillexstudios.axauctions.items;

import com.artillexstudios.axauctions.hooks.currency.CurrencyHook;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class AuctionManager {
    private static final HashMap<Integer, AuctionItem> items = new HashMap<>();

    public static void addItem(@NotNull AuctionItem auctionItem) {
    }

    public static void removeItem(@NotNull AuctionItem auctionItem) {
    }

    public static List<AuctionItem> getItemsByCurrency(@NotNull CurrencyHook currency) {
        return new ArrayList<>();
    }

    public static List<AuctionItem> getItemsByUser(@NotNull UUID uuid) {
        return new ArrayList<>();
    }

    @NotNull
    public static Optional<AuctionItem> getItemByID(int id) {
        return null;
    }

    @NotNull
    public static List<AuctionItem> getItemsByUser(@NotNull String search) {
        return new ArrayList<>();
    }

    @NotNull
    public static HashMap<Integer, AuctionItem> getItems() {
        return items;
    }

    public static void createAuction(@NotNull Player player, double price, @Nullable Integer am, @NotNull CurrencyHook currency) {
    }
}
