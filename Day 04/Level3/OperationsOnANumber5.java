import java.util.Scanner;

public class OperationsOnANumber5{

    // Method to find the factors of a number and return them as an array
    public static int[] findFactors(int number) {
        // variable to count number of factors
        int factorsCount = 0;
        
        // Count how many factors the number has
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorsCount++;
            }
        }
        
        // Create an array to store the factors
        int[] factorsArray = new int[factorsCount];
        int index = 0;

        // Store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorsArray[index++] = i;
            }
        }
        
        return factorsArray;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int findGreatestFactor(int[] factorsArray) {
        int greatestFactor = factorsArray[0];
        for (int i = 1; i < factorsArray.length; i++) {
            if (factorsArray[i] > greatestFactor) {
                greatestFactor = factorsArray[i];
            }
        }
        return greatestFactor;
    }

    // Method to find the sum of the factors using the factors array
    public static int sumOfFactors(int[] factorsArray) {
        int sum = 0;
        for (int factor : factorsArray) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static int productOfFactors(int[] factorsArray) {
        int product = 1;
        for (int factor : factorsArray) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cubes of the factors using the factors array
    public static double productOfCubesOfFactors(int[] factorsArray) {
        double product = 1;
        for (int factor : factorsArray) {
            product *= Math.pow(factor, 3);  // Calculate the cube of the factor
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factorsArray = findFactors(number);
        int sum = sumOfFactors(factorsArray) - number;  // Exclude the number itself
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factorsArray = findFactors(number);
        int sum = sumOfFactors(factorsArray) - number;  // Exclude the number itself
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factorsArray = findFactors(number);
        int sum = sumOfFactors(factorsArray) - number;  // Exclude the number itself
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sumOfFactorialOfDigits = 0;
        int originalNumber = number;

        // Calculate the sum of the factorial of the digits
        while (number > 0) {
            int digit = number % 10;
            sumOfFactorialOfDigits += factorial(digit);
            number /= 10;
        }

        // Check if the sum of the factorial of digits equals the original number
        return sumOfFactorialOfDigits == originalNumber;
    }

    // Helper method to calculate factorial of a number
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		// Taking a number as input
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        // Find the factors of the number
        int[] factors = findFactors(number);

        // Display the results
        System.out.println("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Greatest factor
        System.out.println("Greatest factor: " + findGreatestFactor(factors));

        // Sum of factors
        System.out.println("Sum of factors: " + sumOfFactors(factors));

        // Product of factors
        System.out.println("Product of factors: " + productOfFactors(factors));

        // Product of cubes of factors
        System.out.println("Product of cubes of factors: " + productOfCubesOfFactors(factors));

        // Check if the number is perfect
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        // Check if the number is abundant
        if (isAbundantNumber(number)) {
            System.out.println(number + " is an abundant number.");
        } else {
            System.out.println(number + " is not an abundant number.");
        }

        // Check if the number is deficient
        if (isDeficientNumber(number)) {
            System.out.println(number + " is a deficient number.");
        } else {
            System.out.println(number + " is not a deficient number.");
        }

        // Check if the number is strong
        if (isStrongNumber(number)) {
            System.out.println(number + " is a strong number.");
        } else {
            System.out.println(number + " is not a strong number.");
        }

        sc.close();
    }
}
