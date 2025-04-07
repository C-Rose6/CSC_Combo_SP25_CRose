
public class Nine {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 6; i++) {
			printRow(i);
	}

	}
	public static void printRow(int n) {
		for(int i = 1; i <= 6; i++) {
			System.out.printf("%4d", n * i);
	}
		System.out.println();
}
}