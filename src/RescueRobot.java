public class RescueRobot implements Flyable, Drivable, ThermalSensor, Communicable {

    private String deviceId;

    // Composition (has-a)
    private Battery battery;
    private GPSTracker gps;
    private ThermalCamera thermal;

    public RescueRobot(String deviceId) {
        this.deviceId = deviceId;
        this.battery = new Battery();
        this.gps = new GPSTracker();
        this.thermal = new ThermalCamera();
    }

    public GPSTracker getGps() {
        return gps;
    }

    private void useBattery(double amount) {
        battery.drain(amount);
        System.out.println("Battery: " + battery.getLevel() + "%");
    }

    // ===== Flyable =====
    @Override
    public void takeOff() {
        System.out.println("Robot taking off...");
        useBattery(5);
    }

    @Override
    public void land() {
        System.out.println("Robot landing...");
        useBattery(3);
    }

    @Override
    public double maxAltitude() {
        return 500;
    }

    // ===== Drivable =====
    @Override
    public void startEngine() {
        System.out.println("Engine started");
        useBattery(2);
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped");
        useBattery(1);
    }

    @Override
    public double maxSpeed() {
        return 80;
    }

    // ===== ThermalSensor =====
    @Override
    public double readTemperatureC() {
        double temp = thermal.readTemperatureC();
        useBattery(1);
        return temp;
    }

    @Override
    public boolean detectHuman(double thresholdC) {
        boolean found = thermal.detectHuman(thresholdC);
        useBattery(1);
        return found;
    }

    // ===== Communicable =====
    @Override
    public void send(String message) {
        useBattery(2);
        System.out.println("ID=" + deviceId +
                " POS=" + gps.currentPosition() +
                " MSG=" + message);
    }

    @Override
    public String getDeviceId() {
        return deviceId;
    }

    // ===== Resolve default method conflict =====
    @Override
    public String status() {
        return "ROBOT: " +
                Flyable.super.status() +
                " + " +
                Drivable.super.status();
    }
}
