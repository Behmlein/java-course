import java.util.Scanner;
public class Y2K_Problem_Detektor {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int Alter;
        byte Aktuelles_Jahr;
        byte Geburtsjahr;

        System.out.println("Bitte geben sie ihr Geburtsjahr in zwei Stellen Format ein: ");
        Geburtsjahr = scan.nextByte();

        System.out.println("Bitte geben sie das Aktuelle Jahr in zwei Stellen Format ein: ");
        Aktuelles_Jahr = scan.nextByte();

        if (Aktuelles_Jahr >= Geburtsjahr) {
            Alter = Aktuelles_Jahr - Geburtsjahr;
        }
        else {

            Alter = (100 - Geburtsjahr) + Aktuelles_Jahr;

        }
        System.out.println("Ihr Alter beträgt: "+ Alter);
    }
}
