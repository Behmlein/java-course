class Robot {
    EncryptedEMail encryptedEMail = new EncryptedEMail();
    int X = 1;
    int Y = 1;

public void decryptSender()
{
    for(Y = 1; Y < 4; Y++)
    {
        for(X = 1; X < 28; X++)
        {
            System.out.print(encryptedEMail.decryptChar(Y,X));
        }
        System.out.println();
    }
}

}
