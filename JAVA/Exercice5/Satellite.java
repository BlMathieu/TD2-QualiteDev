package Exercice5;

public abstract class Satellite {
    private String modele;
    public Satellite(String modele){
        this.modele=modele;
    }

    public String toString(){
        return "Satellite : "+modele;
    }
}
