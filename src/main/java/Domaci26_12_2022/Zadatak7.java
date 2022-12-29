package Domaci26_12_2022;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {

//    Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.

//    Primer izvrsenja:
//    izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//    izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1



    Scanner s = new Scanner(System.in);
    System.out.print("Unesite M: ");
    int m=s.nextInt();

    System.out.print("Unesite N: ");
    int n =s.nextInt();

    izbroj(m,n);

    }


    public static int izbroj ( int a, int b) {

        int c= Math.abs(a-b+1);
        System.out.println(("Izbroj ( ") + a + (", ")+ b +(" )") + ("ima rezultat ")+ c+("."));
        return 0;
    }

}
