package kraus_adam.Visitors;

import kraus_adam.SpotTypes.*;

/**
 * Count visitor class to count spot types
 */
public class Count implements Visitor {
    /**
     * Number of empty spots counted
     */
    int numEmpty = 0;
    /**
     * Number of nebula spots counted
     */
    int numNebula = 0;
    /**
     * Number of blackhole spots counted
     */
    int numBlackhole = 0;
    /**
     * Number of planet spots counted
     */
    int numPlanet = 0;
    /**
     * Number of star spots counted
     */
    int numStar = 0;
    /**
     * Number of pullable spots counted
     */
    int numPullable = 0;

    /**
     * Get number of blackholes counter
     * @return  Number of blackholes
     */
    public int getNumBlackhole() {
        return numBlackhole;
    }

    /**
     * Get number of empty counted
     * @return  Number of empty
     */
    public int getNumEmpty() {
        return numEmpty;
    }

    /**
     * Get number of nebulas counted
     * @return  Number of nebulas
     */
    public int getNumNebula() {
        return numNebula;
    }

    /**
     * Get number of planets counted
     * @return  Number of planets
     */
    public int getNumPlanet() {
        return numPlanet;
    }

    /**
     * Get number of pullable counted
     * @return  Number of pullable
     */
    public int getNumPullable() {
        return numPullable;
    }

    /**
     * Get number of stars counted
     * @return  Number of stars
     */
    public int getNumStar() {
        return numStar;
    }

    /**
     * Visit function
     * @param b Blackhole instance
     */
    @Override
    public void gotABlackhole(BlackHole b) {
        numBlackhole++;
    }

    /**
     * Visit function
     * @param n Nebula instance
     */
    @Override
    public void gotANebula(Nebula n) {
        numNebula++;
        numPullable++;
    }

    /**
     * Visit function
     * @param p Planet instance
     */
    @Override
    public void gotAPlanet(Planet p) {
        numPlanet++;
        numPullable++;
    }

    /**
     * Visit function
     * @param s Star instance
     */
    @Override
    public void gotAStar(Star s) {
        numStar++;
        numPullable++;
    }

    /**
     * Visit function
     * @param e Empty instance
     */
    @Override
    public void gotAnEmpty(Empty e) {
        numEmpty++;
    }
}
