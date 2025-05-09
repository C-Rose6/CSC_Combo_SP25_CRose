import java.util.Arrays;

public class Enkrypt {
	private String string;
	private String kryptStr;
	
	
	public Enkrypt(String string) {
		super();
		this.string = string;
		this.kryptStr = arrayToString(reverse(combine(ascii(string), newArray(ascii(string)))));
		
	}

	// converts string into an integer array composed of ASCII values.
	// the method then modifies the number.
	public int[] ascii(String string) {
		int l = string.length();
		int convert;
		int[] decArr = new int[l];
		for (int i = 0; i < l; i++) {
			convert = string.charAt(i);
			decArr[i] += convert;
			if (decArr[i] % 2 == 0) {
				decArr[i] = decArr[i] / 2;
			} else {
				decArr[i] = decArr[i] - 13;
			}

		}
		return decArr;
	}

	// creates new array with an index one smaller than the other.
	// this array is populated by modifying the numbers from the original array
	public int[] newArray(int[] arr) {
		int[] newArr = new int[arr.length - 1];
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] % 2 == 0) {
				newArr[i] = arr[i] / 2;
			} else {
				newArr[i] = arr[i] + 14;
			}
		}
		return newArr;
	}

	// this method mixes the two arrays together into one.
	public int[] combine(int[] a, int[] b) {
		int[] mixedArray = new int[a.length + b.length];

		int index = 0;

		for (int i = 0; i < a.length; i++) {
			mixedArray[index++] = a[i];
		}

		for (int i = 0; i < b.length; i++) {
			mixedArray[index++] = b[i];
		}

		return mixedArray;
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
