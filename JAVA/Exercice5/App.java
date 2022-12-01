package Exercice5;

public class App {
    public static void main(String []args){

        AvionAirbus avionAirbus = new UsineAirbus().fabriqueAvion("320","Airbus");
        Reacteur rolls = new Reacteur("Rolls-Royce",5,10);
        Reacteur trent = new Reacteur("Trent",6,9);
        Fuselage fuselage = new Fuselage(30,120);

        AvionBoeing avionBoeing = new UsineBoeing().fabriqueAvion("737","Boeing");
        avionBoeing.ajoutFuselage(new Fuselage(50,41));
        avionBoeing.ajoutReacteur(new Reacteur("Rolls-Royce",5,10));
        avionBoeing.ajoutReacteur(new Reacteur("Rolls-Royce",5,10));
        avionBoeing.ajoutReacteur(new Reacteur("Trent",8,12));
        avionBoeing.ajoutReacteur(new Reacteur("Trent",8,12));

        Satellite satellite = new UsineBoeing().fabriqueSatelliteEspace("Argos");
        Satellite satellite1 = new UsineAirbus().fabriqueSatelliteTerrestre("Jason1");


        avionAirbus.ajoutReacteur(rolls);
        avionAirbus.ajoutReacteur(rolls);
        avionAirbus.ajoutReacteur(trent);
        avionAirbus.ajoutReacteur(trent);
        avionAirbus.ajoutFuselage(fuselage);

        System.out.println(avionAirbus);
        System.out.println(avionBoeing);
        System.out.println(satellite);
        System.out.println(satellite1);



    }
}
