package kraus_adam.SpotTypes;

import kraus_adam.ColorText;
import kraus_adam.Visitors.Visitor;

public class Blackhole extends Spot {
    public Blackhole() {
        color = ColorText.Color.BLACK;
        printChar = '⯄';
    }

    @Override
    public void accept(Visitor v) {
        v.gotABlackhole(this);
    }

    public String toString() {
        return ColorText.colorString(printChar, color);
    }
}
