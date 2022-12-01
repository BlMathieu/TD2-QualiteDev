package Exercice5;

import javax.swing.*;

public abstract class Usine {
    private Immatriculation immatriculation = Immatriculation.getInstance();

    public abstract Avion fabriqueAvion(String modeleAvion,String marqueAvion);
    public abstract Satellite fabriqueSatelliteTerrestre(String modeleSatellite);
    public abstract Satellite fabriqueSatelliteEspace(String modeleSatellite);

}
