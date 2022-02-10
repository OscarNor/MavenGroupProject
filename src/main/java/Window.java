import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

    /**
     * The window for the game. Here is where all the visuals are.
     * @author Luca
     */
public class Window extends JButton {


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

    public void alternatePlayer(){
    if (currentPlayer == 1) {
        currentPlayer = 2;
    }
    else{
        currentPlayer = 1;
    }
    }

    private ArrayList<GameLabel> gameLabels;
    public Window(){

        // Window size is 540x580;
        gameWindow.setUndecorated(true);
        gameWindow.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);

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

        GameLabel square1 = new GameLabel(1,this);
        GameLabel square2 = new GameLabel(2,this);
        GameLabel square3 = new GameLabel(3,this);
        GameLabel square4 = new GameLabel(4,this);
        GameLabel square5 = new GameLabel(5,this);
        GameLabel square6 = new GameLabel(6,this);
        GameLabel square7 = new GameLabel(7,this);
        GameLabel square8 = new GameLabel(8,this);
        GameLabel square9 = new GameLabel(9,this);

        square1.getLabel().setBounds(263-OFFSET,300-OFFSET,DEF_SIZE,DEF_SIZE);
        square2.getLabel().setBounds(263-OFFSET,163-OFFSET,DEF_SIZE,DEF_SIZE);
        square3.getLabel().setBounds(263-OFFSET,437-OFFSET,DEF_SIZE,DEF_SIZE);
        square4.getLabel().setBounds(396-OFFSET,163-OFFSET,DEF_SIZE,DEF_SIZE);
        square5.getLabel().setBounds(396-OFFSET,300-OFFSET,DEF_SIZE,DEF_SIZE);
        square6.getLabel().setBounds(396-OFFSET,437-OFFSET,DEF_SIZE,DEF_SIZE);
        square7.getLabel().setBounds(128-OFFSET,163-OFFSET,DEF_SIZE,DEF_SIZE);
        square8.getLabel().setBounds(128-OFFSET,300-OFFSET,DEF_SIZE,DEF_SIZE);
        square9.getLabel().setBounds(128-OFFSET,437-OFFSET,DEF_SIZE,DEF_SIZE);

        gameLabels = new ArrayList<>();
        gameLabels.add(square1);
        gameLabels.add(square2);
        gameLabels.add(square3);
        gameLabels.add(square4);
        gameLabels.add(square5);
        gameLabels.add(square6);
        gameLabels.add(square7);
        gameLabels.add(square8);
        gameLabels.add(square9);

        gameWindow.add(player1Name);
        gameWindow.add(player2Name);
        gameWindow.add(player1Score);
        gameWindow.add(player2Score);
        gameWindow.add(resetGame);
        gameWindow.add(quitGame);

        for (GameLabel l : gameLabels) {
            gameWindow.add(l.getLabel());
        }

        quitGame.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

        });

        gameWindow.setVisible(true);
    }

    // For resetter class
    public JButton getResetGame() {
        return resetGame;
    }

    // For resetter class and win condition
    public ArrayList<GameLabel> getGameLabels() {
        return gameLabels;
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }
}
