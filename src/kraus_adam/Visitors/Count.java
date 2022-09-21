package kraus_adam.Visitors;

import kraus_adam.SpotTypes.*;

public class Count implements Visitor {
    int numEmpty = 0, numNebula = 0, numBlackhole = 0, numPlanet = 0, numStar = 0, numPullable = 0;

    public int getNumBlackhole() {
        return numBlackhole;
    }

    public int getNumEmpty() {
        return numEmpty;
    }

    public int getNumNebula() {
        return numNebula;
    }

    public int getNumPlanet() {
        return numPlanet;
    }

    public int getNumPullable() {
        return numPullable;
    }

    public int getNumStar() {
        return numStar;
    }

    @Override
    public void gotABlackhole(BlackHole b) {
        numBlackhole++;
    }

    @Override
    public void gotANebula(Nebula n) {
        numNebula++;
        numPullable++;
    }

    @Override
    public void gotAPlanet(Planet p) {
        numPlanet++;
        numPullable++;
    }

    @Override
    public void gotAStar(Star s) {
        numStar++;
        numPullable++;
    }

    @Override
    public void gotAnEmpty(Empty e) {
        numEmpty++;
    }
}
