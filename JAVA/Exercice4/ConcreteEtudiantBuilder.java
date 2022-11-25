package Exercice4;

public class ConcreteEtudiantBuilder implements EtudiantBuilder{

    private Etudiant etudiant;


    public void setEtudiantObligatoire(String nom,String prenom,int ine,int nip){
        this.etudiant = new Etudiant(nom,prenom);
        this.etudiant.setCodeIne(ine);
        this.etudiant.setCodeNip(nip);
    }

    public void setEtudiantCoordonnees(String domicile,String tel,String email){
        this.etudiant.setDomicile(domicile);
        this.etudiant.setTelephone(tel);
        this.etudiant.setEmail(email);
    }
    public void setEtudiantOptionnel(String nom,String prenom,int ine,int nip,String nomU,String dateNaissance,String lieuNaissance,int anneBac){
        this.etudiant=new Etudiant(nom,prenom,nomU);
        this.etudiant.setAnneBac(anneBac);
        this.etudiant.setDateNaissance(dateNaissance);
        this.etudiant.setLieuNaissance(lieuNaissance);
        this.etudiant.setCodeIne(ine);
        this.etudiant.setCodeNip(nip);
    }

    @Override
    public Etudiant getEtudiant() {
        return etudiant;
    }
}
