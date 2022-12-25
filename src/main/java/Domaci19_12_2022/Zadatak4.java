package Domaci19_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//        Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija. Korisnik unosi N rekacija zatim se prikazuje evidencija:
//        Program podrzava sledece reakcije:
//        like
//        smile
//        heart

        Scanner s = new Scanner (System.in);

        int likeCounter =0;
        int smileCounter =0;
        int heartCounter =0;

        System.out.print("Unesi N: ");
        int n =s.nextInt();


        for (int i = 0; i < n ; i++) {
            System.out.println("Reaguj ");
          String reakcija =s.next();

            if (reakcija.equals("like")) {
                likeCounter=likeCounter+1;
            }
            if (reakcija.equals("smile")) {
                smileCounter=smileCounter+1;
            }
            if (reakcija.equals("heart")) {
                heartCounter=heartCounter+1;
            }

        }
        System.out.println("Summary like " + likeCounter + " | smile " + smileCounter + " | heart " + heartCounter) ;
    }
}
