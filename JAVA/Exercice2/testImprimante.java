package Exercice2;

public class testImprimante {
    public static void main (String []args){
        Imprimante imprimante = Imprimante.getInstance();
        Employeur e1 = new Employeur("Bob","Charlie",imprimante);
        Employeur e2 = new Employeur("Annie","Bal",imprimante);
        e1.imprimer();
        System.out.println(imprimante.getcImpression());
        e2.imprimer();
        System.out.println(imprimante.getcImpression());


    }
}
