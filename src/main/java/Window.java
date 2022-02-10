import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Window {

    /**
     * The window for the game. Here is where all the visuals are.
     * Luca
     */

    // 1
    JFrame gameWindow = new JFrame();
    ImageIcon icon = new ImageIcon("treiradboard.png");

    ImageIcon t = new ImageIcon("testimg.png");
    JLabel board = new JLabel(icon);

    JLabel player1Name = new JLabel("Player X");
    JLabel player2Name = new JLabel("Player O");

    JLabel player1Score = new JLabel("0");
    JLabel player2Score = new JLabel("0");
    JButton resetGame = new JButton("Restart");
    JButton quitGame = new JButton("Exit");

    Font defaultFont = new Font("Calibri", Font.BOLD, 30);
    Font defaultScoreFont = new Font("Calibri", Font.BOLD, 54);
    private int currentPlayer = 1;

    final int OFFSET = 50;
    final int DEF_SIZE = 100;

    public Window(){

        // Window size is 540x580;
        gameWindow.setVisible(true);
        gameWindow.setResizable(false);
        gameWindow.setLayout(null);
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        try {
            gameWindow.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("wood.png")))));
        }
        catch(Exception e) {
            e.getStackTrace();
        }
        gameWindow.pack();

        board.setBounds(263-200,300-220, 400,440);
        board.setVisible(true);

        gameWindow.add(board);

        player1Name.setBounds(5,0,200,150);
        player1Name.setForeground(Color.BLACK);
        player1Name.setFont(defaultFont);

        player2Name.setBounds(422,0,200,150);
        player2Name.setForeground(Color.BLACK);
        player2Name.setFont(defaultFont);

        player1Score.setBounds(5, 0, 200, 80);
        player1Score.setForeground(Color.BLACK);
        player1Score.setFont(defaultScoreFont);

        player2Score.setBounds(505, 0, 200, 80);
        player2Score.setForeground(Color.BLACK);
        player2Score.setFont(defaultScoreFont);

        resetGame.setBounds(110-100, 548-25,200,50);
        resetGame.setForeground(Color.BLACK);
        resetGame.setFont(defaultFont);

        quitGame.setBounds(282-65, 548-25,130,50);
        quitGame.setForeground(Color.BLACK);
        quitGame.setFont(defaultFont);

        JLabel t1 = new JLabel(t);
        JLabel t2 = new JLabel(t);
        JLabel t3 = new JLabel(t);
        JLabel t4 = new JLabel(t);
        JLabel t5 = new JLabel(t);
        JLabel t6 = new JLabel(t);
        JLabel t7 = new JLabel(t);
        JLabel t8 = new JLabel(t);
        JLabel t9 = new JLabel(t);

        t1.setBounds(263-OFFSET,300-OFFSET,DEF_SIZE,DEF_SIZE);
        t2.setBounds(263-OFFSET,163-OFFSET,DEF_SIZE,DEF_SIZE);
        t3.setBounds(263-OFFSET,437-OFFSET,DEF_SIZE,DEF_SIZE);
        t4.setBounds(396-OFFSET,163-OFFSET,DEF_SIZE,DEF_SIZE);
        t5.setBounds(396-OFFSET,300-OFFSET,DEF_SIZE,DEF_SIZE);
        t6.setBounds(396-OFFSET,437-OFFSET,DEF_SIZE,DEF_SIZE);
        t7.setBounds(128-OFFSET,163-OFFSET,DEF_SIZE,DEF_SIZE);
        t8.setBounds(128-OFFSET,300-OFFSET,DEF_SIZE,DEF_SIZE);
        t9.setBounds(128-OFFSET,437-OFFSET,DEF_SIZE,DEF_SIZE);
        //GameLabel square1 = new GameLabel();
        // square1.getLabel().setBounds(263-OFFSET,300-OFFSET,100,100);

        gameWindow.add(player1Name);
        gameWindow.add(player2Name);
        gameWindow.add(player1Score);
        gameWindow.add(player2Score);
        gameWindow.add(resetGame);
        gameWindow.add(quitGame);

        gameWindow.add(t1);
        gameWindow.add(t2);
        gameWindow.add(t3);
        gameWindow.add(t4);
        gameWindow.add(t5);
        gameWindow.add(t6);
        gameWindow.add(t7);
        gameWindow.add(t8);
        gameWindow.add(t9);
        // gameWindow.add(square1.getLabel());
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }
}
