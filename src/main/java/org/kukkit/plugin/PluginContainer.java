package org.kukkit.plugin;

import org.apache.logging.log4j.Logger;

/**
 * A container for plugins.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 */
public class PluginContainer {
    /**
     * Container essential information.
     */
    public final Plugin pluginAnnotation;
    public final Object pluginInstance;
    public final Logger logger;

    /**
     * Constructs a new {@link PluginContainer}.
     * @param pluginAnnotation the plugin annotation
     * @param pluginInstance the instance of the plugin
     * @param logger the logger
     */
    public PluginContainer(Plugin pluginAnnotation, Object pluginInstance, Logger logger) {
        this.pluginAnnotation = pluginAnnotation;
        this.pluginInstance = pluginInstance;
        this.logger = logger;
    }
}
