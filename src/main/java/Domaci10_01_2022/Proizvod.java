package Domaci10_01_2022;

public class Proizvod {

   private String naziv;

    private int cenaIzrade;


    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCenaIzrade(int cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }



    public String getNaziv() {
        return naziv;
    }

    public int getCenaIzrade() {
        return cenaIzrade;
    }

    public Kupac getKupac() {
        return kupac;
    }

    private Kupac kupac= new Kupac();



   public Proizvod ( String naziv, int cenaIzrade) {
       this.naziv=naziv;
       this.cenaIzrade=cenaIzrade;

   }
    public double cenaProizvoda () {
       double a=0;
     a= cenaIzrade*1.9*(100- kupac.getKartica().getPopust())/100;
     return a;
    }

    public  void  stampaj()
    {
        System.out.println(naziv + " - " + cenaProizvoda());
    }
}
