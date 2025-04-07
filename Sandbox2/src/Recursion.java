import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(factorial(12));
		countdown(2);
		System.out.println("How far in the fibonacci sequence do you want to go?");
		int num = sc.nextInt();
		
		for(int i = 0; i <= num; i++) {	
			System.out.print(fib(i) + " ");
		}
		System.out.println();
		binConverter(9);
	}
	private static void binConverter(int n) {
		if(n > 0) {
			binConverter(n / 2);
			System.out.print(n % 2);
		}
	}
	
	private static int fib(int n) {
		if(n == 0)return 0;
		if(n == 1 || n == 2)return 1;
		return fib(n - 2) + fib(n - 1);
	}

	private static int factorial(int n) {
		if(n == 0)return 1;
			return factorial(n - 1) * n;
		}
	
	
	private static void countdown(int n) {
		if (n == 0) {
			System.out.println("Blast Off!");
		} else {
			System.out.println(n);
			countdown(n - 1);
		}
	}

}
