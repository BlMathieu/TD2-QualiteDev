package Exercice5;

public class UsineAirbus extends Usine{
    @Override
    public AvionAirbus fabriqueAvion(String modeleAvion, String marqueAvion) {
        return new AvionAirbus(marqueAvion,modeleAvion);
    }

    @Override
    public SatelliteTerrestre fabriqueSatelliteTerrestre(String modeleSatellite) {
        SatelliteTerrestre satellite = new SatelliteTerrestre(modeleSatellite);
        return satellite;
    }

    @Override
    public SatelliteEspace fabriqueSatelliteEspace(String modeleSatellite) {
        SatelliteEspace satellite = new SatelliteEspace(modeleSatellite);
        return satellite;
    }

}
