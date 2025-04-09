
public class War_Driver {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		
		Pile p1 = new Pile();
		p1.addDeck(deck.subDeck(0,  25));
		
		Pile p2 = new Pile();
		p2.addDeck(deck.subDeck(26, 51));
		
		Pile center = new Pile();
			
		
		while(!p1.isEmpty() && !p2.isEmpty()) {
			Card c1 = p1.popCard();
			Card c2 = p2.popCard();
			
			int diff = c1.getRank() - c2.getRank();
			
			if(diff > 0) {
				p1.addCard(c1);
				p1.addCard(c2);
				for(int i = 0; i < 5; i++) {
					if(!p2.isEmpty()){
						p1.addCard(p2.popCard());
					}	
				}
			}
			else if(diff < 0) {
				p2.addCard(c1);
				p2.addCard(c2);
				for(int i = 0; i < 10; i++) {
					if(!p1.isEmpty())
					p2.addCard(p1.popCard());
				}
			}
			else {
				p1.addCard(c1);
				p2.addCard(c2);
			}
			//System.out.println("P1: " + c1 + " | P2: " + c2);
		}
		if(p2.isEmpty()) {
			System.out.println("Player 1 Wins!");
		}
		else{
			System.out.println("Player 2 Wins!");
		}
		
		
	}		
}		
		
//		Card[] cards = new Card[52];
//		makeDeck(cards);
////		printDeck(cards);

//		Card target = new Card(11, 3);
//		System.out.println(target);
//		System.out.println("\nLinear\n");
//		System.out.println(search(cards, target));
//		System.out.println("\nBinary\n");
//		System.out.println(binarySearch(cards, target));

//	}
//
//	public static int search(Card[] cards, Card target) {
//
//		for (int i = 0; i < cards.length; i++) {
//			if (cards[i].equals(target)) {
//				return i;
//			}
//		}
//		return -1;
//	}

//	public static int binarySearch(Card[] cards, Card target) {
//
//		int low = 0;
//		int high = cards.length - 1;
//		while (low <= high) {
//			
//			System.out.println(low + " , " + high);
//			int mid = (low + high) / 2;
//			int comp = cards[mid].compareTo(target);
//
//			if (comp == 0) {
//				return mid;
//			} else if (comp < 0) {
//				low = mid + 1;
//			} else {
//				high = mid - 1;
//			}
//		}
//		return -1;
//	}
//
//	public static void printDeck(Card[] cards) {
//		if (cards[0] == null) {
//			System.out.println("There are no cards yet");
//		}
//		for (Card card : cards) {
//			System.out.println(card);
//		}
//	}
//
//	public static void makeDeck(Card[] cards) {
//		int index = 0;
//		for (int suit = 0; suit < 4; suit++) {
//
//			for (int rank = 1; rank <= 13; rank++) {
//
//				cards[index] = new Card(rank, suit);
//				index++;
//			}
//		}
//
//	}
//
//

