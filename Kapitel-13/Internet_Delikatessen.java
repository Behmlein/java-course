import java.util.Scanner;
public class Internet_Delikatessen
{

    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String Artikel;
        double Preis;
        double Versandkosten = 0;
        int Expressversand;
        double Expresszuschlag = 0;
        double GesamtPreis;

        System.out.println("Bitte geben sie den Artikel ein, den sie kaufen möchten: ");
        Artikel = scan.nextLine();

        System.out.println("Bitte geben sie den Preis des Artikels ein: ");
        Preis = scan.nextDouble();

        System.out.println("Wenn sie Expressversand möchten, dann wählen sie bitte die 1");
        Expressversand = scan.nextInt();

        if (Preis < 10.00){
            Versandkosten = 2.00;
        }
        if (Preis >= 10.00)
    {
        Versandkosten = 3.00;
        }
        if (Expressversand == 1){
            Expresszuschlag = 5;
        }


        System.out.println(Artikel + ": " + (Preis));
        GesamtPreis = Preis + Versandkosten + Expresszuschlag;
        Versandkosten = Versandkosten + Expresszuschlag;
        System.out.println("Versand: " + Versandkosten);
        System.out.println("GesamtPreis: " + GesamtPreis);
    }
}
