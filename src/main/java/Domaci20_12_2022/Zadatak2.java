package Domaci20_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

//        Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje arapsku vrednost
//        sve dok korisnik ne unese KRAJ..


        Scanner s = new Scanner(System.in);
    Boolean x= true;

   String b = " ";

   while (x)
   {
       System.out.print("Unesite rimski broj: ");
       b =s.next();

       if  (b.equals("KRAJ")) {
           x = false;
           System.out.println("Kraj programa.");
       }



    else if  (b.equals("I")) {

        System.out.println("Arapski: 1");
    }

       else if  (b.equals("V")) {

           System.out.println("Arapski: 5");
       }

       else if  (b.equals("X")) {

           System.out.println("Arapski: 10");
       }

       else if  (b.equals("L")) {

           System.out.println("Arapski: 50");
       }

       else if  (b.equals("C")) {

           System.out.println("Arapski: 100");
       }


       else if  (b.equals("D")) {

           System.out.println("Arapski: 500");
       }

       else if  (b.equals("M")) {

           System.out.println("Arapski: 1000");
       }

}

    }

}
