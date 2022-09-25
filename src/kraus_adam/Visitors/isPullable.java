package kraus_adam.Visitors;

import kraus_adam.SpotTypes.*;

/**
 * Pullable visitor class to determine if a spot is pullable by a blackhole. Used by the Gravity visitor class
 */
public class isPullable implements Visitor {
    /**
     * If a spot is pullable
     */
    private boolean isPullable = false;

    /**
     * Visit function
     * @param e Empty spot instance
     */
    @Override
    public void gotAnEmpty(Empty e) {
        isPullable = false;
    }

    /**
     * Visit function
     * @param n Nebula spot instance
     */
    @Override
    public void gotANebula(Nebula n) {
        isPullable = true;
    }

    /**
     * Visit function
     * @param b Blackhole spot instance
     */
    @Override
    public void gotABlackhole(BlackHole b) {
        isPullable = false;
    }

    /**
     * Visit function
     * @param p Planet spot instance
     */
    @Override
    public void gotAPlanet(Planet p) {
        isPullable = true;
    }

    /**
     * Visit function
     * @param s Star spot instance
     */
    @Override
    public void gotAStar(Star s) {
        isPullable = true;
    }

    /**
     * Gets the pullability of last visited spot
     * @return  true if pullable
     */
    public boolean canBePulled() {
        return isPullable;
    }
}
