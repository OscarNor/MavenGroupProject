import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Resetter {

    /**
    * Empties the board and allows for a new game to be played. Contains a button to manually reset the whole game.
     * @author Hampus
    */
    private Window window;
    private JButton resetButton;

    public Resetter(Window window)
    {
        this.window = window;
        resetButton = window.getResetGame();
        resetButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                hardReset();
            }
        });
    }

    private void hardReset()
    {
        window.resetBoard();
        window.resetPlayers();
    }

    public void reset()
    {
        window.resetBoard();
    }

    // 4
}
