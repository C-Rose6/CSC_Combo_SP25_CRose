import java.util.Scanner;

public class Scrabble {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String tiles = "quibjo";

		System.out.println("Enter a word to try");
		String word = sc.next();

		boolean success = canSpell(word, tiles);

		if (success) {
			System.out.println("Word found");
		} else
			System.out.println("Word not found");

	}

	public static boolean canSpell(String word, String tiles) {

		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			boolean isThere = false;

			for (int j = 0; j < tiles.length(); j++) {
				char letter2 = tiles.charAt(j);

				if (letter2 == letter) {

					isThere = true;
				}

			}
			if (!isThere) {
				return false;
			}

		}
		return true;

	}
}
