package Exercice2;

import org.w3c.dom.css.CSSImportRule;

public class Imprimante {

    private static Imprimante imprimante;
    private static int cImpression = 0;
    private Imprimante(){
    }

    public static Imprimante getInstance(){
        if(imprimante == null){
            imprimante = new Imprimante();
        }
        else{
            System.out.println("L'imprimante existe déjà");
        }
        return imprimante;
    }

    public void impression(){
        cImpression++;
    }

    public int getcImpression(){
        return cImpression;
    }

}
