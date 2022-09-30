package p1;

public class Dog extends Animal{

		private String name;
		
		public void playGames()
		{
			int currentWeight = super.getWeight();
			
			if(currentWeight < 10)
			{
				System.out.println(name+" dog cannot play game , give him food first");
			}
			else
			{
				System.out.println(" Dog play Games ");
				currentWeight--;
				super.setWeight(currentWeight);
			}
			
		    
			// Note : super keyword is pointing towards super(parent) class
		}
		
		
	
}
