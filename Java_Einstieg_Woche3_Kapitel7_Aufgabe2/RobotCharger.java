class RobotCharger {


public void chargeRobot(DetectiveRobot hans)
{
    hans.batteryRuntime = hans.batteryRuntime + 7;
    
}

public void chargeRobot(ReadingRobot peter)
{
    peter.batteryRuntime =peter.batteryRuntime + 7;
}
}
