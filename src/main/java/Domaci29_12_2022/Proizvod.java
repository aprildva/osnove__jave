package Domaci29_12_2022;

public class Proizvod {

    public String naziv;

    public double cena;

    public double tezinaGr;


    public void stampaj () {

        System.out.println(naziv +", " + cena + ", "+ tezinaGr + "grama");
    }

    public void povecajCenu ( double povecaj) {

        cena=cena+povecaj;
    }

    public  double vratiCenuSaPopustom ( int popust) {
        cena=cena-popust;
        return cena;
    }

    public double racunajPostarinu (){
        double postarina=0;

        if (tezinaGr<100) {
            postarina=200;
            return postarina;

        } else if (tezinaGr>101 && tezinaGr<501) {
            postarina=400;
            return postarina;
            
        } else if (tezinaGr>501) {
            postarina=1000;
            return postarina;
        }
        return 0;
    }

}
