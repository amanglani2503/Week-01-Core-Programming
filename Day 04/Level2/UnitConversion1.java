import java.util.Scanner;

public class UnitConversion1{

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double kilometers) {
        double kmToMiles = 0.621371;
        return kilometers * kmToMiles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double milesToKm = 1.60934;
        return miles * milesToKm;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double metersToFeet = 3.28084;
        return meters * metersToFeet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feetToMeters = 0.3048;
        return feet * feetToMeters;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		// Taking as input
        System.out.print("Enter kilometers to convert to miles: ");
        double kilometers = sc.nextDouble();
        System.out.println(kilometers + " kilometers = " + convertKmToMiles(kilometers) + " miles");

        System.out.print("Enter miles to convert to kilometers: ");
        double miles = sc.nextDouble();
        System.out.println(miles + " miles = " + convertMilesToKm(miles) + " kilometers");

        System.out.print("Enter meters to convert to feet: ");
        double meters = sc.nextDouble();
        System.out.println(meters + " meters = " + convertMetersToFeet(meters) + " feet");

        System.out.print("Enter feet to convert to meters: ");
        double feet = sc.nextDouble();
        System.out.println(feet + " feet = " + convertFeetToMeters(feet) + " meters");

        sc.close();
    }
}
