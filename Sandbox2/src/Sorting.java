import java.util.Random;

public class Sorting {

	public static void main(String[] args) {
		int[] arr = new int[10];

		fillArray(arr);
		printArray(arr);
		selectionSort(arr, 0);
		printArray(arr);
	}

	private static void selectionSort(int[] arr, int index) {
		if (index == arr.length - 1)
			return;
		int low = findLow(arr, index);
		swap(arr, index, low);
		selectionSort(arr, index + 1);
	}

	private static void swap(int[] arr, int index, int low) {
		int temp = arr[index];
		arr[index] = arr[low];
		arr[low] = temp;
	}

	private static void fillArray(int[] arr) {
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10) + 1;

		}

	}

	private static void printArray(int[] arr) {
		System.out.print("|");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + "|");
		}
		System.out.println();
	}

	private static int findLow(int[] arr, int index) {
		int low = index;
		for (int i = index; i < arr.length; i++) {
			if (arr[i] < arr[low])
				low = i;
		}
		return low;
	}
}
