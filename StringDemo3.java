class StringDemo3
{
    public static void main ( String[] args )
    {
        String str = new String( "Golf is a good walk spoiled." ); // erzeuge das originale Stringobjekt
        int Laenge = str.length();
        String sub = str.substring(0,Laenge); // erzeuge ein neues Objekt aus dem Original

        System.out.println( sub );

    }
}