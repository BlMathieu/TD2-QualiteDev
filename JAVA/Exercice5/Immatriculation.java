package Exercice5;

public class Immatriculation {
    private static Immatriculation immatriculation;

    private Immatriculation(){

    }

    public static Immatriculation getInstance(){
        if(immatriculation==null){
            immatriculation = new Immatriculation();
        }
        return immatriculation;
    }
}
