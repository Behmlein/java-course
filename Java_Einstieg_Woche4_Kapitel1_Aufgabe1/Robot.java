public class Robot {

	private String name;
	private String id;
	private int age;

	Robot(String name, String id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	@Override 
	
   public  String toString()
    {
        String output = this.name + "_" + this.id + "_" + this.age;
        
        return output;
        
    }
}
