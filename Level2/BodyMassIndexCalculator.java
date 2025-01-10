import java.util.Scanner;

public class BodyMassIndexCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = sc.nextInt();

        // Arrays to store height, weight, BMI, and weight status
        double[] heights = new double[numberOfPersons];
        double[] weights = new double[numberOfPersons];
        double[] bmiValues = new double[numberOfPersons];
        String[] weightStatuses = new String[numberOfPersons];

        // Taking Input height and weight for each person
        for (int personIndex = 0; personIndex < numberOfPersons; personIndex++) {
            System.out.println("Enter details for Person " + (personIndex + 1) + " - ");
            System.out.print("Height (in meters) - ");
            heights[personIndex] = sc.nextDouble();
            System.out.print("Weight (in kg) - ");
            weights[personIndex] = sc.nextDouble();

            // Calculating and storing BMI of each person
            bmiValues[personIndex] = weights[personIndex] / (heights[personIndex] * heights[personIndex]);

            // Determine weight status
            if (bmiValues[personIndex] <= 18.4) {
                weightStatuses[personIndex] = "Underweight";
            } else if (bmiValues[personIndex] <= 24.9) {
                weightStatuses[personIndex] = "Normal";
            } else if (bmiValues[personIndex] <= 39.9) {
                weightStatuses[personIndex] = "Overweight";
            } else {
                weightStatuses[personIndex] = "Obese";
            }
        }
		
		// Displaying details of all the persons
        for (int personIndex = 0; personIndex < numberOfPersons; personIndex++) {
            System.out.println("\nPerson " + (personIndex + 1) + " Details - ");
			System.out.println("Height - " + heights[personIndex]);
			System.out.println("Weight - " + weights[personIndex]);
			System.out.println("BMI - " + bmiValues[personIndex]);
			System.out.println("Weight Status - " + weightStatuses[personIndex]);
        }

        sc.close();
    }
}
