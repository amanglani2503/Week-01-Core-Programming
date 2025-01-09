import java.util.Scanner;

class HeightConversionCentimetersToInches{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking height as input in Centimeters
		double heightInCentimeters = sc.nextDouble();
		
		// converting height in centimeters to inches
		double heightInInches = heightInCentimeters / 2.54;
		
		// converting height in feet
		double heightInFeet = heightInInches / 12;
		
		System.out.println("Your Height in cm is " + heightInCentimeters + " while in feet is " + heightInFeet + " and inches is " + heightInInches);
		sc.close();
	}
}