package Domaci16_01_2023;

public class OsobaMain {
    public static void main(String[] args) {

       Igrac jovan=new Igrac("Jovan Misic", "2601998888888",1998,10, "Napadac", true);
       Trener marko=new Trener("Mako Markovic", "2702979715182",1979,25,"pomocni");

       jovan.stampaj();
       marko.stampaj();

}}
