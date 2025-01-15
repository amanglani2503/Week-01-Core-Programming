import java.util.Scanner;

public class BodyMassIndexCalculator{

    // Method to calculate BMI and status for each person
    public static String[][] calculateBMI(double[][] heightWeight) {
        String[][] bmiData = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = heightWeight[i][0]; // weight in kg
            double heightCm = heightWeight[i][1]; // height in cm
            double heightM = heightCm / 100; // Convert height to meters

            // Calculate BMI using the formula: BMI = weight / (height * height)
            double bmi = weight / (heightM * heightM);
            String status = determineStatus(bmi);

            // Store the results in the 2D array (height, weight, bmi, status)
            bmiData[i][0] = String.valueOf(heightCm);
            bmiData[i][1] = String.valueOf(weight);
            bmiData[i][2] = String.format("%.2f", bmi); // BMI rounded to 2 decimal places
            bmiData[i][3] = status;
        }
        return bmiData;
    }

    // Method to determine BMI status based on the value of BMI
    public static String determineStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    // Method to display the BMI table in tabular format
    public static void displayBMIData(String[][] bmiData) {
        System.out.println("----------------------------------------------------");
        System.out.println("Person | Height (cm) | Weight (kg) | BMI    | Status");
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-6d | %-12s | %-11s | %-6s | %s\n", 
                              (i + 1), 
                              bmiData[i][0], 
                              bmiData[i][1], 
                              bmiData[i][2], 
                              bmiData[i][3]);
        }

        System.out.println("----------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2D array to store weight (kg) and height (cm) for 10 persons
        double[][] heightWeight = new double[10][2];

        // Taking user input for weight and height of each person
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            heightWeight[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            heightWeight[i][1] = sc.nextDouble();
            System.out.println();
        }

        // Calculate BMI and status for each person
        String[][] bmiData = calculateBMI(heightWeight);

        // Display the results in tabular format
        displayBMIData(bmiData);

        sc.close();
    }
}
