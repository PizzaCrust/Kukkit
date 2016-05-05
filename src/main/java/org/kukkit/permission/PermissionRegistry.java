package org.kukkit.permission;

import org.kukkit.entity.PlayerEntity;

/**
 * Represents a registry of permission nodes.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 */
public interface PermissionRegistry {
    /**
     * Allows the specified permission to the specified player.
     * @param permissionName the permission name. Ex: 'essentials.testCommand'
     * @param playerEntity the player entity to assign the permission
     */
    void set(String permissionName, PlayerEntity playerEntity);

    /**
     * Checks if the specified player has the specified permission.
     * @param playerEntity the player
     * @param permissionName the permission
     * @return the bool
     */
    boolean permissible(PlayerEntity playerEntity, String permissionName);

    /**
     * Removes a specific permission from the player.
     * @param permissionName the permission
     * @param playerEntity the player
     */
    void remove(String permissionName, PlayerEntity playerEntity);
}
