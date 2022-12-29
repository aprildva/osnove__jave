package Domaci26_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

//        Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
//        Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

        Scanner s = new Scanner(System.in);
        System.out.println("Uneti broj :");
        int broj =s.nextInt();

        stampajVrednostZa10Vecu(broj);

        System.out.println("Vrednost veca 10 puta je:"+ stampajVrednostZa10Vecu(broj));



    }


    public static int stampajVrednostZa10Vecu (int a )  {
        a=a*10;

        return +a;

    }
}
