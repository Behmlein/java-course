import java.util.Scanner;

public class Kreisfläche {
    public static void main (String[] args)
    {
        double Ergebnis;
        double Zwischenergebnis;
        Scanner Scan = new Scanner (System.in);
        System.out.println("Bitte geben sie einen Radius ein!!");
        Zwischenergebnis = Scan.nextInt();
        Ergebnis = (Zwischenergebnis * Zwischenergebnis) * Math.PI;
        System.out.println("Der Radius ist " + Zwischenergebnis + "Die Fläche beträgt: " + Ergebnis);
    }
}
