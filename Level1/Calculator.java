import java.util.Scanner;

class Calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking Numbers as input
		System.out.print("Enter First Number - ");
		float number1 = sc.nextFloat();
		System.out.print("Enter Second Number - ");
		float number2 = sc.nextFloat();
		
		double sum = number1 + number2;
		double difference = number1 - number2;
		double product = number1 * number2;
		double division = number1 / number2;
		
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + sum + ", " + difference + ", " + product + ", " + division);
		sc.close();
	}
}