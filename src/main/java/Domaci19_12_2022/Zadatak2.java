package Domaci19_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

//        Napisati program koji ucitava N brojeva od korisnika i sabira samo trocifrene brojeve.


                Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj N:");
        int n=s.nextInt();

        int suma =0;

        for (int i = 0; i < n; i++) {
            System.out.print("Unesi broj: ");
            int broj=s.nextInt();

          if (broj < 1000 && broj>99 ) {

                suma=suma+broj;}}

//
            System.out.print(suma);






}}
