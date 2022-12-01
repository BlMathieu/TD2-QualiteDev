package Exercice5;

public class App {
    public static void main(String []args){
        UsineAirbus usineAirbus = new UsineAirbus();
        AvionAirbus avionAirbus = usineAirbus.fabriqueAvion("320","Airbus");
    }
}
