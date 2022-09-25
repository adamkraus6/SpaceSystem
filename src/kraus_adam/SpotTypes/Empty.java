package kraus_adam.SpotTypes;

import kraus_adam.Visitors.Visitor;

public class Empty extends Spot {
    public Empty() {
        symbol = '▩';
    }

    @Override
    public void accept(Visitor v) {
        v.gotAnEmpty(this);
    }
}
