import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameLabel {

    /**
     * Represents a square on the board. Holds either X or O, and holds a number where it is positioned.
     * There should be 9 objects of this class. Contains two ints, position and value. X represents 1 and O represents 2.
     * 0 is empty.
     */


    ImageIcon ring = new ImageIcon("bin/o.png"); // importera o bild
    ImageIcon cross = new ImageIcon("bin/xx.png"); // importera x bild
    ImageIcon empty = new ImageIcon("bin/white.jpg");

    JLabel[] board = new JLabel[9];
    int i;
    public GameLabel() {

        for(i = 0; i < 9; i++) {

                board[i] = new JLabel(empty);
                board[i].addMouseListener(new MouseListener() {
                    int id = i;
                    boolean isEmpty = true;
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if (isEmpty) {
                            // GetPlayer ID int
                            int player = 1;
                            if (player == 1) {
                                board[id].setIcon(ring);
                            } else {
                                board[id].setIcon(cross);
                            }
                            isEmpty = false;
                        } // else Cant click here messege
                    }

                    @Override
                    public void mousePressed(MouseEvent e) { }

                    @Override
                    public void mouseReleased(MouseEvent e) { }

                    @Override
                    public void mouseEntered(MouseEvent e) { }

                    @Override
                    public void mouseExited(MouseEvent e) { }
                });
            }

    }

}
