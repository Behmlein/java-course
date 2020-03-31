import java.util.Scanner;

class FallenderZiegelstein
{
    public static void main (String[] args )
    {
        final double G = 9.80665;
        int    t, zeit;
        double entfernung;

        Scanner scan = new Scanner( System.in );

        System.out.println( "Zeit in Sekunden:" );
        zeit = scan.nextInt();


        System.out.println( "Sekunden\tEntfernung"  );
        System.out.println( "-------\t--------"  );

        t         = 0 ;
        while (  t <= zeit )
        {
            entfernung = (G * t * t)/2 ;
            System.out.println( t + "\t" + entfernung );

            t = t + 1 ;
        }
    }
}