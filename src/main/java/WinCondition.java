import java.util.ArrayList;
import java.util.List;
    /**
    * Checks if a player has won the game. If the board is full, it's a tie. Calls for a reset.
     * @author Anton
    */
public class WinCondition {

    private Player player1;
    private Player player2;
    private Resetter rs;

    public WinCondition(Player player1, Player player2, Resetter rs){
        this.player1 = player1;
        this.player2 = player2;
        this.rs = rs;
    }

    static ArrayList<GameLabel> list;



    //Returns 1 if p1 is winner, 2 if p2 is winner and 0 if no one has won
        //TODO
        //Should reset the board on player win
    public void checkGameWon(int p1, int p2){
        if (checkPlayerWin(1) == 1) {
            System.out.println("p1 won");
            player1.setPlayerScore(player1.getPlayerScore() + 1);
            try {
                Thread.sleep(3000);
            }
            catch(Exception e){}
            rs.reset();
        }
        else if (checkPlayerWin(2) == 2) {
            System.out.println("p2 won");
            player2.setPlayerScore(player2.getPlayerScore() + 1);
            try {
                Thread.sleep(3000);
            }
            catch(Exception e){}
            rs.reset();
        }
    }

    private static boolean check3Positions(int player, int a, int b, int c){
        return list.get(a).getLabelValue() == player && list.get(b).getLabelValue() == player && list.get(c).getLabelValue() == player;
    }

    // Return 0 if no winner, returns player value if player has won EG: player1 = 1 will return 1 if the player has three in a row
    public static int checkPlayerWin(int player){
        if (check3Positions(player, 0,1 ,2))
            return player;
        else if(check3Positions(player, 0,3,6))
            return player;
        else if (check3Positions(player,0,4,8))
            return player;
        else if (check3Positions(player,1,4,7))
            return player;
        else if (check3Positions(player,2,4,6 ))
            return player;
        else if (check3Positions(player,2,5,8))
            return player;
        else if (check3Positions(player,3,4,5 ))
            return player;
        else if (check3Positions(player, 6,7,8))
            return player;
        else
            return 0;
    }

        public void setList(ArrayList<GameLabel> list) {
            this.list = list;
        }

        // 3
}
