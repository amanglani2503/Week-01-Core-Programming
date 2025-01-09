import java.util.Scanner;

class DoubleOpt{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input from user
		
		System.out.print("Enter first number - ");
		double firstNumber = sc.nextDouble();
		System.out.print("Enter Second Number - ");
		double secondNumber = sc.nextDouble();
		System.out.print("Enter third Number - ");
		double thirdNumber = sc.nextDouble();
		
		// Performing operation 1 - a + b * c
		double firstOperationResult = firstNumber + secondNumber * thirdNumber;
		
		// Performing operation 2 = a * b + c
		double secondOperationResult = firstNumber * secondNumber + thirdNumber;
		
		// Performing operation 3 - c + a/b
		double thirdOperationResult = thirdNumber + firstNumber / secondNumber;
		
		// performing operation 4 - a % b + c
		double fourthOperationResult = firstNumber % secondNumber + thirdNumber;
		
		System.out.println("The results of int operations are - " + firstOperationResult + ", " + secondOperationResult + ", " + thirdOperationResult + ", " + fourthOperationResult);
		sc.close(); 
	}
}