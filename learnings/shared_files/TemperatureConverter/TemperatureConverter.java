package assQuestion9;

public interface TemperatureConverter {
	// Method declarations
    double convertToFahrenheit(double celsius);
    double convertToCelsius(double fahrenheit);

    // Static method to provide information about the interface
    static void about() {
        System.out.println("This interface is used to convert temperatures between Celsius and Fahrenheit.");
    }
}
