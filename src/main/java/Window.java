import javax.swing.*;

public class Window {

    /**
     * The window for the game. Here is where all the visuals are.
     */

    // 1
    JFrame gameWindow = new JFrame();
    ImageIcon icon = new ImageIcon("treiradboard.png");
    JLabel board = new JLabel(icon);

    public Window(){

        gameWindow.setSize(540,580);
        gameWindow.setVisible(true);
        gameWindow.setResizable(false);
        gameWindow.setLayout(null);
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        board.setBounds(263-200,300-220, 400,440);
        board.setVisible(true);

        gameWindow.add(board);
    }
}
