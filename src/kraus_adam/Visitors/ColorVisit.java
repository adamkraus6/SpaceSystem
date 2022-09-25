package kraus_adam.Visitors;

import kraus_adam.ColorText;
import kraus_adam.SpotTypes.*;

/**
 * ColorVisit visitor class to change color of certain spot types
 */
public class ColorVisit implements Visitor {
    /**
     * Area type to change color of
     */
    private int areaToChange;
    /**
     * Color to change area to
     */
    private ColorText.Color toChangeTo;

    /**
     * ColorVisit constructor
     * @param areaToChange  Area type to change color of
     * @param toChangeTo    Color to change area to
     */
    public ColorVisit(int areaToChange, ColorText.Color toChangeTo) {
        this.areaToChange = areaToChange;
        this.toChangeTo = toChangeTo;
    }

    /**
     * Visit function
     * @param e Empty spot instance
     */
    @Override
    public void gotAnEmpty(Empty e) {
        if(areaToChange == 0) {
            e.setColor(toChangeTo);
        }
    }

    /**
     * Visit function
     * @param n Nebula spot instance
     */
    @Override
    public void gotANebula(Nebula n) {
        if(areaToChange == 1) {
            n.setColor(toChangeTo);
        }
    }

    /**
     * Visit function
     * @param b Blackhole spot instance
     */
    @Override
    public void gotABlackhole(BlackHole b) {
        if(areaToChange == 2) {
            b.setColor(toChangeTo);
        }
    }

    /**
     * Visit function
     * @param p Planet spot instance
     */
    @Override
    public void gotAPlanet(Planet p) {
        if(areaToChange == 1) {
            p.setColor(toChangeTo);
        }
    }

    /**
     * Visit function
     * @param s Star spot instance
     */
    @Override
    public void gotAStar(Star s) {
        if(areaToChange == 1) {
            s.setColor(toChangeTo);
        }
    }
}
