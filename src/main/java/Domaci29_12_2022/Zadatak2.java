package Domaci29_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

//        Kreirati klasu FacebookPost koja ima:
//        Od atributa:
//        ime i prezime korisnika koji je objavio post
//        ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//        tekst objave
//        broj lajkova
//        broj deljenja
//        gettere za sve atribute
//        settere za sve atribute osim broja lajkova i broja deljenja
//        Od metoda:
//        like(), koja povecava broj lajkova za 1.
//        dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//        share(), koja povecava broj deljenja za 1
//        print(), koja stampa objavu u formatu:
//        (ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//        (tekst objave)
//        Likes (broj lajkova) | Shares (broj deljenja)

//        U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.


        Scanner s= new Scanner(System.in);

        FacebookPost prvi = new FacebookPost();

        System.out.println("Unesite ime i prezime Korisnika 1: ");
        String ime1 =s.nextLine();
        prvi.setKorisnik1(ime1);

        System.out.println("Unesite ime i prezime korisnika 2: ");
        String ime2=s.nextLine();
        prvi.setKorisnik2(ime2);

        System.out.println("Unesi tekst objave: ");
        String tekst1=s.nextLine();
        prvi.setTekst(tekst1);

        prvi.like();
        prvi.share();
        prvi.like();

        prvi.stampaj();

        FacebookPost drugi = new FacebookPost();

        System.out.println("Unesite ime i prezime  Korisnika 1: ");
        String ime3 =s.nextLine();
        drugi.setKorisnik1(ime3);

        System.out.println("Unesite ime i prezime korisnika 2");
        String ime4=s.nextLine();
        drugi.setKorisnik2(ime4);

        System.out.println("Unesi tekst objave:");
        String tekst2=s.nextLine();
        drugi.setTekst(tekst2);

        drugi.like();
        drugi.share();
        drugi.like();
        drugi.like();

        drugi.stampaj();

    }
}
