import java.util.Scanner;
import java.util.Arrays;

public class ArrayReversal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a series of numbers:");

		
		int myArray[] = new int[100];
		
//		fillArray(myArray);
		
		for (int i = 0; i < myArray.length; i++) {
			int userInput = sc.nextInt();
			myArray[i] = userInput;
			if (userInput == -1) {
				for (int j = 0; j != -1; j++) {
					int arr[] = new int[i];
				}	
			
				System.out.println(Arrays.toString(myArray));
		}	
			
		}

		
	}

//	private static int[] fillArray(int[] arr) {
//		for (int i = 0; i != -1; i++) {
//			arr[i] = sc.nextInt();
//			if (i == -1) return arr;
//		}return arr;

//	}

	private static void printArray(int[] arr) {
		System.out.print("|");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + "|");
		}
		System.out.println();
	}
}