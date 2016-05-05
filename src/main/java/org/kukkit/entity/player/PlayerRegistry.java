package org.kukkit.entity.player;

import org.kukkit.entity.PlayerEntity;
import org.kukkit.ext.FindingException;

import java.util.UUID;

/**
 * Represents a player registry.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 */
public interface PlayerRegistry {
    /**
     * Lists the players on the server.
     * @return the players
     */
    PlayerEntity[] players();

    /**
     * Finds the specified player from a player name.
     * @param playerName the player name
     * @return the player
     * @throws FindingException
     */
    PlayerEntity find(String playerName) throws FindingException;

    /**
     * Finds the specified player from the unique ID of it.
     * @param uuid the uuid
     * @return the player
     * @throws FindingException
     */
    PlayerEntity find(UUID uuid) throws FindingException;
}
