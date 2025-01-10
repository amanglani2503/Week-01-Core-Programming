import java.util.Scanner;

public class PowerOfNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the base number - ");
        int inputNumber = sc.nextInt();

        System.out.print("Enter the power -  ");
        int power = sc.nextInt();

        // Initializing result variable
        int result = 1;

        // Calculating the power using a loop
        for (int i = 1; i <= power; i++) {
            result *= inputNumber;
        }

        // Displaying the result
        System.out.println(inputNumber + " raised to the power " + power + " is: " + result);
        sc.close();
    }
}
