import java.util.Scanner;
class  DollarsNachVierzig
{

    public static void main( String[] args )
    {
        double dollars = 1000.0 ;
        int    jahre   =  1 ;
        double zinssatz ;


        Scanner scan = new Scanner( System.in );
        System.out.println("Geben Sie den Zinssatz in Prozent ein:") ;
        zinssatz = scan.nextDouble()/100.0 ;

        while (  jahre <= 40 )
        {

            dollars =  dollars + dollars * zinssatz ;


            dollars = dollars + 1000 ;

            jahre    =  jahre + 1 ;
        }

        System.out.println("Nach 40 Jahren bei " + zinssatz*100
                + " Prozent Zinsen werden Sie " + dollars + " Dollar haben." ) ;
    }

}