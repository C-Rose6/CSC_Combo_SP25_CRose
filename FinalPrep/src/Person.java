
public class Person {
	private String name;
	private Coin coin;
	
	private int headCount = 0;
	
	public Person(String name) {
		super();
		this.name = name;
		coin = new Coin();
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Coin getCoin() {
		return coin;
	}


	public void setCoin(Coin coin) {
		this.coin = coin;
	}


	public int getHeadCount() {
		return headCount;
	}


	public void setHeadCount(int headCount) {
		this.headCount = headCount;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", coin=" + coin + ", headCount=" + headCount + "]";
	}
	
	
	
}
