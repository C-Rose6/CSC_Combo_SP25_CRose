
public class stringPractice {

	public static void main(String[] args) {
		
		String name = "Connor";
		System.out.println(reverseIt(name));
		
	}

	
	public static String reverseIt(String str) {
		String reverseStr = "";
		for(int i = str.length()-1; i >= 0; i--) {
			reverseStr += str.charAt(i);
		}
		return reverseStr;
	}
	
}
