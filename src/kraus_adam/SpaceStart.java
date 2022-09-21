package kraus_adam;

import kraus_adam.Exceptions.InvalidOptionException;
import kraus_adam.Exceptions.LocationOutOfRangeException;
import kraus_adam.SpotTypes.*;
import kraus_adam.Visitors.Count;
import kraus_adam.Visitors.ColorVisit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SpaceStart {

    static Scanner cin;

    public static void main(String[] args) {
        System.out.println();
        Grid grid = new Grid();
        cin = new Scanner(System.in);
        String menu = """
                1) Set Area
                2) Make Default Grid
                3) Count Types
                4) Set Type Color
                5) Merge Nebula into Star
                6) Blackhole Gravitational Pull
                0) Quit
                """;
        int input = -1, areaType, col, row, colorSelection;
        while (input != 0) {
            try {
                System.out.println("\n" + grid);
                System.out.println(menu);
                System.out.print("Choice:> ");

                input = cin.nextInt();
                switch (input) {
                    case 1:
                        System.out.println("Input area type 0) Empty 1) Planet 2) Star 3) Nebula 4) Black hole:> ");
                        areaType = cin.nextInt();
                        if (areaType < 0 || areaType > 4) {
                            throw new InvalidOptionException();
                        }
                        System.out.println("Input location (x y):> ");
                        col = cin.nextInt();
                        row = cin.nextInt();
                        if (row < 0 || row > 4 || col < 0 || col > 6) {
                            throw new LocationOutOfRangeException();
                        }

                        Spot spot = switch (areaType) {
                            default -> new Empty();
                            case 1 -> new Planet();
                            case 2 -> new Star();
                            case 3 -> new Nebula();
                            case 4 -> new BlackHole();
                        };
                        grid.setSpot(spot, row, col);
                        break;
                    case 2:
                        grid.setDefault();
                        break;
                    case 3:
                        Count count = new Count();
                        // GRADING: COUNT
                        grid.accept(count);
                        System.out.println("empty: " + count.getNumEmpty() +
                                "\nplanets: " + count.getNumPlanet() +
                                "\nstars: " + count.getNumStar() +
                                "\nnebulas: " + count.getNumNebula() +
                                "\nblack holes: " + count.getNumBlackhole());
                        break;
                    case 4:
                        System.out.println("Input area type 0) empty 1) pullable 2) black hole:> ");
                        areaType = cin.nextInt();
                        if (areaType < 0 || areaType > 2) {
                            throw new InvalidOptionException();
                        }
                        System.out.println("Input color 0) red 1) yellow 2) blue 3) green 4) black:> ");
                        colorSelection = cin.nextInt();
                        if (colorSelection < 0 || colorSelection > 4) {
                            throw new InvalidOptionException();
                        }
                        ColorText.Color color = switch (colorSelection) {
                            case 0 -> ColorText.Color.RED;
                            case 1 -> ColorText.Color.YELLOW;
                            case 2 -> ColorText.Color.BLUE;
                            case 3 -> ColorText.Color.GREEN;
                            default -> ColorText.Color.BLACK;
                        };
                        ColorVisit colorVisit = new ColorVisit(areaType, color);
                        // GRADING: COLOR
                        grid.accept(colorVisit);
                        break;
                    case 5:
                        // todo
                        break;
                    case 6:
                        // todo
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Unknown menu option");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please input an integer");
                cin.nextLine();
            } catch (InvalidOptionException e) {
                System.out.println("Invalid selection option");
            } catch (LocationOutOfRangeException e) {
                System.out.println("Location is out of range");
            }

        }

    }

}
