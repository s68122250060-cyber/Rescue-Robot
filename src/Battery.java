public class Battery {
    private double level = 100.0;

    public void drain(double amount) {
        level -= amount;
        if (level < 0) {
            level = 0;
        }
    }

    public double getLevel() {
        return level;
    }
}
