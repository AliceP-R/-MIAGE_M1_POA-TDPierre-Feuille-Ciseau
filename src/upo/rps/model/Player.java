package upo.rps.model;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * Created by alpottie on 21/09/2015.
 */
public class Player {
    private String nom;
    private int score;
    /*On utilise Stack car il y a les m�thodes push() et pop() qui permettent de g�rer la collection sans connaitre les index */
    public List<RPSEnum> mouvements;
    private Iterator<RPSEnum> it;
    int max = 3;
    int min = 0;

    public Player(String n, List<RPSEnum> mvt) {
        this.nom = n;
        this.score = 0;
        this.mouvements=mvt;
        it = this.mouvements.iterator();


    }

    public Player(String n, int nbre_mvt)
    {
        this.nom = n;
        this.score = 0;
        this.mouvements = new ArrayList<>();

        for(int i=0; i<nbre_mvt; i++)
        {
            int num_rand = (int)(Math.random()*(max-min))+min;
            if(num_rand == 0)
                mouvements.add(RPSEnum.ROCK);
            if(num_rand == 1)
                mouvements.add(RPSEnum.PAPER);
            if(num_rand == 2)
                mouvements.add(RPSEnum.SCISSORS);
        }

        it = this.mouvements.iterator();
    }

    public RPSEnum getNextMove()
    {
        if(it.hasNext())
            return it.next();
        else
            return null;
    }

    public String getNom() {
        return this.nom;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
