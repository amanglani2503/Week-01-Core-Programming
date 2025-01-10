import java.util.Scanner;

class FizzBuzzInArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		// Taking as input a number
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.err.println("Invalid Number");
            System.exit(0);
        }
		
		
		// Array to store the result
        String[] results = new String[number + 1];

        // Populating Result array
        for (int currentNumber = 0; currentNumber <= number; currentNumber++) {
            if (currentNumber % 3 == 0 && currentNumber % 5 == 0) {
                results[currentNumber] = "FizzBuzz";
            } else if (currentNumber % 3 == 0) {
                results[currentNumber] = "Fizz";
            } else if (currentNumber % 5 == 0) {
                results[currentNumber] = "Buzz";
            } else {
                results[currentNumber] = String.valueOf(currentNumber);
            }
        }

        // Displaying the results
        System.out.println("FizzBuzz Results:");
        for (int i = 0; i <= number; i++) {
            System.out.println("Number " + i + " = " + results[i]);
        }

        sc.close();
    }
}
