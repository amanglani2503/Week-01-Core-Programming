import java.util.Scanner;

class IntOperation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking integers as input
		
		System.out.print("Enter first number - ");
		int firstNumber = sc.nextInt();
		System.out.print("Enter Second Number - ");
		int secondNumber = sc.nextInt();
		System.out.print("Enter third Number - ");
		int thirdNumber = sc.nextInt();
		
		// Performing operation 1 - a + b * c
		int firstOperationResult = firstNumber + secondNumber * thirdNumber;
		
		// Performing operation 2 = a * b + c
		int secondOperationResult = firstNumber * secondNumber + thirdNumber;
		
		// Performing operation 3 - c + a/b
		int thirdOperationResult = thirdNumber + firstNumber / secondNumber;
		
		// performing operation 4 - a % b + c
		int fourthOperationResult = firstNumber % secondNumber + thirdNumber;
		
		System.out.println("The results of int operations are - " + firstOperationResult + ", " + secondOperationResult + ", " + thirdOperationResult + ", " + fourthOperationResult);
		sc.close();  
	}
}