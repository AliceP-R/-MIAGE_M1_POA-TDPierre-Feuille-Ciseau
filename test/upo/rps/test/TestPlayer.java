package upo.rps.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import upo.rps.model.Player;
import upo.rps.model.RPSEnum;
import upo.rps.model.RockPaperScissors;

import java.util.Stack;

import static org.testng.Assert.*;

/**
 * Created by alpottie on 21/09/2015.
 */
public class TestPlayer
{
    RockPaperScissors rps;
    Player p1;
    Player p2;

    @BeforeMethod
    public void setUp() throws Exception
    {
        rps = new RockPaperScissors();
        Stack<RPSEnum> mvtp1 = new Stack<RPSEnum>();
        for(int i=0; i<10; i++) {
            mvtp1.push(RPSEnum.PAPER);
        }

        Stack<RPSEnum> mvtp2 = new Stack<RPSEnum>();
        for(int i=0; i<10; i++) {
            mvtp2.push(RPSEnum.ROCK);
        }

        p1 = new Player("Joueur 1", mvtp1);
        p1 = new Player("Joueur 2", mvtp2);
    }

    @AfterMethod
    public void tearDown() throws Exception
    {
        rps = null;
        p1 = null;
        p2 = null;

    }


    @Test
    public void testPlay() throws Exception
    {

    }
}