import java.util.Scanner;

class IsPrime{

    public static void main(String [] args){
	
		//create object of scanner class to take input
		Scanner sc = new Scanner(System.in);
		
		//take input from user
		System.out.print("Enter a number - ");
		int number = sc.nextInt();
		
		// consider integer is prime
		boolean isPrime = true;
		
		//here number is less than or equal to one then it is not a prime number
		if(number <= 1){
			isPrime = false;
		}
	
	// here numbers from 2 to the user input number, If the reminder is zero than break out from the loop
		else{
			for(int i = 2; i < number; i++){
			    if(number % i == 0){
				    isPrime	= false;
					break;
			   }
			}
		}
	    
		if(isPrime){
		System.out.println(number + " is prime number");	
		} else{
		   System.out.println(number + " is not prime");
		}
		
		sc.close();
	}
}
