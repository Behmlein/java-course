class Parrot extends Animal {

	void speak() {
		System.out.println("Ich kann sprechen");
	}
    @Override 
    public void move()
    {
        System.out.println("ich fliege");
    }
    void speak(String eingabe1)
    {
        System.out.println(eingabe1);
    }
}