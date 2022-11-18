package Exercice3;

public class testCarte {

    public static void main(String []args){


        Client client = new Client("Jean","Neymar",true);
        Client client2 =  new Client("Agathe","Zeblouse",false);
        System.out.println(client.getCarte());
        System.out.println(client2.getCarte());

    }
}
