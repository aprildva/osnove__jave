package Domaci10_01_2022;

public class Autor {

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    private String ime;

    private String prezime;

    public Autor (String ime,String prezime) {
        this.ime=ime;
        this.prezime=prezime;
    }
    public void stampaj () {

        System.out.println(ime + " " + prezime);
    }
}
