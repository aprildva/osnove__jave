package Domaci16_01_2023;

import p13_01_2023.Sastojak;

import java.util.ArrayList;

public class Igrac extends Osoba {
    private int broj;

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public int getBroj() {
        return broj;
    }

    public void setKapite(boolean kapite) {
        this.kapiten = kapite;
    }

    public String getPozicija() {
        return pozicija;
    }

    public boolean isKapite() {
        return kapiten;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    private String pozicija;

    private boolean kapiten;



    public Igrac (String imeIPrezime, String jmbg, int godiRodjenja, int broj, String pozicija, boolean kapiten) {
        super(imeIPrezime, jmbg, godiRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
    }

    public void stampaj(){

        super.stampaj();
        System.out.println( "Broj: " + broj + ", "+ "Pozicija: " + pozicija+", "+ "Kapiten : " + kapiten);
    }








}
