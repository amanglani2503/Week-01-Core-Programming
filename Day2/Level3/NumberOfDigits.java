import java.util.Scanner;

class NumberOfDigits{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking integer as input
		System.out.print("Enter a number - ");
		int inputNumber = sc.nextInt();
		
		// storing a copy of number
		int copyNumber = inputNumber;
		
		// Storing number of digits
		int numberOfDigits = 0;
		
		while(copyNumber != 0){
			numberOfDigits++;
			copyNumber /= 10;
		}
		
		System.out.println("There are " + numberOfDigits + " digits in " + inputNumber);
		sc.close();
	}
}