import java.util.Scanner;

public class BeverageSelector {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Select a beverage by entering a corresponding number from the following list:");
		System.out.println("1. Water\n2. Coke\n3. Coffee\n");

		int beverage = sc.nextInt();

		System.out.printf("You have selected %s", beverageSelector(beverage));

		

	}

	public static String beverageSelector(int a) {
		String option1 = "Water";
		String option2 = "Coke";
		String option3 = "Coffee";

		if (a == 1) {
			return option1;
		} else if (a == 2) {
			return option2;
		} else if (a == 3) {
			return option3;
		}
		return "no beverage, select a number between 1 and 3.";
	}

}
