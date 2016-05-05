package org.kukkit.entity;

import org.kukkit.ext.Position;
import org.kukkit.world.World;

import java.util.UUID;

/**
 * Represents a base entity for all entities.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 */
public interface BaseEntity {
    /**
     * Retrieves the custom name of the entity.
     * @return the custom name
     */
    String customName();

    /**
     * Sets the custom name of the entity.
     * @param customName the custom name
     */
    void customName(String customName);

    /**
     * Retrieves the entity ID of the entity.
     * @return the id
     */
    int entityId();

    /**
     * Retrieves the fall distance that the entity has fallen.
     * @return the fall distance
     */
    float fallDistance();

    /**
     * Sets the fall distance of the entity.
     * @param fallDistance the fall distance
     */
    void fallDistance(float fallDistance);

    /**
     * Retrieves the fire ticks that the entity has taken.
     * @return the fire ticks
     */
    int fireTicks();

    /**
     * Sets the fire ticks that the entity has taken.
     * @param ticks the fire ticks
     */
    void fireTicks(int ticks);

    /**
     * Retrieves the position of the entity.
     * @return the position
     */
    Position position();

    /**
     * Sets the position of the entity.
     * @param position the position
     */
    void position(Position position);

    /**
     * Retrieves the max fire ticks of the entity.
     * @return the max fire ticks
     */
    int maxFireTicks();

    /**
     * Sets the max fire ticks of the entity.
     * @param ticks the max fire ticks
     */
    void maxFireTicks(int ticks);

    /**
     * Retrieves the ticks that the entity has lived.
     * @return the ticks
     */
    int ticksLived();

    /**
     * Sets the ticks that the entity has lived.
     * @param ticks the ticks
     */
    void ticksLived(int ticks);

    /**
     * Retrieves the unique ID that the entity has.
     * @return the unique ID
     */
    UUID uniqueId();

    /**
     * Retrieves the velocity of the entity.
     * @return the velocity
     */
    Position velocity();

    /**
     * Sets the velocity of the entity.
     * @param position the velocity
     */
    void velocity(Position position);

    /**
     * Retrieves the world that the entity is in.
     * @return the world
     */
    World world();

    /**
     * Retrieves if the custom name is visible.
     * @return the boolean
     */
    boolean customNameVisible();

    /**
     * Retrieves if the entity is dead.
     * @return the boolean
     */
    boolean dead();

    /**
     * Retrieves if the entity is glowing.
     * @return the boolean
     */
    boolean glowing();

    /**
     * Retrieves if the entity is on the ground.
     * @return the boolean
     */
    boolean ground();

    /**
     * Removes the entity from the world.
     */
    void remove();
}
