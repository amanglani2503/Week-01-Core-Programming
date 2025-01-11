import java.util.Scanner;

public class SmallestAndLargestAmongThree{
    
	// Function to find smallest and largest numbers 
	public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        
		// Determining smallest of three 
		int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
        return new int[]{smallest, largest};
    }
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		// Taking three numbers as input
        System.out.print("Enter First number :");
        int number1 = sc.nextInt();
		
		System.out.print("Enter Second number :");
		int number2 = sc.nextInt();
        
		System.out.print("Enter Third number :");
		int number3 = sc.nextInt();


		// Array to store smallest and largest number. smallest at index 0 and largest at 1
        int[] result = findSmallestAndLargest(number1, number2, number3);
        System.out.println("Smallest Number : " + result[0]);
        System.out.println("Largest Number : " + result[1]);

        sc.close();
    }
}
