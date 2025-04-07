import java.util.Random;

public class Deck {
	private Card[] cards;
	private static Random rand = new Random();

	public Deck() {
		this.cards = new Card[52];
		int index = 0;
		for (int suit = 0; suit <= 3; suit++) {

			for (int rank = 1; rank <= 13; rank++) {
				this.cards[index] = new Card(rank, suit);
				index++;
			}
		}
	}

	public Deck(int n) {
		this.cards = new Card[n];
	}

//	public void selectionSort() {
//		for each index i;
//			//find the lowest card at or to the right of i
//			//swap the i card with the lowest card	
//	}
//
//	private int indexLowest(int low, int high) {
//		int lowest = low;
//		//find and return the lowest card between low and high
//		for(int )
//		return lowest
//	}

	public void shuffle() {
		for (int i = 0; i < this.cards.length; i++) {
			int rNum = randomInt(i, this.cards.length - 1);
			swap(i, rNum);
		}

	}

	private static int randomInt(int low, int high) {
		return rand.nextInt(high - low + low);
	}

	private void swap(int i, int j) {
		Card temp = this.cards[i];
		this.cards[i] = this.cards[j];
		this.cards[j] = temp;
	}

	public Card[] getCards() {
		return this.cards;
	}
	public void print() {
		
		for(Card card : this.cards) {
			System.out.println(card);
		}
	}
	
}
