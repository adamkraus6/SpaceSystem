package kraus_adam.Visitors;

import kraus_adam.SpotTypes.*;

public class CountTypes implements Visitor {
    int numEmpty = 0, numNebula = 0, numBlackhole = 0, numPlanet = 0, numStar = 0;
    @Override
    public void gotAnEmpty(Empty e) {
        numEmpty++;
    }

    @Override
    public void gotANebula(Nebula n) {
        numNebula++;
    }

    @Override
    public void gotABlackhole(Blackhole b) {
        numBlackhole++;
    }

    @Override
    public void gotAPlanet(Planet p) {
        numPlanet++;
    }

    @Override
    public void gotAStar(Star s) {
        numStar++;
    }

    public String toString() {
        return "empty: " + numEmpty +
                "\nplanets: " + numPlanet +
                "\nstars: " + numStar +
                "\nnebulas: " + numNebula +
                "\nblack holes: " +numBlackhole;
    }
}
