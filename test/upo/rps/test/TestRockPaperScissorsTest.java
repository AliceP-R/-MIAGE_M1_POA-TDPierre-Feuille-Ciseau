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

    @DataProvider
    public Object[][] winData()
    {
        return new Object[][]{
                {"ROCK", "SCISSORS"},
                {"SCISSORS", "PAPER"},
                {"PAPER", "ROCK"}
        };
    }

    // Sans dataProvider
    //@Parameters({"paper","rock"})
    //@Test
    // Avec dataProvider
    @Test (dataProvider = "winData")
    public void testWinPlay(String p1, String p2) throws Exception
    {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.WIN);
    }


    @DataProvider
    public Object[][] tieData()
    {
        return new Object[][]{
                {"ROCK", "ROCK"},
                {"SCISSORS", "SCISSORS"},
                {"PAPER", "PAPER"}
        };
    }

    /*
    @Parameters({"paper","paper"})
    @Test
    */
    @Test (dataProvider = "tieData")
    public void testTiePlay(String p1, String p2) throws Exception
    {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.TIE);
    }

    @DataProvider
    public Object[][] lostData()
    {
        return new Object[][]{
                {"ROCK", "PAPER"},
                {"SCISSORS", "ROCK"},
                {"PAPER", "SCISSORS"}
        };
    }

    /*
    @Parameters({"paper","scissors"})
    @Test
    */
    @Test (dataProvider = "lostData")
    public void testLostPlay(String p1, String p2) throws Exception
    {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.LOST);
    }
}