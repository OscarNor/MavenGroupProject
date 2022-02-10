import org.junit.Assert;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class WindowTest {

    Window window = new Window();

    @Test
    void testList(){
        Assert.assertEquals(9, window.getGameLabels().size());
    }

    @Test
    void testGetButton(){
        try{
            JButton testButton = window.getResetGame();
        }
        catch (Exception e){
            Assert.fail("Could not get button");
        }
    }

}
