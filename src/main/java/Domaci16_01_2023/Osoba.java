package Domaci16_01_2023;

public class Osoba {


    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public void setGodiRodjenja(int godiRodjenja) {
        this.godiRodjenja = godiRodjenja;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public int getGodiRodjenja() {
        return godiRodjenja;
    }

    protected String imeIPrezime;
    protected String jmbg;
    protected int godiRodjenja;

    public Osoba () {

    }
    public Osoba(String imeIPrezime, String jmbg, int godiRodjenja) {
        this.imeIPrezime = imeIPrezime;
        this.jmbg = jmbg;
        this.godiRodjenja = godiRodjenja;
    }

    public void stampaj (){
        System.out.println(this.imeIPrezime + ", "+ this.jmbg+ ", "+this.godiRodjenja);
    }


}
