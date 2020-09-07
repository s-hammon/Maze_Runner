package maze;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Point entr = new Point(0, 3);
        Point exit = new Point(6, 0);
        Maze maze = new Maze(entr, exit);
        maze.set();
        System.out.print(maze.toString());
    }
}
