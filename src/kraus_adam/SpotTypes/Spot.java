package kraus_adam.SpotTypes;

import kraus_adam.ColorText;
import kraus_adam.Visitors.Visitor;

public abstract class Spot {
    protected ColorText.Color color;
    protected char printChar;
    public Spot() {

    }

    public abstract void accept(Visitor v);

    public void setColor(ColorText.Color color) {
        this.color = color;
    }
}
