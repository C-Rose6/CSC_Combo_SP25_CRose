import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a word");
		String word = sc.nextLine();
		
		System.out.println(isDoubloon(word));

	}

	public static boolean isDoubloon(String str) {
		
		for(int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);
			int count = 0;
				
			for(int j = 0; j < str.length(); j++) {
					if(letter == str.charAt(j)) {
						count++;
					}
				}
			if(count != 2) {
			return false;
			}
		
		}
		return true;
		
	}
	
	
}
