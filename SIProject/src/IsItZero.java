import java.util.Scanner;

public class IsItZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
	
		System.out.println(isItZero(num1,num2));
	
	
	}
	
	public static boolean isItZero(int numX, int numY) {
		if(numX - numY == 0) {
			return true;
		}
		
			return false;
	}
}
