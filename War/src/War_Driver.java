
public class War_Driver {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.print();
		deck.shuffle();
		deck.print();
		
		Card[] cards = new Card[52];
		makeDeck(cards);
//		printDeck(cards);

//		Card target = new Card(11, 3);
//		System.out.println(target);
//		System.out.println("\nLinear\n");
//		System.out.println(search(cards, target));
//		System.out.println("\nBinary\n");
//		System.out.println(binarySearch(cards, target));

	}

	public static int search(Card[] cards, Card target) {

		for (int i = 0; i < cards.length; i++) {
			if (cards[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}

	public static int binarySearch(Card[] cards, Card target) {

		int low = 0;
		int high = cards.length - 1;
		while (low <= high) {
			
			System.out.println(low + " , " + high);
			int mid = (low + high) / 2;
			int comp = cards[mid].compareTo(target);

			if (comp == 0) {
				return mid;
			} else if (comp < 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void printDeck(Card[] cards) {
		if (cards[0] == null) {
			System.out.println("There are no cards yet");
		}
		for (Card card : cards) {
			System.out.println(card);
		}
	}

	public static void makeDeck(Card[] cards) {
		int index = 0;
		for (int suit = 0; suit < 4; suit++) {

			for (int rank = 1; rank <= 13; rank++) {

				cards[index] = new Card(rank, suit);
				index++;
			}
		}

	}


}
