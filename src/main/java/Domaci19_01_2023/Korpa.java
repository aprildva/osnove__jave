package Domaci19_01_2023;

import java.util.ArrayList;

public class Korpa {


    public Korpa() {

        ambalaze=new ArrayList<>();

    }

    private ArrayList <Ambalaza> ambalaze;

    public void dodajAmbalazu(Ambalaza ambalaza){
        this.ambalaze.add(ambalaza);

    }

    public void izbaciIzKorpe( String barkod) {
        for (int i = 0; i < this.ambalaze.size(); i++) {
            if(this.ambalaze.get(i).getBarKod().equals(barkod));
            this.ambalaze.remove(i);
        }

    }

    private double  cenaPopust (int popust) {

        double iznos=0;

        for (int i = 0; i < ambalaze.size(); i++) {

           iznos=iznos+ ambalaze.get(i).cena()-popust;

        }
        return iznos;

    }


    public double cenaKorpePopust ( SuperKartica kartica) {

     double suma=0;

        for (int i = 0; i <ambalaze.size() ; i++) {
            suma=suma+ambalaze.get(i).cena()-kartica.getPopust();

        }
        return suma;
    }


}
