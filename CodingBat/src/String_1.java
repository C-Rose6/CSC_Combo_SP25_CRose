import java.util.Scanner;

public class String_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two words");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		System.out.println(lastChars(str1, str2));
	}
	public static String lastChars(String a, String b) {
		  String n = "";
		  if (a.length() > 0 && b.length() > 0) return a.substring(0,1) + b.substring(b.length() -1);
		//  else if (n.equals(a.substring(0) || n.equals(b.substring(0) return
		return a + b;
	}
}
