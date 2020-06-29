class Robot {
	private int batteryRuntime = 0;
	private boolean pruefer = false;

	public void setBatteryRuntime(int newTime) {
	    
	    if (notNegative(newTime)) {
		    batteryRuntime = newTime;
		    }
	}

	public int getBatteryRuntime() {
		return batteryRuntime;
	}
	private boolean notNegative(int pruefung)
	{
	   if(pruefung > 0)
	   {
	     pruefer = true;
	     
	   }
	   return pruefer;
	}
}
