public class Car {

	public String brand;
	public int model;
	public double mileage;
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Car(String brand, int model, double mileage, String color) {
		this.brand = brand;
		this.model = model;
		this.mileage = mileage;
		this.color = color;

	}

}