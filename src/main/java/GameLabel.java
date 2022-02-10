import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

    /**
     *
     * Represents a square on the board. Holds either X or O, and holds a number where it is positioned.
     * There should be 9 objects of this class. Contains two ints, position and value. X represents 1 and O represents 2.
     * 0 is empty.
     * @author Oscar
     */
public class GameLabel {



    ImageIcon ring = new ImageIcon("bin/ring.gif"); // importera o bild
    ImageIcon cross = new ImageIcon("bin/cross.png"); // importera x bild

    int labelValue = 0;
    JLabel label = new JLabel();
    int i;

    // There should be a function to update win condition
    public GameLabel(int position, Window window, WinCondition winCondition) {


        label.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                int player = window.getCurrentPlayer();
                if (labelValue == 0) {
                    if (player == 1) {
                        labelValue = 1;
                        label.setIcon(cross);
                    } else if (player == 2) {
                        labelValue = 2;
                        label.setIcon(ring);
                    }
                window.alternatePlayer();
                winCondition.checkGameWon(1, 2);
                } // else dont do anything
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }

    // For win condition
    public int getLabelValue() {
        return labelValue;
    }

    public JLabel getLabel() {
        return label;
    }
}
