package kraus_adam.SpotTypes;

import kraus_adam.Visitors.Visitor;

public class Star extends Spot {
    public Star() {
        symbol = '★';
    }

    @Override
    public void accept(Visitor v) {
        v.gotAStar(this);
    }
}
