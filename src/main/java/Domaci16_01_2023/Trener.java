package Domaci16_01_2023;

public class Trener extends Osoba {



    public Trener(String imeIPrezime, String jmbg, int godiRodjenja, int godIskustva, String tip) {
        super(imeIPrezime, jmbg, godiRodjenja);
        this.godIskustva = godIskustva;
        this.tip = tip;
    }

    public int getGodIskustva() {
        return godIskustva;
    }

    public String getTip() {
        return tip;
    }

    private int godIskustva;

    private String tip;



    public void stampaj() {
        super.stampaj();
        System.out.println("Trener ima  " + godIskustva +" godina iskustva i " + "radi kao " + tip + " trener.");
    }



}
