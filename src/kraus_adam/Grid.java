package kraus_adam;

import kraus_adam.SpotTypes.*;
import kraus_adam.Visitors.Visitor;

public class Grid {
    public static final int WIDTH = 7;
    public static final int HEIGHT = 5;
    private Spot[][] grid;

    public Grid() {
        grid = new Spot[HEIGHT][WIDTH];

        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                grid[i][j] = new Empty();
            }
        }
    }

    public void setDefault() {
        int[][] def = { {2, 0, 3, 1, 0, 0, 0},
                {0, 3, 2, 1, 2, 0, 2},
                {1, 0, 4, 2, 1, 0, 4},
                {1, 2, 3, 2, 3, 0, 4},
                {4, 2, 3, 0, 2, 0, 0} };

        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                switch (def[i][j]) {
                    case 0:
                        grid[i][j] = new Empty();
                        break;
                    case 1:
                        grid[i][j] = new Planet();
                        break;
                    case 2:
                        grid[i][j] = new Star();
                        break;
                    case 3:
                        grid[i][j] = new Nebula();
                        break;
                    case 4:
                        grid[i][j] = new BlackHole();
                        break;
                }
            }
        }
    }

    public void setSpot(Spot spot, int row, int col) {
        grid[row][col] = spot;
    }

    public void accept(Visitor v) {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                grid[i][j].accept(v);
            }
        }
    }

    public void acceptRowCol(Visitor v, int row, int col) {
        grid[row][col].accept(v);
    }

    public String toString() {
        String string = "";

        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                string += grid[i][j];
            }
            string += "\n";
        }

        return string;
    }
}
