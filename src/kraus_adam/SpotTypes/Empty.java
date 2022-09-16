package kraus_adam.SpotTypes;

import kraus_adam.ColorText;
import kraus_adam.Visitors.Visitor;

public class Empty extends Spot {
    ColorText.Color color;
    public Empty() {
        color = ColorText.Color.BLACK;
    }

    @Override
    public void accept(Visitor v) {
        v.gotAnEmpty(this);
    }

    public String toString() {
        return ColorText.colorString("▩", color);
    }
}
