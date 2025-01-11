import java.util.Scanner;

public class OperationsOnANumber3{

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

    // Method to reverse the digits array
    public static int[] reverseDigitsArray(int[] digitsArray) {
        int[] reversedArray = new int[digitsArray.length];
        for (int i = 0; i < digitsArray.length; i++) {
            reversedArray[i] = digitsArray[digitsArray.length - 1 - i];
        }
        return reversedArray;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a palindrome using the digits array
    public static boolean isPalindrome(int number) {
        int[] digitsArray = extractDigits(number);
        int[] reversedArray = reverseDigitsArray(digitsArray);
        return areArraysEqual(digitsArray, reversedArray);
    }

    // Method to check if a number is a duck number using the digits array
    public static boolean isDuckNumber(int number) {
        int[] digitsArray = extractDigits(number);
        for (int digit : digitsArray) {
            if (digit != 0) {
                return true; // Duck number has at least one non-zero digit
            }
        }
        return false; // If all digits are zero, it's not a duck number
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

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

        // Checking if the number is a palindrome
        boolean isPalindrome = isPalindrome(number);
        System.out.println("Is the number a palindrome: " + isPalindrome);

        // Checking if the number is a duck number
        boolean isDuck = isDuckNumber(number);
        System.out.println("Is the number a duck number: " + isDuck);

        sc.close();
    }
}
