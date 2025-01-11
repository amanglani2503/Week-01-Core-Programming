import java.util.Scanner;

public class OperationsOnANumber2{

    // Method to find the count of digits in the number
    public static int getDigitCount(int number) {
        int count = 0;
        number = Math.abs(number); // Handle negative numbers
        while (number > 0) {
            number /= 10; // Remove the last digit
            count++; // Increment the digit count
        }
        return count == 0 ? 1 : count; // Handle case where number is 0
    }

    // Method to store the digits of the number in a custom array
    public static int[] extractDigits(int number) {
        number = Math.abs(number); // Handle negative numbers
        int digitCount = getDigitCount(number);
        int[] digitsArray = new int[digitCount];
        
        for (int i = digitCount - 1; i >= 0; i--) {
            digitsArray[i] = number % 10;
            number /= 10;
        }
        return digitsArray;
    }

    // Method to calculate the sum of the digits of a number
    public static int calculateDigitSum(int[] digitsArray) {
        int sum = 0;
        for (int i = 0; i < digitsArray.length; i++) {
            sum += digitsArray[i];
        }
        return sum;
    }

    // Method to calculate the sum of the squares of the digits of a number
    public static int calculateSumOfSquares(int[] digitsArray) {
        int sumOfSquares = 0;
        for (int i = 0; i < digitsArray.length; i++) {
            sumOfSquares += digitsArray[i] * digitsArray[i];
        }
        return sumOfSquares;
    }

    // Method to check if the number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        int[] digitsArray = extractDigits(number);
        int sumOfDigits = calculateDigitSum(digitsArray);
        return number % sumOfDigits == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] calculateDigitFrequency(int number) {
        int[] digitsArray = extractDigits(number);
        int[][] digitFrequency = new int[10][2];

        // Initialize the frequency array
        for (int i = 0; i < 10; i++) {
            digitFrequency[i][0] = i; // Digit
            digitFrequency[i][1] = 0; // Frequency
        }

        // Count the frequency of each digit
        for (int i = 0; i < digitsArray.length; i++) {
            digitFrequency[digitsArray[i]][1]++;
        }

        return digitFrequency;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Get digit count
        int digitCount = getDigitCount(number);
        System.out.println("Number of digits: " + digitCount);

        // Get digits array
        int[] digitsArray = extractDigits(number);
        System.out.print("Digits array: ");
        for (int digit : digitsArray) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Calculate the sum of digits
        int digitSum = calculateDigitSum(digitsArray);
        System.out.println("Sum of digits: " + digitSum);

        // Calculate the sum of squares of digits
        int sumOfSquares = calculateSumOfSquares(digitsArray);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        // Check if the number is a Harshad number
        boolean isHarshad = isHarshadNumber(number);
        System.out.println("Is the number a Harshad number: " + isHarshad);

        // Calculate the frequency of each digit
        int[][] frequency = calculateDigitFrequency(number);
        System.out.println("Digit frequencies:");
        for (int[] freq : frequency) {
            if (freq[1] > 0) {
                System.out.println("Digit " + freq[0] + ": " + freq[1] + " times");
            }
        }

        scanner.close(); // Close the scanner
    }
}
