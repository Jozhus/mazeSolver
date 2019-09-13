package Maze;

public interface MazeADT {

    public void tryPosition(int r, int c);

    public void markPath(int r, int c);

    public boolean validPos(int r, int c);

    public int getRows();

    public int getCols();

    public String toString();
}
