package APrviJavaTest;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaZadatak3 {

//    Zadatak (Nizovi)
//    Napisati program koji cuva dva niza celih brojeva, jedan za parne brojeve a drugi za neparne brojeve. Program sa tastature ucitava N brojeva koje unosi korisnik i parne brojeve dodaje u niz parnih brojeva a neparne brojeve u niz neparnih. Na kraju programa odstampati brojeve oba niza kao i sumu svakog niza.
//    Napomena: Nizovi se stampaju koristeci petlje.
//
//    Primer izvrsenja:
//    Unesite N: 9
//    Unesite broj: 1
//    Unesite broj: 2
//    Unesite broj: 4
//    Unesite broj: 8
//    Unesite broj: 3
//    Unesite broj: 9
//    Unesite broj: 13
//    Unesite broj: 10
//    Unesite broj: 4
//
//    Niz parnih: 2, 4, 8, 10, 4
//    Suma parnih: 28
//    Niz neparnih: 1, 3, 9, 13
//    Suma neparnih: 26


    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);

        ArrayList<Integer> parna = new ArrayList<Integer>();
        ArrayList<Integer> neparna = new ArrayList<Integer>();

        System.out.println("Unesi N broj:  ");
          int n=s.nextInt();

        int sumaPar=0;
        int sumaNepar=0;


        for (int i = 0; i < n; i++) {
            System.out.println("Unesi broj: ");
            int broj = s.nextInt();

            if (broj % 2 == 0) {
                parna.add(broj);
                sumaPar = sumaPar + broj;


            } else {
                neparna.add(broj);
                sumaNepar = sumaNepar + broj;

            }
        }

            System.out.print("Niz parnih ");

            for (int i = 0; i <parna.size() ; i++) {
                System.out.print( parna.get (i) + ", ");

            }

        System.out.println();

            System.out.println("Suma parnih: "+ sumaPar);


        System.out.print("Niz neparnih ");

        for (int i = 0; i < neparna.size(); i++) {
            System.out.print(neparna.get(i) + ", ");

        }
        System.out.println();

        System.out.println("Suma neparnih: "+ sumaNepar);



    }
}
