package Exercice3;

public abstract class Carte {

    private String nomCarte;
    private int idCarte;
    private Client client;
    public Carte(Client client,int idCarte){
        this.client=client;
        this.idCarte=idCarte;
        this.nomCarte="Carte";
    }

    public abstract String getNomCarte();

    @Override
    public String toString() {
        return getNomCarte() + " " + idCarte + " " + client.getNom();
    }


}
