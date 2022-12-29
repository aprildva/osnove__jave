package Domaci27_12_2022;

public class Proizvod {

public String naziv;

public double cena;

public double tezinaGr;

    public void stampaj(){

        System.out.println(naziv + ", "+ cena + " dinara"+ ", "+tezinaGr+ " grama");
    }

    public double konvertuj ( String jedinica) {

        if (jedinica.equals("kg")) {

            double konvrt = tezinaGr/1000;
            return konvrt;


        }
         else if (jedinica.equals("t")) {

            double konvert =tezinaGr/1000000;
            return konvert;

            }


return 0;
        }

    }









