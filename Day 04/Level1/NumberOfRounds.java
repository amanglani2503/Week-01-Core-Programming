import java.util.Scanner;

class NumberOfRounds{	
	// Function to Calculate number of rounds  
	public static int CalculateNumberOfRounds(double side1Length, double side2Length, double side3Length){
		// Calculating perimeter of park
		double perimeterOfPark = side1Length + side2Length + side3Length;
		
		// Calculating number of rounds required
		int numberOfRounds = (int) (Math.ceil(5000 / perimeterOfPark));  // ceiling because rounds are rounded to their next integer value. like 3.5 will become 4
	
		return numberOfRounds;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking as input, length of sides of triangle
		System.out.print("Enter length of Side 1 in meters - ");
		double side1Length = sc.nextDouble();
		
		System.out.print("Enter length of Side 2 in meters - ");
		double side2Length = sc.nextDouble();
		
		System.out.print("Enter length of Side 3 in meters - ");
		double side3Length = sc.nextDouble();
		
		// calling method to calculate number of rounds and storing the result
		int roundsRequired = CalculateNumberOfRounds(side1Length, side2Length, side3Length);
		
		System.out.println("Total Numbers of rounds required - " + roundsRequired);
		
		sc.close();
	}
}