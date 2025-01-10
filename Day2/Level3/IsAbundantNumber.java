import java.util.Scanner;

class IsAbundantNumber{
    public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);

        // Get an integer input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initializing sum to 0
        int sum = 0;

        // Looping to find all divisors of the number
        for (int currentNumber = 1; currentNumber < number; currentNumber++) {
            if (number % currentNumber == 0) { // Check if i is a divisor
                sum += currentNumber; // Add the divisor to the sum
            }
        }

        // Check if the number is abundant
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }

        // Close the scanner
        sc.close();
    }
}