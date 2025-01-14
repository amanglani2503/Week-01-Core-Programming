import java.util.Scanner;

public class FibonacciSequenceGenerator{

    // Function to calculate and print the Fibonacci sequence
    public static void generateFibonacci(int numberOfTerms) {
        int firstTerm = 0, secondTerm = 1;

        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= numberOfTerms; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;  // Calculate the next Fibonacci number
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();  // Print a newline after the sequence
    }

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of terms in the Fibonacci sequence
        System.out.print("Enter the number of terms for the Fibonacci sequence : ");
        int numberOfTerms = sc.nextInt();

        // Calling the function to generate the Fibonacci sequence
        generateFibonacci(numberOfTerms);
    
		sc.close();
	}
}
