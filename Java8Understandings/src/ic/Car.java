package ic;

@FunctionalInterface
interface Engine
{
	public int getPower();	
	    
}


public class Car{
	
	String color;
	String brandName;
	String musicSystem;
	
	public void playMusic()
	{
		System.out.println(musicSystem+" started ... & Playing music ....");
	}
	
	public void startCar(Engine e)
	{
		int power = e.getPower();
		
		if(power >= 1200)
		{
			System.out.println(" car is moving ...with the power :- "+power);
		}
		
	}
	
	
}//end class