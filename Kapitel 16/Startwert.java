import java.util.Scanner;
public class Startwert
{
    public static void main (String[] args)
    {
        int Startwert ;
        int Endwert;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben sie einen Startwert ein");
        Startwert = scan.nextInt();

        System.out.println("Bitte geben sie einen Endwert ein");
        Endwert = scan.nextInt();


        System.out.println("Startwert:");
        System.out.println(Startwert);
        System.out.println("Endwert");
        System.out.println(Endwert);

        while (Startwert < Endwert +1)
        {
            System.out.println(Startwert);
            Startwert++;
        }

    }
}
