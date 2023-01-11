package Domaci10_01_2022;

public class Kartica {

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public double getPopust() {
        return popust;
    }

    private double popust =10;

    private String brojKartice ="123";

    public Kartica() {

    }

    public Kartica(double popust, String brojKartice) {

        this.popust=popust;
        this.brojKartice=brojKartice;
    }

}


