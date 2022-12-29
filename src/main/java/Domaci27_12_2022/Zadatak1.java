package Domaci27_12_2022;

import P27_12_2022.SlackMessage;

public class Zadatak1 {
    public static void main(String[] args) {

//        Napisati klasu Proizvod koja ima atribute
//        naziv proizvoda (String)
//                cenu proizvoda (double)
//        težinu proizvoda u gramima. (double)
//                i metode:
//        stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//        konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo, a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
//        Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//        Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012

//        U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode


        Proizvod cement = new Proizvod();

        cement.naziv="Cement";
        cement.cena= 150;
        cement.tezinaGr=12000;
        cement.stampaj();

        System.out.println( "Sracunata vrednost: "+ cement.konvertuj("kg")+ " kilograma");
        System.out.println( "Sracunata vrednost: "+ cement.konvertuj("t")+ " tona");

        Proizvod pesak = new Proizvod();

        pesak.naziv="Pesak";
        pesak.cena= 200;
        pesak.tezinaGr=15000;
        pesak.stampaj();

        System.out.println( "Sracunata vrednost: "+ cement.konvertuj("kg")+ " kilograma");
        System.out.println( "Sracunata vrednost: "+ cement.konvertuj("t")+ " tona");









    }
}
