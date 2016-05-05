package org.kukkit.plugin;

import java.io.File;

/**
 * Represents an loader of plugins.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 */
public interface Loader {
    /**
     * Loads a file as a plugin.
     * @param pluginFile the plugin file
     */
    PluginContainer load(File pluginFile);

    /**
     * Lists all the plugins loaded.
     * @return the plugins
     */
    PluginContainer[] plugins();
}
