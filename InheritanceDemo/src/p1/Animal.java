package p1;

public class Animal {

	private int weight;
	private int legs;
	
	/* general logic, default behaviour of app */
	public void eatFood(int foodQuantity)
	{
		System.out.println(" eat food of Animal");
		this.weight += foodQuantity;
		System.out.println(" All animal eats food , weight is :- "+weight);
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	
}
