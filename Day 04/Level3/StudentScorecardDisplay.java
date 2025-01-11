import java.util.Random;
import java.util.Scanner;

public class StudentScorecardDisplay{

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math for each student
    public static int[][] generateRandomScores(int numberOfStudents) {
        Random random = new Random();
        int[][] studentScores = new int[numberOfStudents][3]; // 2D array for storing scores

        for (int studentIndex = 0; studentIndex < numberOfStudents; studentIndex++) {
            studentScores[studentIndex][0] = random.nextInt(90) + 10; // Physics score (2-digit number)
            studentScores[studentIndex][1] = random.nextInt(90) + 10; // Chemistry score (2-digit number)
            studentScores[studentIndex][2] = random.nextInt(90) + 10; // Math score (2-digit number)
        }
        
		return studentScores;
    }

    // Method to calculate the total, average, and percentage for each student
    public static double[][] calculateStudentResults(int[][] studentScores, int numberOfStudents) {
        double[][] studentResults = new double[numberOfStudents][4]; // 2D array for total, average, percentage

        for (int studentIndex = 0; studentIndex < numberOfStudents; studentIndex++) {
            int physicsScore = studentScores[studentIndex][0];
            int chemistryScore = studentScores[studentIndex][1];
            int mathScore = studentScores[studentIndex][2];

            double totalScore = physicsScore + chemistryScore + mathScore;
            double averageScore = totalScore / 3;
            double percentage = (totalScore / 300) * 100;

            studentResults[studentIndex][0] = totalScore;
            studentResults[studentIndex][1] = averageScore;
            studentResults[studentIndex][2] = percentage;
        }
        
		return studentResults;
    }

    // Method to display the scorecard of all students
    public static void displayScorecard(int[][] studentScores, double[][] studentResults, int numberOfStudents) {
        System.out.println("Student Scorecard:");
        
        for (int studentIndex = 0; studentIndex < numberOfStudents; studentIndex++) {
            int physicsScore = studentScores[studentIndex][0];
            int chemistryScore = studentScores[studentIndex][1];
            int mathScore = studentScores[studentIndex][2];

            double totalScore = Math.round(studentResults[studentIndex][0] * 100.0) / 100.0;
            double averageScore = Math.round(studentResults[studentIndex][1] * 100.0) / 100.0;
            double percentage = Math.round(studentResults[studentIndex][2] * 100.0) / 100.0;

            System.out.println("Student " + (studentIndex + 1) + " Details:");
            System.out.println("Physics Score: " + physicsScore);
            System.out.println("Chemistry Score: " + chemistryScore);
            System.out.println("Math Score: " + mathScore);
            System.out.println("Total: " + totalScore);
            System.out.println("Average: " + averageScore);
            System.out.println("Percentage: " + percentage + "%");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Generate random scores for the students
        int[][] studentScores = generateRandomScores(numberOfStudents);

        // Calculate total, average, and percentage for each student
        double[][] studentResults = calculateStudentResults(studentScores, numberOfStudents);

        // Display the scorecard
        displayScorecard(studentScores, studentResults, numberOfStudents);
    
		sc.close();
	}
}
