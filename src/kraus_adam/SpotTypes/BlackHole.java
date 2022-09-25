package kraus_adam.SpotTypes;

import kraus_adam.Visitors.Visitor;

public class BlackHole extends Spot {
    public BlackHole() {
        symbol = '⯄';
    }

    @Override
    public void accept(Visitor v) {
        v.gotABlackhole(this);
    }
}
