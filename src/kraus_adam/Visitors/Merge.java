package kraus_adam.Visitors;

import kraus_adam.Grid;
import kraus_adam.SpotTypes.*;

public class Merge implements Visitor {
    private Grid grid;
    private int currentRow, currentCol;
    public Merge(Grid grid) {
        this.grid = grid;
    }

    @Override
    public void gotABlackhole(BlackHole b) {
        // not used
    }

    @Override
    public void gotANebula(Nebula n) {
        grid.setSpot(new Star(), currentRow, currentCol);
    }

    @Override
    public void gotAPlanet(Planet p) {
        // not used
    }

    @Override
    public void gotAStar(Star s) {
        // not used
    }

    @Override
    public void gotAnEmpty(Empty e) {
        // not used
    }

    public void setCurrentLocation(int row, int col) {
        currentRow = row;
        currentCol = col;
    }
}
