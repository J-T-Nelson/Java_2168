package maze_demo;

//import the libraries necessary for the GUI interface
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class TwoDimGrid extends JPanel {

    // Data Fields
    private static final int PREFERED_BUTTON_SIZE = 60;
    private static final int DEFAULT_COLS = 20;
    private static final int DEFAULT_ROWS = 20;
    
    private final JButton[][] theGrid;
    private final int nRows;
    private final int nCols;

    // Constructors
    public TwoDimGrid(int nRows, int nCols) {
        this.nRows = nRows;
        this.nCols = nCols;
        setPreferredSize(new Dimension(nCols * PREFERED_BUTTON_SIZE,
                nRows * PREFERED_BUTTON_SIZE));
        setLayout(new GridLayout(nRows, nCols));
        theGrid = new JButton[nCols][];
        for (int i = 0; i != nCols; ++i) {  //i: column
            theGrid[i] = new JButton[nRows];  
            for (int j = 0; j != nRows; ++j) { //j: row
                theGrid[i][j] = new JButton(i + ", " + j);
                theGrid[i][j].setBackground(Maze.BACKGROUND);
                theGrid[i][j].addActionListener(new ToggleColor(theGrid[i][j]));
            }
        }

        // Add the buttons to the button panel
        for (int j = 0; j != nRows; ++j) {
            for (int i = 0; i != nCols; ++i) {
                add(theGrid[i][j]);
            }
        }
    }

    //getter
    public int getNCols() {
        return nCols;
    }

    public int getNRows() {
        return nRows;
    }

    public Color getColor(int x, int y) {
        return theGrid[x][y].getBackground();
    }

    public void recolor(int x, int y, Color newColor) {
        theGrid[x][y].setBackground(newColor);
        repaint();
    }

    public void recolor(char[][] bitMap, Color aColor) {
        for (int i = 0; i != bitMap.length; ++i) {
            for (int j = 0; j != bitMap[i].length; ++j) {
                if (bitMap[i][j] == '1') {
                    theGrid[j][i].setBackground(aColor);
                }
            }
        }
    }

    // Inner class
    private class ToggleColor
            implements ActionListener {
        // DataField
        private final JButton me;

        // Constructor
        public ToggleColor(JButton theButton) {
            me = theButton;
        }

        // Methods
        @Override
        public void actionPerformed(ActionEvent e) {
            if (me.getBackground().equals(Maze.BACKGROUND)) {
                me.setBackground(Maze.NON_BACKGROUND);
            } else {
                me.setBackground(Maze.BACKGROUND);
            }
        }   
    }
}
