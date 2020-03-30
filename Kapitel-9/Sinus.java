public class Sinus {
    public static void main ( String[] args )
    {

        double sinx = 0;
        double Gesamt;

        double cosx = 0;
        double Grad = 30;
        double Bogenmass =0;
        Bogenmass = Grad * Math.PI/180;
        cosx = Math.cos( Bogenmass );
        sinx = Math.sin( Bogenmass );
        System.out.println(sinx); System.out.println(cosx);
        Gesamt = cosx + sinx;
        System.out.println( Gesamt);
    }

}
