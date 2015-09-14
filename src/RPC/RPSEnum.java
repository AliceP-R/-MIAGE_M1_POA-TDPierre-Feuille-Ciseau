package RPC;

/**
 * Created by alpottie on 14/09/2015.
 */
public enum RPSEnum
{
    ROCK("Rock"),
    PAPERS("Paper"),
    SCISSORS("Scissors");

    public String getNom() {
        return nom;
    }

    private final String nom;

    RPSEnum(String nom)
    {
        this.nom = nom;
    }


}
