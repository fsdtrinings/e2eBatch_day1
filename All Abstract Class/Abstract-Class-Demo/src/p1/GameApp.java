package p1;

import java.util.Scanner;

public class GameApp {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		new GameApp().startGame();
	}
	
	public  void startGame() {
		
		// Animal a = new Animal();
		// cannot create object , rule no 4
		while(true)
		{
			
			System.out.println("Choose Animal ");
			System.out.println("1. Dog ");
			System.out.println("2. Cat ");
			System.out.println("3. Tiger ");
			System.out.println("4. Cow ");
			
			
			switch (sc.nextInt()) {
			case 1:
				Dog d = new Dog(); 
				d.setDogDetails("kuku", 4);
				doAnimalThings(d);
				break;
			case 2:
				
				Cat c = new Cat();
				c.setCatDetails("myCat", 6);
				doAnimalThings(c);
				break;

			default:
				System.out.println("Wrong Option");
				System.exit(0);
			}
			

		}
			
	}
	
	public void doAnimalThings(Animal a)
	{
		
		if(a instanceof Dog)
		{
			Dog d = (Dog)a; // need of type casting
			// doing so , we save the previous state 
						// data related to a object
			doDogThings(d);
		}
		if(a instanceof Cat)
		{
			Cat c = (Cat)a; // doing so , we save the previous state 
			// data related to a object
			doCatThings(c);
		}
		
		
		
	} // end of doAnimal action
	
	//----------------------------
	//    execution of specific animal methods
	// ----------------------------

	public void doDogThings(Dog d)
	{
		while(true)
		{
			System.out.println("(P)lay Games");
			System.out.println("(F)eed the Dog");
			System.out.println("(C)hange Animal");
			
			
			
			switch (new Scanner(System.in).next()) {
				case "p":
				case "P":
						d.playGames();
						break;
				case "f":
				case "F":
						System.out.println("enter the dog food quantity [1-3]");
						int quantity = sc.nextInt();
						if(quantity>=1 && quantity<=3)
						{
							d.doEat(quantity);
						}
						break;
				case "c":
				case "C":{
						return; // return from method and land on start game method
				}			
		
				default:
					break;
			}
			
		}//end while
	} //end of doDogThings
	
	
	
	public void doCatThings(Cat c)
	{
		while(true)
		{
			System.out.println("do (H)unting");
			System.out.println("(F)eed the Cat");
			System.out.println("(C)hange Animal");
			
			
			
			switch (new Scanner(System.in).next()) {
				case "h":
				case "H":
						c.doHunt();
						break;
				case "f":
				case "F":
						System.out.println("enter the Cat food quantity [1-3]");
						int quantity = sc.nextInt();
						if(quantity>=1 && quantity<=3)
						{
							c.doEat(quantity);
						}
						break;
				case "c":
				case "C":{
						return; // return from method and land on start game method
				}			
		
				default:
					break;
			}
			
		}//end while
	}
	
	
}//end class





