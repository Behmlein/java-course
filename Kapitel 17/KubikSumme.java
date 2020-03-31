import java.util.Scanner;
public class KubikSumme {
    public static void main (String[] args )
    {
        int n;
        int QuadratSumme = 0;
        int Kubiksumme = 0;
        int Zwischenspeicher;
        int Zaehler = 1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Bitte geben sie die Anzahl n ein");
        n = scan.nextInt();
        Zwischenspeicher = n;

        while (n >= Zaehler)
        {
            QuadratSumme = QuadratSumme + (n * n);

            n--;
        }
            System.out.println(QuadratSumme);


                while (Zwischenspeicher >= Zaehler)
    {
        Kubiksumme = Kubiksumme + (Zwischenspeicher * Zwischenspeicher * Zwischenspeicher);

        Zwischenspeicher--;
    }
            System.out.println(Kubiksumme);
}
}
