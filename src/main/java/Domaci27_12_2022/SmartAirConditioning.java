package Domaci27_12_2022;

import java.awt.event.WindowFocusListener;

public class SmartAirConditioning {

    public  String marka;

    public int izabranaTem ;

    public String mod;

    public void stampaj()
    {

        System.out.println( "Klima je marke " + marka);
        System.out.println("Zeljena temperatura: "+izabranaTem+ " stepena C");
        System.out.println("Klima je na modu - "+ mod);
    }

    public String informacija ( int temperatura) {

        if (temperatura<izabranaTem){

        return "greje"; }

        else  {
            return "hladi";
        }
    }







}
