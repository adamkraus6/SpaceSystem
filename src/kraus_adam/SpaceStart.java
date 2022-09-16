package kraus_adam;

import kraus_adam.Exceptions.InvalidOptionException;
import kraus_adam.Exceptions.LocationOutOfRangeException;
import kraus_adam.SpotTypes.*;
import kraus_adam.Visitors.CountTypes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SpaceStart {

    static Scanner cin;
    public static void main(String[] args) {
        System.out.println();
        Space grid = new Space();
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
        int input = -1;
        while(input != 0) {
            try {
                System.out.println("\n"+grid);
                System.out.println(menu);
                System.out.print("Choice:> ");

                input = cin.nextInt();
                switch (input) {
                    case 1:
                        System.out.println("Input area type 0) Empty 1) Planet 2) Star 3) Nebula 4) Black hole:> ");
                        int areaType = cin.nextInt();
                        if(areaType < 0 || areaType > 4) {
                            throw new InvalidOptionException();
                        }
                        System.out.println("Input location (x y):> ");
                        int col = cin.nextInt();
                        int row = cin.nextInt();
                        if(row < 0 || row > 4 || col < 0 || col > 6) {
                            throw new LocationOutOfRangeException();
                        }

                        Spot spot;
                        switch(areaType) {
                            default:
                            case 0:
                                spot = new Empty();
                                break;
                            case 1:
                                spot = new Planet();
                                break;
                            case 2:
                                spot = new Star();
                                break;
                            case 3:
                                spot = new Nebula();
                                break;
                            case 4:
                                spot = new Blackhole();
                                break;
                        }
                        grid.setSpot(spot, row, col);
                        break;
                    case 2:
                        grid.setDefault();
                        break;
                    case 3:
                        CountTypes visitor = new CountTypes();
                        grid.accept(visitor);
                        System.out.println(visitor);
                        break;
                    case 4:
                        //todo
                        break;
                    case 5:
                        //todo
                        break;
                    case 6:
                        //todo
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Unknown menu option");
                        break;
                }
            } catch(InputMismatchException e) {
                System.out.println("Please input an integer");
                cin.nextLine();
            } catch(InvalidOptionException e) {
                System.out.println("Invalid selection option");
            } catch(LocationOutOfRangeException e) {
                System.out.println("Location is out of range");
            }

        }

    }

}
