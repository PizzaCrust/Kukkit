package org.kukkit.ext;

/**
 * A utility for text.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 */
public class Text {
    /**
     * Adds the section symbol to a color code.
     * @param colorCode the color code
     * @return the section symbol with the color code
     */
    public static String color(String colorCode) {
        return "\u00A7" + colorCode;
    }
}
