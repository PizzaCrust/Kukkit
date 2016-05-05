package org.kukkit;

import org.kukkit.command.CommandManager;
import org.kukkit.event.EventBus;
import org.kukkit.permission.PermissionRegistry;
import org.kukkit.world.World;

/**
 * Bridge from the implementation to the API user.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 */
public class Kukkit {
    /**
     * The running system. (implementation of the server)
     */
    private static RunningSystem SYSTEM = null;

    public static void system(RunningSystem system) {
        if (SYSTEM != null) {
            throw new RuntimeException("system already exists");
        }
        SYSTEM = system;
    }

    /**
     * Retrieves the command manager.
     * @return the command manager
     */
    public static CommandManager commands() {
        return SYSTEM.commands();
    }

    /**
     * Retrieves the world.
     * @return the world
     */
    public static World world() {
        return SYSTEM.world();
    }

    /**
     * Retrieves the event bus
     * @return the event bus
     */
    public static EventBus events() {
        return SYSTEM.bus();
    }

    /**
     * Retrieves the permission registry.
     * @return the registry
     */
    public static PermissionRegistry permissions() {
        return SYSTEM.permissions();
    }
}
