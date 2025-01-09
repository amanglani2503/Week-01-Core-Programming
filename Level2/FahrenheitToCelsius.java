import java.util.Scanner;

class FahrenheitToCelsius{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			
		// Taking temperature as Input from user in degree FahrenheitToCelsius
		System.out.print("Enter temperature in Fahrenheit - ");
		double fahrenheit = sc.nextDouble();
		
		// Converting temperature from fahrenheit to celsius
		double celsiusResult = (fahrenheit - 32) * 5/9;
		
		System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");
		sc.close();
	}
}