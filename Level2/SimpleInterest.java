import java.util.Scanner;
class SimpleInterest{
    public static void main(String[] args){
	  //Creating Scanner object to take user input
	    Scanner sc = new Scanner(System.in);
		  
		//Taking user input in respective variables
		System.out.print("Please enter the principle amount");
		int Principle = sc.nextInt();	
		System.out.print("Please enter the interest rate");	
		int Rate = sc.nextInt();
			
		System.out.println("Please enter the Time ");	
		int time = sc.nextInt();
			
	
		//Calculating simple interst by forumula
		int simpleInterest = (Principle * Rate * time) / 100;
		System.out.println("The Simple Interst is" + " " + simpleInterest +" " + "for principle"+ " "+ Principle+","+"Rate of interest" +" "+ Rate+" "+"and Time" + " "+time);
		sc.close();
	}
}	 