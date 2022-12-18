package Domaci13_12_2022;

import javax.sound.midi.Soundbank;

public class Zadatak4 {
    public static void main(String[] args) {

//        Napisati program koji racuna i ispisuje povrsinu i obim trougla.
//        KOREN BROJA 3 neka bude konstanta 1.73. Za stranicu trougla postavite proizvoljnu vrednost.
//        Primer izvrsenja programa:
//        a: 10
//        Povrsina je 43.25
//        Obim je 30

        int a=10;
        double korenBroja =1.73;
        double povrsina = a*a*korenBroja/4;
        int obim =3*a;

        System.out.println("a : 10");
        System.out.println("Povrsina je "+ povrsina);
        System.out.println("Obim je " + obim);


    }
}
