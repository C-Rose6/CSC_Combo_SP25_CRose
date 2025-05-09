
public class Dekrypt {
	private String string;
	
	
	
	
	
	
	
	

	public Dekrypt(String string) {
		super();
		this.string = string;
		
	}












	public  int[] ascii(String string) {
		int l = getKryptStr.length();
		int convert;
		int[] decArr = new int[l];
		for (int i = 0; i < l; i++) {
			convert = this.string.charAt(i);
			decArr[i] += convert;
			if (decArr[i] % 2 == 0) {
				decArr[i] = decArr[i] / 2;
			} else {
				decArr[i] = decArr[i] - 13;
			}

		}
		return decArr;

	}








	
	
	
	
	public String getString() {
		return string;
	}








	public void setString(String string) {
		this.string = string;
	}








	public Enkrypt[] getEnkrypt() {
		return enkrypt;
	}








	public void setEnkrypt(Enkrypt[] enkrypt) {
		this.enkrypt = enkrypt;
	}


	
}


