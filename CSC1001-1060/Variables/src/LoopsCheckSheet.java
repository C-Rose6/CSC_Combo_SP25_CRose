import java.util.Random;
import java.util.Scanner;

/**********************************
 *  This is check sheet for       *
 *  running loops                 *                                                
 *                                *
 * @author Connar                 *
 *********************************/
public class LoopsCheckSheet { //Class

	public static void main(String[] args) { // Main method
		Scanner sc = new Scanner(System.in);// Scanner.class
		Random rnd = new Random();// Random.class

		int nestedCount;// declaration
		int sum = 0;// initializer
		int count = 0;// initializer

		System.out.println("Enter a quality"); // output
		int quantity = sc.nextInt();// initializer

		while (count < quantity) {// conditional
			count++;// changer
			int value = rnd.nextInt(100 - 5) + 5; // initializes random number
			System.out.println("Outer loop counter equals " + count); // print output
			sum += value; //adds value to sum
			nestedCount = 0; //initializer
			while (nestedCount < value) { // nested while loop conditional
				nestedCount++; // nested changer
				System.out.print(nestedCount + " "); // nested output

			} // nested while loop end
			System.out.println();//print nextline
		} // end while
		System.out.println("The total of all random numbers is " + sum); // output sum of all random numbers
	}// end main

}// end class
