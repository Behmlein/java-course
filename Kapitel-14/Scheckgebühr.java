import java.util.Scanner;
public class Scheckgebühr {
    public static void main (String[] args)
    {
        double Girokonto;
        double Sparkonto;
        double Gebuehr;

        Scanner scan = new Scanner(System.in);

        System.out.println("Bitte geben sie ihr Girokonto-Guthaben an: ");
        Girokonto = scan.nextDouble();

        System.out.println("Bitte geben sie ihr Sparkonto-Guthaben an: ");
        Sparkonto = scan.nextDouble();

        if (Girokonto < 1000 == Sparkonto < 1500)
        {
            Gebuehr = 0.15;

        }
        else
        {
            Gebuehr  = 0.0;
        }

        System.out.println("Es wird eine Gebühr von "+ Gebuehr + "erhoben.");

    }
}
