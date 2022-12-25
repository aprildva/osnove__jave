package Domaci20_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

//        Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.


                Scanner s = new Scanner(System.in);

        int broj =0;

        int brojac1 =0;
        int brojac2 =0;


        while ( brojac2<2 && brojac1<3)  {

            System.out.println("Unesite broj: ");
             broj =s.nextInt();


            if ( broj==2) {
                brojac2++;
            }


            if (broj==1) {
                brojac1++;

            }

    }
        System.out.println("Kraj programa!");

}}
