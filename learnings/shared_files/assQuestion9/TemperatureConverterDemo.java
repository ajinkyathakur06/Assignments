package assQuestion9;

public class TemperatureConverterDemo {
	public static void main(String[] args) {
        // Display information about the interface
        TemperatureConverter.about();

        // Create an object of TemperatureConverterImplementation
        TemperatureConverter converter = new TemperatureConverterImplementation();

        // Test conversion methods
        double celsius = 25;
        double fahrenheit = converter.convertToFahrenheit(celsius);
        System.out.println(celsius + " °C is " + fahrenheit + " °F");

        double fahrenheitInput = 77;
        double celsiusResult = converter.convertToCelsius(fahrenheitInput);
        System.out.println(fahrenheitInput + " °F is " + celsiusResult + " °C");
    }
}
