import java.util.Scanner;

public class UnitConversion3{

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double poundsToKg = 0.453592;
        return pounds * poundsToKg;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kgToPounds = 2.20462;
        return kilograms * kgToPounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallonsToLiters = 3.78541;
        return gallons * gallonsToLiters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double litersToGallons = 0.264172;
        return liters * litersToGallons;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		// Taking inputs and converting
        System.out.print("Enter Fahrenheit to convert to Celsius: ");
        double fahrenheit = sc.nextDouble();
        System.out.println(fahrenheit + "°F = " + convertFahrenheitToCelsius(fahrenheit) + "°C");

        System.out.print("Enter Celsius to convert to Fahrenheit: ");
        double celsius = sc.nextDouble();
        System.out.println(celsius + "°C = " + convertCelsiusToFahrenheit(celsius) + "°F");

        System.out.print("Enter pounds to convert to kilograms: ");
        double pounds = sc.nextDouble();
        System.out.println(pounds + " pounds = " + convertPoundsToKilograms(pounds) + " kilograms");

        System.out.print("Enter kilograms to convert to pounds: ");
        double kilograms = sc.nextDouble();
        System.out.println(kilograms + " kilograms = " + convertKilogramsToPounds(kilograms) + " pounds");

        System.out.print("Enter gallons to convert to liters: ");
        double gallons = sc.nextDouble();
        System.out.println(gallons + " gallons = " + convertGallonsToLiters(gallons) + " liters");

        System.out.print("Enter liters to convert to gallons: ");
        double liters = sc.nextDouble();
        System.out.println(liters + " liters = " + convertLitersToGallons(liters) + " gallons");

        sc.close();
    }
}
