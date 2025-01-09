import java.util.Scanner;

class NumberOfHandshakes{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input from user
		System.out.print("Enter the number of Students - ");
		int numberOfStudents = sc.nextInt();
		
		/* Calculating Total Number of Handshakes*/
		int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
		System.out.println("Total Number Of Handshakes is " + handshakes + " given there are " + numberOfStudents + " students");
		
		sc.close();
	}
}