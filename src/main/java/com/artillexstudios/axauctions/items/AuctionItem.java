package com.artillexstudios.axauctions.items;

import com.artillexstudios.axauctions.hooks.currency.CurrencyHook;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public class AuctionItem {
    private int id = 0;
    private final ItemStack item;
    private int sellerId;
    private final UUID seller;
    private final String sellerName;
    private final double price;
    private int currencyId;
    private final CurrencyHook currency;
    private long startTime;

    public AuctionItem(int id, ItemStack item, int sellerId, UUID seller, String sellerName, double price, int currencyId, CurrencyHook currency, long startTime) {
        this.id = id;
        this.item = item;
        this.sellerId = sellerId;
        this.seller = seller;
        this.sellerName = sellerName;
        this.price = price;
        this.currencyId = currencyId;
        this.currency = currency;
        this.startTime = startTime;
    }

    public AuctionItem(ItemStack item, UUID seller, String sellerName, double price, CurrencyHook currency, long startTime) {
        this.item = item;
        this.seller = seller;
        this.sellerName = sellerName;
        this.price = price;
        this.currency = currency;
        this.startTime = startTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public int getSellerId() {
        return sellerId;
    }

    public int getId() {
        return id;
    }

    public ItemStack getItemStack() {
        return item;
    }

    public UUID getSeller() {
        return seller;
    }

    public String getSellerName() {
        return sellerName;
    }

    public double getPrice() {
        return price;
    }

    public CurrencyHook getCurrency() {
        return currency;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getExpiryTime() {
        return 0;
    }

    public long getDeletionTime() {
        return 0;
    }

    public void setCurrencyId(int currencyId) {
        this.currencyId = currencyId;
    }

    public int getCurrencyId() {
        return currencyId;
    }

    public boolean isExpired() {
        return getExpiryTime() < 0;
    }

    public void makeExpired() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuctionItem that = (AuctionItem) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
