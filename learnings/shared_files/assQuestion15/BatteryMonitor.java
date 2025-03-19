package assQuestion15;

public class BatteryMonitor {
	public void checkBattery(int batteryLevel) throws LowBatteryException, InsufficientChargeException {
        if (batteryLevel < 10) {
            throw new InsufficientChargeException("Battery level is below 10%. Activating Power Saver Mode.");
        } else if (batteryLevel < 20) {
            throw new LowBatteryException("Battery level is below 20%. Please charge your device.");
        } else {
            System.out.println("Battery level is sufficient: " + batteryLevel + "%");
        }
    }

    public static void main(String[] args) {
        BatteryMonitor monitor = new BatteryMonitor();
        int[] batteryLevels = {25, 15, 8}; // Test different battery levels

        for (int level : batteryLevels) {
            try {
                System.out.println("Checking battery level: " + level + "%");
                monitor.checkBattery(level);
            } catch (LowBatteryException e) {
                System.out.println("LowBatteryException: " + e.getMessage());
            } catch (InsufficientChargeException e) {
                System.out.println("InsufficientChargeException: " + e.getMessage());
            }
        }
    }
}
