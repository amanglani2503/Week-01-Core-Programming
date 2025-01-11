import java.util.Scanner;

public class TrigonometricFunctions{
	
	// Method to calculate sine, cosine, and tangent of an angle in degrees
    public static double[] calculateTrigonometricFunctions(double angleInDegree) {
        double angleInRadians = Math.toRadians(angleInDegree);  // Converting angle to radians
        double sine = Math.sin(angleInRadians);          // Calculating sine
        double cosine = Math.cos(angleInRadians);       // Calculating cosine
        double tangent = Math.tan(angleInRadians);      // Calculating tangent
        
		return new double[]{sine, cosine, tangent};  // Return all three values as an array
    }
	
	
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Taking input from as input angle in degrees
        System.out.println("Enter an angle in degrees:");
        double angleInDegree = sc.nextDouble();

        // Calling the method to calculate sine, cosine, and tangent of the angle
        double[] result = calculateTrigonometricFunctions(angleInDegree);
        System.out.println("Sine :- " + result[0]);   // Printing sine of the angle
        System.out.println("Cosine :- " + result[1]);  // Print cosine of the angle
        System.out.println("Tangent :- " + result[2]); // Print tangent of the angle

        // Close the scanner object to free resources
        sc.close();
    }
}
