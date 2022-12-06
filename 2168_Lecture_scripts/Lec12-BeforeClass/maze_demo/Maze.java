package maze_demo;

import java.awt.Color;

public class Maze {

    static final Color PATH = Color.GREEN;          //PATH COLOR    
    static final Color BACKGROUND = Color.white;    //initial non-barrier
    static final Color BARRIER = Color.RED;         //initial barrier
    static final Color NON_BACKGROUND = BARRIER;
    static final Color DEAD_END = Color.BLACK;     
    static final Color TEMPORARY = DEAD_END;        //tried & dead end (not work)


    private final TwoDimGrid maze;

    public Maze(TwoDimGrid m) {
        maze = m;
    }

    public boolean findMazePath() {
        return findMazePath(0, 0);
    }

    //start from (x,y), try to find a path to exit (nCols - 1, nRows - 1)
    private boolean findMazePath(int x, int y) {

        return false;
    }
}