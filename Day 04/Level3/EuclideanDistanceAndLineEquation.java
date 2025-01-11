import java.util.Scanner;

public class EuclideanDistanceAndLineEquation{

    // Method to calculate the Euclidean distance between two points
    public static double calculateEuclideanDistance(double xCoordinate1, double yCoordinate1, double xCoordinate2, double yCoordinate2) {
        double xDifference = xCoordinate2 - xCoordinate1;
        double yDifference = yCoordinate2 - yCoordinate1;
        return Math.sqrt(Math.pow(xDifference, 2) + Math.pow(yDifference, 2));
    }

    // Method to calculate the slope and y-intercept of the line
    public static double[] calculateLineEquation(double xCoordinate1, double yCoordinate1, double xCoordinate2, double yCoordinate2) {
        double slope = (yCoordinate2 - yCoordinate1) / (xCoordinate2 - xCoordinate1);
        double yIntercept = yCoordinate1 - (slope * xCoordinate1);
        return new double[]{slope, yIntercept}; // Array containing slope and y-intercept
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /// Taking input for the first point
        System.out.println("Enter the x-coordinate of the first point (xCoordinate1): ");
        double xCoordinate1 = sc.nextDouble();
        System.out.println("Enter the y-coordinate of the first point (yCoordinate1): ");
        double yCoordinate1 = sc.nextDouble();

        // Taking input for the second point
        System.out.println("Enter the x-coordinate of the second point (xCoordinate2): ");
        double xCoordinate2 = sc.nextDouble();
        System.out.println("Enter the y-coordinate of the second point (yCoordinate2): ");
        double yCoordinate2 = sc.nextDouble();

        // Calculate Euclidean distance
        double distance = calculateEuclideanDistance(xCoordinate1, yCoordinate1, xCoordinate2, yCoordinate2);
        System.out.println("Euclidean Distance: " + distance);

        // Calculate slope and y-intercept
        double[] lineEquation = calculateLineEquation(xCoordinate1, yCoordinate1, xCoordinate2, yCoordinate2);
        double slope = lineEquation[0];
        double yIntercept = lineEquation[1];

        // Output the equation of the line
        System.out.println("The equation of the line is: y = " + slope + "x + " + yIntercept);
    
		sc.close();
	}
}
