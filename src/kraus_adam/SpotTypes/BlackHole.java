package kraus_adam.SpotTypes;

import kraus_adam.Visitors.Visitor;

/**
 * Blackhole spot class
 */
public class BlackHole extends Spot {
    /**
     * Blackhole constructor
     */
    public BlackHole() {
        symbol = '⯄';
    }

    /**
     * Accepts a visitor to visit this class type
     * @param v Generic visitor
     */
    @Override
    public void accept(Visitor v) {
        v.gotABlackhole(this);
    }
}
