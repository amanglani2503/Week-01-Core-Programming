import java.util.Scanner;

public class BonusCalculator{
    public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		// Storing salaries of employees
        double[] salaries = new double[10];
 
		// Storing experience of employees
		double[] yearsOfService = new double[10];
		
		// Array to store bonuses
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        
		// Taking as input employee salary and Year of service
        for (int employeeIndex = 0; employeeIndex < 10; employeeIndex++) {
            System.out.print("Enter salary for employee " + (employeeIndex + 1) + ":");
            
			// looping until a valid salary is received from user
			while (!sc.hasNextDouble()) {
                System.out.println("Invalid input! Enter a valid salary:");
                sc.next();
            }
            salaries[employeeIndex] = sc.nextDouble();
			
			
			System.out.print("Enter years of service for employee " + (employeeIndex + 1) + ":");
            // looping until a valid salary is received from user
			while (!sc.hasNextDouble()) {
                System.out.println("Invalid input! Enter valid years of service:");
                sc.next();
            }
            yearsOfService[employeeIndex] = sc.nextDouble();
        }
		
		
		double totalBonus = 0.0;
		double totalOldSalary = 0.0;
		double totalNewSalary = 0.0;
	
		// calculating bonuses and storing them in bonuses array and calculating the total of new and old salaries
        for (int employeeIndex = 0; employeeIndex < 10; employeeIndex++) {
            if (yearsOfService[employeeIndex] > 5) {
                bonuses[employeeIndex] = salaries[employeeIndex] * 0.05;
            } else {
                bonuses[employeeIndex] = salaries[employeeIndex] * 0.02;
            }

            newSalaries[employeeIndex] = salaries[employeeIndex] + bonuses[employeeIndex];
            totalBonus += bonuses[employeeIndex];
            totalOldSalary += salaries[employeeIndex];
            totalNewSalary += newSalaries[employeeIndex];
        }

        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
