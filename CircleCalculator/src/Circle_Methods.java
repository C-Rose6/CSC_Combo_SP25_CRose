import java.util.Scanner;
/***************************************************************
 * This program is designed to calculate the Area, Diameter,   *
 * and the Circumference of a circle based on a given Radius.  *
 *                                                             * 
 * There are separate methods for each operation               *
 *                                                             * 
 *   @author Connor Rose                                       *
 *                                                             *
 **************************************************************/
public class Circle_Methods {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius of your circle");
		
		double radius = input.nextDouble();

		System.out.println(findCircleDiameter(radius));
		System.out.println(findCircleArea(radius));
		System.out.println(findCircumference(radius));
		
	}	
	public static double findCircleDiameter(double rad) {
		return 2 * rad;
	}
	
	public static double findCircleArea(double rad) {
		return Math.PI * Math.pow(rad, 2);
	}
	
	public static double findCircumference(double rad) {
		return 2 * Math.PI * rad;
	}

	
	
	
	
	

}
