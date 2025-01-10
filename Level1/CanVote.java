import java.util.Scanner;

class CanVote{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] ageArray = new int[10];
		
		for(int index = 0 ; index < ageArray.length ; index++){
			System.out.print("Enter age for Student " + (index + 1) + " - ");
			ageArray[index] = sc.nextInt();
		}
		
		for(int index = 0 ; index < ageArray.length ; index++){
			if(ageArray[index] < 0){
				System.out.println("Invalid Age");
			}
			
			else if(ageArray[index] >= 18){
				System.out.println("The student with age " + ageArray[index] + " can vote");
			}
			else{
				System.out.println("The student with age " + ageArray[index] + " cannot vote");
			}
		}
		
		sc.close();
	}
}