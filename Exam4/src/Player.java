
public class Player {
	private String name;
	private Die die;
	private int endValue = 0;
	
	public Player(String name, int numSides) {
		super();
		this.name = name;
		die = new Die(numSides);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Die getDie() {
		return die;
	}

	public void setDie(Die die) {
		this.die = die;
	}

	@Override
	public String toString() {
		return "Player [name = " + name + ", die = " + die + "]";
	}

}
