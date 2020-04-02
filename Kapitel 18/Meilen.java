import java.util.Scanner;
public class Meilen {
    public static void main (String[] args)
    {
        int Gallonen;
        int Anfangsstand = 0;
        int Endstand;
        int ZwischenErgebnis;
        String pruefer = "j";

        Scanner scan = new Scanner(System.in);


        while (Anfangsstand != -1)
        {
            if (Anfangsstand != -1) {
                System.out.println("Bitte geben sie den Anfangsstand an");
                Anfangsstand = scan.nextInt();

                System.out.println("Bitte geben sie den Endstand an");
                Endstand = scan.nextInt();

                ZwischenErgebnis = Endstand - Anfangsstand;
                Gallonen = ZwischenErgebnis / 25;


                System.out.println("Anfangsstand Meilen: " + Anfangsstand);
                System.out.println("Endstand Meilen: " + Endstand);
                System.out.println("Gallonen: " + Gallonen);
            }
            System.out.println("Bitte geben sie -1 ein, wenn sie abbrechen wollen");
            Anfangsstand = scan.nextInt();


        }
        System.out.println("See you later elegator");

    }
}
