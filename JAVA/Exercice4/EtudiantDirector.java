package Exercice4;

public class EtudiantDirector {
    private static EtudiantBuilder etudiantBuilder;

    public EtudiantDirector(EtudiantBuilder etudiantBuilder){
        this.etudiantBuilder=etudiantBuilder;
    }

    public static Etudiant getEtudiant(){
        return etudiantBuilder.getEtudiant();
    }
}
