package com.artillexstudios.axauctions.items;

import com.artillexstudios.axauctions.user.PlayerRecord;
import org.bukkit.inventory.ItemStack;

public record HistoryItem(int id, ItemStack item, int sellerId, PlayerRecord seller, int buyerId, PlayerRecord buyer, double price, int currencyId, String currency, long soldTime) {
}
