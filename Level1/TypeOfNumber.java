import java.util.Scanner;

class TypeOfNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Declaring an Array
		int[] numbers = new int[5];
		
		// Taking input from user
		for(int index = 0 ; index < numbers.length ; index++){
			System.out.print("Enter number " + (index + 1) + " - ");
			numbers[index] = sc.nextInt();
		}
		
		for(int index = 0 ; index < numbers.length ; index++){
			if(numbers[index] > 0){
				if(numbers[index] % 2 == 0){
					System.out.println("The Number " + numbers[index] + " is Even Positive number");
				}
				else{
					System.out.println("The Number " + numbers[index] + " is odd Positive number");
				}
			}
			
			else if(numbers[index] < 0){
				System.out.println("The Number " + numbers[index] + " is Negative number");
			}
			
			else{
				System.out.println("The Number " + numbers[index] + " is zero");
			}
		}
		
		if(numbers[0] > numbers[numbers.length - 1]){
			System.out.println("First element is greater than last element");
		}
		else if(numbers[0] < numbers[numbers.length - 1]){
			System.out.println("Last element is greater than last element");
		}
		else{
			System.out.println("First element is equal to the last element");
		}
	}
}