package p1;

public abstract class Animal {

	private String name;
	private int power;
	private int age;
	
	abstract public int doEat(int foodQuantity);

	
	
	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



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









