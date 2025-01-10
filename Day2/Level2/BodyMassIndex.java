import java.util.Scanner;
class BodyMassIndex{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking as input user weight in kg and height in cm
		System.out.print("Enter weight - ");
		double weightInKg =  sc.nextDouble();
		
		System.out.print("Enter height in centimeters - ");
		double heightInCm =  sc.nextDouble();
		
		// Converting height into meter 
		double heightConvert = heightInCm / 100;
		
		// Calculating BMI of user
		double bodyMassIndex = weightInKg / (heightConvert * heightConvert);
		
		// Checking condition of Underweight
		if (18.4 >= bodyMassIndex ){
			System.out.print("Your are Underweight");
		}
		
		// Checking condition of Normal
		else if(18.5 <= bodyMassIndex && bodyMassIndex <= 24.9){
			System.out.print("Your are Fine");
		}
		
		// Checking condition of Overweight
		else if(25.0 <= bodyMassIndex && bodyMassIndex <= 39.9){
			System.out.print("Your are Overweight");
		}
		
		// Checking condition of Obese
		else {
			System.out.print("You are Obese");
		}
	}
}