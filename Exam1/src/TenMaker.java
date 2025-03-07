import java.util.Scanner;

public class TenMaker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
	
		System.out.println(makes10(num1,num2));
	
	
	}
	
	public static boolean makes10(int numX, int numY) {
		if(numX + numY == 10) {
			return true;
		}
		
			return false;
	}

}
