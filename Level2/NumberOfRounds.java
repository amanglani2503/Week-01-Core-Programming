import java.util.Scanner;

class NumberOfRounds{
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for all the sides
        System.out.print("Enter the length of side 1 - ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the length of side 2 - ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the length of side 3 - ");
        double side3 = scanner.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Distance the athlete needs to run in meters (5 km = 5000 meters)
        double totalDistance = 5000;

        // Calculate the number of rounds
        double rounds = totalDistance / perimeter;

        // Print the result
        System.out.println("The total number of rounds the athlete will run is " + Math.ceil(rounds) + " to complete 5 km.");
		sc.close();
	}
}
