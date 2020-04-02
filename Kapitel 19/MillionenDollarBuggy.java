class  MillionenDollarBuggy
{

    public static void main( String[] args )
    {
        double anfangsbetrag = 1000.0 ;
        double dollars = 0.0;
        double zinssatz ;
        int    jahre ;

        zinssatz = 0.0 ;

        while ( dollars < 1000000 )
        {


            jahre   =  1 ;
            dollars = anfangsbetrag ;
            while (  jahre <= 40 )
            {
                dollars = dollars + dollars*zinssatz ;

                dollars = dollars + 1000 ;

                jahre    =  jahre + 1 ;
            }


            zinssatz = zinssatz + 0.001 ;

        }

        System.out.println("Nach 40 Jahren bei " + zinssatz*100
                + "Prozent Zinsen werden Sie" + dollars + " Dollar haben." ) ;
    }

}