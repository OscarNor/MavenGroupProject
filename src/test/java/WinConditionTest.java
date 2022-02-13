import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class WinConditionTest {

    Window w = new Window();
    Player p1 = new Player(1, w);
    Player p2 = new Player(2, w);
    Resetter rs = new Resetter(w);
    WinCondition cond = new WinCondition(p1,p2,rs);

    @Test
    public void TestWinCondition(){
        WinCondition wc = new WinCondition(p1,p2,rs);
        assertEquals(cond.getClass(), wc.getClass());
    }

    @Test
    public void checkPlayerWinTestFail(){
        cond.setList(w.getGameLabels());
        assertEquals(0, cond.checkPlayerWin(p1.getPlayerNumber()));
        assertNotEquals(p1.getPlayerNumber(), cond.checkPlayerWin(p1.getPlayerNumber()));

        //int a = WinCondition.list.get(1).labelValue;
    }

    @Test
    public void checkPlayerWinWinning(){
        cond.setList(w.getGameLabels());

        WinCondition.list.get(0).setLabelValue(1);
        WinCondition.list.get(1).setLabelValue(1);
        WinCondition.list.get(2).setLabelValue(1);

        assertEquals(p1.getPlayerNumber(), cond.checkPlayerWin(p1.getPlayerNumber()));
        assertNotEquals(0, cond.checkPlayerWin(p1.getPlayerNumber()));

        WinCondition.list.get(0).setLabelValue(0);
        WinCondition.list.get(1).setLabelValue(0);
        WinCondition.list.get(2).setLabelValue(0);

        WinCondition.list.get(6).setLabelValue(1);
        WinCondition.list.get(7).setLabelValue(1);
        WinCondition.list.get(8).setLabelValue(1);

        assertEquals(p1.getPlayerNumber(), cond.checkPlayerWin(p1.getPlayerNumber()));
        assertNotEquals(0, cond.checkPlayerWin(p1.getPlayerNumber()));
    }

    @Test
    public void checkGameWonTest(){
        cond.setList(w.getGameLabels());

        cond.checkGameWon(p1.getPlayerNumber(),p2.getPlayerNumber());

        assertEquals(0, p1.getPlayerScore());
        assertEquals(0, p2.getPlayerScore());
        assertEquals(p1.getPlayerScore(), p2.getPlayerScore());




    }
}
