import java.util.Scanner;

class DeterminingGrade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter marks for Physics: ");
        int physicsMarks = sc.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        int chemistryMarks = sc.nextInt();

        System.out.print("Enter marks for Maths: ");
        int mathsMarks = sc.nextInt();

        // Calculate total marks and percentage
        int totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        double percentageScored = (totalMarks / 3.0);

        // Determine the grade and remarks based on the percentage
        String grade;
        String remarks;

        if (percentageScored >= 80) {
            grade = "A";
            remarks = "(Level 4, above agency-normalized standards)";
        } else if (percentageScored >= 70) {
            grade = "B";
            remarks = "(Level 3, at agency-normalized standards)";
        } else if (percentageScored >= 60) {
            grade = "C";
            remarks = "(Level 2, below, but approaching agency-normalized standards)";
        } else if (percentageScored >= 50) {
            grade = "D";
            remarks = "(Level 1, well below agency-normalized standards)";
        } else if (percentageScored >= 40) {
            grade = "E";
            remarks = "(Level 1-, too below agency-normalized standards)";
        } else {
            grade = "R";
            remarks = "(Remedial standards)";
        }

        System.out.printf("\nTotal Marks: %d\n", totalMarks);
        System.out.printf("Percentage: %.2f%%\n", percentageScored);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        sc.close();
    }
}
