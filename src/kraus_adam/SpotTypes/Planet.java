package kraus_adam.SpotTypes;

import kraus_adam.Visitors.Visitor;

/**
 * Planet spot class
 */
public class Planet extends Spot {
    /**
     * Planet constructor
     */
    public Planet() {
        symbol = '⦾';
    }

    /**
     * Accepts a visitor to visit this class type
     * @param v Generic visitor
     */
    @Override
    public void accept(Visitor v) {
        v.gotAPlanet(this);
    }
}
