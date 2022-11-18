package Exercice3;

public class CarteDebit extends Carte {
    private String nomCarte;
    public CarteDebit(Client client, int idCarte,String nomCarte) {
        super(client,idCarte);
        this.nomCarte = nomCarte;

    }

    @Override
    public String getNomCarte() {
        return nomCarte;
    }


}
