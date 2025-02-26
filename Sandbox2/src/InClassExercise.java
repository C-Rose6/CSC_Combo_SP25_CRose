import java.util.Scanner;

public class InClassExercise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number range");
		
		int startRange = input.nextInt();
		int endRange = input.nextInt();
		int result = sumNumbers(startRange, endRange);
		
		
		System.out.println("The sum of numbers from " + startRange + " to " + endRange + " \nis " + result);
		
	}
	public static int sumNumbers(int start, int end) {
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		return sum;
	}

}




