import java.util.Scanner;
/*************************************************************************
 * This is a simple calculator app. It will add, subtract, multiply      *
 * or divide two numbers. The first number will operated on by the second*
 *                                                                       *
 * There will be a method for each operation.                            *
 *                                                                       *
 * 	@author Connor Rose                                                  *
 *                                                                       *
 ************************************************************************/
public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Welcome to my calculator!");
		System.out.println("Enter the type of operation you would like to perform.");
		System.out.println("Addition (add), Subtraction (sub), \nMultiplication (mult), or Division (div)");
		
		String operation = input.next();
		
		System.out.println("Enter two whole numbers.");
		
		int num1 = input.nextInt();
	    int num2 = input.nextInt();
		//switch on operation to find which method to use
		switch(operation) {
		case "add": //in this instance, "add" was selected
			add(num1, num2);
			break; //break means no other cases will run
		case "sub":
			sub(num1, num2);
			break;
		case "mult":
			mult(num1, num2);
			break;
		case "div":
			div(num1,num2);
			break;
		default:
			System.out.println("invalid entry");
			
		}
	}

	private static void div(int num1, int num2) {
		if(num2 == 0)
		{
			System.out.println("undefined");
			return;
		}
		System.out.printf("%d divided by %d = %d", num1, num2, num1/num2);
	}

	private static void mult(int num1, int num2) {
		
		System.out.printf("%d multiplied by %d = %d", num1, num2, num1*num2);
		
	}

	private static void sub(int num1, int num2) {
		
		System.out.printf("%d subtracted by %d = %d", num1, num2, num1-num2);
		
	}

	private static void add(int num1, int num2) {
		
		System.out.printf("%d added to %d = %d", num1, num2, num1+num2);
		
	}

}
