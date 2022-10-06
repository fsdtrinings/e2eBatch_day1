package p1;

public class Dog extends Animal{

	@Override
	public int doEat(int foodQuantity) {
		int currentDogPower = super.getPower();
		
		currentDogPower += (foodQuantity/2);
		
		super.setPower(currentDogPower);
		
		return currentDogPower;
	}

	
	public void setDogDetails(String name,int power)
	{
		super.setName(name);
		super.setPower(power);
	}
	
	
	
	public void playGames()
	{
		int currentDogPower = super.getPower();
		super.printAnimalDetails();
		
		if(currentDogPower>10)
		{
			System.out.println(" dog play game ");
			currentDogPower -= 4;
			super.setPower(currentDogPower);
		}
		else
		{
			System.out.println("Dog "+super.getName()+" power is low ("+super.getPower()+") , feed the dog to gain power");
			
		}
	
	}
}
