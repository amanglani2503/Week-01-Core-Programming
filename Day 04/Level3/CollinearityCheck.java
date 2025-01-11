import java.util.Scanner;

public class CollinearityCheck{

    // Method to calculate the slope between two points
    public static double calculateSlope(int x1, int y1, int x2, int y2) {
        // Slope = (y2 - y1) / (x2 - x1)
        return (double) (y2 - y1) / (x2 - x1);
    }

    // Method to check if the three points are collinear using the slope formula
    public static boolean arePointsCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate the slopes between points AB, BC, and AC
        double slopeAB = calculateSlope(x1, y1, x2, y2);
        double slopeBC = calculateSlope(x2, y2, x3, y3);
        double slopeAC = calculateSlope(x1, y1, x3, y3);

        // The points are collinear if all slopes are equal
        return (slopeAB == slopeBC && slopeAB == slopeAC);
    }

    // Method to check if the three points are collinear using the area of triangle formula
    public static boolean arePointsCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Area of triangle formula: area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2))
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        // The points are collinear if the area of the triangle is zero
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the 3 points
        System.out.print("Enter x1, y1 for point A : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        
        System.out.print("Enter x2, y2 for point B : ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        System.out.print("Enter x3, y3 for point C : ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        // Check if the points are collinear using slope method
        boolean areCollinearBySlope = arePointsCollinearBySlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Are the points collinear by slope method? " + areCollinearBySlope);

        // Check if the points are collinear using area method
        boolean areCollinearByArea = arePointsCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Are the points collinear by area method? " + areCollinearByArea);

        sc.close(); // Close the scanner
    }
}
