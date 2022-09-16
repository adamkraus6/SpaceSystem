package kraus_adam.Visitors;

import kraus_adam.SpotTypes.*;

public interface Visitor {
    void gotAnEmpty(Empty e);
    void gotANebula(Nebula n);
    void gotABlackhole(Blackhole b);
    void gotAPlanet(Planet p);
    void gotAStar(Star s);
}
