package Exercice4;

public class Etudiant {
    private int codeNip;
    private int codeIne;
    private String nom;
    private String nomUsuel;
    private String prenom;
    private String dateNaissance;
    private String lieuNaissance;
    private int anneBac;

    @Override
    public String toString() {
        return "Etudiant{" +
                "codeNip=" + codeNip +
                ", codeIne=" + codeIne +
                ", nom='" + nom + '\'' +
                ", nomUsuel='" + nomUsuel + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance='" + dateNaissance + '\'' +
                ", lieuNaissance='" + lieuNaissance + '\'' +
                ", anneBac=" + anneBac +
                ", email='" + email + '\'' +
                ", domicile='" + domicile + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }

    private String email;
    private String domicile;
    private String telephone;


    protected Etudiant(String nom,String prenom){
        this.nom=nom;
        this.prenom=prenom;
    }
    protected Etudiant(String nom,String prenom,String nomUsuel){
        this.nom=nom;
        this.prenom=prenom;
        this.nomUsuel=nomUsuel;
    }

    public void setCodeNip(int codeNip) {
        this.codeNip = codeNip;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public void setAnneBac(int anneBac) {
        this.anneBac = anneBac;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDomicile(String domicile) {
        this.domicile = domicile;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getCodeNip() {
        return codeNip;
    }

    public int getCodeIne() {
        return codeIne;
    }

    public String getNom() {
        return nom;
    }

    public String getNomUsuel() {
        return nomUsuel;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public int getAnneBac() {
        return anneBac;
    }

    public String getEmail() {
        return email;
    }

    public String getDomicile() {
        return domicile;
    }

    public String getTelephone() {
        return telephone;
    }
    public void setCodeIne(int codeIne) {
        this.codeIne = codeIne;
    }

}
