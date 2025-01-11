import java.util.Scanner;

public class QuotientAndRemainder{
	
	// Method to calculate the quotient and remainder of division
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;  // Calculate quotient using division operator
        int remainder = number % divisor;  // Calculate remainder using modulus operator
        return new int[]{quotient, remainder};  // Return both quotient and remainder as an array
    }
	
	
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Prompt user for the dividend and divisor
        System.out.println("Enter dividend :- ");
        int dividend = sc.nextInt();
		
		System.out.print("Enter divisor:");
        int divisor = sc.nextInt();

        // Call the method to calculate quotient and remainder
        int[] result = findRemainderAndQuotient(dividend, divisor);
        
		System.out.println("Quotient: " + result[0]);   // Print quotient
        System.out.println("Remainder: " + result[1]);   // Print remainder

        sc.close();
    }
}
