package Exercice5;

import java.util.List;

public class Avion {
    private String marque;
    private String modele;
    private Fuselage fuselage;
    private List<Reacteur> listReacteur;

    public Avion(String marque,String modele){
        this.marque=marque;
        this.modele=modele;
    }

    public void ajoutReacteur(Reacteur reacteur){
        listReacteur.add(reacteur);
    }
    public void ajoutFuselage(Fuselage fuselage){
        this.fuselage=fuselage;
    }
}
