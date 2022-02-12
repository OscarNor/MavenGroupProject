public class Player {

    /**
    * Used for holding the score. Two ints that describe score and player number. Player 1 starts.
     */

    private int playerNumber;

    private int playerScore;

    public Player(int player, Window window)
    {
        this.playerNumber = player;
        this.playerScore = 0;
    }

    public void setPlayerScore(int playerScore)
    {
        this.playerScore = playerScore;
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
