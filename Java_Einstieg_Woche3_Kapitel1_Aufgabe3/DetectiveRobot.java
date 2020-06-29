class DetectiveRobot extends Robot {



    int spareBatteryRuntime = 5;

    int giveTotalBatteryRuntime() {
        giveBatteryRuntime();

        return spareBatteryRuntime + batteryRuntime;
    }
}
