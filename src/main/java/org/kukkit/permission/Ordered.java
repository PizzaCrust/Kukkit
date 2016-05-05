package org.kukkit.permission;

/**
 * Represents a entity that follows permission standard and can be checked for permissions.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 */
public interface Ordered {
    /**
     * Retrieves if the implementation is permissible with the permission given.
     * @param permission the permission node name
     * @return the boolean
     */
    boolean permissible(String permission);
}
