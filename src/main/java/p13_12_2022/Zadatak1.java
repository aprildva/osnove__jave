package p13_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {
        // Napisati program koji na ekranu stampa podatke u formatu:
      //  [IME I PREZIME]
       //[BROJ TELEFONA], [ULICA I BROJ], [GRAD]
      //[EMAIL]
 String imeIPrezime = "Ana Micic";
 String brojTelefona = "0642004525";
 String ulicaIBroj = "Bitoljska 16";
 String grad = "Beograd";
 String email = "ana@gmail.com";

        System.out.println(imeIPrezime);
        System.out.println( brojTelefona + ", " + ulicaIBroj + ", " + grad);
        System.out.println(email);



    }
}
