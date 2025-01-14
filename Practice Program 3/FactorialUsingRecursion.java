import java.util.Scanner;

public class FactorialUsingRecursion{

    // Function for calculating the factorial
    public static int calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;  // Base case: factorial of 0 or 1 is 1
        } else {
            return num * calculateFactorial(num - 1);  // Recursive case
        }
    }

    // Function for taking input from the user
    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial : ");
		int number = sc.nextInt();
		
		sc.close();
        return number;
    }

    // Function for displaying the result
    public static void displayResult(int num, int factorial) {
        System.out.println("The factorial of " + num + " is: " + factorial);
    }

 
    public static void main(String[] args) {
        int num = getInput();  // Get user input
        int factorial = calculateFactorial(num);  // Calculate the factorial using recursion
        displayResult(num, factorial);  // Display the result
    }
}
