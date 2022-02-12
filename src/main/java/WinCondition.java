import java.util.ArrayList;
import java.util.List;
    /**
    * Checks if a player has won the game. If the board is full, it's a tie. Calls for a reset.
     * @author Anton
    */
public class WinCondition {

    int p1Score;
    int p2Score;

    static ArrayList<GameLabel> list;

    //Returns 1 if p1 is winner, 2 if p2 is winner and 0 if no one has won
    public void checkGameWon(Player p1, Player p2){
        for (GameLabel g : list){
            System.out.println(g.getLabelValue());
        }
        System.out.println("-");
        if (checkPlayerWin(p1.getPlayerNumber()) == p1.getPlayerNumber()) {
            System.out.println("p1 won");
            p1.setPlayerScore(p1.getPlayerScore() + 1);
        }
        else if (checkPlayerWin(p2.getPlayerNumber()) == p2.getPlayerNumber()) {
            System.out.println("p2 won");
            p2.setPlayerScore(p2.getPlayerScore() + 1);
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

        public int getP1Score() {
            return p1Score;
        }

        // 3
}
