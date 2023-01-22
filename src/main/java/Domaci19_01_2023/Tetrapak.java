package Domaci19_01_2023;

public class Tetrapak extends Ambalaza{
    public Tetrapak(String barKod, String naziv, double netoTezina, double brutoTezina, boolean recikliranje, double osnovnaCena) {
        super(barKod, naziv, netoTezina, brutoTezina);
        this.reciklirano = recikliranje;
        this.osnovnaCena = osnovnaCena;
    }


    private boolean reciklirano;

    private double osnovnaCena;

    @Override
    public double cena () {
        if (reciklirano==true) {
            return this.tezina(getNetoTezina(),getBrutoTezina())*1.5+this.osnovnaCena;
        }

        else if (reciklirano==false) {
            return this.osnovnaCena;

        }
        return 0;
    }
  @Override
    public void stampaj () {

      System.out.println(this.barKod);
      System.out.println(this.naziv);
      System.out.println(this.netoTezina);
      System.out.println(this.brutoTezina);
      System.out.println(this.reciklirano);
      System.out.println(this.osnovnaCena);
      System.out.println(this.cena());
  }


}
