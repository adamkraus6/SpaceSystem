package kraus_adam.SpotTypes;

import kraus_adam.ColorText;
import kraus_adam.Visitors.Visitor;

public class Empty extends Spot {
    public Empty() {
        symbol = '▩';
    }

    @Override
    public void accept(Visitor v) {
        v.gotAnEmpty(this);
    }

    public String toString() {
        return ColorText.colorString(symbol, color);
    }
}
