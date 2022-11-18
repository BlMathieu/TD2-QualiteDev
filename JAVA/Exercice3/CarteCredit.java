package Exercice3;

public class CarteCredit extends Carte {
    private String nomCarte;
    public CarteCredit(Client client, int idCarte,String nomCarte) {
        super(client,idCarte);
        this.nomCarte = nomCarte;
    }

    @Override
    public String getNomCarte() {
        return this.nomCarte;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
