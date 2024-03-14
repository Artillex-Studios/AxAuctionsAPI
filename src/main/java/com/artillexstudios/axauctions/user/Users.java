package com.artillexstudios.axauctions.user;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class Users {
    private static final HashMap<Player, AuctionUser> users = new HashMap<>();

    public static void addUser(Player player) {
        users.put(player, new AuctionUser(player));
    }

    public static void removeUser(Player player) {
        users.remove(player);
    }

    public static HashMap<Player, AuctionUser> getUsers() {
        return users;
    }

    @NotNull
    public static AuctionUser getUser(@NotNull Player player) {
        return users.get(player);
    }
}
