package com.artillexstudios.axauctions.user;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public record PlayerRecord(@NotNull String name, UUID uuid) {
}
