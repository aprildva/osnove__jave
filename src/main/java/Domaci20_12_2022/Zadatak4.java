package Domaci20_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//        Napisati program koji proverava uparenost zagrada. Korisnik unosi matematicku formulu sve dok ne unese znak =.
//        Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje da li su sve zagrade uparene.
//        Formula koja se koristi u primeru je: (2 * ( 1 + 3))=


                Scanner s = new Scanner(System.in);

        String unos = (" ");

        Boolean x = true;

        int brojac1=0;
        int brojac2=0;


        while(x) {
            System.out.println("Unos: ");
            unos =s.next();

            if (unos .equals("=")) {
                x=false;

            }
            else if (unos.equals("("))
            {
                brojac1++;
            }
            else if (unos.equals(")")){
                brojac2++;

        }}
            if ( brojac1==2 && brojac2==2){
        System.out.println("Zagrade su uparene.");}

        else{
        System.out.println("Zagrade nisu uparene.");}


}}


