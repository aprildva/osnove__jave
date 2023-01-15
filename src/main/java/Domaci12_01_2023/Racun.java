package Domaci12_01_2023;

public class Racun {
    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public Racun(String brojRacuna, String ime, String prezime, int stanje) {
        this.brojRacuna = brojRacuna;
        this.ime = ime;
        this.prezime = prezime;
        this.stanje = stanje;
    }

    public int getStanje() {
        return stanje;
    }

    private String brojRacuna;

     private String ime;

     private String prezime;

     private int stanje;

     public void menjajStanjemanje( int vrednost) {


         this.stanje=this.stanje-vrednost-45;

         if (this.stanje<vrednost) {
             this.stanje=0;
         }

     }
    public void menjaJStanjevise( int vrednost) {


        this.stanje=this.stanje+vrednost;

    }

     public void stampajStanje() {

         System.out.println( this.ime + " "+ this.prezime + " -"+ this.brojRacuna);
         System.out.println(this.stanje);
     }




}
