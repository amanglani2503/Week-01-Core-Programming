import java.util.Scanner;

class CalculatorUsingSwitchCase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		// Taking input for the first number
        System.out.print("Enter the first number: ");
        double firstNumber = sc.nextDouble();
		
		// Taking input for the second number
        System.out.print("Enter the second number: ");
        double secondNumber = sc.nextDouble();
		
		// Taking input for the operator
        System.out.print("Enter the operator (+, -, *, /): ");
        String op = sc.next();
		
		// Initialize validOperator to true
        double result = 0;
        boolean validOperator = true;

        // Using switch case to perform the desired operation based on the operator
        switch (op) {
            case "+":
                result = firstNumber + secondNumber; // Performing addition
                break;
            case "-":
                result = firstNumber - secondNumber; // Performing subtraction
                break;
            case "*":
                result = firstNumber * secondNumber; // Performing multiplication
                break;
            case "/":
                if (second != 0) {
                    result = firstNumber / secondNumber; // Performing division if second number is not zero
                } else {
                    System.out.println("Cannot divide by zero"); // Handling division by zero Exception
                    validOperator = false; // Set validOperator to false for division by zero
                }
                break;
            default:
                validOperator = false; // Set validOperator to false for invalid operator
                System.out.println("Invalid Operator"); // Print invalid operator message
                break;
        }

        // Printing the result if the operator entered was valid
        if (validOperator) {
            System.out.println("The result of " + firstNumber + " " + op + " " + secondNumber + " is: " + result);
        }
		else{
			System.out.println("Invalid operator was entered");
		}
		
        sc.close();
    }
}
