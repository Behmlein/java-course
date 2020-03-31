import java.util.Scanner;
public class Wort_eingeben {
    public static void main (String[] args)
    {
        String Wort;
        int zaehler = 0;
        int laenge;
        Scanner scan = new Scanner(System.in);

        System.out.println("Bitte geben sie ein Wort ein");
        Wort = scan.nextLine();
        laenge = Wort.length();

        while (zaehler < laenge + 1 )
        {
            System.out.println(Wort);
            zaehler++;
        }



    }
}
