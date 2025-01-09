import java.util.Scanner;

class ComputingSideFromPerimeterOfSquare{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking Perimeter as input
		System.out.print("Enter Perimeter Of Square - ");
		double perimeterOfSquare = sc.nextDouble();
		
		// Calculating side of square
		double side = perimeterOfSquare / 4;
		
		System.out.println("The length of side is " + side + " whose perimete is " + perimeterOfSquare);
		sc.close();
	}
}