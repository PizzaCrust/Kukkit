package org.kukkit.plugin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates the annotated field as a logger.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Logger {
    /**
     * The name of the logger.
     * @return the name
     */
    String name();
}
