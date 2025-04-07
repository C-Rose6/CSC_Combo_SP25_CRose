import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car ocar = new Car();
		Car tcar = new Car("red", 25, false);
		
		System.out.println(tcar);
	
	
	
		ocar.setCarColor("Blue");
		System.out.println(ocar);
	
	}
	

}
