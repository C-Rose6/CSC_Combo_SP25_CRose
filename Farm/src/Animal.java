
public class Animal {
	//data members - HAS a relationship
	private String name;
	private double weight;
	private double height;
	
	
	
	
	//constructor - no argument/default
	public Animal() {
		name = "parent";
		weight = 0.0;
		height = 0.0;
	}



	//create an animal with the passed parameters
	public Animal(String name, double weight, double height) { 
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}


	//getters and setters
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}


	//formatted toString
	@Override
	public String toString() {
		return "Animal [name:" + name + ", weight=" + weight + ", height=" + height + "]";
	}
	
	
	
	
	
	
	
}
