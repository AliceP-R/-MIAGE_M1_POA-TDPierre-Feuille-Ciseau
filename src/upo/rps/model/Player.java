package upo.rps.model;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by alpottie on 21/09/2015.
 */
public class Player {
    private String nom;
    private int score;
    /*On utilise Stack car il y a les méthodes push() et pop() qui permettent de gérer la collection sans connaitre les index */
    public List<RPSEnum> mouvements;

    public Player(String n, List<RPSEnum> mvt) {
        this.nom = n;
        this.score = 0;
        this.mouvements = new ArrayList<>();
        this.mouvements=mvt;


    }

    public Player(String n, int nbre_mvt)
    {
        this.nom = n;
        this.score = 0;
        this.mouvements = new ArrayList<>();

        for(int i=0; i<nbre_mvt; i++)
        {
            int num_rand = (int)Math.random()*2;
            if(num_rand == 0)
                mouvements.add(RPSEnum.ROCK);
            if(num_rand == 1)
                mouvements.add(RPSEnum.PAPER);
            if(num_rand == 2)
                mouvements.add(RPSEnum.SCISSORS);
        }
    }

    public RPSEnum getNextMove()
    {
        return this.mouvements.remove(this.mouvements.size()-1);
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
