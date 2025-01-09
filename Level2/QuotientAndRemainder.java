import java.util.Scanner;

class QuotientAndRemainder{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking numbers as input from user
		System.out.print("Enter First Number - ");
		int number1 = sc.nextInt();
		System.out.print("Enter Second Number - ");
		int number2 = sc.nextInt();
		
		// calculating quotient and remainder
		int quotient = number1 / number2;
		int remainder = number1 % number2;
		
		System.out.println("The quotient is " + quotient + " and Remainder is " + remainder + " of two number " + number1 + " and " + number2);
		sc.close();
	}
}