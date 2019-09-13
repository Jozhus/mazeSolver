package Maze;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class mazeTester {
    public static void main(String[] args) throws FileNotFoundException {
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Enter maze file name and path: ");
        String filename = scan.nextLine();*/
        final String filename = "src/Maze/maze.txt"; //For ease of testing

        Maze maze = new Maze(filename);
        mazeSolver solver = new mazeSolver(maze);

        System.out.println(maze);

        if (solver.traverse()) System.out.println("The maze was successfully traversed!");
        else System.out.println("There is no possible path.");

        System.out.println(maze);
    }
}
