class Robot {

	int batteryRuntime = 5;

	boolean isBatteryRuntimeLow() {
		if (batteryRuntime < 2) {
		    return true;
            
		} else {
		    return false;
            
    	}
    }
}
