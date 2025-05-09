import java.util.Random;

public class Die {
	Random rand = new Random();
	private int numSides;
	private int value;
	
	
	public Die() {
		super();
		this.numSides = 6;
		this.value = 1;
	}
	
	public Die(int numSides) {
		this.numSides = numSides;
		this.value = 1;
	}
	
	public int Roll() {
		value = rand.nextInt(numSides)+1;
		return value;
	}


	public int getNumSides() {
		return numSides;
	}


	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	@Override
	public String toString() {
		return "Die [numSides = " + numSides + ", value = " + value + "]";
	}
	
}
