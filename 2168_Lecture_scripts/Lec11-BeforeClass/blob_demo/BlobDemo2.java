package blob_demo;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * Program to illustrate counting cells in a blob
 *
 * @author Koffman & Wolfgang & Cindy
 *
 */
public class BlobDemo2 extends JFrame {

    // data field
    /**
     * a 2-D grid of buttons
     */
    private TwoDimGrid theGrid;

    /**
     * Reads data file and defines array bitMap to match data file
     *
     * @param args - Optional input file containing Blob
     */
    public static void main(String[] args) {

        String reply = JOptionPane.showInputDialog("Enter number of rows");
        int nRows = Integer.parseInt(reply);
        reply = JOptionPane.showInputDialog("Enter number of columns");
        int nCols = Integer.parseInt(reply);
        TwoDimGrid aGrid = new TwoDimGrid(nRows, nCols);
        SwingUtilities.invokeLater(() -> new BlobDemo2(aGrid));
    }

    /**
     * Builds the GUI
     *
     * @param aGrid - The TwoDimGrid that contains the blob
     */
    private BlobDemo2(TwoDimGrid aGrid) {
        theGrid = aGrid;
        getContentPane().add(aGrid, BorderLayout.CENTER);
        JTextArea instruct = new JTextArea(2, 10);
        instruct.setText("Toggle a button to change its color" + "\nPress SOLVE when ready");
        getContentPane().add(instruct, BorderLayout.NORTH);
        JPanel bottomPanel = new JPanel();
        JButton solveButton = new JButton("SOLVE");
        solveButton.addActionListener(e -> solve());
        JButton resetButton = new JButton("RESET");
        resetButton.addActionListener(e -> (new Blob2(theGrid)).restore());
        bottomPanel.add(solveButton);
        bottomPanel.add(resetButton);
        getContentPane().add(bottomPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    /**
     * Respond to pressing SOLVE button
     */
    public final void solve() {
        String reply = JOptionPane.showInputDialog("Enter x coordinate of blob cell");
        int x = Integer.parseInt(reply);
        reply = JOptionPane.showInputDialog("Enter y coordinate of blob cell");
        int y = Integer.parseInt(reply);
        Blob2 aBlob = new Blob2(theGrid);
        JOptionPane.showMessageDialog(null, "For blob at (" + x + "," + y + ") " + "\ncount is "
                + aBlob.countCells(x, y) + "\nReset blob and try again");
    }
}
