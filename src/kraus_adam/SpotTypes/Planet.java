package kraus_adam.SpotTypes;

import kraus_adam.ColorText;
import kraus_adam.Visitors.Visitor;

public class Planet extends Spot {
    ColorText.Color color;
    public Planet() {
        color = ColorText.Color.BLACK;
    }

    @Override
    public void accept(Visitor v) {
        v.gotAPlanet(this);
    }

    public String toString() {
        return ColorText.colorString("⦾", color);
    }
}
