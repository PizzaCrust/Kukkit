package org.kukkit.event.defaults;

import org.kukkit.entity.PlayerEntity;
import org.kukkit.event.Event;

/**
 * Represents an event when a player joins the server.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 */
public class PlayerJoinServerEvent implements Event {
    /**
     * The player.
     */
    private final PlayerEntity player;

    /**
     * Constructs a new {@link PlayerJoinServerEvent}.
     * @param playerEntity the player
     */
    public PlayerJoinServerEvent(PlayerEntity playerEntity) {
        this.player = playerEntity;
    }

    /**
     * Retrieves the player of the event.
     * @return the player
     */
    public PlayerEntity getPlayer() {
        return player;
    }
}
