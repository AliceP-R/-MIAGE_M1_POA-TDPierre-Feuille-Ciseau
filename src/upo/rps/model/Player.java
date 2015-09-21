package upo.rps.model;

import java.util.List;

/**
 * Created by alpottie on 21/09/2015.
 */
public class Player {
    private String nom;
    private int score;
    public List<RPSEnum> mouvements;

    public Player(String n, List<RPSEnum> mvt) {
        this.nom = n;
        this.mouvements = mvt;
    }

    public Player(String n)
    {
        this.nom = n;

    }
}
