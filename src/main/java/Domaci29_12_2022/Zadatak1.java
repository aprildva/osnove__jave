package Domaci29_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {

//        Napisati klasu Proizvod koja ima atribute
//        naziv proizvoda (String)
//        cenu proizvoda (double)
//        težinu proizvoda u gramima. (double)
//                i metode:
//        stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//        povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu.
//                      Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//       vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda kada se uračuna popust.
//                            Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//        racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe.
//                            Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//             za tezinu do 100g, postarina iznosi 200din
//             za tezinu od 101g do 500g, postarina iznosi 400din
//             za tezinu preko 500g, postarina iznosi 1000din



        Proizvod biljka = new Proizvod();

        biljka.naziv="Iris";
        biljka.cena=50;
        biljka.tezinaGr=45.3;


        biljka.stampaj();
        biljka.povecajCenu(15.5);
        System.out.println(biljka.vratiCenuSaPopustom(50));
        System.out.println (biljka.racunajPostarinu());


        Proizvod knjiga = new Proizvod();

        knjiga.naziv="Prolece";
        knjiga.cena=150;
        knjiga.tezinaGr=500;


        knjiga.stampaj();
        knjiga.povecajCenu(50);
        System.out.println(knjiga.vratiCenuSaPopustom(15));
        System.out.println (knjiga.racunajPostarinu());
    }
}
