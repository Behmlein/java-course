import java.util.Scanner;
public class Effizienz {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double effizienz;
        double tLuft;
        double tDampf;

        System.out.println("Bitte geben sie die Lufttemperatur in Kelvin ein: ");
        tLuft = scan.nextDouble();

        System.out.println("Bitte geben sie die Dampftemperatur in Kelvin ein: ");
        tDampf = scan.nextDouble();




        if (tDampf < 373) {
            effizienz = 0;
        } else {
            effizienz = 1 - tLuft / tDampf;
        }
        System.out.println("Effizienz: " + effizienz);
    }


}
