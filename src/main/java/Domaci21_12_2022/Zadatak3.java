package Domaci21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

//        Napisati program koji ucitava niz A duzine N, i koji nakon unosa niz A stampa sve elemente niza koji su veci od nule.


        Scanner s = new Scanner(System.in);

        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        System.out.println("Unesite N:");
        int n = s.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();

            if (broj>0) {

                brojevi.add(broj);
            }
        }

        System.out.print("Brojevi veci od nule u nizu A su: ");

        for (int i = 0; i < brojevi.size(); i++) {


            System.out.print( brojevi.get(i) + " ,") ;

        }

        }

            }













