package kraus_adam.SpotTypes;

import kraus_adam.Visitors.Visitor;

/**
 * Nebula spot class
 */
public class Nebula extends Spot {
    /**
     * Nebula constructor
     */
    public Nebula() {
        symbol = '⛆';
    }

    /**
     * Accepts a visitor to visit this class type
     * @param v Generic visitor
     */
    @Override
    public void accept(Visitor v) {
        v.gotANebula(this);
    }
}
