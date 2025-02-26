import java.util.Scanner;

public class Triangles {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of the triangle:");
		int size = input.nextInt();
		
		System.out.println("Enter the character to be used:");
		char fill = input.next().charAt(0);
		
		for(int i = 1; i <= size; i++) {
			
			for(int j = size; j >= i ; j--) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++) {
				System.out.print(fill + " ");
			}
			System.out.println();
		}
	
	}

}
