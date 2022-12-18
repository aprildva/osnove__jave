package Domaci14_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite x za T1:");
        int t1x = s.nextInt();

        System.out.print("Unesite y za T1:");
        int t1y = s.nextInt();

        System.out.print("Unesite x za T2:");
        int t2x = s.nextInt();

        System.out.print("Unesite y za T2:");
        int t2y = s.nextInt();

        System.out.print("Unesite x za M:");
        int mx = s.nextInt();

        System.out.print("Unesite y za M:");
        int my = s.nextInt();

        if ( mx < t2x  && my < t1y)

        {
            System.out.println("Kliknuto je unutar forme");
        }

        else

        {
            System.out.println("Kliknuto je van forme");
        }
    }

}
