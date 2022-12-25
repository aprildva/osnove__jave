package Domaci19_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {


//        Napisati program koji od korisnika ucitava N brojeva i sabira samo parne brojeve. 
//        Na kraju programa prikazati sumu.


                Scanner s = new Scanner(System.in);
        System.out.print("Unesite N:");
        int n =s.nextInt();

        int suma =0;


        for (int i = 0; i <n ; i++) {
            System.out.print("Unesi broj:");
            int broj =s.nextInt();


            if (broj%2==0 ){

                suma=suma+broj;

            }

        }

        System.out.println("Suma parnih brojeva je: "+suma);


    }
}
