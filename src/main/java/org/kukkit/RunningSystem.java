package org.kukkit;

import org.kukkit.command.CommandManager;
import org.kukkit.event.EventBus;
import org.kukkit.permission.PermissionRegistry;
import org.kukkit.world.World;

/**
 * Represents a system that is running. Usually, the 'server'.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 */
public interface RunningSystem {
    /**
     * Retrieves the implementation of the command manager.
     * @return the command manager
     */
    CommandManager commands();

    /**
     * Retrieves the implementation of the world.
     * @return the world
     */
    World world();

    /**
     * Retrieves the event bus.
     * @return Should return {@link org.kukkit.event.RegularEventBus}.
     */
    EventBus bus();

    /**
     * Retrieves the permission registry.
     * @return the permission registry
     */
    PermissionRegistry permissions();
}
