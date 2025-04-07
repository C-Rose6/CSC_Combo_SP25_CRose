import java.util.Scanner;

public class Accumulator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int num = -1;
		int sum = 0;

		while (num != 0) {
			num = sc.nextInt();
			sum = sum + num;
		}
		System.out.println("The sum of the series is " + sum);

	}

}
