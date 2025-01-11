import java.util.Scanner;

class CalculateSimpleInterest{
	
	// Method to calculate Simple Interest
	static double CalculateSimpleInterest(double principalAmount, double rateOfInterest, double timeDuration){
		
		double simpleInterest = (principalAmount * rateOfInterest * timeDuration)/100;
		return simpleInterest;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking as input Pricipal, Rate of Interest and Time
		System.out.print("Enter Principal Amount - ");
		double principalAmount = sc.nextDouble();
		
		System.out.print("Enter Rate of Interest - ");
		double rateOfInterest = sc.nextDouble();
		
		System.out.print("Enter Time - ");
		double timeDuration = sc.nextDouble();
		
		// storing returned Simple Interest
		double simpleInterest = CalculateSimpleInterest(principalAmount, rateOfInterest, timeDuration);
		
		System.out.println("The calculated Simple Interest is INR - " + simpleInterest);
		
		sc.close();
	}
}