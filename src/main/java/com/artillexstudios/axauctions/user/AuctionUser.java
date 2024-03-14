package com.artillexstudios.axauctions.user;

import com.artillexstudios.axauctions.AxAuctions;
import com.artillexstudios.axauctions.enums.Sorting;
import com.artillexstudios.axauctions.hooks.HookManager;
import com.artillexstudios.axauctions.items.AuctionItem;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class AuctionUser {
    private final int userId;
    private final Player player;
    private Sorting sorting = Sorting.NEW_FIRST;
    private int currency = HookManager.getCurrency().size();
    private int extraLimit;

    public AuctionUser(@NotNull Player player) {
        this.userId = AxAuctions.getDatabase().getUserId(player);
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void switchSorting() {
    }

    public void switchSortingBack() {
    }

    public void switchCurrency() {
        currency++;
    }

    public Sorting getSorting() {
        return sorting;
    }

    public int getCurrency() {
        return currency;
    }

    public int getUserId() {
        return userId;
    }

    public String getSelectedCurrency() {
        return "";
    }

    public String getSelectedCurrencyId() {
        return "";
    }

    public boolean isCurrencySelected() {
        return false;
    }

    public int getExtraLimit() {
        return extraLimit;
    }

    public void setExtraLimit(int extraLimit) {
    }

    public void changeExtraLimit(int amount) {
    }

    public List<AuctionItem> getFilteredItems() {
        return new ArrayList<>();
    }
}
