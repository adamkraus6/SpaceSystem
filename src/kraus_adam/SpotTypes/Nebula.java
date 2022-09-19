package kraus_adam.SpotTypes;

import kraus_adam.ColorText;
import kraus_adam.Visitors.Visitor;

public class Nebula extends Spot {
    public Nebula() {
        color = ColorText.Color.BLACK;
        printChar = '♨';
    }

    @Override
    public void accept(Visitor v) {
        v.gotANebula(this);
    }

    public String toString() {
        return ColorText.colorString(printChar, color);
    }
}
