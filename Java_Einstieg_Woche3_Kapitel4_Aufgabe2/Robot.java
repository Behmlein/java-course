public class Robot extends OldRobot {
	int additionalStorageSize = 0;

@Override 

public void setStorage(int uebergabe)
{
    if (uebergabe < 1000)
    {
        super.setStorage(uebergabe);
    }
    else 
    {
        super.setStorage(1000);
        additionalStorageSize = uebergabe - 1000;
        
    }
}
}