package org.kukkit.ext;

/**
 * The position inside of a 3D world.
 * May be used as a replacement of Vector objects.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 */
public class Position {
    /**
     * Main positional coordinates.
     */
    private int x;
    private int y;
    private int z;

    /**
     * Constructs a new {@link Position} object.
     * @param x the xCoordinate
     * @param y the yCoordinate
     * @param z the zCoordinate
     */
    public Position(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * The 'X' position.
     * @return the position
     */
    public int x() {
        return x;
    }

    /**
     * The 'Y' position.
     * @return the position
     */
    private int y() {
        return y;
    }

    /**
     * The 'Z' position.
     * @return the position
     */
    private int z() {
        return z;
    }
}
