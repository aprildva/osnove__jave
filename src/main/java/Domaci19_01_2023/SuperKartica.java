package Domaci19_01_2023;

public class SuperKartica {
    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public void setPunoImeVlasnika(String punoImeVlasnika) {
        this.punoImeVlasnika = punoImeVlasnika;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public String getPunoImeVlasnika() {
        return punoImeVlasnika;
    }

    public int getPopust() {
        return popust;
    }



    public SuperKartica(String brojKartice, String punoImeVlasnika, int popust) {
        this.brojKartice = brojKartice;
        this.punoImeVlasnika = punoImeVlasnika;
        this.popust = popust;
    }

    public SuperKartica() {

    }

    private String brojKartice;

    private  String punoImeVlasnika;

    private int popust;

    public void stampajkarticu(){
        System.out.println(this.brojKartice + ", "+ this.punoImeVlasnika);
    }



}
