package p1;

public class Cat extends Animal{
	
	String name;
	
	public void doHunt()
	{
		int currentWeight = super.getWeight();
		
		if(currentWeight < 5)
		{
			System.out.println(name+" Cat cannot hunt , give him food first");
		}
		else
		{
			System.out.println(" cat do hunting called  ");
			currentWeight -= 2;
			super.setWeight(currentWeight);
		}
		
	}

	@Override
	public void eatFood(int foodQuantity)
	{
		System.out.println("eat food of Cat");
		int addOn = (int)(foodQuantity*0.75);
		super.setWeight(super.getWeight()+addOn);
		
	}

}
