package Exercice2;

public class Employeur {
    private String nom;
    private String prenom;

    private Imprimante imprimante;

    public Employeur(String nom, String prenom,Imprimante imprimante){
        this.nom=nom;
        this.prenom=prenom;
        this.imprimante = imprimante;
    }

    @Override
    public String toString() {
        return "Employeur : " + nom + " " + prenom;
    }

    public void setImprimante(Imprimante imprimante){
        this.imprimante=imprimante;
    }

    public void imprimer(){
        this.imprimante.impression();
        System.out.println("Page imprimé par "+this.prenom);
    }
}
