import java.util.Scanner;

public class GCDAndLCMCalculator{

    // Function to calculate GCD using Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function for calculating LCM using the formula LCM(a, b) = |a * b| / GCD(a, b)
    public static int calculateLCM(int a, int b) {
        return Math.abs(a * b) / calculateGCD(a, b);  // Using GCD to calculate LCM
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for two numbers
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        // Calculating and displaying the GCD and LCM
        int gcd = calculateGCD(number1, number2);
        int lcm = calculateLCM(number1, number2);

        System.out.println("The GCD of " + number1 + " and " + number2 + " is: " + gcd);
        System.out.println("The LCM of " + number1 + " and " + number2 + " is: " + lcm);
    
		sc.close();
	}
}
