package singleton;
public class Main {
    public static void main(String[] args) {
        TemperatureConverter converter = TemperatureConverter.getInstance();

        double celsius = 100;
        double fahrenheit = converter.celsiusToFahrenheit(celsius);
        System.out.println(celsius + " °C is " + fahrenheit + " °F");

        fahrenheit = 32;
        celsius = converter.fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " °F is " + celsius + " °C");
    }
}
