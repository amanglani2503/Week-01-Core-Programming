import java.util.Scanner;

class TotalIncome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking salary and bonus as input from user
		System.out.print("Enter the salary - ");
		int salary = sc.nextInt();
		System.out.print("Enter bonus - ");
		int bonus = sc.nextInt();
		
		// calculating total income by adding salary and bonus
		int totalIncome = salary + bonus;
		System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence total income is " + totalIncome);
		
		sc.close();
	}
}