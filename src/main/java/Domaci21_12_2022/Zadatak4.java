package Domaci21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//        Napisati program koji ucitava niz A duzine N i broj X.
//        Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.


                Scanner s = new Scanner(System.in);

        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        ArrayList<Integer> indexi = new ArrayList<Integer>();

        System.out.println("Unesite N:");
        int n = s.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            brojevi.add(broj);

        }
        System.out.println("Unesite X: ");
        int x = s.nextInt();

        System.out.print("Elementi niza A koji su jednaki broju X imaju indekse: ");

        for (int i = 0; i < brojevi.size(); i++) {

            if (brojevi.get(i) == x) {

                indexi.add(i);
            }

        }

        for (int i = 0; i < indexi.size(); i++) {
            System.out.print(indexi.get(i)+ ", ");

        }

    }}


