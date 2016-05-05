package org.kukkit.entity;

import org.kukkit.command.Issuer;
import org.kukkit.permission.Ordered;

/**
 * Represents an player.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 * TODO: Improvements.
 */
public interface PlayerEntity extends Ordered, Issuer, BaseEntity {
    /**
     * Retrieves if the player is allowed flight.
     * @return the bool
     */
    boolean allowFlight();

    /**
     * Sets if the player can fly
     * @param flag the flag
     */
    void allowFlight(boolean flag);

    /**
     * Retrieves the display name of the player.
     * @return the display name
     */
    String displayName();

    /**
     * Retrieves the display name of the player.
     * @param name
     */
    void displayName(String name);

    /**
     * Retrieves the player list name of the player.
     * @return the player list name
     */
    String listName();

    /**
     * Sets the player list name of the player.
     * @param name the player list name
     */
    void listName(String name);

    /**
     * Represents the default Minecraft GameModes.
     */
    enum GameMode {
        SURVIVAL,
        CREATIVE,
        SPECTATOR,
        ADVENTURE
    }

    /**
     * Retrieves the current GameMode of the player.
     * @return the current GameMode.
     */
    GameMode gameMode();

    /**
     * Sets the GameMode of the player.
     * @param gameMode the GameMode
     */
    void gameMode(GameMode gameMode);

    /**
     * Retrieves if the player is flying.
     * @return the bool
     */
    boolean flying();

    /**
     * Sets if the player is flying.
     * @param flag the flag
     */
    void flying(boolean flag);

    /**
     * Retrieves if the player is sprinting.
     * @return the flag
     */
    boolean sprinting();

    /**
     * Sets if the player is sprinting.
     * @param flag the flag
     */
    void sprinting(boolean flag);

    /**
     * Kicks the player from the server.
     * @param reason the reason
     */
    void kick(String reason);

    /**
     * Performs a command as a the player.
     * @param command the command
     */
    void sudo(String command);
}
