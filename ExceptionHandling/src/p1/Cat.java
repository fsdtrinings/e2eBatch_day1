package p1;

public class Cat extends Animal {

	@Override
	public int doEat(int foodQuantity) {
		int currentCatPower = super.getPower();

		currentCatPower += (foodQuantity);

		super.setPower(currentCatPower);

		return currentCatPower;
	}
	
	public void doHunt()
	{
		int currentCatPower = super.getPower();
		super.printAnimalDetails();
		
		if(currentCatPower>10)
		{
			System.out.println(" Cat is doing hunting of the Rat ");
			currentCatPower -= 9;
			super.setPower(currentCatPower);
		}
		else
		{
			System.out.println("Cat "+super.getName()+" power is low ("+super.getPower()+") , feed the cat to gain power");
			
		}
	}

	public void setCatDetails(String name,int power,int age)
	{
		super.setName(name);
		super.setPower(power);
		super.setAge(age);
	}
	
	
}
