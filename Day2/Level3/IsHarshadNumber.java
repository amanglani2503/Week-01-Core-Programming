import java.util.Scanner;

class IsHarshadNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();


		// Storing the original number for comparison
        int originalNumber = number;
        int sum = 0;

        // Calculating the sum of digits
        while (number > 0) {
			// Get the last digit
            int digit = number % 10; 
			
			// Add the digit to sum
            sum += digit;           

			// Remove the last digit
            number /= 10;            
        }

        // Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }

        sc.close();
    }
}
