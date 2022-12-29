package Domaci26_12_2022;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

//        Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare prema dole navedenoj konverziji. Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je potrebno izvrsiti konverziju (RSD/USD/RUB) a vraca konvertovanu vrednost. U glavnom programu pozvati funkciju za neki od primera.
//        Primer poziva funkcija:
//        Ako se za vrednost u eurima unese 3 i valuta RSD vraca vrednost 351.6339
//        Ako se za vrednost u eurima unese 4.5 i valuta USD vraca vrednost 5.31945
//        Primer izvrsenja main programa:
//        Unesite vrednost u eurima: 3
//        Unesite valutu za konverziju: RSD
//        3 EUR je 351.6339 RSD
//        Konverzija eura u druge valute:
//        1 EUR = 117.5 RSD
//        1 EUR = 1.1 USD
//        1 EUR = 62.98 RUB


        Scanner s = new Scanner(System.in);
        System.out.print("Unesite vrednost u evrima: ");
        double euro = s.nextDouble();

        System.out.print("Unesite valutu: ");
        String valuta = s.next();

        System.out.println(vrednost(euro, valuta));


    }

    public static double vrednost(double euro, String valuta) {

        if (valuta.equals("RSD")) {

            double iznos = euro * 117.5000;
            return iznos;

        } else if (valuta.equals("USD")) {

            double iznos = euro * 1.1000;
            return iznos;

        } else if (valuta.equals("RUB")) {

            double iznos = euro * 62.9800;
            return iznos;


        }
        else {
            return 0;
        }


    }

}