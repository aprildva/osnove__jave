package Domaci26_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

//        Napisati metodu koja vrsi spajanje punog imena i vraca tu vrednost. Metoda od parametara prima ime i prezime (2 parametra) i
//        vraca jedan string tako sto spoji ime i prezime. METODA NISTA NE STAMPA.
//        Primer poziva: Ako se metoda pozvove za ime=”Milan” i prezime=”Jovanovic”, metoda vraca “Milan Jovanovic”


        Scanner s = new Scanner(System.in);
        System.out.print("Unesi ime :");
        String ime =s.next();
        System.out.print("Unesi prezime :");
        String prezime =s.next();

        punoIme( ime, prezime);

        System.out.println(punoIme(ime,prezime));


    }




    public static String punoIme( String ime, String prezime) {

        String zajedno = (ime + " " +prezime);

        return zajedno;
    }
}
