
public class MethodsAndDecisions {
//Access modifier-keyword-return type-method name(arguments)
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = dblIt(num1);
		System.out.println(dblIt(num1));
	}

	private static int dblIt(int n1) {
		int doubled = n1 * 2;
		return doubled;
	}

	private static int add(int n1, int n2) {
		
		return n1 + n2; 
	}
}