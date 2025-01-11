import java.util.Scanner;

class SumOfNaturalNumbers{
	// Function that calculates 
	public static int CalculateSumUptoN(int upperLimit){
		
		// storing sum
		int currentSum = 0;
		
		// Looping to calculate sum
		for(int currentNumber = 1 ; currentNumber <= upperLimit ; currentNumber++){
			currentSum += currentNumber;
		}
		return currentSum;
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking last numbers as input. Upto which sum is to be calculated
		System.out.print("Enter upper limit :- ");
		int upperLimit = sc.nextInt();
		
		// Storing calculated sum
		int sumOfNaturalNumbers = CalculateSumUptoN(upperLimit);
		
		System.out.println("Sum of Natural Numbers upto " + upperLimit + " = " + sumOfNaturalNumbers);
		sc.close();
	}
}