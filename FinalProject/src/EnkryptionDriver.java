import java.util.Scanner;

public class EnkryptionDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int key = 6;
	
		System.out.println("Enter a string for encryption:");
		String message = sc.next();
		System.out.println("Enter the key");
		int userKey = sc.nextInt();
		Enkrypt enkrypt = new Enkrypt(message);
		String enkryptedMessage = enkrypt.getKryptStr();
		Dekrypt dekrypt = new Dekrypt(enkryptedMessage);

		if (userKey == key) {
			
			System.out.println("The encrypted message is: " + enkrypt);
			System.out.println();
		}
		
		System.out.println("Enter key to dekrypt:");
		int key2 = sc.nextInt();
		
		if(key2 == key) {
			
			System.out.println("The decryted message is: " + dekrypt);
		}
		
	}	
}