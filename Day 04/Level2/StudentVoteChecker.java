import java.util.Scanner;

public class StudentVoteChecker{

    // Method to check if a student can vote
    static public boolean canStudentVote(int age) {
        // Validate for negative age
        if (age < 0) {
            return false; // Invalid age
        }
        // Check if age is 18 or above
        return age >= 18;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        

        // Array to store ages of 10 students
        int[] studentAges = new int[10];

        // Loop to take input for each student's age
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = sc.nextInt();

            // Check if the student can vote
            boolean canVote = canStudentVote(studentAges[i]);

            // Display the result
            if (studentAges[i] < 0) {
                System.out.println("Invalid age entered. Cannot vote.");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + " is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " is not eligible to vote.");
            }
        }
        sc.close();
    }
}
