package Exercice5;

public class UsineBoeing extends Usine{
    @Override
    public Avion fabriqueAvion(String modeleAvion, String marqueAvion) {
        AvionBoeing avionBoeing = new AvionBoeing(modeleAvion,marqueAvion);
        return avionBoeing;
    }

    @Override
    public SatelliteEspace fabriqueSatelliteEspace(String modeleSatellite) {
        SatelliteEspace satellite = new SatelliteEspace(modeleSatellite);
        return satellite;
    }

    @Override
    public SatelliteTerrestre fabriqueSatelliteTerrestre(String modeleSatellite) {
        SatelliteTerrestre satellite = new SatelliteTerrestre(modeleSatellite);
        return satellite;
    }
}
