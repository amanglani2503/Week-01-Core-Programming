import java.util.Scanner;

public class OperationsOnANumber4{

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        
		while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        
		return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        int originalNumber = number;
        
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        
		return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        int temp = number;
        
        while (temp > 0) {
            if (temp % 10 != square % 10) {
                return false;
            }
            temp /= 10;
            square /= 10;
        }
        
		return true;
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        boolean isPrime = isPrime(number);
        System.out.println("Is the number prime: " + isPrime);

        // Check if the number is a neon number
        boolean isNeon = isNeon(number);
        System.out.println("Is the number a neon number: " + isNeon);

        // Check if the number is a spy number
        boolean isSpy = isSpy(number);
        System.out.println("Is the number a spy number: " + isSpy);

        // Check if the number is an automorphic number
        boolean isAutomorphic = isAutomorphic(number);
        System.out.println("Is the number an automorphic number: " + isAutomorphic);

        // Check if the number is a buzz number
        boolean isBuzz = isBuzz(number);
        System.out.println("Is the number a buzz number: " + isBuzz);

        scanner.close(); // Close the scanner
    }
}
