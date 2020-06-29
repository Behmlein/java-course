class Robot {
	private String internalStorage = "416e737765723f203432";

private void flushStorage()
{
internalStorage = " ";
}
void safeFlushStorage(String Annahme)
{
    if(Annahme.equals("pw_duke"))
    {
    System.out.println(internalStorage);
    this.flushStorage();
    
    }
}

}
