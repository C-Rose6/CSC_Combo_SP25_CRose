import java.util.Scanner;

public class GradeCalc2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your grade.");
		
		int numGrade = input.nextInt();
		
	}	
	
	public static String findLetterGrade(int numGrade) {

		String result = "A";
		
		switch(numGrade)
		{
		case 1:
			if (numGrade < 60);
			result = "F";
			break;
		case 2:
			if (numGrade < 70);
			result = "D";
			break;
		
		default:
			return result;
		
		
	
	}
}

