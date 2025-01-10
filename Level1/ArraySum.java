import java.util.Scanner;

class ArraySum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an array of 10 elements of type double
        double[] inputNumbers = new double[10];
        double totalSumOfNumbers = 0.0; // Variable to store the total sum
        int currentIndex = 0;  // Index variable initialized to 0

        System.out.println("Enter up to 10 numbers. Enter 0 or a negative number to stop");

        // Loop to take user inputs, ensuring the array can hold up to 10 numbers
        while (currentIndex < 10) {
            System.out.print("Enter number - ");
            double currentInput = sc.nextDouble();

            // Break the loop if the user enters 0 or a negative number
            if (currentInput <= 0) {
                break;
            }

            // Store the number in the array and increment the index
            inputNumbers[currentIndex] = currentInput;
            currentIndex++;
        }

        // Calculating the total
        for (int i = 0; i < currentIndex; i++) {
            totalSumOfNumbers += inputNumbers[i];
        }

        // Displaying the stored numbers and the total sum
        System.out.println("\nYou entered the following numbers:");
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(inputNumbers[i]);
        }

        System.out.println("\nTotal sum of the numbers: " + totalSumOfNumbers);

        sc.close();
    }
}
