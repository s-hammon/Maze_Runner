package maze;

import java.awt.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Maze {
    private final Point entr;
    private final Point exit;

    private Cell[][] maze;

    public Maze(Point entr, Point exit) {
        this.entr = entr;
        this.exit = exit;
        maze = new Cell[10][10];
    }

    public void set() {
        maze[(int)entr.getY()][(int)entr.getX()] = Cell.PASS;
        maze[(int)exit.getY()][(int)exit.getX()] = Cell.PASS;

        for (int i = 0; i < maze.length; i++) {
            //north wall
            if (maze[0][i] == null)
                maze[0][i] = Cell.WALL;
            //south wall
            if (maze[maze.length - 1][i] == null)
                maze[maze.length - 1][i] = Cell.WALL;
            //west wall
            if (maze[i][0] == null)
                maze[i][0] = Cell.WALL;
            //east wall
            if (maze[i][maze.length - 1] == null)
                maze[i][maze.length - 1] = Cell.WALL;
        }

        for (int i = 1; i < maze.length - 1; i++) {
            for (int j = 1; j < maze.length - 1; j++) {
                maze[i][j] = Cell.PASS;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Cell[] cells : maze) {
            String row = Arrays.stream(cells).map(Cell::getCell)
                    .collect(Collectors.joining(""));
            sb.append(row).append("\n");
        }

        return sb.toString();
    }
}
