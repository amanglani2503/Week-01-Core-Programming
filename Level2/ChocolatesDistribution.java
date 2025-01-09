import java.util.Scanner;

class ChocolatesDistribution{
	public static void main(String[] args){

		//Creating Scanner object to take user input
		Scanner sc = new Scanner(System.in);

		//Taking number of students and chocolates as user inputs 
		System.out.print("Enter Number of Chocolates - ");
		int numberofchocolates = sc.nextInt();
		System.out.print("Enter Number of Students - ");
		int numberofstudents = sc.nextInt();

		// Chocolates each student receives
		int chocolateperstudent = numberofchocolates / numberofstudents;

		//Finding number of remaining chocolates
		int remainingchocolates = numberofchocolates % numberofstudents;

		System.out.println(" The number of chocolates each child gets is" + " "+ chocolateperstudent + " " + "and the number of remaining chocolates are" + " "+ remainingchocolates ); 
		sc.close();
	}
}