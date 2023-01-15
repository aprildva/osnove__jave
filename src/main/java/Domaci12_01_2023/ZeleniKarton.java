package Domaci12_01_2023;

public class ZeleniKarton {


    public ZeleniKarton(String imeStudenta, String prezimeStudenta, int brojIndexa, String imeProfesora, String prezimeProfesora, int ocena, String nazivPredmeta) {
        this.imeStudenta = imeStudenta;
        this.prezimeStudenta = prezimeStudenta;
        this.brojIndexa = brojIndexa;
        this.imeProfesora = imeProfesora;
        this.prezimeProfesora = prezimeProfesora;
        this.ocena = ocena;
        this.nazivPredmeta=nazivPredmeta;
    }
    private String imeStudenta;

    private String prezimeStudenta;

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    private int brojIndexa;

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    private String nazivPredmeta;

    public void setImeStudenta(String imeStudenta) {
        this.imeStudenta = imeStudenta;
    }

    public void setPrezimeStudenta(String prezimeStudenta) {
        this.prezimeStudenta = prezimeStudenta;
    }

    public void setBrojIndexa(int brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public void setImeProfesora(String imeProfesora) {
        this.imeProfesora = imeProfesora;
    }

    public void setPrezimeProfesora(String prezimeProfesora) {
        this.prezimeProfesora = prezimeProfesora;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    private String imeProfesora;

   private String prezimeProfesora;
    private int ocena;


    public String getImeStudenta() {
        return imeStudenta;
    }

    public String getPrezimeStudenta() {
        return prezimeStudenta;
    }

    public int getBrojIndexa() {
        return brojIndexa;
    }

    public String getImeProfesora() {
        return imeProfesora;
    }

    public String getPrezimeProfesora() {
        return prezimeProfesora;
    }

    public int getOcena() {
        return ocena;
    }


    public void polozen( int ocena) {
        if (ocena >5 ) {
            System.out.println("Polozen ispit");
        }
        else {
            System.out.println("Nije polozen ispit.");
        }

    }

        public void stampaj () {

            System.out.println( this.nazivPredmeta + " - " + ocena);
            System.out.println("Student: "+ this.imeStudenta + " "+ this.prezimeStudenta);
            System.out.println("Profesor: " +this.prezimeProfesora + " "+ this.prezimeProfesora);

        }
    }

