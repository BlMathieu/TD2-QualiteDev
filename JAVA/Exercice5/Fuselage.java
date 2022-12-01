package Exercice5;

public class Fuselage  {
    private int poids;
    private int capacite;

    public Fuselage(int poids, int capacite) {
        this.poids = poids;
        this.capacite = capacite;
    }

    public String toString(){
        return "Fuselage : " + poids +" "+capacite;
    }
}
