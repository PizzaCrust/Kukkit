package org.kukkit.event;

import org.apache.logging.log4j.LogManager;
import org.kukkit.event.defaults.KukkitInitializationEvent;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * The default implementation and should be the only implementation of {@link EventBus}.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 */
public class RegularEventBus implements EventBus {
    private final List<Object> listeners = new ArrayList<>();

    @Override
    public void register(Object instanceOfListener) {
        listeners.add(instanceOfListener);
    }

    private void passFailed() {
        LogManager.getLogger("Kukkit").info("Failed to pass event!");
    }

    @Override
    public void callEvent(Event event) {
        for (Object listener : listeners) {
            Class<?> listenerClass = listener.getClass();
            for (Method method : listenerClass.getDeclaredMethods()) {
                if (method.isAnnotationPresent(BusListener.class)) {
                    for (Class<?> parameter : method.getParameterTypes()) {
                        if (parameter.getName().equals(event.getClass().getName())) {
                            try {
                                method.invoke(listener, event);
                            } catch (IllegalAccessException | InvocationTargetException e) {
                                passFailed();
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Starting regular event bus...");
        RegularEventBus regularEventBus = new RegularEventBus();
        regularEventBus.register(new TestListener());
        regularEventBus.callEvent(new KukkitInitializationEvent());
        System.out.println("Test end!");
    }

    private static class TestListener {
        @BusListener
        public void onTest(KukkitInitializationEvent e) {
            System.out.println("Works!");
        }
    }
}
