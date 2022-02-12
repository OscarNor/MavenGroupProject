
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class WindowTest {

    Window window = new Window();

    @Test
    void testList(){
        assertEquals(9, window.getGameLabels().size());
    }

    @Test
    void testGetButton(){
        try{
            JButton testButton = window.getResetGame();
        }
        catch (Exception e){
            fail("Could not get button");
        }
    }

}

