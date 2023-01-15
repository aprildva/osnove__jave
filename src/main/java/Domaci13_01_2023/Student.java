package Domaci13_01_2023;

import java.util.ArrayList;

public class Student {
    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }

    public void setBrIndexa(String brIndexa) {
        this.brIndexa = brIndexa;
    }


    public void setIme(String ime) {
        this.ime = ime;
    }

    public Student(String brIndexa, String ime, String prezime, String tipStudija) {
        this.brIndexa = brIndexa;
        this.ime = ime;
        this.prezime = prezime;
        this.tipStudija = tipStudija;
        this.ispiti=new ArrayList<>();
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public String getBrIndexa() {
        return brIndexa;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    private String brIndexa;

    private String ime;

    private String prezime;
     private String tipStudija;
     private ArrayList < Ispit> ispiti;

     public void dodajIspit (Ispit ispit){
         ispiti.add(ispit);
     }

     public void prosek (){
         double suma=0;
         int brojac=0;


         for (int i = 0; i < ispiti.size(); i++) {

             if (ispiti.get(i).getOcena()>5) {
                 suma=suma+ispiti.get(i).getOcena();
                 brojac++;
             }

           }
         System.out.println("Prosecna ocena je: "+ suma/brojac); }





     public void stampaj () {

         System.out.println(this.brIndexa + " - " + this.ime +" "+ this.prezime + " - "+ this.tipStudija);
         System.out.println("Predmeti:");
         for (int i = 0; i < ispiti.size(); i++) {
             ispiti.get(i).stampajIspit();

         }

     }


}
