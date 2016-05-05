package org.kukkit.command;

import org.kukkit.permission.Ordered;

/**
 * Represents an entity that can issue commands.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 */
public interface Issuer extends Ordered {
    /**
     * Sends a message to the issuer.
     * @param message the message
     */
    void message(String message);
}
