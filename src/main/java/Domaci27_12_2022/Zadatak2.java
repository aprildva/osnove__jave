package Domaci27_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {

//        Kreirati klasu SmartAirConditioning koja ima:
//        atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//        atribut za izabranu temperaturu
//        atribut za mod (hladi/greje) - string
//        metodu za stampu (proizvoljno)
//        metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena. Metoda kao parametar prima temperaturu koja je napolju.

//        U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metode


        SmartAirConditioning hotel = new SmartAirConditioning() ;

         hotel.marka = "Samsung";
         hotel.izabranaTem= 32;
         hotel.mod = hotel.informacija( 25);
         hotel.stampaj();

        SmartAirConditioning vikendica = new SmartAirConditioning() ;

        vikendica.marka = "Gree";
        vikendica.izabranaTem= 22;
        vikendica.mod = vikendica.informacija( 25);
        vikendica.stampaj();










    }
}
