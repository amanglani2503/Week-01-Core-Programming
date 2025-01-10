import java.util.Scanner;
class FizzBuzzUsingWhile{
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        // Taking as input
        System.out.print("Enter a number to generate FizzBuzz - ");
        int number = sc.nextInt();
		
		//Check if number is less than 0
		if(number < 0){
			return;
		}
		
        // Generating FizzBuzz pattern
		int currentNumber = 0;
        while(currentNumber <= number){
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
			currentNumber++;
		}	
		
        sc.close();
    }
}