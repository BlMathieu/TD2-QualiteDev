package Exercice1;


public class Etiquette {
    private String idEtiquette;
    public Etiquette(String idEtiquette){
        this.idEtiquette=idEtiquette;
    }

    @Override
    public String toString() {
        return "ID Etiquette :"+this.idEtiquette+"\n";
    }
}
