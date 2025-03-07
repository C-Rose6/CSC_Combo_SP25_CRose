import java.util.Scanner;

public class Triangles {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of the triangle:");
		int size = input.nextInt();
		
		System.out.println("Enter the character to be used:");
		char fill = input.next().charAt(0);
		
		//loop for the number of rows
		for(int i = 1; i <= size; i++) {
			
			//loop for the spaces before the character decresing by one each line
			for(int j = size; j >= i ; j--) {
				System.out.print(" ");
			}
			//loop to print the charecter adding one each line
			for(int j = 1; j <= i; j++) {
				System.out.print(fill + " ");
			}
			System.out.println();
		}
	
	}

}
