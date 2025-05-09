import java.util.Random;

public class Coin {
	private int numSides = 2; 
	private int heads = 0;
	private int tails = 1;
	private boolean isHeads = false;
	Random rand = new Random();
	
	
	public Coin() {
	
	}

	public int getNumSides() {
		return numSides;
	}


	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}


	public boolean isHeads() {
		return isHeads;
	}


	public void setHeads(boolean isHeads) {
		this.isHeads = isHeads;
	}
	
	public int flipCoin() {
		int randResult = rand.nextInt(0, 1);
		if(randResult == 0) {
			return 0;
		}
		return 1;
	}


	@Override
	public String toString() {
		return "Coin [numSides=" + numSides + ", isHeads=" + isHeads + "]";
	}
	
	
}
