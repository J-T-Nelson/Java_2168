package maze_demo;

//import the libraries for the GUI demo
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MazeDemo extends JFrame {

    // data field
    private TwoDimGrid theGrid; // a 2-D grid of buttons

    public static void main(String[] args) {
        String reply = JOptionPane.showInputDialog("Enter number of rows");
        int nRows = Integer.parseInt(reply); //"6"
        reply = JOptionPane.showInputDialog("Enter number of columns"); // "4"
        int nCols = Integer.parseInt(reply);

        TwoDimGrid aGrid = new TwoDimGrid(nRows, nCols);
        SwingUtilities.invokeLater(() -> new MazeDemo(aGrid)); //
    }

    private MazeDemo(TwoDimGrid aGrid) {
        theGrid = aGrid;
        getContentPane().add(aGrid, BorderLayout.CENTER);
        JTextArea instruct = new JTextArea(2, 20);
        instruct.setText("Toggle a button to change its color"
                + "\nPress SOLVE when ready");
        getContentPane().add(instruct, BorderLayout.NORTH);
        JButton solveButton = new JButton("SOLVE");
        solveButton.addActionListener(e -> solve());
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(solveButton);
        getContentPane().add(bottomPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
    }
  
    public final void solve() {
        Maze m = new Maze(theGrid);
        boolean found = m.findMazePath();
        if (found) {
            JOptionPane.showMessageDialog(null, "Success - reset maze and try again");
        } else {
            JOptionPane.showMessageDialog(null, "No path - reset maze and try again");
        }
    }
}
