import java.util.Scanner;

class FizzBuzzUsingFor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number to generate FizzBuzz - ");
        int number = sc.nextInt();
		
		//Check if number is less than 0
		if(number < 0){
			return;
		}
		
        // Generating FizzBuzz pattern
        for(int currentNumber = 0; currentNumber <= number ; currentNumber++){
			//Check for the condition if number is divisible by 3 and 5
			if(currentNumber % 3 == 0 && currentNumber % 5 == 0){
				System.out.println("FizzBuzz");
			}
			//Check for the condition if number is divisible by 3 
			else if(currentNumber % 3 == 0){
				System.out.println("Fizz");
			}
			//Check for the condition if number is divisible by 5
			else if(currentNumber % 5 == 0){
				System.out.println("Buzz");
			}
			else{
				System.out.println(currentNumber);
			}
		}	
		
        sc.close();
    }
}