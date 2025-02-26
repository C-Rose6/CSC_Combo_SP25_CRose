import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter term limit");
		int terms = input.nextInt();
		
		fibSequence(terms);
	}
	
	
	public static void fibSequence(int count) {
		int x = 0, y = 1;
		
		System.out.println("The fibonacci sequence of " + count + " numbers:");
		
		for(int i = 1; i <= count; i++) {
			int sum = x + y;
			x = y;
			y = sum;
			
			System.out.print(x + " ");
		}
	}

	

}
