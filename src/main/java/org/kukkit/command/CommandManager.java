package org.kukkit.command;

/**
 * Represents the command manager.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 */
public interface CommandManager {
    /**
     * Registers a class instance to register all {@link Command} annotated methods inside of the class.
     * @param classInstance the instance of the class
     */
    void register(Object classInstance);

    /**
     * Retrieves the command annotations registered to the command manager.
     * @return the annotations
     */
    Command[] commandAnnotations();
}
