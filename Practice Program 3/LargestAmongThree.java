import java.util.Scanner;

public class LargestAmongThree{
    
    public static void takeInput() {
        Scanner sc = new Scanner(System.in);

        // Taking the first number input
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        
        // Consume the newline character left by nextInt
        sc.nextLine();

        // Taking the second number input
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        // Consume the newline character left by nextInt
        sc.nextLine();

        // Taking the third number input
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        // Find the largest number
        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        // Output the largest number
        System.out.println("The largest number is: " + largest);
    }

    public static void main(String[] args) {
        takeInput();
    }
}
