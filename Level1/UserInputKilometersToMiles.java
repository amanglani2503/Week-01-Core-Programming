import java.util.Scanner;

class UserInputKilometersToMiles{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking User Input in Kilometers
		double distanceInKiloMeters = sc.nextDouble();
		
		// converting Kilometers to Miles
		double distanceInMiles = distanceInKiloMeters / 1.6;
		
		System.out.println("The total miles is " + distanceInMiles + " mile for given " + distanceInKiloMeters + " km");
		sc.close();
	}
}