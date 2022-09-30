package p1;

public class Car {

	private int carNumber;
	private String brandName;
	private String color;
	
	private Engine e;// Step 1
	
	public Car(int carNumber, String brandName, String color) {
		super();
		this.carNumber = carNumber;
		this.brandName = brandName;
		this.color = color;
	}
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// --- STep no 2 : to add getters and setters of HAS- A linked object
	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}

	public int getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [carNumber=" + carNumber + ", brandName=" + brandName + ", color=" + color + ", e=" + e + "]";
	}

	
	
}
