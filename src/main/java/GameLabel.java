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
    int position;
    JLabel label = new JLabel();
    int i;

    // There should be a function to update win condition
    public GameLabel(int position, Window window) {

        this.position = position;
        label.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                int player = window.getCurrentPlayer();
                System.out.println(labelValue);
                System.out.println(player);
                if (labelValue == 0) {
                    if (player == 1) {
                        labelValue = 1;
                        System.out.println("cross");
                        label.setIcon(cross);
                    } else if (player == 2) {
                        System.out.println("circle");
                        labelValue = 2;
                        label.setIcon(ring);
                    }
                window.alternatePlayer();
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

    // For win condition
    public int getPosition()   {
        return position;
    }

    public JLabel getLabel() {
        return label;
    }
}
