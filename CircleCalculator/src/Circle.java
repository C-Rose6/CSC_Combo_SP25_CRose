import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius for which you would like to calculate.");
			
		double radius = input.nextDouble();
		double diameter = (2 * radius);
		double area = (Math.PI * Math.pow(radius, 2));
		double circumference = (2 * Math.PI * radius);
		
		System.out.println("The radius you entered is " + radius);
		System.out.println("The diameter of your circle is " + diameter);
		System.out.println("The area of your circle is " + area);
		System.out.println("The circumference of your circle is " + circumference);



		
		
		
		
				
	}

}
