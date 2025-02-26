import java.util.Scanner;
/*****************************************************************************************************
 * This in an app design to output the lyrics to the song "99 bottles of beer on the wall."          *
 * This process occurs number of times to be specified by the user and runs until the song is over.  *
 *                                                                                                   *
 *     date: Feb. 24, 2025                                                                           *                                                                                              *
 *     @author Connor Rose                                                                           *                   
 ****************************************************************************************************/
public class BottlesOfBeer {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many bottle of beer are there?");
		
		int bottles = input.nextInt();
		
		beer(bottles);
		
		System.out.println("1 last bottle of beer on the wall, 1 last bottle of beer.");
		System.out.println("Take it down n' pass it 'round, time to go get some more beer for us all!");
	}
	public static int beer(int count) {
		int sum = 0;
		for(int x = count; x > 2; x--) { 
			sum = x;
			System.out.println(" " + sum + " bottles of beer on the wall, " + sum + " bottles of beer!");
			System.out.println("Take one down n' pass it 'round, " + --sum + " bottles of beer on the wall");
			
			if(sum == 2) {
				System.out.println(" " + sum + " bottles of beer on the wall, " + sum + " bottles of beer!");
				System.out.println("Take one down n' pass it 'round, " + --sum + " last bottle of beer on the wall");
			}
		}	 
		return sum;
	}
	
}
