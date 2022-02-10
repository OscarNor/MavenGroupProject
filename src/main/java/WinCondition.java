import java.util.List;
    /**
    * Checks if a player has won the game. If the board is full, it's a tie. Calls for a reset.
     * @author Anton
    */
public class WinCondition {


    private static boolean check3PositionsIntList(int player, int[] list, int a, int b, int c){
        return list[a] == player && list[b] == player && list[c] == player;
    }

    //Returns 1 if p1 is winner, 2 if p2 is winner and 0 if no one has won
    public static int checkGameWon(int p1, int p2, int[] list){
        if (checkPlayerWin(p1, list) == p1)
            return 1;
        else if (checkPlayerWin(p2, list) == p2)
            return 2;
        else
            return 0;
    }

    //Return 0 if no winner, returns player value if player has won EG: player1 = 1 will return 1 if the player has three in a row
    public static int checkPlayerWin(int player, int[] list){
        if (check3PositionsIntList(player, list, 0,1 ,2))
            return player;
        else if(check3PositionsIntList(player, list, 0,3,6))
            return player;
        else if (check3PositionsIntList(player, list,0,4,8))
            return player;
        else if (check3PositionsIntList(player, list, 1,4,7))
            return player;
        else if (check3PositionsIntList(player, list,2,4,6 ))
            return player;
        else if (check3PositionsIntList(player, list,2,5,8))
            return player;
        else if (check3PositionsIntList(player, list,3,4,5 ))
            return player;
        else if (check3PositionsIntList(player, list, 6,7,8))
            return player;
        else
            return 0;
    }

    //Not used currently
    private static boolean check3Positions(int player, List list, int a, int b, int c){
        return list.get(a).equals(player) && list.get(b).equals(player) && list.get(c).equals(player);
    }
    // Not Used currently
    // Return 0 if no winner, returns player value if player has won EG: player1 = 1 will return 1 if the player has three in a row
    public static int checkPlayerWin(int player, List list){
        if (check3Positions(player, list, 0,1 ,2))
            return player;
        else if(check3Positions(player, list, 0,3,6))
            return player;
        else if (check3Positions(player, list,0,4,8))
            return player;
        else if (check3Positions(player, list, 1,4,7))
            return player;
        else if (check3Positions(player, list,2,4,6 ))
            return player;
        else if (check3Positions(player, list,2,5,8))
            return player;
        else if (check3Positions(player, list,3,4,5 ))
            return player;
        else if (check3Positions(player, list, 6,7,8))
            return player;
        else
            return 0;
    }


    // 3
}
