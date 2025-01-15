import java.util.Scanner;
import java.util.Random;

public class IsEligible{

    // Method to generate random ages for n students
    public static int[] generateAges(int numStudents) {
        Random random = new Random();
        int[] ages = new int[numStudents];

        // Generate random 2-digit ages for the students
        for (int i = 0; i < numStudents; i++) {
            ages[i] = 18 + random.nextInt(13); // Ages between 18 and 30
        }

        return ages;
    }

    // Method to check whether each student can vote or not
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] votingResults = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            String eligibility = "Not Valid";  // Default for invalid age

            if (age >= 0) {  // Validate age to avoid negative numbers
                eligibility = (age >= 18) ? "Can Vote" : "Cannot Vote";
            }

            votingResults[i][0] = String.valueOf(age);
            votingResults[i][1] = eligibility;
        }

        return votingResults;
    }

    // Method to display the 2D array in a tabular format
    public static void displayVotingEligibility(String[][] votingResults) {
        System.out.printf("%-10s %-15s%n", "Age", "Voting Eligibility");
        System.out.println("-------------------------------------");
        for (String[] entry : votingResults) {
            System.out.printf("%-10s %-15s%n", entry[0], entry[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking number of students as input (For this case, we use a fixed number: 10 students)
        System.out.println("Enter the number of students: ");
        int numStudents = 10;

        // Generate random ages for the students
        int[] studentAges = generateAges(numStudents);

        // Check the voting eligibility for each student
        String[][] eligibilityResults = checkVotingEligibility(studentAges);

        // Displaying the results
        displayVotingEligibility(eligibilityResults);

        sc.close();
    }
}
