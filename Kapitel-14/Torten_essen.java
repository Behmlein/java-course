import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;
public class Torten_essen {
    public static void main (String[] args)
    {
      int Teilnehmer_gewicht;

      Scanner scan = new Scanner(System.in);

      System.out.println("Bitte geben sie ihr Gewicht an");
      Teilnehmer_gewicht = scan.nextInt();

      if (Teilnehmer_gewicht > 235 == Teilnehmer_gewicht < 265  )
      {
          System.out.println("Sie sind zugelassen!");
      }
      else {
          System.out.println("Sie sind nicht zugelassen!!");
      }
    }




}
