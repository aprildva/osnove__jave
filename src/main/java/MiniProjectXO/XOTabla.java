package MiniProjectXO;

import sun.font.DelegatingShape;

public class XOTabla {

    private String polje1;

    private String polje2;

    private String polje3;

    private String polje4;

    private String polje5;

    private String polje6;

    private String polje7;

    private String polje8;

    private String polje9;

    private String imeXIgraca;

    private String imeOIgraca;

    private String naPotezu;




    public String getNaPotezu() {
        return this.naPotezu;
    }

    public void setImeXIgraca(String imeX) {
        this.imeXIgraca = imeX;
    }


    public void setImeOIgraca(String imeO) {
        this.imeOIgraca = imeO;
    }


    public String getImeXIgraca() {

        return this.imeXIgraca;
    }

    public String getImeOIgraca() {

        return this.imeOIgraca;
    }




    public void pokreniIgru() {


        this.polje1 = (" ");
        this.polje2 = (" ");
        this.polje3 = (" ");
        this.polje4 = (" ");
        this.polje5 = (" ");
        this.polje6 = (" ");
        this.polje7 = (" ");
        this.polje8 = (" ");
        this.polje9 = (" ");
        this.naPotezu = "X";

    }

    public void stampaj() {

        System.out.println("Igrač X: " + getImeXIgraca());
        System.out.println("Igrač O: " + getImeOIgraca());

        System.out.println(polje1 + " | " + polje2 + " | " + polje3);
        System.out.println(polje4 + " | " + polje5 + " | " + polje6);
        System.out.println(polje7 + " | " + polje8 + " | " + polje9);



    }

         public boolean PoljePrazno( String polje) {

            if ( polje.equals("1") && polje1.equals(" ")) {
                return true;
             }
             if ( polje.equals("2") && polje2.equals(" ")) {

                 return true;
             }
             if ( polje.equals("3")  && polje3.equals(" ")) {

                 return true;
             }
             if ( polje.equals("4") && polje4.equals(" ")) {

                 return true;
             }
             if ( polje.equals("5") && polje5.equals(" ")) {

                 return true;
             }
             if ( polje.equals("6") && polje6.equals(" ")) {

                 return true;
             }
             if ( polje.equals("7") && polje7.equals(" ")) {

                 return true;
             }
             if ( polje.equals("8") && polje8.equals(" ")) {

                 return true;
             }
             if ( polje.equals("9") && polje9.equals(" ")) {

                 return true;
             }

             return false;




        }


    public void ZameniIgraca() {

        if (naPotezu.equals("X")) {
            naPotezu = ("O");
        } else if (naPotezu.equals("O")) {
            naPotezu = ("X");
        }
    }

    public void odigrajpotez(String broj) {

        if (broj.equals("1")) {

            polje1 = naPotezu;
        } else if (broj.equals("2")) {
            polje2 = naPotezu;

        } else if (broj.equals("3")) {
            polje3 = naPotezu;

        } else if (broj.equals("4")) {
            polje4 = naPotezu;

        } else if (broj.equals("5")) {
            polje5 = naPotezu;

        } else if (broj.equals("6")) {
            polje6 = naPotezu;

        } else if (broj.equals("7")) {
            polje7 = naPotezu;

        } else if (broj.equals("8")) {
            polje8 = naPotezu;

        } else if (broj.equals("9")) {
            polje9 = naPotezu;

        }


    }

    public boolean popunjenaTabla() {
        if (polje1 != (" ") &&
                polje2 != (" ") &&
                polje3 != (" ") &&
                polje4 != (" ") &&
                polje5 != (" ") &&
                polje6 != (" ") &&
                polje7 != (" ") &&
                polje8 != (" ") &&
                polje9 != (" "))
        {
            return true;
        }
        else {
            return false;
        }


    }

    public boolean PobednikX () {


        if (polje1== "X" && polje2=="X" && polje3=="X") {

            return false;
        }
        else if (polje4== "X" && polje5=="X" && polje6=="X") {

            return false;
        }
        else if (polje7== "X" && polje8=="X" && polje9=="X") {

            return false;
        }
        else if (polje1== "X" && polje4=="X" && polje7=="X") {

            return false;
        }
        else if (polje2== "X" && polje5=="X" && polje8=="X") {

            return false;
        }
        else if (polje3== "X" && polje6=="X" && polje9=="X") {

            return false;
        }
        else if (polje1== "X" && polje5=="X" && polje9=="X") {

            return false;
        }
        else if (polje3== "X" && polje5=="X" && polje7=="X") {

            return false;
        }
            return true;
    }

    public boolean PobednikO () {


        if (polje1== "O" && polje2=="O" && polje3=="O") {

            return false;
        }
        else if (polje4== "O" && polje5=="O" && polje6=="O") {

            return false;
        }
        else if (polje7== "O" && polje8=="O" && polje9=="O") {

            return false;
        }
        else if (polje1== "O" && polje4=="O" && polje7=="O") {

            return false;
        }
        else if (polje2== "O" && polje5=="O" && polje8=="O") {

            return false;
        }
        else if (polje3== "O" && polje6=="O" && polje9=="O") {

            return false;
        }
        else if (polje1== "O" && polje5=="O" && polje9=="O") {

            return false;
        }
        else if (polje3== "O" && polje5=="O" && polje7=="O") {

            return false;
        }
        return true;
    }

}
