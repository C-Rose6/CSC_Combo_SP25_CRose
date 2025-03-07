import java.util.Scanner;

public class DateNight {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Select a number for date night");

		int dateSelection = sc.nextInt();

//		date(dateSelection);

		System.out.printf("You have selected %s", date(dateSelection));
	}

	public static String date(int a) {
		String option1 = "Movie";
		String option2 = "Park";
		String option3 = "Boardgame";
		String option4 = "Concert";

		if (a == 1) {
			return option1;
		} else if (a == 2) {
			return option2;
		} else if (a == 3) {
			return option3;
		}
		return option4;
	}
}
