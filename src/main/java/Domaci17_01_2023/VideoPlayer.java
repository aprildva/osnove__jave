package Domaci17_01_2023;

public class VideoPlayer  {

    public VideoPlayer(int duzinaVidea, int vreme, int jacinaZvuka, int kvalitet) {
        this.duzinaVidea = duzinaVidea;
        this.vreme = vreme;
        this.jacinaZvuka = jacinaZvuka;
        this.kvalitet = kvalitet;
    }

    public void setDuzinaVidea(int duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public void setVreme(int vreme) {
        this.vreme = vreme;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public void setKvalitet(double kvalitet) {
        this.kvalitet = kvalitet;
    }

    public int getDuzinaVidea() {
        return duzinaVidea;
    }

    public int getVreme() {
        return vreme;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public double getKvalitet() {
        return kvalitet;
    }

    protected int duzinaVidea;

    protected int vreme;

    protected  int jacinaZvuka;

    protected double kvalitet;

    public void stampaj() {
        System.out.println("Duzina videa:" + duzinaVidea);
        System.out.println("Trenutno Vreme: "+ vreme);
        System.out.println("Jacina zvuka:  " + jacinaZvuka);
        System.out.println("Kvalitet videa. " +kvalitet);
    }





}
