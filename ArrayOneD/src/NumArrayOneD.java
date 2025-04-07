import java.util.Arrays;

public class NumArrayOneD {

	public static void main(String[] args) {
		int[] numArray = { 2, 5, 7, 11, 13, 17, 19 };
		int[] cpNumArray = new int[8];

		System.out.println(Arrays.toString(numArray));
		for (int i = 0; i < cpNumArray.length - 1; i++) {
			cpNumArray[i] = numArray[i];
		}

		for (int i = 0; i < cpNumArray.length / 2; i++) {
			int temp = cpNumArray[i];
			cpNumArray[i] = cpNumArray[cpNumArray.length - 1 - i];
			cpNumArray[cpNumArray.length - 1 - i] = temp;

		}
		System.out.println(Arrays.toString(cpNumArray));

	}

}
