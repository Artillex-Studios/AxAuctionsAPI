package com.artillexstudios.axauctions;

import com.artillexstudios.axapi.AxPlugin;
import com.artillexstudios.axapi.config.Config;
import com.artillexstudios.axapi.data.ThreadedQueue;
import com.artillexstudios.axapi.utils.MessageUtils;
import com.artillexstudios.axauctions.database.Database;
import net.kyori.adventure.platform.bukkit.BukkitAudiences;

public final class AxAuctions extends AxPlugin {
    private static AxPlugin instance;
    public static Config CONFIG;
    public static Config MESSAGES;
    public static Config HOOKS;
    public static Config DISCORD;
    private static ThreadedQueue<Runnable> threadedQueue;
    private static Database database;
    public static MessageUtils MESSAGEUTILS;
    public static BukkitAudiences BUKKITAUDIENCES;

    public static ThreadedQueue<Runnable> getThreadedQueue() {
        return threadedQueue;
    }

    public static Database getDatabase() {
        return database;
    }

    public static AxPlugin getInstance() {
        return instance;
    }
}
