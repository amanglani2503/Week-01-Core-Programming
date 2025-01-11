import java.util.Scanner;

public class BodyMassIndexCalculator{

    // Method to calculate BMI and populate the BMI column in the array
    public static void computeBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0]; // Weight in kg
            double heightInMeters = data[i][1] / 100.0; // Height in meters
            data[i][2] = weight / (heightInMeters * heightInMeters); // BMI formula
        }
    }

    // Method to determine BMI status
    public static String[] determineBMIStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        return statuses;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2D array to store weight, height, and BMI for 10 members
        double[][] teamData = new double[10][3];

        // Input for weight and height of each team member
        System.out.println("Enter weight (in kg) and height (in cm) for 10 members:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Member " + (i + 1) + " - Weight (kg): ");
            teamData[i][0] = sc.nextDouble();
            System.out.print("Member " + (i + 1) + " - Height (cm): ");
            teamData[i][1] = sc.nextDouble();
        }

        // Calculate BMI
        computeBMI(teamData);

        // Determine BMI statuses
        String[] bmiStatuses = determineBMIStatus(teamData);

        // Display the results
        for (int personIndex = 0; personIndex < 10; personIndex++) {
            System.out.println("\nPerson " + (personIndex + 1) + " Details - ");
			System.out.println("Height - " + teamData[personIndex][0]);
			System.out.println("Weight - " + teamData[personIndex][1]);
			System.out.println("BMI - " + teamData[personIndex][2]);
			System.out.println("Weight Status - " + bmiStatuses[personIndex]);
        }

        sc.close();
    }
}
