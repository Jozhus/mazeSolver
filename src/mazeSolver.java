import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class mazeSolver {
    public static void main(String[] args) {
        try {
            solve();
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }

    private static void solve() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("maze.txt"));
        int numberRows = scan.nextInt();
        int numberCols = scan.nextInt();

        int [][] grid = new int[numberRows][numberCols];

        for (int i = 0; i < numberRows; i++) {
            for (int j = 0; i < numberCols; j++) {
                int readin = scan.nextInt();
                grid[i][j] = readin;
                System.out.println(readin);
            }
        }

    }
}
