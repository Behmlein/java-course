import java.util.Scanner;
public class Integer_addieren {
    public static void main (String[] args)
    {
        int Addier_zaehler;
        int While_zeahler = 0;
        int Eingabe_zahlen;
        int Summe = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Wie viele Zahlen wollen sie eingeben?");
        Addier_zaehler = scan.nextInt();

        while (While_zeahler < Addier_zaehler)
        {
            System.out.println("Bitte geben sie die Zahlen zum Addieren an");
            Eingabe_zahlen = scan.nextInt();
            Summe = Summe + Eingabe_zahlen;
            While_zeahler++;
        }
        System.out.print(Summe);
    }

}
