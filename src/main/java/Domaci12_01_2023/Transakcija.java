package Domaci12_01_2023;

import p10_01_2023.Korisnik;

public class Transakcija {
    public String getId() {
        return id;
    }

    public Transakcija(String id, String racunPrenos, String racunPrima, Racun posiljalac,Racun primalac) {
        this.id = id;
        this.racunPrenos = racunPrenos;
        this.racunPrima = racunPrima;
        this.posiljalac=posiljalac;
        this.primalac=primalac;

    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRacunPrenos(String racunPrenos) {
        this.racunPrenos = racunPrenos;
    }

    public void setRacunPrima(String racunPrima) {
        this.racunPrima = racunPrima;
    }

    public String getRacunPrenos() {
        return racunPrenos;
    }

    public String getRacunPrima() {
        return racunPrima;
    }

    private String id;

     private String racunPrenos;

     private String racunPrima;

    public Racun getPosiljalac() {
        return posiljalac;
    }

    public Racun getPrimalac() {
        return primalac;
    }

    private Racun posiljalac;

     private Racun primalac;

     public void izvrsiTransakciju (int vrednost) {

         if (this.posiljalac.getStanje()+45 > vrednost) {
             this.posiljalac.menjajStanjemanje(vrednost);
         }

         if (this.posiljalac.getStanje()>vrednost)  {
             this.primalac.menjaJStanjevise(vrednost);
         }

         else {
             System.out.println("Nema dovoljno sredstava na racunu");
         }


     }

     public void stampajTransakciju (){

         System.out.println(this.id);
         System.out.println(this.posiljalac.getIme()+ " "+ this.posiljalac.getPrezime()+ " - "+ this.posiljalac.getBrojRacuna());
         System.out.println(this.primalac.getIme() + " "+ this.primalac.getPrezime()+ " - "+ this.primalac.getBrojRacuna());
     }


}








