import java.util.Scanner;

class TotalDistanceAndTime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking name of Traveller
		System.out.print("Enter traveller name - ");
		String name = sc.nextLine();
		
		// Taking City names from user
		System.out.print("Enter the source city - ");
		String fromCity = sc.nextLine();
		System.out.print("Enter the Intermediate City - ");
		String viaCity = sc.nextLine();
		System.out.print("Enter the destination - ");
		String toCity = sc.nextLine();
		
		// Taking distances from user
		System.out.print("Enter distance between "+ fromCity + " and " +  viaCity + " - ");
		double distanceFromToVia = sc.nextDouble();
		System.out.print("Enter distance between " + viaCity + " and " + toCity + " - ");
		double distanceViaToFinal = sc.nextDouble();
		
		// Taking times in minutes
		System.out.print("Enter time between "+ fromCity + " and " +  viaCity + " - ");
		int timeFromToVia = sc.nextInt();
		System.out.print("Enter time between " + viaCity + " and " + toCity + " - ");
		int timeViaToFinalCity = sc.nextInt();
		
		// calculating total time and distance
		int totalTime = timeFromToVia + timeViaToFinalCity;
		double totalDistance = distanceFromToVia + distanceViaToFinal;
		
		System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
	}
}