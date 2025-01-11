import java.util.Scanner;

class PossibleHandshakes{
	
	public static void calculateHandshakes(int numberOfStudents){
		System.out.println("Total Number of Students - " + (numberOfStudents * (numberOfStudents - 1)) / 2);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking as input number of Students present
		System.out.print("Enter the number of students - ");
		int numberOfStudents = sc.nextInt();
		
		calculateHandshakes(numberOfStudents);
		
		sc.close();
	}
}