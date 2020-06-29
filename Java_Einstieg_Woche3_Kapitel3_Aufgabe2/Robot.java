class Robot {
	private boolean activated = false;

	public void printStatus() {
		System.out.println(activated);
	}
	
	public void setActivated(boolean Annahme)
	{
	    activated = Annahme;
	}
	public boolean isActivated()
	{
	    return activated;
	}
}
