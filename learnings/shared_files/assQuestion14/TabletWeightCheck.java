package assQuestion14;

public class TabletWeightCheck {
	public static void main(String[] args) {
        double[] tabletWeights = {450.0, 520.0, 480.0, 600.0}; // Sample tablet weights

        for (double weight : tabletWeights) {
            try {
                TabletManufacturing.checkTabletWeight(weight);
            } catch (TabletWeightExceededException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
}
