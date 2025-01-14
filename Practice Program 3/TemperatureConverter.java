import java.util.Scanner;

public class TemperatureConverter{

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Main function to take input and perform conversion
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Choose conversion type
        System.out.println("Choose conversion type:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        int choice = sc.nextInt();

        if (choice == 1) {
            // Fahrenheit to Celsius
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println(fahrenheit + " °F = " + celsius + " °C");
        
		} else if (choice == 2) {
            // Celsius to Fahrenheit
            System.out.print("Enter temperature in Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println(celsius + " °C = " + fahrenheit + " °F");
        
		} else {
            System.out.println("Invalid choice");
        }
    
		sc.close();
	}
}
