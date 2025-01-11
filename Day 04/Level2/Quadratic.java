import java.util.Scanner;

public class Quadratic{

    // Method to find the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        // Calculate the discriminant (delta)
        double delta = Math.pow(b, 2) - 4 * a * c;

        // If delta is positive, two distinct roots exist
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        }
        // If delta is zero, one root exists
        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }
        // If delta is negative, no real roots exist
        else {
            return new double[]{}; // Return an empty array
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input coefficients a, b, and c
        System.out.println("Enter coefficients a, b, and c of the quadratic equation ax^2 + bx + c:");
        System.out.print("a : ");
        double a = sc.nextDouble();
        System.out.print("b : ");
        double b = sc.nextDouble();
        System.out.print("c : ");
        double c = sc.nextDouble();

        // Validate that 'a' is not zero (not a quadratic equation if a = 0)
        if (a == 0) {
            System.err.println("Invalid input: Coefficient 'a' cannot be zero for a quadratic equation");
            return;
        }

        // Call method to find roots
        double[] roots = findRoots(a, b, c);

        // Display results
        if (roots.length == 2) {
            System.out.printf("The equation has two distinct roots : " + roots[0]+ " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.printf("The equation has one root : " + roots[0]);
        } else {
            System.out.println("The equation has no real roots");
        }

        sc.close();
    }
}
