package kraus_adam.Visitors;

import kraus_adam.Grid;
import kraus_adam.SpotTypes.*;

/**
 * Merge visitor class to change nebulas into stars
 */
public class Merge implements Visitor {
    /**
     * Grid instance
     */
    private Grid grid;
    /**
     * Current row in grod
     */
    private int currentRow;
    /**
     * Current column in grid
     */
    private int currentCol;

    /**
     * Merge constructor
     * @param grid  Grid instance
     */
    public Merge(Grid grid) {
        this.grid = grid;
    }

    /**
     * Visit function - not used
     * @param b Blackhole instance
     */
    @Override
    public void gotABlackhole(BlackHole b) {
        // not used
    }

    /**
     * Visit function
     * @param n Nebula instance
     */
    @Override
    public void gotANebula(Nebula n) {
        grid.setSpot(new Star(), currentRow, currentCol);
    }

    /**
     * Visit function - not used
     * @param p Planet spot instance
     */
    @Override
    public void gotAPlanet(Planet p) {
        // not used
    }

    /**
     * Visit function - not used
     * @param s Star spot instance
     */
    @Override
    public void gotAStar(Star s) {
        // not used
    }

    /**
     * Visit function - not used
     * @param e Empty spot instance
     */
    @Override
    public void gotAnEmpty(Empty e) {
        // not used
    }

    /**
     * Sets current location in grid
     * @param row   current row
     * @param col   current column
     */
    public void setCurrentLocation(int row, int col) {
        currentRow = row;
        currentCol = col;
    }
}
