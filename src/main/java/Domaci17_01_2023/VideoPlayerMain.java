package Domaci17_01_2023;

public class VideoPlayerMain {
    public static void main(String[] args) {

        VideoPlayer video=new VideoPlayer(150,300,140,1440);

        video.stampaj();

        TimeControl napred=new TimeControl(true);
     //   TimeControl unazad=new TimeControl(false);

        napred.izvrsiAkciju(video);

        AudioControl pojacaj=new AudioControl(true);
      //  AudioControl utisaj=new AudioControl(false);

        pojacaj.izvrsiAkciju(video);

        QualityOptimizerControl kvalitet = new QualityOptimizerControl (60000);

        kvalitet.izvrsiAkciju(video);

        video.stampaj();









    }
}
