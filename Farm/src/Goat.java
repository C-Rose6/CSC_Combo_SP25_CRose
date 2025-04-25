
public class Goat extends Animal{ //IS a relationship
	private String coatColor;
	
	public Goat() {
		coatColor = "white and brown";
		
		
	}

	public Goat(String name, double weight, double height, String coatColor) {
		super(name, weight, height);
		this.coatColor = coatColor;
	}
	
	
	

	/**
	 * @return the coatColor
	 */
	public String getCoatColor() {
		return coatColor;
	}

	/**
	 * @param coatColor the coatColor to set
	 */
	public void setCoatColor(String coatColor) {
		this.coatColor = coatColor;
	}

	@Override
	public String toString() {
		return "Goat: " + getName() + "\nWeight: " + getWeight() + "\nHeight: " + getHeight() + "\nCoat Color: " + coatColor;
	}
	

}
