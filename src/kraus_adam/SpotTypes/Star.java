package kraus_adam.SpotTypes;

import kraus_adam.Visitors.Visitor;

/**
 * Star spot class
 */
public class Star extends Spot {
    /**
     * Star constructor
     */
    public Star() {
        symbol = '★';
    }

    /**
     * Accepts a visitor to visit this class type
     * @param v Generic visitor
     */
    @Override
    public void accept(Visitor v) {
        v.gotAStar(this);
    }
}
