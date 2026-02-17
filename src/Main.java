public class Main {
    public static void main(String[] args) {

        // 1. Create robot
        RescueRobot robot = new RescueRobot("RR-01");

        // 2. Update GPS
        robot.getGps().updatePosition(13.7563, 100.5018);

        // 3. Fly test
        robot.takeOff();
        System.out.println(robot.status());
        robot.land();

        // 4. Drive test
        robot.startEngine();
        System.out.println("Max speed: " + robot.maxSpeed());
        robot.stopEngine();

        // 5. Thermal test
        double temp = robot.readTemperatureC();
        System.out.println("Temperature: " + temp);

        boolean human = robot.detectHuman(36.5);
        System.out.println("Human detected: " + human);

        // 6. Communication
        robot.send("Found hotspot...");
    }
}
