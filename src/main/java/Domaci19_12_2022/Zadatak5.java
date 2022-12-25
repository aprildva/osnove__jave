package Domaci19_12_2022;


import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {


//        Napisati program za ucenje matematike. Program daje korisniku 5 matematickih zadataka.
//        Svaki nivo predstavlja jednu iteraciju petlje i u svakom nivou korisniku se prikazuju dva random broja koja treba da sabere i poruka o tacnosti resenja.
//
//        (Program generise random brojeve u opsegu od 0 do 50, ne unosi ih korisnik)

        Scanner s = new Scanner (System.in);
        Random random = new Random();

        int resenje = 0;

        int x = random.nextInt(50);
        int y = random.nextInt(50);


        for (int i = 0; i <5 ; i++) {

            x = random.nextInt(50);
            y = random.nextInt(50);

            System.out.println("Koliko je "+ x + " + "+ y +" ? ");
            resenje=s.nextInt();




        if (x+y==resenje) {
            System.out.println("Cestitamo!");
        }

        if (x+y!=resenje)
        {
            System.out.println("Greska!");

        }
        }

    }
}
