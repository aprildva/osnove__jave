package Domaci17_01_2023;

public class TimeControl extends Control{

    public TimeControl(boolean pomera) {
        this.pomeraVreme = pomera;
    }

    protected boolean pomeraVreme;


    @Override
    public void izvrsiAkciju(VideoPlayer video) {
        if( !pomeraVreme ){
            video.setVreme(video.getVreme()+15);
            if (video.getVreme()>video.duzinaVidea) {
                video.setVreme(video.getDuzinaVidea());
            }
    }
        else {
            video.setVreme(video.getVreme()-15);
        }
        if (video.getVreme()<video.duzinaVidea) {
            video.setVreme(video.getDuzinaVidea());
        }
}



}




