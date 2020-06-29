class Robot extends OldRobot {
	int internalStorageSize = 7;
    @Override 
public void greetUser()
{
    System.out.println("Hallo Duke");
}
public int getInternalStorageSize()
{
    return internalStorageSize;
}
}

