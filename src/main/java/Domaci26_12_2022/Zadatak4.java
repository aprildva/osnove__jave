package Domaci26_12_2022;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[]args) {

//        Zadatak
//        Napisati metodu koja stampa podatke o korisniku u formatu:
//        JMBG: [jmbg]
//        Ime: [ime]
//        Prezime: [prezime]
//        God. rodjenja: [god]
//        Aktivan: [true/false]
//        Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.


        Scanner s = new Scanner(System.in);
    System.out.print("Unesite JMBG: ");
    String jmbg=s.next();

    System.out.print("Unesite ime: ");
    String ime=s.next();

    System.out.print("Unesite prezime: ");
    String prezime=s.next();

    System.out.print("Unesite godinu rodjenja: ");
    int godRodjenja=s.nextInt();

    System.out.print("Aktivan: ");
    boolean aktivan=s.nextBoolean();

    podaci(jmbg, ime, prezime,godRodjenja,aktivan);



}

    public static void podaci ( String jmbg, String ime, String prezime, int godRodjenja, boolean aktivan){

        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime. " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("God.rodjenja: " + godRodjenja);
        System.out.println("Aktivan: " + aktivan);

    }}


