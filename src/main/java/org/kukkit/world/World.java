package org.kukkit.world;

import org.kukkit.ext.Position;

/**
 * Represents a world.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 * TODO: Add spawnEntity(BaseEntity entity)
 */
public interface World {
    /**
     * Creates an explosion inside of the world.
     * @param position the position of the explosion
     * @param power the power of the explosion
     */
    void explode(Position position, float power);

    /**
     * Retrieves if the world can generate structures.
     * @return the boolean
     */
    boolean generateStructures();

    /**
     * Retrieves if the world allows animals.
     * @return the boolean
     */
    boolean allowAnimals();

    /**
     * Retrieves if the world can allow monsters.
     * @return the boolean
     */
    boolean allowMonsters();

    /**
     * Sets the gamerule inside of the world.
     * @param rule the rule
     * @param value the value
     */
    void gameRule(String rule, String value);

    /**
     * Retrieves the value of the specified gamerule.
     * @param rule the rule
     * @return the value
     */
    String gameRule(String rule);

    /**
     * Retrieves if the world allows Player vs Player.
     * @return the boolean
     */
    boolean pvp();

    /**
     * Sets if Player vs Player is allowed
     * @param flag the boolean
     */
    void pvp(boolean flag);
}
