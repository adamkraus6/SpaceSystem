package kraus_adam.SpotTypes;

import kraus_adam.ColorText;
import kraus_adam.Visitors.Visitor;

public class Planet extends Spot {
    public Planet() {
        symbol = '⦾';
    }

    @Override
    public void accept(Visitor v) {
        v.gotAPlanet(this);
    }

    public String toString() {
        return ColorText.colorString(symbol, color);
    }
}
