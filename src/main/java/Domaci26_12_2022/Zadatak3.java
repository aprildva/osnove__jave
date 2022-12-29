package Domaci26_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

//        Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
//        ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//        ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.


        Scanner s = new Scanner(System.in);
        System.out.print("unesi broj a: ");
        int a=s.nextInt();

        System.out.print("Unesi broj b: ");
        int b=s.nextInt();

//        int a=6;
//        int b=2;

        novBroj(a,b);
        System.out.println(novBroj(a,b));

    }


    public static int novBroj (int a,int b) {

        int broj = a*10+b;
        return broj;

    }
}
