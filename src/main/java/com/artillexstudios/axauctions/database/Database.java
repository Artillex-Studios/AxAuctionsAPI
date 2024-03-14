package com.artillexstudios.axauctions.database;

import com.artillexstudios.axauctions.enums.ChangeType;
import com.artillexstudios.axauctions.hooks.currency.CurrencyHook;
import com.artillexstudios.axauctions.items.AuctionItem;
import com.artillexstudios.axauctions.items.HistoryItem;
import com.artillexstudios.axauctions.user.AuctionUser;
import com.artillexstudios.axauctions.user.PlayerRecord;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.UUID;

public interface Database {

    String getType();

    void setup();

    int getUserId(@NotNull Player player);

    int getUserId(@NotNull UUID uuid);

    @Nullable
    PlayerRecord getUserById(int id);

    @Nullable
    String getNameById(int id);

    int getCurrencyId(@NotNull CurrencyHook currency);

    @Nullable
    String getCurrencyById(int id);

    int getExtraLimit(@NotNull UUID uuid);

    void setExtraLimit(UUID uuid, int amount);

    void addItem(@NotNull AuctionItem auctionItem);

    void removeItem(@NotNull AuctionItem auctionItem);

    void updateItem(@NotNull AuctionItem auctionItem);

    void addToHistory(@NotNull AuctionItem auctionItem, int buyerId);

    ArrayList<HistoryItem> getHistory(UUID uuid);

    void sendMessage(@NotNull ChangeType changeType, int id);

    void addUnclaimedCurrency(int sellerId, int buyerId, double price, int currencyId, @NotNull ItemStack item);

    void checkForUnclaimedCurrency(@NotNull AuctionUser user);

    void addWarning(int sellerId, int staffId, @NotNull ItemStack item, boolean removed);

    void checkForWarnings(@NotNull AuctionUser user);

    void load();

    void loadSingle(int id);

    void checkForChanges();

    void removeOldChanges();

    void disable();
}
