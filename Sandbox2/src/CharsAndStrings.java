import java.util.Scanner;

public class CharsAndStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		//		System.out.println("Roman Alphabet");
		//		for(char c = 'A'; c <= 'Z'; c++) {
		//			System.out.print((int)c + " ");
		//		}
		//		System.out.println();
		//		
		//		System.out.println("Greek Alphabet: ");
		//		
		//		for(int i = 913; i <= 937; i++) {
		//			System.out.print((char)i + " ");
		//			
		//		}
		//		
		//		System.out.println("\nEnter a number:");
		//		
		//	
		//		while(!input.hasNextDouble()) {
		//			
		//			String word = input.next();
		//			System.err.println(word + " is not a nmuber");
		//			System.out.println("Enter a number");
		//		}
		//		System.out.println();
		//		double number = input.nextDouble();
		//		System.out.println(number);
		//	}
//	
//		String fruit = "blackberry";
//		for(int i = 0; i < fruit.length(); i++) {
//			
//			char letter = fruit.charAt(i);
//			System.out.print(letter);
//		}
//			char lastLetter = fruit.charAt(fruit.length()-1);
//			
//			String fruitReversed = reverse(fruit);
//			System.out.println(fruitReversed);
//
//			System.out.println("the letter b appears first at index " + fruit.indexOf('b'));
//			System.out.println("the letter b appears second at index " + fruit.indexOf('b', 1));
//			System.out.println("the letter b appears last at index " + fruit.lastIndexOf('b'));
//			
//			System.out.println(fruit.substring(0, 5));
//			System.out.println(fruit.substring(5));
		
//		System.out.println("Play again");
//		String ans = input.next();
//		if(ans.equals("yes")) {
//			System.out.println("LETS GO!!!");
//		}
//		else {
//			System.out.println("Goodbye.");
//		}


//		String name1 = "Ada Lovelace";
//		String name2 = "Alan Turing";
//		int diff = name1.compareTo(name2);
//		if(diff < 0) 
//		{
//			System.out.println("name 2 is before name 1");
//		}
//		else if (diff > 0)
//		{
//			System.out.println("name 1 is before name 2");
//		}
//		else 
//		{
//			System.out.println("They are the same");
//		}
	
		int hour = 18;
		int minute = 23;
		System.out.println(timeString(hour, minute));
	
	
	private static String timeString(int hour, int minute){
		String ampm;
		
		if(hour < 12) {
			ampm = "AM";
			if(hour == 0) {
				hour = 12;
			}
		else {
			ampm = "PM";
			hour = hour - 12;
		}
			return String.format(%02d:%02d %s, hour, minute, ampm);
		}
		
		
			
	}
	
	
	private static String reverse(String fruit) {
			String r = "";
			for(int i = fruit.length()-1; i >= 0; i--) {
				
				r += fruit.charAt(i);
			}
			return	r;
		}
	}
	

