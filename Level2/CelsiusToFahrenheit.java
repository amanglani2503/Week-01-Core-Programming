import java.util.Scanner;

class CelsiusToFahrenheit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking temperature in celsius as input
		System.out.print("Enter Temperature in Celsius - ");
		double celsius = sc.nextDouble();
		
		// converting temperature from Celsius to Fahrenheit
		double fahrenheitResult = (celsius * 9) / 5 + 32;
		
		System.out.println("The " + celsius + " celsius is " + fahrenheitResult + "fahrenheit");
		sc.close();
	}
}