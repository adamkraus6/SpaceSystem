package kraus_adam.SpotTypes;

import kraus_adam.ColorText;
import kraus_adam.Visitors.Visitor;

public class Blackhole extends Spot {
    ColorText.Color color;
    public Blackhole() {
        color = ColorText.Color.BLACK;
    }

    @Override
    public void accept(Visitor v) {
        v.gotABlackhole(this);
    }

    public String toString() {
        return ColorText.colorString("⯄", color);
    }
}
