qimport java.util.Arrays;

public class OperatingRandomNumbers{

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000; // Generate 4-digit numbers
        }
        return randomNumbers;
    }

    // Method to find the average, minimum, and maximum values of an array
    public static double[] findMinMaxAverage(int[] numbers) {
        double sumOfNumbers = 0;
        int minimum = numbers[0];
        int maximum = numbers[0];

        for (int number : numbers) {
            sumOfNumbers += number;
            minimum = Math.min(minimum, number); // Update minimum value
            maximum = Math.max(maximum, number); // Update maximum value
        }

        double average = sumOfNumbers / numbers.length;
        return new double[]{average, minimum, maximum};
    }

    public static void main(String[] args) {

        // Generate an array of 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Find the average, minimum, and maximum values
        double[] results = findMinMaxAverage(randomNumbers);

        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));
        System.out.printf("Average: %.2f\n", results[0]);
        System.out.println("Minimum: " + (int) results[1]);
        System.out.println("Maximum: " + (int) results[2]);
    }
}
