class StringDemo2
{
    public static void main ( String[] args )
    {
        String str;
        int    len;

        str = new String( "Der Kuchen schmeckt gut und hat keine verdorbenen Dinge in sich!" );

        len = str.length();

        System.out.println("Die Laenge ist: " + len );

    }
}