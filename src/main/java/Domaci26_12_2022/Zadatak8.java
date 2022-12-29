package Domaci26_12_2022;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {

//        Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
//        U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite tri broja: ");
        int broj1=s.nextInt();
        int broj2=s.nextInt();
        int broj3=s.nextInt();

        System.out.println("Najmanji broj je" + najmanji(broj1,broj2,broj3));


    }

    public static int najmanji (int a, int b, int c) {


        if (a<b && a<c) {
            return a;
        }

        else if (b<a && b<c) {

            return b;

        } else if (c<a & c<b) {
            return c;

        }
        return 0;


    }





}
