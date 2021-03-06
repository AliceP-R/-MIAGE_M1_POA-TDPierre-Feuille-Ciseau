package upo.rps.test;

import org.testng.annotations.*;
import upo.rps.model.Player;
import upo.rps.model.RPSEnum;
import upo.rps.model.Result;
import upo.rps.model.RockPaperScissors;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by alpottie on 21/09/2015.
 */
public class TestPlayer
{
    RockPaperScissors rps;
    /* On est oblig� de cr�er 6 joueurs car on d�pile la liste de mouvement � chaque fois
       ce qui signifie qu'on ne peut donc pas refaire des tests puisque la liste est vide
     */
    Player p1;
    Player p2;

    @BeforeClass
    public void setUp() throws Exception
    {
        rps = new RockPaperScissors();
        List<RPSEnum> mvtp1 = new ArrayList<>();
        for(int i=0; i<rps.nbre_mvt; i++) {
            mvtp1.add(RPSEnum.PAPER);
        }

        List<RPSEnum> mvtp2 = new ArrayList<>();
        for(int i=0; i<rps.nbre_mvt; i++) {
            mvtp2.add(RPSEnum.ROCK);
        }

        p1= new Player("Joueur 1", mvtp1);
        p2 = new Player("Joueur 2", mvtp2);
    }

    @AfterClass
    public void tearDown() throws Exception
    {
        rps = null;
        p1 = p2 = null;

    }


    @Test
    public void testWinPlay() throws Exception
    {
        assertEquals(rps.play(p1, p2), Result.WIN);
    }

    @Test
    public void testTiePlay() throws Exception
    {
        assertEquals(rps.play(p1, p2), Result.TIE);
    }

    @Test
    public void testLostPlay() throws Exception
    {
        assertEquals(rps.play(p1, p2), Result.LOST);
    }
}