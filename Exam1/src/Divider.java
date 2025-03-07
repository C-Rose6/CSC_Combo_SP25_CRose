import java.util.Scanner;

public class Divider {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double answer;
		
		System.out.println("Enter the first number");
		double num1 = sc.nextInt();
		
		System.out.println("Enter the second number");
		double num2 = sc.nextInt();
		
		if(num2 != 0) {
			answer = num1 / num2;
			System.out.println("The answer is " + answer + " when you divide " + num1 + " by " + num2);
		}
		else {
			System.out.println("You cannot divide by zero!");;
		}
		
	}
	
	
}
