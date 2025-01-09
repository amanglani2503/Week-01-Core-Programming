import java.util.Scanner;

class SwappingNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking numbers for swapping as input 
		System.out.print("Enter first number - ");
		int firstNumber = sc.nextInt();
		System.out.print("Enter second Number - ");
		int secondNumber = sc.nextInt();
		
		// Swapping the numbers
		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;
		
		System.out.println("The swapped numbers are " + firstNumber + " and " + secondNumber);
		sc.close();
	}
}