class SamAverageMarks{
	public static void main(String[] args){
		int samPhysicsMarks = 95;
		int samMathsMarks = 94;
		int samChemistryMarks = 96;
		int samTotalMarks = samPhysicsMarks + samMathsMarks + samChemistryMarks;
		int totalMarks = 3 * 100; // there are 3 subjects and Each subject has maximum of 100 marks
		
		// Calculating Average
		double SamAverageMarks = (samTotalMarks * 100) / totalMarks;
		System.out.println("Sam's average mark in PCM is " + SamAverageMarks);
	}
}