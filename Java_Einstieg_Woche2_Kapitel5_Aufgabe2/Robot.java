class Robot {
    String[] clues = {"Boesewicht mag keine Papageien.", "Boesewicht kennt sich mit Computern aus.", 
                        "E-Mail-Adresse des Boesewichts."};

public String giveClue(int uebergabe)
    {
        return clues[uebergabe];
    }

public void printClues()
    {
        for(int i=0;i<clues.length;i++)
        {
            System.out.println(clues[i]);
        }
    }

}
