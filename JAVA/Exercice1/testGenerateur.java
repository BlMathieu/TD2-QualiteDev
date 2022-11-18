package Exercice1;

public class testGenerateur {
    public static void main(String []args){
        Generateur generateur = Generateur.getInstance();
        System.out.println(generateur.genereEtiquette());
        System.out.println(generateur.genereEtiquette());
        generateur = Generateur.getInstance();
        System.out.println(generateur.genereEtiquette());
    }
}
