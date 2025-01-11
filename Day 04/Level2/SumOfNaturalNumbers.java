import java.util.Scanner;

public class SumOfNaturalNumbers{
	
	
	// Method to calculate the sum of n natural numbers using recursion
    private static int calculateSumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + calculateSumRecursive(n - 1);
    }
	
	
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

        // Taking user input for a number
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.err.println("Please enter a valid natural number (n > 0).");
            sc.close();
            return;
        }

        // Calculating sum using recursive function calls
        int sumRecursive = calculateSumRecursive(n);

        // Calculating the sum using formula
        int sumFormula = n * (n + 1) / 2;

        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using formula: " + sumFormula);

        // Comparing the results
        if (sumRecursive == sumFormula) {
            System.out.println("Both methods have the same result");
        } else {
            System.out.println("Results do not match. Check the computation.");
        }

        sc.close();
    }
}
