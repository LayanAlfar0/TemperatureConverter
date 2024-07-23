package singleton;
public class TemperatureConverter {
    private static TemperatureConverter instance;

    // Private constructor to prevent instantiation from outside the class
    private TemperatureConverter() {}

    // Public method to get the instance of the class
    public static TemperatureConverter getInstance() {
        if (instance == null) {
               instance = new TemperatureConverter();
            }
        return instance;
    }

    // Converts Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Converts Fahrenheit to Celsius
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
