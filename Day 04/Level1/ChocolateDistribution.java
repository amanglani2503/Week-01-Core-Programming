import java.util.Scanner;

public class ChocolateDistribution{
	
    // Method to calculate the number of chocolates each child gets and the remainder
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        
		int chocolatesReceived = numberOfChocolates / numberOfChildren;  // Calculating chocolates per child
        int remainingChocolates = numberOfChocolates % numberOfChildren;  // Calculating remaining chocolates
        
		return new int[]{chocolatesReceived, remainingChocolates};  // Return both values as an array
    }
	
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Taking from user number of chocolates and children as input
        System.out.print("Enter the number of chocolates :- ");
        int numberOfChocolates = sc.nextInt();
        
		System.out.print("Enter number of children :- ");
		int numberOfChildren = sc.nextInt();

        // Calling the method to calculate chocolates per child and remaining chocolates
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        System.out.println("Each child gets :- " + result[0] + " chocolates");  // Print chocolates each child gets
        System.out.println("Remaining chocolates :- " + result[1]);  // Print remaining chocolates

        sc.close();
    }
}
