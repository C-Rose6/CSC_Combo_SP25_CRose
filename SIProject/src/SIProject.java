import java.util.Scanner;

public class SIProject {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many chickens are there?");
		int numChicken = input.nextInt();
		
		System.out.println("How many eggs do the chickens lay?");
		int numEggs = input.nextInt();
		
		int totalEggs = numChicken * numEggs;
		
		
		System.out.println("I have " + numChicken + " and " + numEggs + " eggs ");
		
		System.out.println(:"How are your chickens?");
		

	}

}
