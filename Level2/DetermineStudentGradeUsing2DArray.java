import java.util.Scanner;

public class DetermineStudentGradeUsing2DArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // 2D array to store marks of students in three subjects: [Physics, Chemistry, Maths]
        double[][] marks = new double[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];  // Array to store percentages
        String[] grades = new String[numberOfStudents];       // Array to store grades

        // Taking input marks, calculating percentage, and determining grades
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            // Input marks for Physics with validation
            do {
                System.out.print("Physics: ");
                marks[i][0] = sc.nextDouble();
                if (marks[i][0] < 0) {
                    System.out.println("Marks cannot be negative! Please enter again.");
                }
            } while (marks[i][0] < 0);

            // Input marks for Chemistry with validation
            do {
                System.out.print("Chemistry: ");
                marks[i][1] = sc.nextDouble();
                if (marks[i][1] < 0) {
                    System.out.println("Marks cannot be negative! Please enter again.");
                }
            } while (marks[i][1] < 0);

            // Input marks for Maths with validation
            do {
                System.out.print("Maths: ");
                marks[i][2] = sc.nextDouble();
                if (marks[i][2] < 0) {
                    System.out.println("Marks cannot be negative! Please enter again.");
                }
            } while (marks[i][2] < 0);

            // Calculate percentage
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            // Determine grade based on percentage
            if (percentages[i] >= 90) {
                grades[i] = "A+";
            } else if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else {
                grades[i] = "F";
            }
        }

        // Display details
        for (int studentIndex = 0; studentIndex < numberOfStudents; studentIndex++) {
            System.out.println("\nDetails of Student " + (studentIndex + 1));
			System.out.println("Physics Marks - " + marks[studentIndex][0]);
			System.out.println("Chemistry Marks - " + marks[studentIndex][1]);
			System.out.println("Maths Marks - " + marks[studentIndex][2]);
			System.out.println("Percentage - " + percentages[studentIndex]);
			System.out.println("Grades - " + grades[studentIndex]);
        }

        sc.close();
    }
}
