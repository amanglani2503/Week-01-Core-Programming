import java.util.Scanner;

class AreaOfTriangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking Inputs for height and base lengths
		System.out.print("Enter Length of Base in cm - ");
		double baseLength = sc.nextDouble();
		System.out.print("Enter Height in cm - ");
		double height = sc.nextDouble();
		
		/* Calculating Area of traiangle
		Area = 0.5 * base * height */
		// Calculating area in Square Centimeters
		double areaOfTriangleInSquareCentimeter = baseLength * height / 2;
		
		// Converting area of Triangle from square centimeters to square inches
		// 1 square centimeters = 0.155 square inch
		double areaOfTriangleInSquareInches = areaOfTriangleInSquareCentimeter / 0.155;
		
		System.out.println("Base length and Height of Triangle are " + baseLength + " and " + height + ". Area of Triangle in square centimeters is " + areaOfTriangleInSquareCentimeter + " and in square inches is " + areaOfTriangleInSquareInches);
		sc.close();
	}
}