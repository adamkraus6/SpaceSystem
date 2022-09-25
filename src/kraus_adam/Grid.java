package kraus_adam;

import kraus_adam.SpotTypes.*;
import kraus_adam.Visitors.Visitor;

/**
 * Grid class, collection of spots
 */
public class Grid {
    /**
     * Grid width
     */
    public static final int WIDTH = 7;
    /**
     * Grid height
     */
    public static final int HEIGHT = 5;
    /**
     * 2D array of spots
     */
    private Spot[][] grid;

    /**
     * Grid constructor
     */
    public Grid() {
        grid = new Spot[HEIGHT][WIDTH];

        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                grid[i][j] = new Empty();
            }
        }
    }

    /**
     * Sets the default grid
     */
    public void setDefault() {
        int[][] def = { {2, 0, 3, 1, 0, 0, 0},
                {0, 3, 2, 1, 2, 0, 2},
                {1, 0, 4, 2, 1, 0, 4},
                {1, 2, 3, 2, 3, 0, 4},
                {4, 2, 3, 0, 2, 0, 0} };

        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                switch (def[i][j]) {
                    case 0 -> grid[i][j] = new Empty();
                    case 1 -> grid[i][j] = new Planet();
                    case 2 -> grid[i][j] = new Star();
                    case 3 -> grid[i][j] = new Nebula();
                    case 4 -> grid[i][j] = new BlackHole();
                }
            }
        }
    }

    /**
     * Gets a spot at a given location
     * @param row   row in grid
     * @param col   column in grid
     * @return  Spot at location
     */
    public Spot getSpot(int row, int col) {
        return grid[row][col];
    }

    /**
     * Sets a spot at a given location
     * @param spot  Spot to put at location
     * @param row   row in grid
     * @param col   column in grid
     */
    public void setSpot(Spot spot, int row, int col) {
        grid[row][col] = spot;
    }

    /**
     * Visit function cascaded to spots
     * @param v Generic visitor
     */
    public void accept(Visitor v) {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                grid[i][j].accept(v);
            }
        }
    }

    /**
     * Visit function at a specific location
     * @param v     Generic visitor
     * @param row   row in grid
     * @param col   column in grid
     */
    public void acceptRowCol(Visitor v, int row, int col) {
        grid[row][col].accept(v);
    }

    /**
     * Prints grid of spots
     * @return  Formatted string
     */
    public String toString() {
        StringBuilder string = new StringBuilder();

        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                string.append(grid[i][j]);
            }
            string.append("\n");
        }

        return string.toString();
    }
}
