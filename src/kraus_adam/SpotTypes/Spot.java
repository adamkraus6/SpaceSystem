package kraus_adam.SpotTypes;

import kraus_adam.ColorText;
import kraus_adam.Visitors.Visitor;

/**
 * Abstract spot class to extend
 */
public abstract class Spot {
    /**
     * Color to print text for toString
     */
    protected ColorText.Color color;
    /**
     * Symbol to print for toString
     */
    protected char symbol;
    /**
     * Spot constructor
     */
    public Spot() {
        color = ColorText.Color.BLACK;
    }

    /**
     * Accepts a visitor to visit this class type
     * @param v Generic visitor
     */
    public abstract void accept(Visitor v);

    /**
     * Sets a spots color
     * @param color New color
     */
    public void setColor(ColorText.Color color) {
        this.color = color;
    }

    /**
     * Prints the spot symbol in its color
     * @return  Formatted string
     */
    public String toString() {
        return ColorText.colorString(symbol, color);
    }
}
