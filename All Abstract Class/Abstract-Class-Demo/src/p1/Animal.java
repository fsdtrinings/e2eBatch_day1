package p1;

public abstract class Animal {

	private String name;
	private int power;
	
	abstract public int doEat(int foodQuantity);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	public void printAnimalDetails()
	{
		System.out.println(name+" - "+power);
	}
}
