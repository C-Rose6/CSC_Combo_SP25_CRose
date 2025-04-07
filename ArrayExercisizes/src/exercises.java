import java.util.Arrays;
import java.util.Scanner;

public class exercises {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] myArray = new int[10];

		for (int i = 0; i < myArray.length; i++) {

			int myRandomNum = (int) (Math.random() * 10);

			myArray[i] = myRandomNum;

			System.out.println(Arrays.toString(myArray));
		}
		System.out.println("Enter a target number:");
		int target = in.nextInt();
		if (findValue(target, myArray) > 0) {
			System.out.println("We found it!");
		}
		System.out.print(myArray[findValue(target, myArray)]);

	}

	public static int findValue(int target, int[] myArray) {
//		Scanner sc = new Scanner(System.in);
//		int targetNum = in.nextInt();

		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] == target) {
				return i;
			}
		}
		return -1;

	}

}
