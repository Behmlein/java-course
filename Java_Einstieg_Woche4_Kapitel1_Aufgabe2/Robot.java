public class Robot {

	private String name;
	private int age;
	private double batteryRuntime;

	Robot(String name, int age, double batteryRuntime) {
		this.name = name;
		this.age = age;
		this.batteryRuntime = batteryRuntime;
	}
	
	@Override
	public boolean equals(Object o)
	{
	    if(this.name.equals(((Robot)o).name) && this.age == ((Robot) o).age  && this.batteryRuntime == ((Robot) o).batteryRuntime)
	    {
	        return true; 
	    }
	    else 
	    {
	        return false;
	    }
	    
	    
	}
}
