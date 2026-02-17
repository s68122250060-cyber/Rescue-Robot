import java.util.Random;

public class ThermalCamera {
    private Random random = new Random();

    public double readTemperatureC() {
        // สุ่มอุณหภูมิระหว่าง 30 - 40 องศา
        return 30 + random.nextDouble() * 10;
    }

    public boolean detectHuman(double thresholdC) {
        double temp = readTemperatureC();
        return temp >= thresholdC;
    }
}
