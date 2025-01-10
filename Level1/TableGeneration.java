import java.util.Scanner;

class TableGeneration{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking as input
        System.out.print("Enter a number to generate its multiplication table - ");
        int number = sc.nextInt();

        // Creating an empty array to store multiples
		int[] multiples = new int[10];
		
		
		// storing multiples in array
        for (int currentMultiplier = 1; currentMultiplier <= 10; currentMultiplier++) {
            multiples[currentMultiplier - 1] = number * currentMultiplier;
        }
		
		for(int currentIndex = 1 ; currentIndex <= 10 ; currentIndex++){
			System.out.println(number + " * " + currentIndex + " = " + multiples[currentIndex - 1]);
		}

        sc.close();
    }
}
