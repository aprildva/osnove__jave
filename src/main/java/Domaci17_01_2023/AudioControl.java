package Domaci17_01_2023;

public class AudioControl extends Control{

    public AudioControl(boolean menjaZvuk) {
        this.menjaZvuk = menjaZvuk;
    }

    private boolean menjaZvuk;

    @Override
    public void izvrsiAkciju(VideoPlayer video) {

        if (!menjaZvuk) {
            video.setJacinaZvuka(video.getJacinaZvuka()+1);

        if (video.getVreme()>100) {
            video.setVreme(100);
        } }


        else  { video.setJacinaZvuka(video.getJacinaZvuka()-1);


         if (video.getVreme()<100) {
        video.setVreme(0);
    }
    }
}}
