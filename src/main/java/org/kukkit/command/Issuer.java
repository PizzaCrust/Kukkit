package org.kukkit.command;

/**
 * Represents an entity that can issue commands.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 * TODO: Implement the 'Ordered' interface, after the permission API's addition.
 */
public interface Issuer {
    /**
     * Sends a message to the issuer.
     * @param message the message
     */
    void message(String message);
}
