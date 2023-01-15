package Domaci13_01_2023;

public class ZadatakStudentIspit {
    public static void main(String[] args) {

     Student ivana =new Student("123","Ivana","Misic","Osnovne");
     ivana.dodajIspit(new Ispit("Hemija",10,"Jovan","Ciric"));
     ivana.dodajIspit(new Ispit("Fizika",6,"Pera","Peric"));
     ivana.dodajIspit(new Ispit("Geografija",6,"Veljko","Ilic"));


     ivana.stampaj();
     ivana.prosek();


        }

    }

