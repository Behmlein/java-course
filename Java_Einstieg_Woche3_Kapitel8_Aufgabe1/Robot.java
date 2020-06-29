class Robot {

	String task;
	static final String Wert = "Duke helfen";

	Robot(String task) {
		this.task = task;
	}
	Robot()
	{
	    this(Wert);
	}

}
