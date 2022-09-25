package kraus_adam.Visitors;

import kraus_adam.SpotTypes.*;

public interface Visitor {
    void gotABlackhole(BlackHole b);

    void gotANebula(Nebula n);

    void gotAPlanet(Planet p);

    void gotAStar(Star s);

    void gotAnEmpty(Empty e);
}
