package Domaci10_01_2022;

public class Zadatak1 {
    public static void main(String[] args) {

//        Kreirati klasu Autor koja ima
//        -ime i prezime
//        -konstuktore koje mislite da su vam potrebni
//        -gettere i settere za atribute
//        -metodu print koja stampa u formatu:
//        (ime autora) (prezime autora)
//
//        Kreirati klasu Knjiga koji ima:
//        -ISBN
//        -naziv
//         -godina izdanja
//         -autor
//         -konstuktore koje mislite da su vam potrebni
//        -gettere i settere za atribute
//        -metodu print koja stampa u formatu (izbegavati dupliranje koda):
//        (ISBN)
//        (naziv) - (godina izdanja)
//        autor: (ime autora) (prezime autora)
//
//        U glavnom programu napraviti vise autora sa vise knjiga.



                Autor d =new Autor("Petar","Peric");
        d.stampaj();


         Autor a=new  Autor("Marko ","Antic");

         Knjiga k=new Knjiga("12121212", "Carstvo",1998);

         k.setpisao(a);

         k.stampaj1();

         Autor b = new Autor("Dejan","Pakic");
         Knjiga k2  =new Knjiga("22222222", "Prolece", 2002);

         k2.setpisao(b);

         k2.stampaj1();
    }
}
