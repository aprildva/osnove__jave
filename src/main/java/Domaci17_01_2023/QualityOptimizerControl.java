package Domaci17_01_2023;

public class QualityOptimizerControl extends Control {

    public QualityOptimizerControl(double brzinaNeta) {
        this.brzinaNeta = brzinaNeta;
    }

    private double brzinaNeta;


    @Override
    public void izvrsiAkciju(VideoPlayer video) {

       video.setKvalitet(this.brzinaNeta * 10.1);

        if (video.getKvalitet()<145) {
            video.setKvalitet(144);
        }
        else  if (video.getKvalitet()>145) {
            video.setKvalitet(240);
        }
        else if (video.getKvalitet()>241) {
            video.setKvalitet(360);
        }
        else if (video.getKvalitet()>361) {
            video.setKvalitet(720);
        }
        else if (video.getKvalitet()>721) {
            video.setKvalitet(1400);
        }


    }
}
