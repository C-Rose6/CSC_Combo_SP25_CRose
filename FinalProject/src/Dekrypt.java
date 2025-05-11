
public class Dekrypt {
	private String string;
	private String dekryptStr;
	int key = 6;

	public Dekrypt(String string) {
		super();
		this.string = string;
		this.dekryptStr = arrayToString(reverse(ascii(string)));

	}

	public int[] ascii(String string) {
		int l = string.length();
		int convert;
		int[] decArr = new int[l];
		for (int i = 0; i < l; i++) {
			convert = this.string.charAt(i);
			decArr[i] += convert - key;

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

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public String getDekrypt() {
		return dekryptStr;
	}

	public void setDekrypt(String dekrypt) {
		this.dekryptStr = dekrypt;
	}

	@Override
	public String toString() {
		return dekryptStr;
	}

}
