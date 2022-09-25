package kraus_adam.Visitors;

import kraus_adam.SpotTypes.*;

public class isPullable implements Visitor {
    private boolean isPullable = false;
    @Override
    public void gotAnEmpty(Empty e) {
        isPullable = false;
    }

    @Override
    public void gotANebula(Nebula n) {
        isPullable = true;
    }

    @Override
    public void gotABlackhole(BlackHole b) {
        isPullable = false;
    }

    @Override
    public void gotAPlanet(Planet p) {
        isPullable = true;
    }

    @Override
    public void gotAStar(Star s) {
        isPullable = true;
    }

    public boolean canBePulled() {
        return isPullable;
    }
}
