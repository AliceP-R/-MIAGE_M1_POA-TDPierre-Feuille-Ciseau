package upo.rps.model;

public class Main {

    public static void main(String[] args) {
	// write your code

        Player p1 = new Player("Audrey", 3);
        Player p2 = new Player("Jacques", 3);

        RockPaperScissors partie = new RockPaperScissors();
        Result res = partie.play(p1, p2);

        System.out.println(p1.getNom()+" a comme mouvements "+p1.mouvements.toString());
        System.out.println(p2.getNom()+" a comme mouvements "+p2.mouvements.toString());
        if(res == Result.WIN)
            System.out.println(p1.getNom()+" a gagné !");
        if(res == Result.LOST)
            System.out.println(p2.getNom()+" a gagné !");
        if(res == Result.TIE)
            System.out.println("Egalité !");

    }
}
