package upo.rps.test;

import org.testng.annotations.*;
import upo.rps.model.RPSEnum;
import upo.rps.model.Result;
import upo.rps.model.RockPaperScissors;

import static org.testng.Assert.*;

/**
 * Created by alpottie on 14/09/2015.
 * Test {@link upo.rps.model.RockPaperScissors}
 */
public class TestRockPaperScissorsTest
{

    private RockPaperScissors rps;

    @BeforeClass
    public void setUp() throws Exception
    {
        rps = new RockPaperScissors();
    }

    @AfterClass
    public void tearDown() throws Exception
    {
        rps = null;
    }

    @Parameters({"paper","rock"})
    @Test
    public void testWinPlay(String p1, String p2) throws Exception
    {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.WIN);
    }

    @Parameters({"paper","paper"})
    @Test
    public void testTiePlay(String p1, String p2) throws Exception
    {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.TIE);
    }

    @Parameters({"paper","scissors"})
    @Test
    public void testLostPlay(String p1, String p2) throws Exception
    {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.LOST);
    }
}