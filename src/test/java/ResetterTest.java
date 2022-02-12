import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

public class ResetterTest
{
    Window window = new Window();
    Resetter resetter = new Resetter(window);
    Player player = new Player(1, window);
    JButton resetButton = new JButton();

    @Test
    public void getHardReset()
    {
        player.setPlayerScore(3);
        assertEquals(0, player.getPlayerScore());
    }

    public void getReset()
    {
        
    }
}
