package Domaci12_01_2023;

public class TransakcijaMain {
    public static void main(String[] args) {
        Racun posaljilac =new Racun("123-123-123","Ivana","Misic",150);
        Racun primalac=new Racun("123-123-456","Sasa","Peric",300);

        Transakcija prva=new Transakcija("111",posaljilac.getBrojRacuna(),posaljilac.getBrojRacuna(),posaljilac,primalac);

        posaljilac.stampajStanje();
        primalac.stampajStanje();

        prva.izvrsiTransakciju(50);

        posaljilac.stampajStanje();
        primalac.stampajStanje();

        prva.stampajTransakciju();




    }
}
