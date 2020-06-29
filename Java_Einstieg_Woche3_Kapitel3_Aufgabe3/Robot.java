class Robot {
    int batteryRuntime = 2;
    String name;

    String getName() {
        return name;
    }

    protected void setName(String newName) {
        name = newName;
    }

    protected int getBatteryRuntime() {
        return batteryRuntime;
    }

    void rechargeBattery() {
        batteryRuntime=10;
    }

    public void saySomething() {
        System.out.println(createSentence());
    }

    public String createSentence() {
        return "Meine Batterie reicht " + batteryRuntime + " Stunden.";
    }
}
