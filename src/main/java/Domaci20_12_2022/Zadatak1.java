package Domaci20_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

//        Napisati program koji ucitava brojeva od korisnika i za svaki broj prikazuje apsolutnu vrednost sve dok se ne unese nula.
//        Pomoc: Apsolutna vrednost je kada bilo koji broj pretvarate u pozitivan broj. Npr: -2 u 2 ili -4 u 4 dok pozitivni ostaju pozitivni npr: 9 ostaje 9

        Scanner s= new Scanner(System.in);

        int broj=1;

        while (broj!=0) {

            System.out.println("Unesi broj: ");
              broj=s.nextInt();

        if (broj >0) {
            System.out.println("Apsolutna vrednost je "+broj);
        }
        else if (broj <0) {

            broj = Math.abs(broj);
            System.out.println("Apsolutna vrednost je " +broj);

        }


    }

        System.out.println("Kraj programa jer je uneta nula.");
}}
