package Exercice1;
public class Generateur {

    private static Generateur generateur;
    private Etiquette etiquette;
    private static int compteur = 1 ;

    private Generateur(int idEtiquette){
    }

    public static Generateur getInstance(){
        if(generateur == null){
            generateur = new Generateur(compteur);

        }
        else {
            System.out.println("Instance existe déjà");
        }
        return generateur;
    }

    public Etiquette genereEtiquette(){
        this.etiquette = new Etiquette("ID_"+compteur);
        compteur++;
        return this.etiquette;
    }
}