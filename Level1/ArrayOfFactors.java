import java.util.Scanner;

public class ArrayOfFactors{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		// Enter a number to determine factors
        System.out.print("Enter a number to find its factors - ");
        int number = sc.nextInt();

        int maxFactors = 10;		// represents nsize of factor array
        int[] factorsArray = new int[maxFactors];		// array to store factors
        int factorIndex = 0;	// index for inserting factor

        // Finding factors and storing them
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (factorIndex == maxFactors) {
                    maxFactors *= 2;
                    int[] temp = new int[maxFactors];
                    System.arraycopy(factorsArray, 0, temp, 0, factorsArray.length);
                    factorsArray = temp;
                }
                factorsArray[factorIndex++] = i;
            }
        }

        // Display factors
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < factorIndex; i++) {
            System.out.print(factorsArray[i] + " ");
        }

        sc.close();
    }
}
