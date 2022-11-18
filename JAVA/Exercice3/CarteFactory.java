package Exercice3;

public class CarteFactory {

    private static int compteur;

    public static Carte createCarte(Client client){
        Carte carte = null;

        if(client.getCategorie()==false){
            carte = new CarteDebit(client,compteur,"Visa");
            compteur++;
        }
        else if(client.getCategorie()==true){
            carte = new CarteCredit(client,compteur,"MasterCard");
            compteur++;
        }
        return carte;
    }

    public class DistributeurCarte {

        public Carte getCarte(Client client){
            Carte carte = CarteFactory.createCarte(client);
            return carte;
        }
    }

}

