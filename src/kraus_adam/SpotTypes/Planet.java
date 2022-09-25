package kraus_adam.SpotTypes;

import kraus_adam.Visitors.Visitor;

public class Planet extends Spot {
    public Planet() {
        symbol = '⦾';
    }

    @Override
    public void accept(Visitor v) {
        v.gotAPlanet(this);
    }
}
