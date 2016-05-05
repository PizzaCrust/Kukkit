package org.kukkit.event;

/**
 * A bus highway for listening and calling events.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 */
public interface EventBus {
    /**
     * Registers a listener.
     * @param instanceOfListener the instance of the listener
     */
    void register(Object instanceOfListener);

    /**
     * Calls the event to the bus of listeners.
     * @param event the event
     */
    void callEvent(Event event);
}
