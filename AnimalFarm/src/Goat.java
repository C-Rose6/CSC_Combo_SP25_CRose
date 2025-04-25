
public class Goat extends Animal {
	private String color;
	private String type;

	public Goat(int height, int weight, String name) {
		super(height, weight, name);
		this.color = color;
		this.type = "Goat";
	}
	

	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return this.type;
	}
	
	@Override
	public void animalSound() {
		System.out.println("Goat Nasty says: I'd eat radioactive glass just glimpse at that ass");
		
	}

	@Override
	public String toString() {
		return super.toString() + " Goat Nasty [color = " + color + "]";
	}

}
