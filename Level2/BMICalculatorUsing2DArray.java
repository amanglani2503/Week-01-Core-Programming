import java.util.Scanner;

public class BMICalculatorUsing2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking as input the number of people
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = sc.nextInt();

        // Declaring array to store people details
        double[][] personData = new double[numberOfPersons][3]; // [height, weight, BMI]
        
        // Storing weight statuses
        String[] weightStatus = new String[numberOfPersons];

        // Taking input for the details
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");

            // Looping until height is valid
            do {
                System.out.print("Enter height (in meters) - ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) System.out.println("Height must be positive!");
            } while (personData[i][0] <= 0);

            // Looping until weight is valid
            do {
                System.out.print("Enter weight (in kg) - ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) System.out.println("Weight must be positive!");
            } while (personData[i][1] <= 0);

            // Calculating BMI
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determining weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Displaying details of all persons
        for (int personIndex = 0; personIndex < numberOfPersons; personIndex++) {
            System.out.println("\nPerson " + (personIndex + 1) + " Details - ");
			System.out.println("Height - " + personData[personIndex][0]);
			System.out.println("Weight - " + personData[personIndex][1]);
			System.out.println("BMI - " + personData[personIndex][2]);
			System.out.println("Weight Status - " + weightStatus[personIndex]);
        }
        
        sc.close();
    }
}
