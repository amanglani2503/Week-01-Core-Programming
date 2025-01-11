import java.util.Scanner;

class SignCheckOfInteger{
	
	// Method to check type of a number
	public static int CheckSign(int number){
		
		// checkig sign
		if(number < 0){
			return -1;
		} 
		else if (number > 0){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking integer as an input
		
		System.out.print("Enter an Integer - ");
		int number = sc.nextInt();
		
		/* calling function and storing the output
		   1 represents positive
		   0 represents integer is 0
		   -1 represents number is negtative */
		int typeOfInteger = CheckSign(number);
		
		System.out.println("Output is : " + typeOfInteger);
		sc.close();
	}
}