package org.kukkit.event.defaults;

import org.kukkit.entity.PlayerEntity;

/**
 * Represents an event when a player joins a world.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 */
public class PlayerJoinWorldEvent extends PlayerJoinServerEvent {
    /**
     * {@inheritDoc}
     */
    public PlayerJoinWorldEvent(PlayerEntity playerEntity) {
        super(playerEntity);
    }
}
