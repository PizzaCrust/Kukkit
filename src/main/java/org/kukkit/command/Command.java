package org.kukkit.command;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates the annotated element as a command.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Command {
    /**
     * The name of the command.
     * @return the name
     */
    String name();

    /**
     * The usage of the command.
     * @return the usage
     */
    String usage();

    /**
     * The help command entry message.
     * @return the entry message
     */
    String help();
}
