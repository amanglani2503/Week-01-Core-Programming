import java.util.Scanner;

class FeetsToYardsAndMiles{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking Inputs from user
		System.out.print("Enter Distance in Feets - ");
		double distanceInFeets = sc.nextInt();
		
		// Converting distance from feets to yard
		double distanceInYards = distanceInFeets / 3;
		
		// Converting distance from Yards to Miles
		double distanceInMiles = distanceInYards / 1760;
		
		System.out.println("The Distance entered by used is " + distanceInFeets + " feets. The converted distance in Yards is " + distanceInYards + " and distance in Miles is " + distanceInMiles);
		sc.close();
	}
}