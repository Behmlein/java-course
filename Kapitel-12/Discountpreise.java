import java.util.Scanner;
public class Discountpreise {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double Rabatt = 0.90;
        double Betrag;
        double Discountpreis;
        System.out.println("Bitte geben sie ihren Betrag ein,um festellen zu können, ob sie einen Rabatt bekommen");
        Betrag = scan.nextInt();


        if (Betrag > 1000) {
            Discountpreis = Betrag * Rabatt;
        }
        else {
            Discountpreis = Betrag;
        }

        System.out.println("Ihr gesamter Preis beträgt: " + Discountpreis);

    }

}
