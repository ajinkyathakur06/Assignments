package assQuestion9;

public class TemperatureConverterImplementation implements TemperatureConverter {

	// Convert Celsius to Fahrenheit
    @Override
    public double convertToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert Fahrenheit to Celsius
    @Override
    public double convertToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

}
