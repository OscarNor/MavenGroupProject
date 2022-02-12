/**
 * Used for holding the score. Two ints that describe score and player number. Player 1 starts.
 * @author Hampus
 */

public class Player {

    private int playerNumber;
    private Window window;
    private int playerScore;

    public Player(int player, Window window)
    {
        this.playerNumber = player;
        this.playerScore = 0;
        this.window = window;
    }

    public void setPlayerScore(int playerScore)
    {
        this.playerScore = playerScore;
        window.setScore(playerNumber, playerScore);
    }

    public int getPlayerNumber()
    {
        return playerNumber;
    }

    public int getPlayerScore() {
        return playerScore;
    }
// 5
}
