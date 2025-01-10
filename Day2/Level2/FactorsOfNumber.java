import java.util.Scanner;

class FactorsOfNumber{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Get the input value
        System.out.print("Enter a number - ");
        int number = sc.nextInt();
        
        System.out.println("Factors of " + number + " are -");
        
        // Loop to find factors of input Number
        for (int currentNumber = 1; currentNumber <= number; currentNumber++) {
            if (number % currentNumber == 0) {
                System.out.println(currentNumber);
            }
        }        
        
        sc.close();
    }
}
