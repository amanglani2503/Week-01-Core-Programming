import java.util.Scanner;

class ConvertingPoundsToKg{
	public static void main(String []args){
		
		//Taking user input from Scanner object
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter weight in pounds");
		double weight = sc.nextInt();
	
		//Converting from pounds to kilograms
		double new_weight = weight * 2.2;
	
	  	System.out.println("The weight of person is " + weight + " and in kg is " + new_weight);
		sc.close();
	}
}	