package APrviJavaTest;

import java.util.Scanner;

public class JavaZadatak4 {

//    Zadatak (While petlja)
//    Napisati program koji pruza mogucnost postavljanja lozinke. Korisnik prvo unosi lozinku a zatim program od korisnika zahteva unos kojim potvrdjuje lozinku sve dok se ne poklopi sa lozinkom ili dok mu se ne blokira mogucnost postavljanja lozinke. Korisnik moze maksimalno 3 puta da pogresi potvrdu lozinke.
//    Ukoliko se lozinke ne poklapaju ispisati gresku “Lozinke se ne poklapaju”
//    Ukoliko korisnik unese pogresno potvrdu lozinke vise od 3 puta, ispisati poruku “Mogucnost postavljanja lozinke je blokirana”
//    Ukoliko se lozinke poklapaju ispisati “Lozinka je uspesno postavljena”
//    Primer izvrsenja 1:
//    Unesite lozinku: sifra123
//    Potvrdite lozinku: pogresna
//    Lozinke se ne poklapaju
//    Potvrdite lozinku: pogresna
//    Lozinke se ne poklapaju
//    Potvrdite lozinku: sifra123
//    Lozinka je uspesno postavljena
//
//
//    Primer izvrsenja 2:
//    Unesite lozinku: sifra123
//    Potvrdite lozinku: pogresna
//    Lozinke se ne poklapaju
//    Potvrdite lozinku: pogresna
//    Lozinke se ne poklapaju
//    Potvrdite lozinku: pogresna
//    Lozinke se ne poklapaju
//    Potvrdite lozinku: pogresna
//    Mogucnost postavljanja lozinke je blokirana

    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);

        System.out.println("Unesi lozinku: ");
        String lozinka=s.next();

      int brojac=0;
      boolean poklapaju = false;


        while ( !poklapaju && brojac<4  ) {

            System.out.println("Potvrdi lozinku: ");
            String  potrda=s.next();

            if (lozinka.equals(potrda)) {

                System.out.println("Lozinke se poklapaju!");

                poklapaju=true;

            }

            else {
                System.out.println("Lozinke se ne poklapaju:");
                brojac++;

            }}

            if (!poklapaju) {

                System.out.println(" Mogucnost postavljanja lozinke je blokirana:");
            }


        }





    }


