import java.util.Scanner;

public class AnalysingNumber{

    // Method to check if a number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check if a number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1; // number1 is greater
        } else if (number1 == number2) {
            return 0; // numbers are equal
        } else {
            return -1; // number1 is less
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to store 5 input numbers
        int[] numbers = new int[5];

        // Taking user input for the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + " : ");
            numbers[i] = sc.nextInt();
        }

        // Loop through the array and analyze each number
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                if (isEven(numbers[i])) {
                    System.out.println("Number " + numbers[i] + " is positive and even");
                } else {
                    System.out.println("Number " + numbers[i] + " is positive and odd");
                }
            } else {
                System.out.println("Number " + numbers[i] + " is negative");
            }
        }

        // Comparing the first and last elements
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);

        System.out.println("\nComparison of first and last elements : ");
        if (comparisonResult == 1) {
            System.out.println("First element is greater than the last element.");
        } else if (comparisonResult == 0) {
            System.out.println("First and last elements are equal.");
        } else {
            System.out.println("First element is less than the last element.");
        }

        sc.close();
    }
}
