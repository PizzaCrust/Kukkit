package org.kukkit.plugin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates the specified element as a plugin.
 * This class annotated is automatically defined as a event listener.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Plugin {
    /**
     * The name of the plugin.
     * @return the name
     */
    String name();

    /**
     * The description of the plugin.
     * @return the description
     */
    String description();

    /**
     * The authors of the plugin.
     * @return the authors
     */
    String[] authors();

    /**
     * The website of the plugin.
     * @return the website
     */
    String website();
}
