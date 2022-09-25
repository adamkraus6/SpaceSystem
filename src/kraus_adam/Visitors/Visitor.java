package kraus_adam.Visitors;

import kraus_adam.SpotTypes.*;

/**
 * Visitor interface
 */
public interface Visitor {
    /**
     * Visit function
     * @param b Blackhole instance
     */
    void gotABlackhole(BlackHole b);
    /**
     * Visit function
     * @param n Nebula instance
     */

    void gotANebula(Nebula n);
    /**
     * Visit function
     * @param p Planet instance
     */

    void gotAPlanet(Planet p);
    /**
     * Visit function
     * @param s Star instance
     */

    void gotAStar(Star s);
    /**
     * Visit function
     * @param e Empty instance
     */

    void gotAnEmpty(Empty e);
}
