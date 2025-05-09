
import java.util.Arrays;
import java.util.Scanner;

public class EnkryptionDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int key = 6;
	
		System.out.println("Enter a string for encryption:");
		String message1 = sc.next();
		System.out.println("Enter the key");
		int userKey = sc.nextInt();
		Enkrypt enkrypt = new Enkrypt(message1);

		if (userKey == key) {
			
			System.out.println(enkrypt);
		}
	}
//		System.out.println(ascii(enkrypt));
//		
//	}

//	public static int[] ascii(Object object) {
//		int l = string.length();
//		int convert;
//		int[] decArr = new int[l];
//		for (int i = 0; i < l; i++) {
//			convert = string.charAt(i);
//			decArr[i] += convert;
//			if (decArr[i] % 2 == 0) {
//				decArr[i] = decArr[i] / 2;
//			} else {
//				decArr[i] = decArr[i] - 13;
//			}
//
//		}
//		return decArr;
//	}
}
