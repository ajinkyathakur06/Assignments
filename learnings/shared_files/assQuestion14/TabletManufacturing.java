package assQuestion14;

public class TabletManufacturing {
	private static final double MAX_WEIGHT = 500.0; // Maximum allowed weight in milligrams

    // Method to check the weight of the tablet
    public static void checkTabletWeight(double weight) throws TabletWeightExceededException {
        if (weight > MAX_WEIGHT) {
            throw new TabletWeightExceededException("Tablet weight exceeded the allowed limit of " + MAX_WEIGHT + " mg.");
        } else {
            System.out.println("Tablet weight is within the allowed limit: " + weight + " mg.");
        }
    }

}
