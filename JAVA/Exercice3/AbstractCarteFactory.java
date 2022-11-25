package Exercice3;

public abstract class  AbstractCarteFactory {

    private static int compteur;

    public static Carte createCarte(Client client,String nomCarte){
        Carte carte = null;

        if(client.getCategorie()==false){
            carte = new CarteDebit(client,compteur,nomCarte);
            compteur++;
        }
        else if(client.getCategorie()==true){
            carte = new CarteCredit(client,compteur,nomCarte);
            compteur++;
        }
        return carte;
    }

    public class MasterCardFactory {
        public static Carte getCarte(Client client) {
            Carte carte = AbstractCarteFactory.createCarte(client,"MasterCard");
            return carte;
        }
    }
    public class VisaFactory {
        public static Carte getCarte(Client client) {
            Carte carte = AbstractCarteFactory.createCarte(client,"Visa");
            return carte;
        }
    }
}

