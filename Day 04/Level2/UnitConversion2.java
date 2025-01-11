import java.util.Scanner;

public class UnitConversion2{

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yardsToFeet = 3;
        return yards * yardsToFeet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feetToYards = 0.333333;
        return feet * feetToYards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double metersToInches = 39.3701;
        return meters * metersToInches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inchesToMeters = 0.0254;
        return inches * inchesToMeters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        double inchesToCm = 2.54;
        return inches * inchesToCm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter yards to convert to feet: ");
        double yards = sc.nextDouble();
        System.out.println(yards + " yards = " + convertYardsToFeet(yards) + " feet");

        System.out.print("Enter feet to convert to yards: ");
        double feet = sc.nextDouble();
        System.out.println(feet + " feet = " + convertFeetToYards(feet) + " yards");

        System.out.print("Enter meters to convert to inches: ");
        double meters = sc.nextDouble();
        System.out.println(meters + " meters = " + convertMetersToInches(meters) + " inches");

        System.out.print("Enter inches to convert to meters: ");
        double inches = sc.nextDouble();
        System.out.println(inches + " inches = " + convertInchesToMeters(inches) + " meters");

        System.out.print("Enter inches to convert to centimeters: ");
        inches = sc.nextDouble();
        System.out.println(inches + " inches = " + convertInchesToCm(inches) + " centimeters");

        sc.close();
    }
}
