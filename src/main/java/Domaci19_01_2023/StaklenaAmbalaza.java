package Domaci19_01_2023;

public class StaklenaAmbalaza extends Ambalaza {
    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public void setDaLiSePlacaKaucija(boolean daLiSePlacaKaucija) {
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    public double getKaucija() {
        return kaucija;
    }

    public boolean isDaLiSePlacaKaucija() {
        return daLiSePlacaKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public StaklenaAmbalaza(String barKod, String naziv, double netoTezina, double brutoTezina, double kaucija, boolean daLiSePlacaKaucija, double osnovnaCena) {
        super(barKod, naziv, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
        this.osnovnaCena = osnovnaCena;
    }


    private double kaucija;
    private boolean daLiSePlacaKaucija;

    private double osnovnaCena;


    @Override
    public double cena() {
        if (daLiSePlacaKaucija == true) {

            return this.osnovnaCena * 1.2 + kaucija;
        } else if (daLiSePlacaKaucija == false) {
            return this.osnovnaCena * 1.2;
        }


        return 0;
    }


    @Override
    public void stampaj() {

        System.out.println(this.barKod);
        System.out.println(this.naziv);
        System.out.println(this.netoTezina);
        System.out.println(this.brutoTezina);
        System.out.println(this.daLiSePlacaKaucija);
        System.out.println(this.osnovnaCena);
        System.out.println(this.cena());


    }

}

