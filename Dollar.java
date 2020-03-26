import java.util.Scanner;
public class Dollar {
    public static void main (String[] args)
    {
        int Ergebnis;
        int Ergebnis2;
        int Eingabe;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Bitte einen Betrag eingeben:");
        Eingabe = Scan.nextInt();
        Ergebnis2 = Eingabe / 100;
        Ergebnis  = Eingabe % 100 ;

        System.out.println("Das ergibt " + Ergebnis2 + " Dollar " + "und " + Ergebnis + " Cent.");
    }
}
