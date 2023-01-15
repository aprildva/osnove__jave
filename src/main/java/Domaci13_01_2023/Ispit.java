package Domaci13_01_2023;

public class Ispit {
    private String predmet;

    private int ocena;

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public void setImeProfesora(String imeProfesora) {
        this.imeProfesora = imeProfesora;
    }

    public void setPrezimeProfesora(String prezimeProfesora) {
        this.prezimeProfesora = prezimeProfesora;
    }

    public String getPredmet() {
        return predmet;
    }

    public int getOcena() {
        return ocena;
    }

    public String getImeProfesora() {
        return imeProfesora;
    }

    public String getPrezimeProfesora() {
        return prezimeProfesora;
    }

    private String imeProfesora;

    public Ispit(String predmet, int ocena, String imeProfesora, String prezimeProfesora) {
        this.predmet = predmet;
        this.ocena = ocena;
        this.imeProfesora = imeProfesora;
        this.prezimeProfesora = prezimeProfesora;
    }

    private  String prezimeProfesora;


    public void polozenIspit () {
        if (this.ocena>5) {
            System.out.println("Polozen ispit");
        }

        else {
            System.out.println("Nije polozen ispit");

        }}

        public void stampajIspit() {

            System.out.println(this.predmet+ " - "+ this.imeProfesora + " "+ this.prezimeProfesora + " " +this.ocena );
        }



}
