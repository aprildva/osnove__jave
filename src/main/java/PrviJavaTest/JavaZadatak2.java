package APrviJavaTest;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class JavaZadatak2 {

//    Zadatak (Petlje)
//    Napisati program koji petljom iscrtava toplomer. Korisnik sa tastature unosi granice toplomera i iscrtava se slika kao u primeru
//    Primer izvrsenja 1:
//    Unesite donju granicu toplomera: 35
//    Unesite gornju granicu toplomera: 42
//            |-42  |
//            |-41  |
//            |-40  |
//            |-39  |
//            |-38  |
//            |-37  |
//            |-36  |
//            |-35  |
//            |    |
//            |    |

//    Primer izvrsenja 2:
//    Unesite donju granicu toplomera: 34
//    Unesite gornju granicu toplomera: 40
//            |-40  |
//            |-39  |
//            |-38  |
//            |-37  |
//            |-36  |
//            |-35  |
//            |-34  |
//            |    |
//            |    |


    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);

        System.out.println("Unesite donju granicu toplomera: ");
        int dg=s.nextInt();
        System.out.println("Unesite gornj granicu toplomera: ");
        int gg=s.nextInt();

        for (int i = gg; i >=dg ; i--) {

            System.out.println( "|-" +i+"|");

        }

        System.out.println("|   |");
        System.out.println("|   |");

    }
}
