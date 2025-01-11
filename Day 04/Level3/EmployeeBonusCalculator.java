import java.util.Random;

public class EmployeeBonusCalculator{

    // Method to generate a 2D array with employees' salaries and years of service
    public static int[][] determineSalaryAndYearsOfService() {
        Random rand = new Random();

        // Define a 2D array with 10 employees (rows) and 2 columns (salary and years of service)
        int[][] employeeData = new int[10][2];  // employeeData[0] = salary, employeeData[1] = years of service

        // Populate the array with random values
        for (int i = 0; i < 10; i++) {
            int randomSalary = rand.nextInt(90000) + 10000; // Random salary between 10000 and 99999
            int randomYearsOfService = rand.nextInt(11);    // Random years of service between 0 and 10

            employeeData[i][0] = randomSalary;              // Assign salary
            employeeData[i][1] = randomYearsOfService;      // Assign years of service
        }

        return employeeData;
    }

    // Method to calculate new salary and bonus for each employee
    public static double[][] calculateNewSalaryAndBonus(int[][] employeeData) {
        double[][] updatedData = new double[10][3];  // updatedData[0] = new salary, updatedData[1] = bonus, updatedData[2] = old salary

        for (int i = 0; i < 10; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonus = 0;

            // Apply bonus logic
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05;  // 5% bonus
            } else {
                bonus = oldSalary * 0.02;  // 2% bonus
            }

            // Calculate new salary
            double newSalary = oldSalary + bonus;

            // Store the new salary, bonus, and old salary in the updatedData array
            updatedData[i][0] = newSalary;  // new salary
            updatedData[i][1] = bonus;      // bonus amount
            updatedData[i][2] = oldSalary;  // old salary
        }

        return updatedData;
    }

    // Method to calculate and display the sum of old salary, new salary, and total bonus
    public static void displayDetails(int[][] employeeData, double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        // Calculate the totals
        for (int i = 0; i < 10; i++) {
            totalOldSalary += employeeData[i][0];
            totalNewSalary += updatedData[i][0];
            totalBonus += updatedData[i][1];
        }

        // Display the details of each employee
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + " Details:");
            System.out.println("Old Salary: " + employeeData[i][0]);
            System.out.println("Years of Service: " + employeeData[i][1]);
            System.out.println("Bonus: " + updatedData[i][1]);
            System.out.println("New Salary: " + updatedData[i][0]);
            System.out.println();  // Blank line between employees
        }

        // Display the total sum of old salary, new salary, and total bonus
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        System.out.println("Total Bonus: " + totalBonus);
    }

    public static void main(String[] args) {
        // Generate the employee data (salary and years of service)
        int[][] employeeData = determineSalaryAndYearsOfService();

        // Calculate the new salary and bonus
        double[][] updatedData = calculateNewSalaryAndBonus(employeeData);

        // Display the details of each employee and the total sum
        displayDetails(employeeData, updatedData);
    }
}
