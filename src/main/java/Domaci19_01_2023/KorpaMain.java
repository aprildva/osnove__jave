package Domaci19_01_2023;

public class KorpaMain {
    public static void main(String[] args) {
        Korpa korpa = new Korpa();

        Ambalaza tetrapak=new Tetrapak("145","Jogurt",100,150,false,150);
        Ambalaza staklo=new StaklenaAmbalaza("500","Sok",150,200,10,false,300);


       tetrapak.stampaj();
       staklo.stampaj();

        korpa.dodajAmbalazu(tetrapak);
        korpa.dodajAmbalazu(staklo);


        SuperKartica kartica = new SuperKartica("123","Pera",10);

        System.out.println(korpa.cenaKorpePopust (kartica));


        korpa.izbaciIzKorpe("500");

        System.out.println(korpa.cenaKorpePopust (kartica));




    }




}
