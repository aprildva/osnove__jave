package Domaci19_01_2023;

public abstract class  Ambalaza {

    public Ambalaza(String barKod, String naziv, double netoTezina, double brutoTezina) {
        this.barKod = barKod;
        this.naziv = naziv;
        this.netoTezina = netoTezina;
        this.brutoTezina = brutoTezina;
    }

    public Ambalaza () {

    }

    protected String barKod;

    protected String naziv;

    protected double netoTezina;

    protected double brutoTezina;


    public String getBarKod() {
        return barKod;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getNetoTezina() {
        return netoTezina;
    }

    public double getBrutoTezina() {
        return brutoTezina;
    }

    public void setBarKod(String barKod) {
        this.barKod = barKod;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setNetoTezina(double netoTezina) {
        this.netoTezina = netoTezina;
    }

    public void setBrutoTezina(double brutoTezina) {
        this.brutoTezina = brutoTezina;
    }

    public double tezina ( double netoTezina, double brutoTezina) {
       double ukupno= brutoTezina-netoTezina;
       return ukupno;
    }

    public abstract double cena ();

    public abstract void stampaj ();
}
