import com.sun.nio.sctp.PeerAddressChangeNotification;

import java.util.Random;
        import java.util.Scanner;
public class Ratespiel {
    public static void main (String[] args)
    {
        int Versuche = 1;
        boolean Gewonnen = false;
        int Ratende_Zahl;
        int Random_Zahl;

        Random rand = new Random();

        Scanner scan = new Scanner(System.in);

        System.out.println("Ich denke mir eine Zahl von 1 bis 10!"  );
        System.out.println("Sie haben 3 Versuche diese Zahl zu erraten!!");
        System.out.println("Raten Sie!");

        Random_Zahl = (rand.nextInt(10))+1;

        while(Gewonnen != true)
        {
            System.out.println("Versuch: " + Versuche);

            Ratende_Zahl = scan.nextInt();



            if (Ratende_Zahl != Random_Zahl)
            {
                System.out.println("Falsch");
                if(Versuche == 3)
                {

                    System.out.println("Die Richtige Zahl ist: " + Random_Zahl);
                    System.out.println("Sie haben verloren");

                }
            }
            if (Ratende_Zahl == Random_Zahl)
            {
                System.out.println("Richtig!");
                System.out.println("Sie haben das Spiel gewonnen");
            }

            if (Versuche == 3)
            {
                Gewonnen = true;
            }


            Versuche++;
        }

    }
}
