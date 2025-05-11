
public class Enkrypt {
	private String string;
	private String kryptStr;
	private int key = 6;

	public Enkrypt(String string) {
		super();
		this.string = string;
		this.kryptStr = arrayToString(reverse(ascii(string)));

	}

	// converts string into an integer array composed of ASCII values.
	// the method then modifies the number.
	public int[] ascii(String string) {
		int l = string.length();
		int convert;
		int[] decArr = new int[l];
		for (int i = 0; i < l; i++) {
			convert = string.charAt(i);
			decArr[i] += convert + key;

		}
		return decArr;
	}

	// reverses array
	public int[] reverse(int[] arr) {
		int n = arr.length;
		int temp = 0;

		for (int i = 0; i < n - 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		return arr;
	}

	// converts new decimal values into ascii characters
	public static String arrayToString(int[] asciiArray) {
		StringBuilder sb = new StringBuilder();
		for (int asciiValue : asciiArray) {
			sb.append((char) asciiValue);
		}
		return sb.toString();
	}
	
	

	public String getKryptStr() {
		return this.kryptStr;
	}

	public void setKryptStr(String kryptStr) {
		this.kryptStr = kryptStr;
	}

	@Override
	public String toString() {
		return kryptStr;
	}
}
