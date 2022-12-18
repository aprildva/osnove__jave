package Domaci16_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//        (Za vezbanje) Napisati program koji ucitava dimenziju table i stampa je na ekranu.
//                Primer izvrsenja:
//        Unesite dimenziju table: 5
//        _|_|_|_|_|
//        _|_|_|_|_|
//        _|_|_|_|_|
//        _|_|_|_|_|
//        _|_|_|_|_|



                Scanner s = new Scanner(System.in);

        System.out.print("Unesi dimenziju tabele:");

        int dimenzija = s.nextInt();



        for (int i = 0; i < dimenzija ; i++) {


            for (int j = 1; j < dimenzija; j++) {


                System.out.print("_|");

            }

            System.out.println("_|");
        }}}







