package kraus_adam.Visitors;

import kraus_adam.ColorText;
import kraus_adam.SpotTypes.*;

public class ColorVisit implements Visitor {
    private int areaToChange;
    ColorText.Color toChangeTo;
    public ColorVisit(int areaToChange, ColorText.Color toChangeTo) {
        this.areaToChange = areaToChange;
        this.toChangeTo = toChangeTo;
    }
    @Override
    public void gotAnEmpty(Empty e) {
        if(areaToChange == 0) {
            e.setColor(toChangeTo);
        }
    }

    @Override
    public void gotANebula(Nebula n) {
        if(areaToChange == 1) {
            n.setColor(toChangeTo);
        }
    }

    @Override
    public void gotABlackhole(BlackHole b) {
        if(areaToChange == 2) {
            b.setColor(toChangeTo);
        }
    }

    @Override
    public void gotAPlanet(Planet p) {
        if(areaToChange == 1) {
            p.setColor(toChangeTo);
        }
    }

    @Override
    public void gotAStar(Star s) {
        if(areaToChange == 1) {
            s.setColor(toChangeTo);
        }
    }
}
