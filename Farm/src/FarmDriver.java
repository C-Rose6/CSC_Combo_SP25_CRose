
public class FarmDriver {

	public static void main(String[] args) {
		Animal animal = new Animal();
		
		Animal animal2 = new Animal();
		
		Goat elsa = new Goat("Elsa", 60, 60, "white and brown"); //name, weight, height, coat color
		
		Goat randy = new Goat("Macho Goat Randy Savage", 120, 70, "black and white");
		
		System.out.println(elsa);
		System.out.println();
		System.out.println(elsa);
	}

}
