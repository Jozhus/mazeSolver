package Maze;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Maze implements MazeADT {

    private static final int TRIED = 2;
    private static final int PATH = 3;

    private int numberRows, numberCols;
    private int[][] grid;

    public Maze(String filename) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(filename));
        numberRows = scan.nextInt();
        numberCols = scan.nextInt();

        grid = new int[numberRows][numberCols];
        for (int i = 0; i < numberRows; i++) {
            for (int j = 0; j < numberCols; j++) {
                grid[i][j] = scan.nextInt();
            }
        }
    }

    @Override
    public void tryPosition(int r, int c) {
        grid[r][c] = TRIED;
    }

    @Override
    public void markPath(int r, int c) {
        grid[r][c] = PATH;
    }

    @Override
    public boolean validPos(int r, int c) {
        boolean result = false;

        if (r >= 0 && r < numberRows && c >= 0 && c < numberCols) {
            if (grid[r][c] == 1) {
                result = true;
            }
        }

        return result;
    }

    @Override
    public int getRows() {
        return numberRows;
    }

    @Override
    public int getCols() {
        return numberCols;
    }

    @Override
    public String toString() {
        String result = "\n";

        for (int r = 0; r < numberRows; r++) {
            for (int c = 0; c < numberCols; c++) {
                result += grid[r][c] + "";
            }
            result += "\n";
        }

        return result;
    }
}
