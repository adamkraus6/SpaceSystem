package kraus_adam.SpotTypes;

import kraus_adam.Visitors.Visitor;

/**
 * Empty spot class
 */
public class Empty extends Spot {
    /**
     * Empty constructor
     */
    public Empty() {
        symbol = '▩';
    }

    /**
     * Accepts a visitor to visit this class type
     * @param v Generic visitor
     */
    @Override
    public void accept(Visitor v) {
        v.gotAnEmpty(this);
    }
}
