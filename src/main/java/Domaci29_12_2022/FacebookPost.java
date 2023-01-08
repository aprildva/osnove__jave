package Domaci29_12_2022;

public class FacebookPost {

    public String Korisnik1;
    public String Korisnik2;

    public String Tekst;

    int brojLike;

    int brojShare;


    public void setKorisnik1 ( String ime1) {
        this.Korisnik1=ime1;
    }

    public void setKorisnik2 ( String ime2) {
        this.Korisnik2=ime2;
    }

    public void setTekst ( String tekst) {
        this.Tekst=tekst;
    }

    public String getKorisnik1(){
        return this.Korisnik1;
    }

    public String getKorisnik2(){
        return this.Korisnik2;
    }

    public String getTekst(){
        return this.Tekst;
    }

    public int getBrojLike(){
        return this.brojLike;
    }

    public int getBrojShare(){
        return this.brojShare;
    }

    public void like() {
        brojLike=brojLike+1;
    }

    public void dislike() {
        brojLike=brojLike-1;

        if (brojLike<0) {
            brojLike=0;
        }
    }

    public void share(){
        brojShare=brojShare+1;

    }

    public void stampaj () {
        System.out.println(getKorisnik1()+ " >>>>> " + getKorisnik2());
        System.out.println(getTekst());
        System.out.println("Likes "+ getBrojLike() + "| Shares " +getBrojShare());
    }



}
