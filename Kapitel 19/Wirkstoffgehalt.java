import java.util.Scanner;
public class Wirkstoffgehalt {
    public static void main( String[] args )
    {
        double Wirkstoffgehalt = 100.0;
        int Monat_Zaehler = 0;
        double Wirkstoffverlust;
        Scanner scan = new Scanner(System.in);


        System.out.println("Bitte geben sie an wie viel Wirkstoffverlust vorhanden ist in Form (0,30 z.B)");
        Wirkstoffverlust = scan.nextDouble();
        System.out.println("Monat: " + Monat_Zaehler + " Wirkstoffgehalt: " + Wirkstoffgehalt );

        while (Wirkstoffgehalt > 50.0)
        {
            Monat_Zaehler++;
            Wirkstoffgehalt = Wirkstoffgehalt -(Wirkstoffgehalt * Wirkstoffverlust);
            if (Wirkstoffgehalt > 50.0)
            {
                System.out.println("Monat: " + Monat_Zaehler + " Wirkstoffgehalt: " + Wirkstoffgehalt);
            }


        }
        System.out.println("Monat: " + Monat_Zaehler + "  Wirkstoffgehalt: " + Wirkstoffgehalt + " abgelaufen" );

    }
}
