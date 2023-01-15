package Domaci12_01_2023;

import p12_01_2023.Sastojak;

import java.util.ArrayList;

public class ZeleniKartonMain {
    public static void main(String[] args) {

        ArrayList<ZeleniKarton>  kartoni = new ArrayList<ZeleniKarton>();

        ZeleniKarton ivana=new ZeleniKarton("Ivana","Misic",123,"Darko","Peric",10,"Fizika");
        ZeleniKarton valadica=new ZeleniKarton("Vladica","Zivkovic",124,"Darko","Savic",6,"Kultura");
        ZeleniKarton marko=new ZeleniKarton("Marko","Markovic",126,"Milan","Glisic",8,"Teorija");
        ZeleniKarton jelena=new ZeleniKarton("Jelena","Zigic",148,"Vukasin","Zubac",5,"Muzicko");

        kartoni.add(ivana);
        kartoni.add(valadica);
        kartoni.add(marko);
        kartoni.add(jelena);

        for (int i = 0; i < kartoni.size(); i++) {
            kartoni.get(i).stampaj();
            kartoni.get(i).polozen(kartoni.get(i).getOcena());
        }
        double suma =0;

        for (int i = 0; i < kartoni.size(); i++) {
         suma = suma+kartoni.get(i).getOcena();

        }
        System.out.println("Prosecna ocena je: " + suma/kartoni.size());


        double suma2=0;

        int broj=0;

        for (int i = 0; i < kartoni.size(); i++) {

            if(kartoni.get(i).getOcena()>5) {
                suma2=suma2+kartoni.get(i).getOcena();
                broj++;
            }
        }

        System.out.println("Prosecna ocena polozenih ispita je: " + suma2/broj );



    }
}
