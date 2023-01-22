package APrviJavaTest;

import java.util.Scanner;

public class JavaZadatak1 {
    public static void main(String[] args) {
//        Zadatak (Grananja)
//        Napisati program koji za dve unete osobe ispisuje koja je starija. Za svaku osobu se od  podataka unosi ime, godina, mesec i dan rodjenja. Na kraju programa ispisati koja je osoba starija.
//
//        Primer izvrsenja 1:
//        Unesite ime prve osobe: Pera
//        Unesite godinu rodjenja prve osobe: 1998
//        Unesite mesec rodjenja prve osobe: 10
//        Unesite dan rodjenja prve osobe: 21
//        Unesite ime druge osobe: Mika
//        Unesite godinu rodjenja druge osobe: 1999
//        Unesite mesec rodjenja druge osobe: 12
//        Unesite dan rodjenja druge osobe: 15
//        Pera je stariji.
//
//                Primer izvrsenja 2:
//        Unesite ime prve osobe: Pera
//        Unesite godinu rodjenja prve osobe: 1998
//        Unesite mesec rodjenja prve osobe: 10
//        Unesite dan rodjenja prve osobe: 21
//        Unesite ime druge osobe: Mika
//        Unesite godinu rodjenja druge osobe: 1998
//        Unesite mesec rodjenja druge osobe: 12
//        Unesite dan rodjenja druge osobe: 15
//        Pera je stariji.
//
//                Primer izvrsenja 3:
//        Unesite ime prve osobe: Pera
//        Unesite godinu rodjenja prve osobe: 1998
//        Unesite mesec rodjenja prve osobe: 10
//        Unesite dan rodjenja prve osobe: 21
//        Unesite ime druge osobe: Mika
//        Unesite godinu rodjenja druge osobe: 1998
//        Unesite mesec rodjenja druge osobe: 10
//        Unesite dan rodjenja druge osobe: 15
//        Mika je stariji.
//
//
//                Primer izvrsenja 4:
//        Unesite ime prve osobe: Pera
//        Unesite godinu rodjenja prve osobe: 1998
//        Unesite mesec rodjenja prve osobe: 10
//        Unesite dan rodjenja prve osobe: 21
//        Unesite ime druge osobe: Mika
//        Unesite godinu rodjenja druge osobe: 1998
//        Unesite mesec rodjenja druge osobe: 10
//        Unesite dan rodjenja druge osobe: 21
//        Iste su starosti.



                Scanner s = new Scanner (System.in);

        System.out.print("Unesite ime prve osobe:");
        String ime1=s.next();
        System.out.print("Unesite godinu rodjenja prve osobe:");
        int godina1=s.nextInt();
        System.out.print("Unesite mesec rodjenja prve osobe:");
        int mesec1=s.nextInt();
        System.out.print("Unesite dan rodjenja prve osobe:");
        int dan1=s.nextInt();

        System.out.print("Unesite ime druge osobe:");
        String ime2=s.next();
        System.out.print("Unesite godinu rodjenja druge osobe:");
        int godina2=s.nextInt();
        System.out.print("Unesite mesec rodjenja druge osobe:");
        int mesec2=s.nextInt();
        System.out.print ("Unesite dan rodjenja druge osobe:");
        int dan2=s.nextInt();

        if ( godina1<godina2 ){

            System.out.println(ime1 + " je starija");
        }


        else if (godina1==godina2 && mesec1<mesec2) {
            System.out.println(ime1 + " je starija");

        }
        else if (godina1==godina2 && mesec1==mesec2 && dan1<dan2) {
            System.out.println(ime1 + " je starija");
        }

        else if (godina1==godina2 && mesec1==mesec2 && dan1==dan2) {
            System.out.println("Iste su starosti.");
        }

        else {

            System.out.println(ime2 + (" je starije"));
        }







    }
}
