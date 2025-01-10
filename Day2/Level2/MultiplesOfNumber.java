import java.util.Scanner;

class MultiplesOfNumber{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Taking the input value
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        System.out.println("Multiples of " + number + " below 100 are:");
        
        // Loop to find multiples, running backward
        for (int currentNumber = 1; currentNumber <= 100; currentNumber++) {
            if (currentNumber % number == 0) {
                System.out.println(currentNumber);
            }
        }
        
        sc.close();
    }
}
