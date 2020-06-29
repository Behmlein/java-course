class Office {
    PasswordGenerator pg;
    String passwort;
    
    

public void printPassword()
{
    PasswordGenerator pg = new PasswordGenerator();
    
    passwort = pg.getPassword();
    
    System.out.println(passwort);
}

}
