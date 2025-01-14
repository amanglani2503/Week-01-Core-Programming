import java.util.Scanner;

public class Calculator{

    // Function to perform addition
    public static double performAddition(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    // Function to perform subtraction
    public static double performSubtraction(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    // Function to perform multiplication
    public static double performMultiplication(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    // Function to perform division
    public static double performDivision(double firstOperand, double secondOperand) {
        if (secondOperand != 0) {
            return firstOperand / secondOperand;
        } else {
            System.out.println("Error: Division by zero is not allowed");
			return Double.NaN;
        }
    }

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take first operand as input with validation
        System.out.print("Enter the first operand: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            sc.next();  // Discard the invalid input
            System.out.print("Enter the first operand: ");
        }
        double firstOperand = sc.nextDouble();

        // Take second operand as input with validation
        System.out.print("Enter the second operand: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            sc.next();  // Discard the invalid input
            System.out.print("Enter the second operand: ");
        }
        double secondOperand = sc.nextDouble();

        // Choose the operation to perform
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int operationChoice = sc.nextInt();

        double result;
        switch (operationChoice) {
            case 1:
                result = performAddition(firstOperand, secondOperand);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = performSubtraction(firstOperand, secondOperand);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = performMultiplication(firstOperand, secondOperand);
                System.out.println("Result: " + result);
                break;
            case 4:
                result = performDivision(firstOperand, secondOperand);
				if(result == Double.NaN){
					System.out.println("Result :- " + result);
				}
                break;
            default:
                System.out.println("Invalid operation choice");
        }
		
		sc.close();
    }
}
