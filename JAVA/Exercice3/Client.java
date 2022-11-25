package Exercice3;

public class Client {
    private String nom;
    private String prenom;
    private Boolean categorie;
    private Carte carte;

    public Client(String nom,String prenom,Boolean categorie){
        this.nom=nom;
        this.prenom=prenom;
        this.categorie=categorie;
        this.carte= null;
    }

    public Boolean getCategorie() {
        return categorie;
    }

    public String getNom() {
        return nom;
    }

    public Carte getCarte(){
        return this.carte;
    }

    public void setCarteMasterCard(){
        this.carte = AbstractCarteFactory.MasterCardFactory.getCarte(this);
    }
    public void setCarteVisa(){
        this.carte = AbstractCarteFactory.VisaFactory.getCarte(this);
    }
}
