import java.util.Scanner;

public class OperationsOnFactors{

	// Method to find factors and save them in an array
    private static int[] findFactors(int number) {
        int factorsFound = 0;

        // First loop to count the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorsFound++;
            }
        }

        // Initialize array to store factors
        int[] factorsArray = new int[factorsFound];
        int index = 0;

        // Second loop to store factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorsArray[index++] = i;
            }
        }
        return factorsArray;
    }
	
	// Method to calculate the sum of factors
    private static int calculateSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to calculate the product of factors
    private static int calculateProduct(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to calculate the sum of squares of factors
    private static int calculateSumOfSquares(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }
	
	
    public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);

        // Take user input for a number
        System.out.print("Enter a number to find its factors: ");
        int number = sc.nextInt();

        // Find factors and store in an array
        int[] factorsArray = findFactors(number);

        // Display the factors
        System.out.print("Factors of " + number + " are: ");
        for (int factor : factorsArray) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Performing operrations on factors
        int sumOfFactors = calculateSum(factorsArray);
        int productOfFactors = calculateProduct(factorsArray);
        int sumOfSquares = calculateSumOfSquares(factorsArray);

        // Displaying results
        System.out.println("Sum of factors: " + sumOfFactors);
        System.out.println("Product of factors: " + productOfFactors);
        System.out.println("Sum of squares of factors: " + sumOfSquares);

        sc.close();
    }
}