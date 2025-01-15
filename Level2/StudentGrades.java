import java.util.Random;

public class StudentGrades{

    // Method to generate random 2-digit scores for Physics, Chemistry, and Maths
    public static int[][] generateScores(int numStudents) {
		Random random = new Random();
		int[][] scores = new int[numStudents][3];

		// Generate random 2-digit scores for Physics, Chemistry, and Maths
		for (int i = 0; i < numStudents; i++) {
			scores[i][0] = 10 + random.nextInt(90);
			scores[i][1] = 10 + random.nextInt(90);
			scores[i][2] = 10 + random.nextInt(90);
		}

		return scores;
	}


    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateTotalAveragePercentage(int[][] scores) {
        double[][] results = new double[scores.length][4];

        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

    // Method to calculate the grade based on percentage
    public static String[][] calculateGrade(double[][] results) {
        String[][] grades = new String[results.length][2];

        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            String grade;

            if (percentage >= 80) {
                grade = "A";
            } else if (percentage >= 70) {
                grade = "B";
            } else if (percentage >= 60) {
                grade = "C";
            } else if (percentage >= 50) {
                grade = "D";
            } else if (percentage >= 40) {
                grade = "E";
            } else {
                grade = "R";
            }

            grades[i][0] = String.valueOf(percentage);
            grades[i][1] = grade;
        }

        return grades;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScorecard(int[][] scores, double[][] results, String[][] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n", "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10s%n", 
                i + 1, 
                scores[i][0], 
                scores[i][1], 
                scores[i][2], 
                results[i][2], 
                grades[i][1]
            );
        }
    }

    public static void main(String[] args) {
        int numStudents = 10;  // Number of students

        // Generate random scores for students
        int[][] studentScores = generateScores(numStudents);

        // Calculate total, average, and percentage for each student
        double[][] studentResults = calculateTotalAveragePercentage(studentScores);

        // Calculate grades for each student based on percentage
        String[][] studentGrades = calculateGrade(studentResults);

        // Display the scorecard in tabular format
        displayScorecard(studentScores, studentResults, studentGrades);
    }
}
