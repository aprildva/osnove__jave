package MiniProjectXO;

import java.util.Scanner;

public class IgraXO {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        XOTabla tabla = new XOTabla();


        System.out.println("Unesite ime prvog igraca: ");
        String imeX= s.next();
        tabla.setImeXIgraca(imeX);


        System.out.println("Unesite ime drugog igraca: ");
        String imeO= s.next();
        tabla.setImeOIgraca(imeO);

        tabla.pokreniIgru();

        tabla.stampaj();


        while ( !tabla.popunjenaTabla()  && tabla.PobednikX() && tabla.PobednikO()) {

            System.out.println("Na potezu je igrac: " + tabla.getNaPotezu());

            System.out.println("Odigraj potez: ");
            String broj = s.next();
            if (tabla.PoljePrazno(broj)) {

            tabla.odigrajpotez(broj);
            tabla.stampaj();
           if  (!tabla.PobednikX()) {
             System.out.println("Cestitamo!Pobednik je "+ tabla.getImeXIgraca());
              }
            else if (!tabla.PobednikO()){
             System.out.println("Cestitamo!Pobednik je "+ tabla.getImeOIgraca());
             }

         tabla.ZameniIgraca();

            }

           else if (!tabla.PoljePrazno(broj)) {
               System.out.println("Potez nije validan");
           }

        }

       if (tabla.popunjenaTabla() && tabla.PobednikX() && tabla.PobednikO())  {
           System.out.println("Igra je neresena!");
          }
























    }
}
