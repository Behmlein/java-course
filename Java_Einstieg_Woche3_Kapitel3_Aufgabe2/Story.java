class Story {
	public static void main(String args[]) {
		Robot ronja = new Robot();
		ronja.setActivated(true);
		System.out.println(ronja.isActivated());
		ronja.printStatus();
		ronja.setActivated(false);
		System.out.println(ronja.isActivated());
		ronja.printStatus();
	}
}
