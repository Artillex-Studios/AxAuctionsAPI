package com.artillexstudios.axauctions.hooks.currency;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public interface CurrencyHook {

    void setup();

    String getName();

    boolean worksOffline();

    boolean usesDouble();

    boolean isPersistent();

    double getBalance(@NotNull UUID player);

    CompletableFuture<Boolean> giveBalance(@NotNull UUID player, double amount);

    CompletableFuture<Boolean> takeBalance(@NotNull UUID player, double amount);
}
