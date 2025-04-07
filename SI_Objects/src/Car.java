
public class Car {
	
	private String carColor;
	
	private int mileage;
	
	private boolean gas = true;
	
	
	
	public Car() {
		this.carColor = "Grey";
		this.mileage = 10;
	}



	public Car(String carColor, int mileage, boolean gas) {
		super();
		this.carColor = carColor;
		this.mileage = mileage;
		this.gas = gas;
	}



	public String getCarColor() {
		return carColor;
	}



	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}



	public int getMileage() {
		return mileage;
	}



	public void setMileage(int mileage) {
		this.mileage = mileage;
	}



	public boolean isGas() {
		return gas;
	}



	public void setGas(boolean gas) {
		this.gas = gas;
	}



	@Override
	public String toString() {
		return "car color: " + carColor 
				+ " \nmileage= " + mileage 
				+ " \ngas= " + gas
				+ "\n";
	}
	
	
	
	
	
	

}
