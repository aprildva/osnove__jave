package Domaci16_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

//        Napisati program koji stampa 25 _ (donjih crta), pritom na svaku 5. iteraciju odstampa i novi red. Zadatak resiti pomocu FOR petlje.


        for (int i = 6; i < 31; i++)
        if ( i%5==0)
        {
            System.out.println("_");
        }
        else
        {
            System.out.print("_");
        }


    }
}
