package Domaci10_01_2022;

public class Kupac {
    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public Kartica getKartica() {
        return kartica;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public void setKartica(Kartica kartica) {
        this.kartica = kartica;
    }

    private String imeIPrezime;
    private Kartica kartica = new Kartica();

    public Kupac (){

    }
    public Kupac( String imeIPrezime) {
        this.imeIPrezime=imeIPrezime;
    }

    public void stampaj1() {
        System.out.println(imeIPrezime + " - " +kartica.getBrojKartice());
    }

}




