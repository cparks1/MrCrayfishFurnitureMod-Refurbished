package com.mrcrayfish.furniture.refurbished.platform.services;

import net.minecraft.world.item.CreativeModeTab;

public interface IPlatformHelper
{
    /**
     * Gets the name of the current platform
     *
     * @return The name of the current platform.
     */
    Platform getPlatform();

    /**
     * Checks if a mod with the given id is loaded.
     *
     * @param modId The mod to check if it is loaded.
     * @return True if the mod is loaded, false otherwise.
     */
    boolean isModLoaded(String modId);

    /**
     * Check if the game is currently in a development environment.
     *
     * @return True if in a development environment, false otherwise.
     */
    boolean isDevelopmentEnvironment();

    /**
     * Gets the name of the environment type as a string.
     *
     * @return The name of the environment type.
     */
    default String getEnvironmentName()
    {
        return isDevelopmentEnvironment() ? "development" : "production";
    }

    /**
     * @return Returns the platform specific creative mode tab
     */
    CreativeModeTab getCreativeModeTab();

    enum Platform
    {
        FORGE, NEOFORGE, FABRIC;

        public boolean isForge()
        {
            return this == FORGE;
        }

        public boolean isFabric()
        {
            return this == FABRIC;
        }
    }
}