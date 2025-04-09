import java.util.Scanner;
import java.util.Arrays;

public class ArrayReversal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a series of numbers:");

		int myArray[] = new int[100];
		int count = 0;
		
		
		for (int i = 0; i < myArray.length; i++) {
			int userInput = sc.nextInt();
			myArray[i] = userInput;
			count++;
			if (userInput == -1) {
				break;
			}

		}
		int[] newArray = new int[count -1];
		for (int i = 0; i < count -1; i++)
			newArray[i] = myArray[i];

		System.out.println(Arrays.toString(newArray));
		
		for(int i = 0; i < newArray.length /2; i++){
		    int temp = newArray[i];
		    newArray[i] = newArray[newArray.length -1 -i];
		    newArray[newArray.length -1 -i] = temp;
		    
		    System.out.println(newArray);
		}
	}

}
