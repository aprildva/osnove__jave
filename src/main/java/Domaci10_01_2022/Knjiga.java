package Domaci10_01_2022;

public class Knjiga {

    private  String isbn;

    private String naziv;
    private int godina;

    private Autor pisao;

    public Knjiga (String isbn, String naziv, int godina) {
        this.isbn=isbn;
        this.naziv=naziv;
        this.godina=godina;
    }
    public void setpisao (Autor pisao) {
        this.pisao=pisao;
    }

    public void stampaj1() {
        System.out.println(isbn);
        System.out.println(naziv + " - " + godina);
        System.out.println("Autor: " + this.pisao.getIme() + " "+ this.pisao.getPrezime());

    }
}
