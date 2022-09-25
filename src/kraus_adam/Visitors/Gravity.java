package kraus_adam.Visitors;

import kraus_adam.Grid;
import kraus_adam.SpotTypes.*;

/**
 * Gravity visitor class to consume and move pullable spots towards blackholes
 */
public class Gravity implements Visitor {
    /**
     * Grid instance
     */
    private Grid grid;
    /**
     * Current row in grid
     */
    private int currentRow;
    /**
     * Current column in grid
     */
    private int currentCol;

    /**
     * Gravity constructor
     * @param grid  Grid instance
     */
    public Gravity(Grid grid) {
        this.grid = grid;
    }

    /**
     * Visit function
     * @param b Blackhole instance
     */
    @Override
    public void gotABlackhole(BlackHole b) {
        isPullable pullCheck = new isPullable();
        // loop through adjacent spots
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                // if not "middle" (self)
                if (i != 0 || j != 0) {
                    int adjRow = currentRow + i, adjCol = currentCol + j;
                    // if valid adjacent row and col
                    if (adjRow >= 0 && adjRow < Grid.HEIGHT && adjCol >= 0 && adjCol < Grid.WIDTH) {
                        // GRADING: NESTED
                        grid.acceptRowCol(pullCheck, adjRow, adjCol);
                        if (pullCheck.canBePulled()) {
                            grid.setSpot(new Empty(), adjRow, adjCol);
                        }
                    }

                    int outerRow = adjRow + i, outerCol = adjCol + j;
                    // if valid outer row and col
                    if (outerRow >= 0 && outerRow < Grid.HEIGHT && outerCol >= 0 && outerCol < Grid.WIDTH) {
                        grid.acceptRowCol(pullCheck, outerRow, outerCol);
                        if (pullCheck.canBePulled()) {
                            // move outer spot to adjacent, set outer to empty
                            Spot outer = grid.getSpot(outerRow, outerCol);
                            grid.setSpot(outer, adjRow, adjCol);
                            grid.setSpot(new Empty(), outerRow, outerCol);
                        }
                    }
                }
            }
        }
    }

    /**
     * Visit function - not used
     * @param n Nebula spot instance
     */
    @Override
    public void gotANebula(Nebula n) {
        // not used
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
