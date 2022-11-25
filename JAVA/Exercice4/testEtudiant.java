package Exercice4;

public class testEtudiant {


    public static void main(String []args){
         ConcreteEtudiantBuilder concreteEtudiantBuilder = new ConcreteEtudiantBuilder();
         EtudiantDirector etudiantDirector = new EtudiantDirector(concreteEtudiantBuilder);

         concreteEtudiantBuilder.setEtudiantObligatoire("bob","m",2,5);
         concreteEtudiantBuilder.setEtudiantCoordonnees("7rue","07.05.65.99","slpqg@ma.com");
         Etudiant etuOb = EtudiantDirector.getEtudiant();
         concreteEtudiantBuilder.setEtudiantOptionnel("bob2","m2",1,3,"u2","01.02.2000","14rue",1);
         concreteEtudiantBuilder.setEtudiantCoordonnees("d1","2","kfs@gqsl.com");
         Etudiant etuOp = EtudiantDirector.getEtudiant();

        System.out.println(etuOb);
        System.out.println(etuOp);
    }
}
