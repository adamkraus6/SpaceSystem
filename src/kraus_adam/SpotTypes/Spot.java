package kraus_adam.SpotTypes;

import kraus_adam.Visitors.Visitor;

public abstract class Spot {
    public Spot() {

    }

    public abstract void accept(Visitor v);
}
