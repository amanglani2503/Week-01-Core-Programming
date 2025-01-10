import java.util.Scanner;

class IsArmstrong{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking number as input
		System.out.print("Enter Number - ");
		int inputNumber = sc.nextInt();
		
		// Taking copy to match at the end if number is Armstrong or not
		int copyNumber = inputNumber;
		
		// For Storing the sum at each iteration
		int sumOfCubes = 0;
		
		// checking for Armstrong Number
		while(copyNumber != 0){
			int currRemainder = copyNumber % 10;
			sumOfCubes += Math.pow(currRemainder, 3);
			copyNumber /= 10;
		}
		
		if(inputNumber == sumOfCubes){
			System.out.println("The Input Number " + inputNumber + " is Armstrong Number");
		} else{
			System.out.println("The number " + inputNumber + " is not an Armstrong Number");
		}
		
		sc.close();
	}
}