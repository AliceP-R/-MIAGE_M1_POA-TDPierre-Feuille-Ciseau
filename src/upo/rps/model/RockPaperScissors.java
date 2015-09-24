package upo.rps.model;

import java.util.Iterator;

/**
 * Created by alpottie on 14/09/2015.
 */
public final class RockPaperScissors {
    public final int nbre_mvt = 10;

    public Result play(RPSEnum p1, RPSEnum p2)
    {
        if( p1 == RPSEnum.ROCK && p2 == RPSEnum.SCISSORS || p1 == RPSEnum.PAPER && p2 == RPSEnum.ROCK || p1 == RPSEnum.SCISSORS && p2 == RPSEnum.PAPER )
            return Result.WIN;

        if( p1 == p2 )
            return Result.TIE;

        else
            return Result.LOST;
    }

    public Result play(Player p1, Player p2)
    {
        Result res;
        Iterator<RPSEnum> itp1 = p1.mouvements.iterator();
        Iterator<RPSEnum> itp2 = p2.mouvements.iterator();

        while(itp1.hasNext() && itp2.hasNext())
        {
            RPSEnum mvtp1 = p1.getNextMove();
            RPSEnum mvtp2 = p2.getNextMove();

           System.out.println("mvtp1 = "+mvtp1.toString());
           System.out.println("mvtp2 = "+mvtp2.toString());

            res=play(mvtp1, mvtp2);
            if(res == Result.WIN)
                p1.setScore(p1.getScore()+1);
            if(res == Result.TIE)
            {
                p1.setScore(p1.getScore()+1);
                p2.setScore(p2.getScore()+1);
            }
            if(res == Result.LOST)
            {
                p2.setScore(p2.getScore()+1);
            }

            itp1.next();
            itp2.next();
        }

        if(p1.getScore() > p2.getScore())
            return Result.WIN;
        if(p1.getScore() == p2.getScore())
            return Result.TIE;
        else
            return Result.LOST;
    }
}
