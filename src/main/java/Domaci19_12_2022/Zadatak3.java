package Domaci19_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

//        Napisati program koji simulira ponasanje speak loud programa. Korisnik unosi N reci a program ispisuje svaku rec na ekranu tako da zadovolji uslov:
//        -ako se u unetom tekstu sadrzi ! onda ga ispise tako kako je unet
//        -ako se ne sadrzi, program dostampa na kraju
//        Nakon toga program ispisuje nivo agresivnosti u komunikaciji (u procentima). Svaka uneta rec sa ! utice na agresivnost.

        Scanner s = new Scanner (System.in);

        System.out.println("Unesite broj N:");
        int n = s.nextInt();

        int counter =0;


        for (int i = 0; i < n; i++) {
            System.out.println("Unesite tekst ");
            String tekst = s.next();

            if (tekst.contains("!")) {

                counter = counter + 1;


                System.out.println(tekst);
            } else {
                System.out.println(tekst + "!");
            }
        }

        int agr = (counter*100/n);


        System.out.println( "Nivo agresivnosti " + agr);






}}
