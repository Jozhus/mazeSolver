package Maze;

import java.util.Deque;
import java.util.LinkedList;

/*
mazeSolver solves an n, m maze where the start position is the
top left cell (0, 0) and the end is the bottom right cell (n, m)
*/

public class mazeSolver {

    private Maze maze;

    public mazeSolver(Maze maze)
    {
        this.maze = maze;
    }

    public boolean traverse() {
        boolean done = false;
        int r, c;
        Position pos = new Position();
        Deque<Position> stack = new LinkedList<Position>();
        stack.push(pos);

        while (!done && !stack.isEmpty()) {
            pos = stack.pop();
            maze.tryPosition(pos.getX(), pos.getY());
            if (pos.getX() == maze.getRows() - 1 && pos.getY() == maze.getCols() - 1) {
                done = true;
            }

                push_new_pos(pos.getX() - 1, pos.getY(), stack);
                push_new_pos(pos.getX() + 1, pos.getY(), stack);
                push_new_pos(pos.getX(), pos.getY() - 1, stack);
                push_new_pos(pos.getX(), pos.getY() + 1, stack);

        }

        return done;
    }

    private void push_new_pos(int x, int y, Deque<Position> stack) {
        Position npos = new Position(x, y);
        if (maze.validPos(x, y)) stack.push(npos);
    }
}
