import java.util.Scanner;

public class DetermineStudentGrades{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Arrays to store marks, percentages, and grades
        int[] physicsMarks = new int[numberOfStudents];
        int[] chemistryMarks = new int[numberOfStudents];
        int[] mathsMarks = new int[numberOfStudents];
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        // Taking input marks, calculating percentage, and determining grades
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            // Input marks for Physics
            int marks;
            do {
                System.out.print("Enter marks for Physics (0-100): ");
                marks = sc.nextInt();
                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                }
            } while (marks < 0 || marks > 100);
            physicsMarks[i] = marks;

            // Input marks for Chemistry
            do {
                System.out.print("Enter marks for Chemistry (0-100): ");
                marks = sc.nextInt();
                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                }
            } while (marks < 0 || marks > 100);
            chemistryMarks[i] = marks;

            // Input marks for Maths
            do {
                System.out.print("Enter marks for Maths (0-100): ");
                marks = sc.nextInt();
                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                }
            } while (marks < 0 || marks > 100);
            mathsMarks[i] = marks;

            // Calculate percentage
            percentages[i] = (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]) / 3.0;

            // Determine grade based on percentage
            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } else if (percentages[i] >= 75) {
                grades[i] = 'B';
            } else if (percentages[i] >= 50) {
                grades[i] = 'C';
            } else if (percentages[i] >= 35) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }

        // Display details
        for (int studentIndex = 0; studentIndex < numberOfStudents; studentIndex++) {
            System.out.println("\nDetails of Student " + (studentIndex + 1));
			System.out.println("Physics Marks - " + physicsMarks[studentIndex]);
			System.out.println("Chemistry Marks - " + chemistryMarks[studentIndex]);
			System.out.println("Maths Marks - " + mathsMarks[studentIndex]);
			System.out.println("Percentage - " + percentages[studentIndex]);
			System.out.println("Grades - " + grades[studentIndex]);
        }

        sc.close();
    }
}
